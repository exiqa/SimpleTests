package com.blogspot.magazsa.simpletest;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private String question;
	private List<Answer> answers;
	
	public Question(String question) {
		this.question = question;
		answers = new ArrayList<>();
	}
	
	public boolean addAnswer(Answer answer) {
		return answers.add(answer);
	}

	public String getQuestion() {
		return question;
	}
	
}
