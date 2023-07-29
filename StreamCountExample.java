package com.biconsumer;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCountExample {

	public static List<String> printStudentActivities(){
		List<String> studentActivities=StudentDatabase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		return studentActivities;
	}
	public static void main (String [] args) {
		long noOfStudentActivities=StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities).distinct().count();
		System.out.println(noOfStudentActivities);
		System.out.println(printStudentActivities());
	}
}
