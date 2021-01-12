package com.sample;

import java.util.Scanner;

public class emp {
	
		
	
	
			
	
	public void emp_Id()
	{   
		System.out.println("Employee ID : 007"  );
	}
  public void emp_Name()
  {
	  System.out.println("Employee name : Sarath");
  }
  public void emp_dob()
  {
	  System.out.println("Employee dob : 29/9/1998");
  }
  public void emp_phn()
  {
	  System.out.println("Employee phone_n0 : 9876543211");
  }
  
  public void emp_add()
  {
	  System.out.println("Employee Address : 162/2 ,Los Angleas, America");
  }
  public void emp_eid()
  {
	  System.out.println("Employee phone_n0 : sarara@123gmail.com");
  }
  
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  
	  emp e = new emp();
	  e.emp_Id();
	  e.emp_Name();
	  e.emp_dob();
	  e.emp_phn();
	  e.emp_add();
	  e.emp_eid();
  }
}

