package edu.orangecoastcollege.cs170.dnguyen1214;

import java.awt.Color;
import java.io.Serializable;

public class Parallelogram extends Shape2D implements Serializable {

	
	private static final long serialVersionUID = -4427829015091181698L;
	private int base;
	private int height;
	public Parallelogram(int x, int y, Color color, int base, int height){
		this.x = x; 
		this.y = y;
		this.color = color;
		this.base = base;
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}
	public int getBase(){
		return this.base;
	}
	public void setHeight(int newHeight){
		this.height = newHeight;
	}
	public void setBase(int newBase){
		this.base = newBase;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (obj==null||!(obj instanceof Parallelogram))
			return false;
		Parallelogram otherParallelogram = (Parallelogram) obj;
		return this.x==otherParallelogram.x
				&&this.y == otherParallelogram.y
				&&this.color == otherParallelogram.color
				&&this.height == otherParallelogram.height
				&&this.base == otherParallelogram.base;
		}
	@Override
	public String toString() {
		String s="";
		for (int i=1;i<=this.height;i++){
			for (int j=1;j<=i;j++)
				s+=" ";
			for (int j=1;j<=base;j++)
				s+="*";
			s+="\n";
		}
		s+="The area of this Parallelogram is "+this.calculateArea()+" square units.";
		return s;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.base*this.height;
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
