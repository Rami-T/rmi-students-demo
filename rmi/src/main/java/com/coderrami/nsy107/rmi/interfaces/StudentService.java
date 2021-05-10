package com.coderrami.nsy107.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StudentService extends Remote {
	List<String> getRegisteredStudents() throws RemoteException;

	int getEnrolledStudentsCount() throws RemoteException;

	void registerNewStudent(String studentName) throws RemoteException;

	void removeStudent(String studentName) throws RemoteException;

	void updateGrades(String student, double mathGrade, double pythicsGrade, double infoGrade) throws RemoteException;

	double calculateAverage(String student) throws RemoteException;

	double calculateTotalAverage() throws RemoteException;

}
