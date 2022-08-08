package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		Circle c = new Circle(x, y, radius);
		double area = Math.PI * radius * radius;
		return x + ", " + y + ", " + radius + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		Circle c = new Circle(x, y, radius);
		double circumference = Math.PI * radius * 2;
		return x + ", " + y + ", " + radius + " / " + circumference;
	}
}
