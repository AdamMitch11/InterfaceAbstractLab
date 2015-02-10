package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Adam
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
    
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.isEmpty()) {
            this.prerequisites = "none";
        }
        this.prerequisites = prerequisites;
    }
}
