package md.design.patterns.observer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Flight implements Observable {
	private LocalDate date;
	private LocalTime time;
	private LinkedList<Observer> observers;
	public Flight(LocalTime time, LocalDate date){
		this.time=time;
		this.date=date;
		this.observers =new LinkedList<>();
	}
	@Override
	public void add(Observer observer){
		observers.add(observer);
	}
	@Override
	public void remove(Observer observer){
		observers.remove(observer);
	}
	@Override
	public void notifyObservers(){
		for(Observer observer: observers){
			observer.update();
		}
	}

	LocalDate getDate(){
		return date;
	}
	LocalTime getTime(){
		return time;
	}

	void changeDate(LocalDate date){
		this.date=date;
		notifyObservers();
	}
	void  changeTime(LocalTime time){
		this.time=time;
		notifyObservers();
	}
}
