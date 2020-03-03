package com.test.cts;


	import java.util.ArrayList;
	public class RetriveStudents
	{
		public static void main(String[] args) {
			fetchStudentData();
		}
	    static void fetchStudentData(){
	        StudentData stdata=new StudentData();
	       ArrayList<StudentQ4> liststu=stdata.addData();
	          for(StudentQ4 student:liststu)
	          {
	            System.out.println("Name: " +student.name + "-" +student.phyMarks +" -"+ student.mathsMarks +"-" +student.chemMarks);
	            System.out.println("Total Marks: " +student.total);
	            System.out.println("Percentage:" +student.per);
	          }
	}

}

