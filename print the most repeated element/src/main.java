
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedadel
 */
public class main {

 
    public static void main(String[] args) {
    int []arr={1,2,1,2,2};
    int element =0;
    int count =0;
    for(int i=0;i<arr.length;i++){
        int tempElement = arr[i];
        int tempCount=0;
        for(int j=0;j<arr.length;j++)
            if(arr[j]==tempElement)
                tempCount ++;
        if(tempCount>count){
            element = tempElement;
            count = tempCount;
        }
        
        
    }
    System.out.println("The most duplicated Element is "+element+" Duplicated " + count + " Times");
    }
    
    
}
