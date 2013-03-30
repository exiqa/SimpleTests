package com.blogspot.magazsa.simpletest;

public class Answer {
	
	private String answer;
	private boolean truth;
	
	public Answer(String answer, boolean truth) {
		this.answer = answer;
		this.truth = truth;
	}

	public String getAnswer() {
		return answer;
	}

	public boolean isTruth() {
		return truth;
	}
	
}
