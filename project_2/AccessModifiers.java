package javaproject1;


public class AccessModifiers {

	public int publicVar=100; 
	private int privateVar=220;
	protected int protectedVar=340;
	int defaultVar=9340;
	
	
	
	
	public void publicMethod() {
		System.out.println("this is public method");
	}
	
	public void privateMethod() {
		System.out.println("this is private method");
	}
	
	public void protectedMethod() {
		System.out.println("this is protect method");
	}
	
	void defaultMethod() {
		System.out.println("this is default method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj= new AccessModifiers();
		System.out.println("public variable: "+ obj.publicVar);
		System.out.println("private variable: "+ obj.privateVar);
		System.out.println("protect variable: "+ obj.protectedVar);
		System.out.println("default variable: "+ obj.defaultVar);
		
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
		
		
		
		
		
		
		
		

	}


}
	


