package com.hw.Garage;

public class Vehicle {
	
	private int ID; 
	private int wheel; 
	private int seat; 
	private String color;
	
	
	public  void setwheel(int wheel) {
		this.wheel = wheel; 
	}
	public  void setSeat(int seat) {
		this.seat = seat; 
	}
	public  void setcolor(String color) {
		this.color = color; 
	}
	public  int getSeat() {
		return seat;
	}
	public  int getwheel() {
		return wheel;
	}
	public  String getcolor() {
		return color;
	}
	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", wheel=" + wheel + ", seat=" + seat + ", color=" + color + "]";
	}
	
	

}
