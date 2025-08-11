//Enter the number of week to know the day


import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the day of the week : ");
        int day=sc.nextInt();
        switch(day){
            case 1-> System.out.println("The day is Monday");
            case 2-> System.out.println("The day is tuesday");
            case 3-> System.out.println("The day is wedday");
            case 4-> System.out.println("The day is thuesday");
            case 5-> System.out.println("The day is friday");
            case 6-> System.out.println("The day is saturday");
            case 7-> System.out.println("The day is sunday");
            default->System.out.println("Enter a valid number (1-7)");
        }
    }
    
}

