package com.figure;

public class Triangle extends Figure {

	public Triangle(int dim1 , int dim2) {
		super(dim1,dim2);
	}
	
	
	@Override
	public double area() {
		return 0.5*super.dim1*super.dim2;
	}
}
