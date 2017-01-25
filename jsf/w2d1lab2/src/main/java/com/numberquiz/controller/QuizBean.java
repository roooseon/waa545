package com.numberquiz.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("quizBean")
@SessionScoped
public class QuizBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ProblemBean> problems = new ArrayList<>();
	private int currentIndex = 0;
	private int score = 0;
	
	public QuizBean() {
		problems.add(new ProblemBean(new int[] { 3, 1, 4, 1, 5 }, 9)); //pi
		problems.add(new ProblemBean(new int[] { 1, 1, 2, 3, 5 }, 8)); // fibonacci
		problems.add(new ProblemBean(new int[] { 1, 4, 9, 16, 25 }, 36)); // square
		problems.add(new ProblemBean(new int[] { 2, 3, 5, 7, 11 }, 13)); // primes
		problems.add(new ProblemBean(new int[] { 1, 2, 4, 8, 16 }, 32)); // power of 2
	}
	
	public void setProblems(ArrayList<ProblemBean> newValue) {
		problems = newValue;
		currentIndex = 0;
		score = 0;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getAnswer() {return "";}
	
	public ProblemBean getCurrent() {
		return problems.get(currentIndex);
	}
	
	public void setAnswer(String newValue) {
		try {
			int answer = Integer.parseInt(newValue.trim());
			
			if (getCurrent().getSolution() == answer) 
				{
				  score++;

				}else {
				currentIndex = (currentIndex + 1) % problems.size(); 
			}
		} catch(NumberFormatException ex) {
			
		}
	}
	
	public void setLocale() {
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		viewRoot.setLocale(new Locale("de"));
	}
	
}
