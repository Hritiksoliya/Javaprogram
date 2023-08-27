import java.lang *;

public class Myclass1{
    /*-----------------------------------------*/
    int a,b,c;
    /*-----------------------------------------*/
    void getdata(int x , int y)
    {
        a=x;
        b=y;
        return;
    }
    /*-----------------------------------------*/
    int add ()
    {
        return a+b;
    }
    /*-----------------------------------------*/
    void display()
    {
        System.out.println("sum is = \n "+c);

    }
    /*-----------------------------------------*/
    public static void main(String args[])
    {
        Myclass1 my =new Myclass1();
        Myclass1.getdata(10,5);
        Myclass1.add();
        int x Myclass1.add();
        System.out.println("sum is ="+ x);
        System.out.println("sum is = \n"+ Myclass1.add());
    }
    /*-----------------------------------------*/
}