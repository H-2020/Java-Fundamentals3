package be.student.intecbrussel.hilal;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text=scanner.nextLine();
        String reverse="";
        System.out.println("your text is: "+text);

        for( int index=text.length()-1;index>=0 ;index--){
            reverse =reverse+text.charAt(index);
        }
        System.out.println(reverse);
        if(text.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
