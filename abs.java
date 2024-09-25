abstract class college{

	abstract void displayclg();//abstract method decleare

	void displayclgname(){ //non abstract method 
		System.out.println("medicaps univercity :\n");
	}

}

class student extends college{
	@Override // override abstract method
	void displayclg(){
		System.out.println("Override abstract method of college class\n");
	}
	void displaystd(){
		System.out.println("student class method ");
	}
}
public class abs{
	public static void main(String[] args){

		student s1=new student();
		s1.displayclg();
		s1.displayclgname();
		s1.displaystd();

	}
}