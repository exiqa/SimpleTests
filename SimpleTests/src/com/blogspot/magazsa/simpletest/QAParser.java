package com.blogspot.magazsa.simpletest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QAParser {
	
	private BufferedReader reader;
		
	public QAParser() throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(new File("questions.txt")));
	}
	
	public int getNumberOfQuestions() throws IOException {
		int count = 0;
		while (reader.readLine() != null) {
			count++;
		}
		return count / 4;
	}
	
	public void goToLine(int lineNumber) throws IOException {
		for (int i = 0; i < lineNumber * 3 - 1; i++) {
			reader.readLine();
		}
	}
	
	public Question parseQuestion() throws IOException {
		String q = reader.readLine();
		Question question = new Question(q);
		for (int i = 0; i < 3; i++) {
			boolean truth = '+' == reader.read();
			String a = reader.readLine();
			Answer answer = new Answer(a, truth);
			question.addAnswer(answer);
		}
		return question;
	}
}
