//to find the type of website


import java.util.Scanner;

public class Toofweb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter your website URL : ");
        String url=sc.nextLine();
        if(url.endsWith(".com")){
            System.err.println("It's an Commercial Website");
        }
        else if(url.endsWith(".org")){
            System.err.println("It's an Organization Website");
        }
        else if(url.endsWith(".in")){
            System.err.println("It's an Indian Website");
        }
        else {
            System.err.println("wrong Website url");
        }
    }
}
