package main;

import arrayList.*;

public class ListApp {

	public static void main(String[] args) {

	Square s1 = new Square(5);
	Square s2 = new Square(3.0);
	Square s3 = new Square(15);
	
	PointThreeD p1 = new PointThreeD(4,5,6);
	PointThreeD p2= new PointThreeD(7.8,10,13);
	PointThreeD p3 = new PointThreeD(43,56,21);
	
	ArrayList<String> stringArray = new ArrayList<String> (4);
	stringArray.addItem("One");
	stringArray.addItem("Three");
	stringArray.addItem("Ten");
	stringArray.addItem("Word");
	System.out.println(stringArray.toString());
	
	ArrayList<Square> squareArray = new ArrayList<Square>(6);
	squareArray.addItem(s2);
	squareArray.addItem(s1);
	squareArray.addItem(s2);
	squareArray.addItem(s3);
	squareArray.addItem(s3);
	squareArray.addItem(s1);
	System.out.println(squareArray.toString());

	ArrayList<PointThreeD> pointArray = new ArrayList<PointThreeD> (6);
	pointArray.addItem(p2);
	pointArray.addItem(p1);
	pointArray.addItem(p3);
	pointArray.addItem(p2);
	pointArray.addItem(p1);
	pointArray.addItem(p3);
	System.out.println(pointArray.toString());
	}//end main


}//end class
