package com.coderrami.nsy107.rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.coderrami.nsy107.rmi.interfaces.StudentService;
import com.coderrami.nsy107.rmi.model.Student;

public class StudentServiceStub implements StudentService {

	private Map<String, Student> studentsMap = new HashMap<>();

	public static void main(String args[]) {

		try {
			StudentService serviceObject = new StudentServiceStub();
			StudentService stub = (StudentService) UnicastRemoteObject.exportObject(serviceObject, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("StudentService", stub);
			System.out.println("#NSY107-> Java RMI Student Service is Running and ready to serve.");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	public List<String> getRegisteredStudents() {
		return studentsMap.entrySet().stream().map(entry -> entry.getKey()).collect(Collectors.toList());
	}

	public int getEnrolledStudentsCount() {
		return getRegisteredStudents().size();
	}

	public void registerNewStudent(String studentName) {
		if (!studentsMap.containsKey(studentName)) {
			studentsMap.put(studentName, new Student(studentName));
		}
	}

	public void removeStudent(String studentName) {
		if (studentsMap.containsKey(studentName)) {
			studentsMap.remove(studentName);
		}
	}

	public void updateGrades(String student, double mathGrade, double pythicsGrade, double infoGrade) {
		if (studentsMap.containsKey(student)) {
			studentsMap.get(student).setMathGrade(mathGrade).setPythicsGrade(pythicsGrade).setInfoGrade(infoGrade);
		}
	}

	public double calculateAverage(String student) {
		double average = 0;
		if (studentsMap.containsKey(student)) {
			average = (studentsMap.get(student).getMathGrade() + studentsMap.get(student).getPythicsGrade()
					+ studentsMap.get(student).getInfoGrade()) / 3;
		}
		return average;
	}

	public double calculateTotalAverage() {
		double totalAverage = 0;
		for (Entry<String, Student> entry : studentsMap.entrySet()) {
			totalAverage += calculateAverage(entry.getKey());
		}
		return totalAverage / studentsMap.size();
	}

}
