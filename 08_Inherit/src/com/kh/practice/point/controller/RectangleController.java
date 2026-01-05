package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		// 면적 : 너비 * 높이
		r = new Rectangle(x, y, height, width);
		int result = width * height;
		String str = r.toString();
		return "면적 : " + str + " / " + result;
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		// 둘레 : 2 * (너비 + 높이)
		r = new Rectangle(x, y, height, width);
		int result = 2 * (width + height);
		String str = r.toString();

		return "둘레 : " + str + " / " + result;
	}

}
