package com.codsoft;

import java.util.Scanner;

public class StudentResult {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println(" Enter  the number of the subjects");
		   int numSubjects = sc.nextInt();
		   
		   
		   int[] marks = new int[numSubjects];
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
	            marks[i] = sc.nextInt();
	        }

	        // Calculate and display results
	        calculateResults(marks);
	        
	        sc.close();
	    }

	private static void calculateResults(int[] marks) {
	
		   int totalMarks =0;
		    int totalSubject = marks.length;
		     
		     for( int mark: marks) {
		    	 totalMarks+=mark;
		    	   double averagePercentage =  (double)totalMarks/totalSubject;
		    	  
		    	   
		    	     String  grade ;
		    	      if( averagePercentage >=90) {
		    	    	  
		    	    	   System.out.println("grade of Student " +"A+");
		    	      } else if( averagePercentage>=80) {
		    	    	  
		    	    	  System.out.println("grade of Student " +"A");
		    	      }else if( averagePercentage>=70) {
		    	    	  System.out.println("grade of Student  " +"B");
		    	    	 
		    	      }
		    	    	  else if (averagePercentage >= 60) {
		    	    		  System.out.println("grade of Student  " +"C");
		    	         
		    	          } else if (averagePercentage >= 50) {
		    	        	  System.out.println("grade of Stident  " +"D");
		    	          } else {
		    	        	  System.out.println("grade of Stident  " +"F");
		    	          }
		    	      }
		    	   
		     }
		    
	}
	


