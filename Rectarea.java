public class Rectangle {

  /*---------------------------------*/
  int area, length, width; //declaring variable

  /*---------------------------------*/

  void getdata(int x, int y) { //declaring method
    length = x;
    width = y;
    return;
  }

  /*---------------------------------*/
  int areacal() {
    int area = length * width;
    return area;
  }

  /*---------------------------------*/
  public void display() {
    System.out.println("Area of ractangle is " + area);
    return;
  }
}

/*---------------------------------*/
class Rectarea {

  /*---------------------------------*/
  public static void main(String args[]) {
    Rectangle rect1 = new Rectangle(); //creating new object
    Rectangle rect2 = new Rectangle(); //creating another object

    rect1.length = 64;
    rect1.width = 28;

    rect1.area = rect1.length * rect1.width;

    System.out.println("*-----------------------------------------*");
    System.out.println("Area is calculeted by accessing variable ");
    rect1.display();
    /*-------------------------------------------------------------*/

    rect2.getdata(38, 32);
    rect2.area = rect2.areacal();
    System.out.println("Area is calculeted by accessing method ");
    rect2.display();
    return;
  }
}
