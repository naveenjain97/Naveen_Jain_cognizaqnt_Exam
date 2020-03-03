package com.test.cts;
	import java.util.ArrayList;
	public class StudentData {
		 ArrayList<StudentQ4> addData(){
			   StudentQ4 s1=new StudentQ4();
			   s1.name="Shubh";
			   s1.phyMarks=95;
			   s1.mathsMarks=100;
			   s1.chemMarks=90;
			   s1.total=95+100+90;
			   s1.per=((s1.total)*100)/300;
			   StudentQ4 s2=new StudentQ4();
			    s2.name="Deep";
			    s2.phyMarks=80;
			    s2.mathsMarks=85;
			    s2.chemMarks=90;
			    s2.total=80+85+90;
			    s2.per=((s2.total)*100)/300;
			   ArrayList<StudentQ4> al=new ArrayList<StudentQ4>();
			         al.add(s1);
			         al.add(s2);
			         return al;
			  }
	}
