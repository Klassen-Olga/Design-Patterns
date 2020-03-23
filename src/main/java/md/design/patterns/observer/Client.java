package md.design.patterns.observer;

import java.time.LocalDate;
import java.time.LocalTime;

public class Client implements Observer {
	private LocalDate date;
	private LocalTime time;
	private Flight flight;
	public Client(LocalTime time, LocalDate date, Flight flight){
		this.time=time;
		this.date=date;
		this.flight=flight;
	}
	public void update(){
		this.time=this.flight.getTime();
		this.date=this.flight.getDate();
	}
	public LocalTime getTime(){
		return time;
	}
}
