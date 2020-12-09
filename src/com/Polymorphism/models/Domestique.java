package com.Polymorphism.models;

public class Domestique extends Animal {
	private String NEWS;

	public Domestique(String name, String color) {
		super(name, color);
		this.NEWS =  color;
	}

	public void play() {
	}

	public String getName() {
		return NEWS;
	}

	public void setName(String news) {
		this.NEWS = news;
	}

	@Override
	public String toString() {
		return "Domestique [NEWS=" + color + ", toString()=" + super.toString() + "]";
	}

}
