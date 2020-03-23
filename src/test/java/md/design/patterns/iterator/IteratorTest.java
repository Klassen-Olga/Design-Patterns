package md.design.patterns.iterator;

import md.design.patterns.iterator.element.Element;
import md.design.patterns.iterator.element.Love;
import md.design.patterns.iterator.element.Water;
import md.design.patterns.iterator.element.Wind;
import md.design.patterns.iterator.iterableImplementation.LifeSet;
import md.design.patterns.iterator.iteratorImplementation.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class IteratorTest {
	md.design.patterns.iterator.iterableImplementation.Iterable lifeSet=new LifeSet();
	@Test
	void should_be_of_type_love_and_return_true(){
		Iterator iter=lifeSet.getIterator();
		Element element=null;
		while (!iter.isDone()){
			element=iter.getCurrent();
			iter.next();
		}
		assertTrue(element instanceof Love);
	}

	@Test
	void should_be_of_type_water_and_return_true(){
		Iterator iter=lifeSet.getIterator();
		Element element=null;
		while (!iter.isDone()){
			element=iter.getCurrent();
			iter.next();
			break;
		}
		assertTrue(element instanceof Water);
	}

	@Test
	void should_be_of_type_wind_and_return_true(){
		Iterator iter=lifeSet.getIterator();
		Element element=null;
		while (!iter.isDone()){
			element=iter.getCurrent();
			iter.next();
			break;
		}
		assertTrue(iter.getCurrent() instanceof Wind);
	}
}
