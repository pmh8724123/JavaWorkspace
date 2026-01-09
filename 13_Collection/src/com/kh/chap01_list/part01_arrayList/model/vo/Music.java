package com.kh.chap01_list.part01_arrayList.model.vo;


public class Music {
	public String title;
	public String artist;
	
	public Music() {
		
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
}
