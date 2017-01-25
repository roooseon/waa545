package com.numberquiz.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProblemBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Integer> sequence;
	private int solution;
	
	public ProblemBean(){}
	
	public ProblemBean(int[] values, int solution) {
		sequence = new ArrayList<>();
		
		for (int i = 0; i < values.length; i++) {
			sequence.add(values[i]);
		}
		this.solution = solution;
	}
	
	public List<Integer> getSequence() {
		return sequence;
	}
	public void setSequence(List<Integer> sequence) {
		this.sequence = sequence;
	}
	public int getSolution() {
		return solution;
	}
	public void setSolution(int solution) {
		this.solution = solution;
	}

}
