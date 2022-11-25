https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/**************************************************************************************************************************
			DO NOT CHANGE THE CONTENTS OF THIS FILE FOR YOUR COURSEWORK. ONLY WORK WITH THE OFFICIAL VERSION
**************************************************************************************************************************/

#include <stdio.h>

struct element
{
	void * pData;
	struct element * pNext;
};

void addLast(void * oTemp, struct element ** pHead, struct element ** pTail);
void addFirst(void * oTemp, struct element ** pHead, struct element ** pTail);
void * removeFirst(struct element ** pHead, struct element ** pTail);
