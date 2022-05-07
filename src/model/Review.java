package model;
import java.util.*;

public class Review extends Document{
	
	private double gasReleased;

	public Review(double price, int year, double gasReleased){ 
		super(price, year);
		this.gasReleased = gasReleased;
	}

	public double getGasReleased(){
		return gasReleased;
	}

	public void setGasReleased(){
		this.gasReleased = gasReleased;
	}

}