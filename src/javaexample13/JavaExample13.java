
package javaexample13;

import java.util.Scanner;


public class JavaExample13 {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String str1=" ", str2=" ";
        
        System.out.print("Please enter two word, Then press enter: ");
        
        str1=input.next();
        str2=input.next();
        
        input.nextLine();// for cleaning the buffer
        input.close();
        
        System.out.println("The first word is: "+str1);
        System.out.println("The second word is: "+str2);            

    }
    
}
