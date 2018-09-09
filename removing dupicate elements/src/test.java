
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedadel
 */
public class test {

    static int removeDuplicates(int [] list, int n){
        if(n==0 || n==1)
            return n;
        
        int temp[]=new int[n];
        
        int j=0;
        for(int i=0; i<n-1;i++)
            if(list[i] != list[i+1])
                temp[j++] = list[i];
        temp[j++]=list[n-1];
        for(int i=0;i<j;i++)
            list[i]=temp[i];
        return j;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,6,8,8};
        int n=arr.length;
        n=removeDuplicates(arr, n);
  
        for(int i=0; i<n;i++)
            System.out.println(arr[i]+" ");
}}
