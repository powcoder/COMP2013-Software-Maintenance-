https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
﻿using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Threading;

namespace MultiThreadEx
{
    class Program
    {
        private static readonly Stopwatch stopwatch = new Stopwatch();
        private static readonly List<Tuple<int, double, double>> intervals = new List<Tuple<int, double, double>>();

        /// <summary>
        /// The duration of the experiment, sec
        /// </summary>
        private const int ExperimentDuration = 10;

        /// <summary>
        /// The height, in pixels, of one thread in the bitmap
        /// </summary>
        private const int ThreadHeight = 40;

        /// <summary>
        /// Horizontal resolution of the bitmap
        /// </summary>
        private const int PixelsPerSec = 1000;

        static void Main(string[] args)
        {
            // If there are several CPU cores, all the threads will run on the second one (the first one might be busy with the system)
            if (Environment.ProcessorCount > 1)
                Process.GetCurrentProcess().ProcessorAffinity = (IntPtr) 4;

            // To reduce interruptions by other processes
            Process.GetCurrentProcess().PriorityClass = ProcessPriorityClass.RealTime;

            // To make sure that some high-priority thread does not prevent the main thread from starting all the other threads
            Thread.CurrentThread.Priority = ThreadPriority.Highest;

            // This defines the number of threads and their priorities
            //var priorities = new[] { ThreadPriority.Highest, ThreadPriority.Highest};
            //var priorities = new[] { ThreadPriority.BelowNormal, ThreadPriority.BelowNormal, ThreadPriority.BelowNormal };
            var priorities = new[] { ThreadPriority.Normal, ThreadPriority.Normal, ThreadPriority.Normal, ThreadPriority.Normal, ThreadPriority.Normal, ThreadPriority.Normal};
            //var priorities = new[] { ThreadPriority.Normal, ThreadPriority.AboveNormal };
            //var priorities = new[] { ThreadPriority.Normal, ThreadPriority.Normal, ThreadPriority.BelowNormal };

            // Start the high-resolution timer
            stopwatch.Start();

            // Start the threads
            Thread[] threads = new Thread[priorities.Length];
            for (int i = 0; i < threads.Length; i++)
            {
                threads[i] = new Thread(Run) { Priority = priorities[i] };
                threads[i].Start(i);
            }

            // Wait until all the threads terminate
            foreach (var thread in threads)
                thread.Join();

            // Produce the bitmap
            var bitmap = new Bitmap(PixelsPerSec * ExperimentDuration, threads.Length * ThreadHeight);
            using (var graphics = Graphics.FromImage(bitmap))
            {
                Brush[] brushes = { Brushes.Blue, Brushes.Red, Brushes.Green };
                foreach (var tuple in intervals)
                {
                    int threadId = tuple.Item1;
                    graphics.FillRectangle(
                        brushes[threadId % brushes.Length],
                        (float)(tuple.Item2 * PixelsPerSec),
                        (threadId + 0.1f) * ThreadHeight,
                        (float)((tuple.Item3 - tuple.Item2) * PixelsPerSec),
                        0.8f * ThreadHeight);
                }
            }

            string filename = priorities.Select(p => p.ToString()).Aggregate((s1, s2) => s1 + ' ' + s2) + ".png";

            // Save the image file
            bitmap.Save(filename);

            // Open the image file
            new Process { StartInfo = new ProcessStartInfo(filename) }.Start();
        }

        private static void Run(object state)
        {
            // To let other threads start
            Thread.Sleep(20);

            int curThreadId = (int)state;

            // The start time of the time chunk allocated to this thread
            double start = stopwatch.Elapsed.TotalSeconds;

            // Last reading of the timer
            double prev = start;

            while (prev < ExperimentDuration)
            {
                double cur = stopwatch.Elapsed.TotalSeconds;

                // If the gap between consecutive readins is above 1 / PixelsPerSec, 
                // add a record for the last chunk of time allocated to this thread
                if ((cur - prev) * PixelsPerSec >= 1)
                {
                    lock (intervals)
                        intervals.Add(Tuple.Create(curThreadId, start, prev));

                    start = cur;
                }
                prev = cur;
            }
        }
    }
}