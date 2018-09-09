/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computersecurity;

import java.util.Scanner;

/**
 *
 * @author mohamedadel
 */
public class Computersecurity {
     
     
     
             
    public static void main(String[] args) {
        
        //create object to read the input from keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Cipher Text Here");
        String cipherText= input.nextLine();
        //remove all spaces from input string
        String CTremovingSpaces = cipherText.replaceAll("\\s", "");
        //convert the input string into UpperCase letters
        CTremovingSpaces = CTremovingSpaces.toUpperCase();
        //remove all special characters from the input String
        System.out.println(CTremovingSpaces.replaceAll("[^a-zA-Z0-9]", ""));
        
        //create object of class indexOfCharacters
        indexOfCharacters indexOfDecryptedText = new indexOfCharacters();
        
        // loop for characters
        for(int i =0; i<26; i++){
            //variable to hold the results of PlainText
            String plainText="";
            //key
            int key = i;
            //loop for final cipher text after removing spaces and special characters
            for(int j=0; j<CTremovingSpaces.length();j++){
                //display the character of CTRS then display its index in characters in class indxofchar.
                int index=indexOfDecryptedText.indexOf(CTremovingSpaces.charAt(j));
                
                if(index == -1){
                    System.out.println("the character does not occur");
                }
                 if((index-key)>=0)
                 {
                     //display the character that output from index-key then store it in plainText
                     plainText+=indexOfDecryptedText.charAt(index-key);
                 }
                 else
                 {
                     plainText+=indexOfDecryptedText.charAt((index-key)+26);
                 }
            }     
            
            System.out.println("The Plain Text using Key " + key + ": " + plainText);
  
            //convert the string of PlainText into character array
            char[] characters2= plainText.toCharArray();
            //store the length of the array
            int lengthOfArray = characters2.length;
            int aCount = 0;
            int eCount = 0;
            int tCount = 0;
            int oCount = 0;
            for(int x = 0; x < lengthOfArray; x++)

            {
                char characters = characters2[x];
                switch (characters) 
                {
                    case 'A': 
                        aCount++;
                        break;
                    case 'E': 
                        eCount++;
                        break;      
                    case 'T': 
                        tCount++;
                        break;      
                    case 'O': 
                        oCount++;
                        break;}
                
            }
            System.out.println("Character of A = " + aCount);
            System.out.println("Character of E = " + eCount);
            System.out.println("Character of T = " + tCount);
            System.out.println("Character of O = " + oCount);
            int sum; 
            sum = aCount + eCount + tCount + oCount;
            System.out.println("The sum of AETO = " + sum);
            ///the program will display the count numbers of AETO then calculate the sum of these numbers
            ///the greatest number of the sum of AETO will be the plain text (based on cryptanalysis)
            
            
            }}}
        
        
    
    
    
        

