package com.player;

public class Player {
	private String name;
	private String category;
	private int ranking;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, String category, int ranking) {
		super();
		this.name = name;
		this.category = category;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	
}
