package lab1;

import javax.swing.JOptionPane;

/**
 * Override two methods and provide implementations
 *
 * @author      Adam
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
