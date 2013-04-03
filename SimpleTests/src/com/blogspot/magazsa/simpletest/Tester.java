package com.blogspot.magazsa.simpletest;

import java.util.Collections;
import java.util.List;

public class Tester {

	private QAParser parser;
	private List<Question> currentQuestions;

	public Tester(QAParser parser) {
		this.parser = parser;
	}

	public List<Question> getCurrentQuestions() {
		return currentQuestions == null ? Collections.<Question> emptyList()
				: currentQuestions;
	}
	

}
