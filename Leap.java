//check the entered year is leap year or not

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the year : ");
        int year=sc.nextInt();
        if(year%4==0){
            System.err.println(year+" is a Leap year");
        }
        else {
            System.err.println(year+" is not a Leap year");
        }
    }
    
}

