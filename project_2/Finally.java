package javaproject1;

public class Finally {
	  public static void main(String args[]){    
		  try{     
		   int division_data=2245/54;    
		   System.out.println(division_data);    
		  }    
		  catch(NullPointerException e){  
		System.out.println(e);  
		}    
		 finally {  
		System.out.println("finally block is always executed");  
		}    
		    
		System.out.println("The End");    
		  }    


}
