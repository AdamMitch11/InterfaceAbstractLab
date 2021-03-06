package lab1;

/**
 *
 * @author Adam
 */
public class Startup {

    /**
     *
     * @param args
     */

        public static void main(String[] args) {
            //Liskov sub
            ProgrammingCourse[] courseList = { new AdvancedJavaCourse("Advanced Java","COURSE_NUMBER"),
            new IntroJavaCourse("Introduction to Java","COURSE_NUMBER"),
            new IntroToProgrammingCourse("Introduction to Programming","COURSE_NUMBER")};
        
            for(ProgrammingCourse c : courseList) {
                System.out.println(c.getCourseName());
        }
    }
}

//I'm still not incredibly fond of abstract classes, but in a learning environment they
//are very easy to learn and use. In this example it keeps code reuse high, because the
//code is primarily getters and setters as it is.