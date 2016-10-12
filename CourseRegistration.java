package courseregistration;

public class CourseRegistration {

    public static void main(String[] args) {
        
        Student s1 = new Student("Mary Jane", "1004208", true);
        Student s2 = new Student("Charlie Day", "123000", true);
        Student s3 = new Student("Molly May", "321234", true);
        Student s4 = new Student("Van Ralf Aguas", "012095", true);
        Student s5 = new Student("Tyler Hoh", "093095", true);
        Student s6 = new Student("Anderi Stoma", "EF4569", true);
        
        Student[] javaStudents = new Student[5];
        Course javaCourse = new Course("Java 111B", 5, javaStudents);

        System.out.println(javaCourse.toString());
        
        javaCourse.printRoster();
        
        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);
        javaCourse.addStudent(s3);
        javaCourse.addStudent(s4);
        javaCourse.addStudent(s5);
        
        javaCourse.addStudent(s6);
        javaCourse.printRoster();

        javaCourse.dropStudent(s3);
        javaCourse.printRoster();
        
        javaCourse.addStudent(s6);
        javaCourse.printRoster();
        
    }
    
}