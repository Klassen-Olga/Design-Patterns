package md.design.patterns.iterator.iteratorImplementation;


import md.design.patterns.iterator.element.Element;

/**
 * Iterator pattern is already implemented by c++, c#, java for a lot of structures
 * (hash maps, linked lists, arrays) BUT
 * we should use them to have iterator possibilities SO
 * we can't build our own structures as zb House ore mix of that structures
 * OR
 *
 * we can implement iterator for our own class so that we can iterate whatever we want to be iterable
 *
 * By iterate pattern you don't have the hole collection at once, but you  receive one item
 * then if you want you will receive another item and so on(incapsulation)
 *
 * House h = new House();
 * foreach(piece: h){...}
 * sooo: Iterator pattern is about we can iterate trow a house zb , which is not a collection
 * It is a possibility of an thing that is innumerable, to return the iterator on itself
 *
 * + the types of items can be different
 */
public interface Iterator{
	public boolean isDone();
	public void next();
	public Element getCurrent();
}
