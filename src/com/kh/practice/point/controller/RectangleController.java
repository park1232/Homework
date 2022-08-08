package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		Rectangle r = new Rectangle(x, y, height, width);
		double area = height * width;
		return x + ", " + y + ", " + height + ", " + width + " / " + area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		Rectangle r = new Rectangle(x, y, height, width);
		double circumference = 2 * (height + width);
		return x + ", " + y + ", " + height + ", " + width + ", " + circumference;
	}
}
