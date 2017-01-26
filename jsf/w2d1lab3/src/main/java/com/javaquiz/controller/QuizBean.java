package com.javaquiz.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("quizBean")
@SessionScoped
public class QuizBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String question;
	private String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String welcomeAction() {
		return "welcome";
	}
}