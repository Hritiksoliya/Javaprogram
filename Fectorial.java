import java.util.Scanner;

class Fectorial {
    public static void main(String[] args) {
        int input;
        int fect=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        input=sc.nextInt();
        
        for(int i=input;i>0;--i){
            if(input==0){
                fect=1;
            }
            fect=i*fect;
        }
        System.out.println("fectorial of given number is : "+fect);
        sc.close();
    }
}