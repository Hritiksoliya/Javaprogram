interface It{

 void displayIt();

}

interface Cs{

 void displayCs();

}

class department implements It,Cs{

	 public void displayIt(){

		System.out.println("IT department\n");
	}
	 public void displayCs(){
		System.out.println("CS department\n");
	}
}


public class multiple_inhe{
	public static void main(String[] args){

		department d1= new department();
		d1.displayIt();
		d1.displayCs();
	}
}