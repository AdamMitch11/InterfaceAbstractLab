/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public ProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();

    public final String getCourseName() {
        return courseName;
    }    
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCourseCredits() {
        return credits;
    }
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits=credits;
    }

//    Made the following two methods private.
//    They are used to instantiate the subclasses
//    and should not change
//    validation would be required before entry
    
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
