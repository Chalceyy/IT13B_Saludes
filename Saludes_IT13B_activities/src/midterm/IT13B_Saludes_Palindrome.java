/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

public class IT13B_Saludes_Palindrome {
        public static void main(String[] args){
        
        String word;
      
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        word = in.nextLine();
        
        String reversed_word = new StringBuilder(word).reverse().toString();
        
        if (word.equalsIgnoreCase(reversed_word)){
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}

