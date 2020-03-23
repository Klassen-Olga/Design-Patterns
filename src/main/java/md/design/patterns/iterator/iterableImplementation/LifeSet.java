package md.design.patterns.iterator.iterableImplementation;

import md.design.patterns.iterator.iteratorImplementation.Iterator;
import md.design.patterns.iterator.iteratorImplementation.LifeSetIterator;
import md.design.patterns.iterator.element.*;

public class LifeSet implements Iterable {
	public Element fiveElements[];
	public LifeSet(){
		fiveElements=new Element[5];
		fiveElements[0]=new Water();
		fiveElements[1]=new Wind();
		fiveElements[2]=new Earth();
		fiveElements[3]=new Fire();
		fiveElements[4]=new Love();
	}
	public Iterator getIterator(){
		return new LifeSetIterator(this);
	}
}
