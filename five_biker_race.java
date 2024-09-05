/* five biker Compete in a race such that they drive at a constant speed which may or may not be the  same as the other . to qualify the race 
 * ,the speedd of a racer must be more then the average speed of all 5 racers . Take input the speed of each racer and print back the speed of qualifying racers
 */

import java.util.Scanner;

public class five_biker_race {

    public static void main(String[] args) {
        float speed[];
        float speed_sum=0.0f;
        speed = new float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < speed.length; i++) {
            System.out.println("Enter the speed of " + (i + 1) + " Racer :");
            speed[i] = sc.nextFloat();
            speed_sum=speed_sum+speed[i];
        }
        float avg =speed_sum/speed.length;
        System.out.println("biker need  atleast speed of "+avg+"km/h" );
        byte count=0;
        for (int i = 0; i < speed.length; i++) {
            if(speed[i]>=avg){
                System.out.println("biker "+(i+1)+" 0is quilifyd race");
                count++;
            }
        }
        if(count==5){
            System.out.println("congratulation All racer qulifyd");
        }
        if(count==0){
            System.out.println("no racer qulifyd");
        }

        sc.close();
    }
}
