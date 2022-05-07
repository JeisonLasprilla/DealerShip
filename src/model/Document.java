package model;
import java.util.*;

public abstract class Document{
	
	protected double price;
	protected int year;
	//Falta picture para la matriz (creo que es algo así <<>>)
	//Aunque podría ir un numero de documento

	public Document(double price, int year){ 
		this.price = price;
		this.year = year;
	}

}