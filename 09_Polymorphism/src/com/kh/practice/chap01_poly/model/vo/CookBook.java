package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	private boolean coupon; // 요리학원쿠폰 유무
	
	
	public CookBook() {
		
	}


	public boolean isCoupon() {
		return coupon;
	}


	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}


	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	
}
