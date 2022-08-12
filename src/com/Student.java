package com;

public class Student {
	String sName;
	int sRollNo;
	float sm1;
	float sm2;
	float sm3;
	float sm4;
	float totalMarks;
	float totalAvg;
	
	public void marks(float sm1, float sm2, float sm3, float sm4) {
		this.sm1 = sm1;
		this.sm2 = sm2;
		this.sm3 = sm3;
		this.sm4 =sm4;
	}
	
	public 
	
	


	float totalMarks()
	{
		totalMarks = sm1 +sm2+sm3+sm4;
		return totalMarks;
	}
	
	float totalAvg(float tm) 
	{
		 
		return totalAvg = tm/4;
	}
	
	
	

public static void main(String[] args) {
	Student sd1 = new Student();
	sd1.sName = "Anu";
	sd1.sRollNo = 001;
	sd1.marks(50, 89, 89, 45);
	System.out.println("Student1 Details: ");
	System.out.println("Student Name : "+ sd1.sName);
	System.out.println("Student Roll number :" + sd1.sRollNo);
	System.out.println("Student Marks in s1,s2,s3,s4 : " + sd1.sm1 + sd1.sm2 + sd1.sm3 + sd1.sm4 );
	System.out.println("Student Total marks : " +sd1.totalMarks());
	System.out.println("Student Total Avg : " + sd1.totalAvg(sd1.totalMarks));
	
	Student sd2 = new Student();
	sd2.sName = "lucky";
	sd2.sRollNo = 002;
	sd2.marks(50, 34.5f, 89, 45);
	System.out.println("Student1 Details: ");
	System.out.println("Student Name : "+ sd2.sName);
	System.out.println("Student Roll number :" + sd2.sRollNo);
	System.out.println("Student Marks in s1,s2,s3,s4 : " + sd2.sm1 + sd2.sm2 + sd2.sm3 + sd2.sm4 );
	System.out.println("Student Total marks : " +sd2.totalMarks());
	System.out.println("Student Total Avg : " + sd2.totalAvg(sd2.totalMarks));
	
	Student sd3 = new Student();
	sd3.sName = "Mani";
	sd3.sRollNo = 003;
	sd3.marks(50, 89, 37, 45);
	System.out.println("Student1 Details: ");
	System.out.println("Student Name : "+ sd3.sName);
	System.out.println("Student Roll number :" + sd3.sRollNo);
	System.out.println("Student Marks in s1,s2,s3,s4 : " + sd3.sm1 + sd3.sm2 + sd3.sm3 + sd3.sm4 );
	System.out.println("Student Total marks : " +sd3.totalMarks());
	System.out.println("Student Total Avg : " + sd3.totalAvg(sd3.totalMarks));
	
	Student sd4 = new Student();
	sd4.sName = "Nik";
	sd4.sRollNo = 004;
	sd4.marks(50, 89, 98, 45);
	System.out.println("Student1 Details: ");
	System.out.println("Student Name : "+ sd4.sName);
	System.out.println("Student Roll number :" + sd4.sRollNo);
	System.out.println("Student Marks in s1,s2,s3,s4 : " + sd4.sm1 + sd4.sm2 + sd4.sm3 + sd4.sm4 );
	System.out.println("Student Total marks : " +sd4.totalMarks());
	System.out.println("Student Total Avg : " + sd4.totalAvg(sd4.totalMarks));
}
}