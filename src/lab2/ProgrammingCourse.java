/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Adam
 */
public interface ProgrammingCourse {
    public void createProgrammingCourse(String courseName, String courseNumber);

    public String getCourseNumber();

    public void setCourseNumber(String courseNumber);

    public double getCredits();
    
    public void setCredits(double credits);

    public String getCourseName();

    public void setCourseName(String courseName);
  
}
