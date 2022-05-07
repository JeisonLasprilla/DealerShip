package model;
import java.util.*;

public class SOAT extends Document{
	
	private double coverageAmount;

	public SOAT(double price, int year, double coverageAmount){ 
		super(price, year);
		this.coverageAmount = coverageAmount;
	}

	public double getCoverageAmount(){
		return coverageAmount;
	}

	public void setCoverageAmount(){
		this.coverageAmount = coverageAmount;
	}

}