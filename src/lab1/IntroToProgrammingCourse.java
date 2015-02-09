package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact. -I did not
 *
 * @author      Adam
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{
    private final String prerequisites = "none";

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName,courseNumber);
    }
@Override
    public void setPrerequisites(String prerequisites){
        JOptionPane.showMessageDialog(null,
            "No prerequisites for this course");
    }

@Override
    public String getPrerequisites() {
        return prerequisites;
    } 
}
