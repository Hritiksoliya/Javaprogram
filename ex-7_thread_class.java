// Java program to illustrate defining Thread 
// by extending Thread class 

// Here we cant extends any other class 
class Test extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Run method executed by child Thread"); 
	} 
	public static void main(String[] args) 
	{ 
		Test t = new Test(); 
		t.start(); 
		System.out.println("Main method executed by main thread"); 
    System.out.println("Hritik Patidar : 2403856 ");
	} 
} 
