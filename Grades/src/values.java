
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
public class values {
    
 private String name;
    private int grade;
    private int year;
    private String studentNum;



    public values(String name, int grade) 
    {

        this.name = name;
this.grade=grade;    }

    // Setters and getters (Name, Age, Year and Student Number)

    public String getName() // name
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getGrade() // age
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public int getYear() // year
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getstudentNum() // studentNum
    {
    return studentNum;
    }

    public void setstudentNum(String studentNum) 
    {
        this.studentNum = studentNum;
    }

}
