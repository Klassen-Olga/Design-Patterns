package md.design.patterns.singleton;

/**
 * When to use:
 * if resource is too heavy or too important and should exist only once
 */
public class Cup {
	private static Cup myCup;
	private Water water200ml;
	private Cup(){

	}
	public static Cup getEmptyCup(){
		if (myCup==null){
			myCup=new Cup();
		}
		return myCup;
	}
	public static Cup getCupWithWater(Water water){
		getEmptyCup().water200ml=water;

		return getEmptyCup();
	}

}
