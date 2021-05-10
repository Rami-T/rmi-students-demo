package com.coderrami.nsy107.rmi.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String studentName;
	private double mathGrade;
	private double pythicsGrade;
	private double infoGrade;

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public Student setStudentName(String studentName) {
		this.studentName = studentName;
		return this;
	}

	public double getMathGrade() {
		return mathGrade;
	}

	public Student setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
		return this;
	}

	public double getPythicsGrade() {
		return pythicsGrade;
	}

	public Student setPythicsGrade(double pythicsGrade) {
		this.pythicsGrade = pythicsGrade;
		return this;
	}

	public double getInfoGrade() {
		return infoGrade;
	}

	public void setInfoGrade(double infoGrade) {
		this.infoGrade = infoGrade;
	}

}
