package day4_05;

import java.util.StringTokenizer;
import java.util.Scanner;

public class PhoneNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your phone number like this form:");
        System.out.println("(xxx) xxx-xxxxxxx");
        Scanner scan = new Scanner(System.in);
        String phoneNum = scan.nextLine();
        
        StringTokenizer token = new StringTokenizer(phoneNum," -");
        System.out.println("in orders: country code, zip code, your number");
        while (token.hasMoreTokens()) 
        {
         System.out.println(token.nextToken());
        }
    }   
    
}
