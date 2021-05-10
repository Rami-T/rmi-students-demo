package com.coderrami.nsy107.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.coderrami.nsy107.rmi.interfaces.StudentService;

public class StudentServiceClient {
	public static void main(String[] args) {

		String host = "127.0.0.1";
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			StudentService stub = (StudentService) registry.lookup("StudentService");

			///////// #NSY107-> print students count /////////////
			System.out.println("#NSY107-> Students Count at the very begining: " + stub.getEnrolledStudentsCount());

			///////// #NSY107-> add demo Students /////////////
			stub.registerNewStudent("Rami");
			stub.registerNewStudent("Ayman");
			stub.registerNewStudent("Joseph");
			stub.registerNewStudent("Mohamed");
			stub.registerNewStudent("Lama");

			///////// #NSY107-> update grades /////////////
			stub.updateGrades("Rami", 16.7, 13.25, 19.25);
			stub.updateGrades("Ayman", 19.7, 14.5, 15);
			stub.updateGrades("Joseph", 16, 15, 12);
			stub.updateGrades("Mohamed", 18, 11, 17.5);
			stub.updateGrades("Lama", 13, 12, 11);

			///////// #NSY107-> print students count /////////////
			System.out.println("#NSY107-> Students Count: " + stub.getEnrolledStudentsCount());

			///////// #NSY107-> print Rami's average /////////////
			System.out.println("#NSY107-> Rami's average: " + stub.calculateAverage("Rami"));

			///////// #NSY107-> print All Total average /////////////
			System.out.println("#NSY107-> Total average: " + stub.calculateTotalAverage());

			///////// #NSY107-> remove Lama /////////////
			System.out.println("#NSY107-> Students Count before removing Lama: " + stub.getEnrolledStudentsCount());
			stub.removeStudent("Lama");
			System.out.println("#NSY107-> Students Count after removing Lama: " + stub.getEnrolledStudentsCount());

			///////// #NSY107-> Add new Student Khalil /////////////
			System.out.println("#NSY107-> Students Count before adding Khalil: " + stub.getEnrolledStudentsCount());
			stub.registerNewStudent("Khalil");
			System.out.println("#NSY107-> Students Count after adding Khalil: " + stub.getEnrolledStudentsCount());

		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
