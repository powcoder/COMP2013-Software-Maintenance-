https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.util.ArrayList;

public class Zoo {
	private String location;
	private int numCompounds;
	public static int numZoos;
	private int zooID;
	private ArrayList<Compound> compounds;
	
	public Zoo(String location,int numCompounds) {
		setLocation(location);
		setNumCompounds(numCompounds);
		compounds=new ArrayList<Compound>();
		numZoos++;
		zooID=numZoos;
		for(int i=0;i<numCompounds;i++) {
			addCompound(new Compound());
		}
		printInfo();
	}
	
	private void addCompound(Compound compound) {
		this.compounds.add(compound);
		
	}

	public Zoo() {
		this("Unknown",30);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumCompounds() {
		return numCompounds;
	}

	public void setNumCompounds(int numCompounds) {
		this.numCompounds = numCompounds;
	}
	
	public void buildNewCompound() {
		this.numCompounds++;
	}
	
	public void printInfo() {
		System.out.println("location:"+location+"; numCompounds:"+numCompounds);
	}
}
