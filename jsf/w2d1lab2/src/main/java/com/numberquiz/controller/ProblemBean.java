package com.numberquiz.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProblemBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Integer> sequences;
	private int solution;
	
	public ProblemBean(){}
	
	public ProblemBean(int[] values, int solution) {
		sequences = new ArrayList<>();
		
		for (int i = 0; i < values.length; i++) {
			sequences.add(values[i]);
		}
		this.solution = solution;
	}
	
	public List<Integer> getSequences() {
		return sequences;
	}
	public void setSequences(List<Integer> sequences) {
		this.sequences = sequences;
	}
	public int getSolution() {
		return solution;
	}
	public void setSolution(int solution) {
		this.solution = solution;
	}

}
