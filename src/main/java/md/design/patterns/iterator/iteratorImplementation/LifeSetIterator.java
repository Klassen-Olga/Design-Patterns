package md.design.patterns.iterator.iteratorImplementation;

import md.design.patterns.iterator.element.Element;
import md.design.patterns.iterator.iterableImplementation.LifeSet;

public class LifeSetIterator implements Iterator {
	private int index=0;
	private LifeSet lifeSet;
	public LifeSetIterator(LifeSet lifeSet){
		this.lifeSet=lifeSet;
	}
	public boolean isDone(){
		return index ==5;
	}
	public void next(){
		if (!isDone()){
			index++;
		}
	}
	public Element getCurrent(){
		return this.lifeSet.fiveElements[index];
	}
}
