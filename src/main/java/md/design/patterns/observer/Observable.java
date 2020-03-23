package md.design.patterns.observer;

/**
 * 1 Observable notifies many observers that he changed any state
 * it is a 1:N dependency
 * Observable has a list of observers to know hom should he notify
 * Observable has methods add/remove the observers
 * and method notify(about the state) notify iterates the list of observers and call the observers method update
 *they two are interfaces(not abstract classes because maybe the child classes want to implement another
 * interfaces(more classes does not work in java))
 *
 * Concrete observable implements observable and concrete observer implements observer
 * and between these two objects exists one more dependency
 * concrete observer says in the time of creation what certain observable he wants to observe
 */
public interface Observable {
	void add(Observer observer);
	void remove(Observer observer);
	void notifyObservers();
}
