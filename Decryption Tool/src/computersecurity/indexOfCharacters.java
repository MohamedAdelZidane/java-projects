/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computersecurity;

/**
 *
 * @author mohamedadel
 */
public class indexOfCharacters {
    String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //display the index of characters
    public int indexOf(char character){
        //loop on each character
        for (int k=0; k<characters.length(); k++)
        {
            //display each character in each index
            if(characters.charAt(k) == character)
                return k;
        }   
        return -1; 
    }
    
    char charAt(int characterIndex)
    {
        return characters.charAt(characterIndex);
    }
}
