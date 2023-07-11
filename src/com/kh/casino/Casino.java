package com.kh.casino;

public class Casino {
	private int money;
	
	public Casino() {
		money = 100000;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void minusMoney(int money) {
		this.money -= money;
	}
}
