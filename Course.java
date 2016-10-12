package courseregistration;
import courseregistration.Student;

public class Course {
    private String courseName;
    private int courseCapacity;
    private Student[] rosterArray;
    
    public Course(String name, int size, Student[] roster){
        courseName = name;
        courseCapacity = size;
        rosterArray = roster;
    }
    
    public void setCourseName(String name){
        if(name.length() == 0){
            System.out.println("No name entered.");
        } else{
            courseName = name;
        }
    }
    
    public void setCourseCapacity(int size){
        if(size <= 0){
            System.out.println("Size invalid.");
        } else{
            courseCapacity = size;
        }
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public int getCourseCapacity(){
        return courseCapacity;
    }
    
    public String toString(){
        return courseName + "(" + courseCapacity + " student capacity)";
    }
    
    public boolean addStudent(Student s){
        for(int i = 0; i < rosterArray.length; i++){
            if(rosterArray[i] == null && s.getTuitionStatus() == true){
                rosterArray[i] = s;
                return true;
            }
        }
        System.out.println( s.getStudentName() + " (" + s.getStudentID() + ") could not be added to the course.");
        return false;
    }
    
    public boolean dropStudent(Student s){
        for(int i = 0; i < rosterArray.length; i++){
            if(rosterArray[i].getStudentID().equals(s.getStudentID())){
                //"fills" the array, shifts all elements to the left
                //removes last elements in array       
                rosterArray[i] = null;
                if(rosterArray[i+1] != null || rosterArray[i] != rosterArray[i+1]){
                    rosterArray[i] = rosterArray[i+1];
                    rosterArray[i+1] = null;
                }
                return true;
            }
        }
        return false;
    }
    
    public void printRoster(){
        int emptyCounter = 0;
        int studentCounter = 0;
        
        System.out.println();
        for(Student s : rosterArray){
            if(s == null){
                emptyCounter++;
            } else{
                studentCounter++;
            }
        }
        
        if(emptyCounter == rosterArray.length){
            System.out.println("-- No students enrolled --");
        } else{
            System.out.println("Enrollment: " + studentCounter);
            for (Student s : rosterArray) {
                if (s == null) {
                    System.out.print("");
                } else {
                    System.out.println(s);
                }
            }
        }
    }
}