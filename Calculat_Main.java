// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Calculat_Main {
    public static void main(String[] args) {
        float input1,input2;
        input1=54;
        input2=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number :");
        input1=sc.nextInt();
        System.out.println("Enter The Second Number :");
        input2=sc.nextInt();
        
        System.out.print("num1+num2 is :");
        System.out.println(calc.add(input1,input2));
        System.out.print("num1-num2 is :");
        System.out.println(calc.sub(input1,input2));
        System.out.print("num1/num2 is :");
        System.out.println(calc.div(input1,input2));
        System.out.print("num1*num2 is :");
        System.out.println(calc.mul(input1,input2));
        sc.close();
    }
}

class calc{
    public static float add(float a,float b){
        return a+b;
    }
    public static float sub(float a,float b){
        return a-b;
    }
    public static float div(float a,float b){
        return a/b;
    }
    public static float mul(float a,float b){
        return a*b;
    }
    
}