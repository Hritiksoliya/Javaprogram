
class college{
	
void displaycollege(){
	System.out.println("school class");
	}
}

class student extends college{
	//single level inheritance
	// extend class student 
	void displaystudent(){
		System.out.println();
		System.out.println("student class with single level inheritance");
		System.out.println("calling college class function");
		displaycollege();

	}
}

class CSstudnt extends student{

	void displayCSstudent(){
		System.out.println();
		System.out.println("CSstudnt class with multilevel inheritance ");
		System.out.println("calling student class function");
		displaystudent();
	}
}

public class Main{
	public static void main(String[] args){

		college c1=new college();
		student s1=new student();
		CSstudnt cs1=new CSstudnt();

		c1.displaycollege();
		s1.displaystudent();
		cs1.displayCSstudent();

	}

}