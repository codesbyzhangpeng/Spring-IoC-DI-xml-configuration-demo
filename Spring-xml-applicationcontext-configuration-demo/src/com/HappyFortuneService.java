package com;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a lucky day!";
	}

}
