
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

    /**
     * @param args the command line arguments
     * 
     */   
    
   
    public static void main(String[] args)throws IOException {
        
        String name;
        int grade;
        int year;
        String cname;
        
        ArrayList<values> student = new ArrayList<values>();
        System.out.println("Enter the data of the students");
        for(int i=0; i<2;i++){
            int studentNumber = (i+1);
            System.out.println("Data of the student number " + studentNumber + "Will be");
            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);
            System.out.println("her/his name ");
            name = in.readLine();
            System.out.println("his/her grade ");
            grade=Integer.valueOf(in.readLine());
            values students = new values(name, grade);
            student.add(students);
            
        }
        for(int j=0; j<student.size();j++){
            values st = student.get(j);
            System.out.println("The Info " + (j+1));
            System.out.println("Name " + st.getName() + "Grade " + st.getGrade());
        }
        

    }
}
   

