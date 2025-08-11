//Employee salary and taxes


import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int Salary=sc.nextInt();
        if(Salary<250000){
            System.out.println("Employee pay no tax");
        }
        else if(Salary>=250000 && Salary<500000){
            System.out.println("Employee pay 5% tax");
        }
        else if(Salary>=500000 && Salary<1000000){
            System.out.println("Employee pay 20% tax");
        }
        else {
            System.out.println("Employee pay 30% tax");
        }
    }
}