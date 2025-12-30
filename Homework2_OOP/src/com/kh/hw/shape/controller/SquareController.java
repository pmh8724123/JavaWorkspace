package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
Shape s;

public double calcPerimeter(double height, double width) {
	s = new Shape(4, height, width);
	double result = (width + height) * 2;
	return result;

}

public double calcArea(double height, double width) {
	s = new Shape(4, height, width);
	double result = width * height;
	return result;
}

public void paintColor(String color) {
	s.setColor(color);
}

public String print() {
	return s.information();
}


}