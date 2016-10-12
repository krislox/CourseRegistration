package courseregistration;

public class Student {
    private String studentName;
    private String studentID;
    private boolean tuitionStatus;
    
    public Student(String name, String ID, boolean tuition){
        studentName = name;
        studentID = ID;
        tuitionStatus = tuition;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public String getStudentID(){
        return studentID;
    }
    
    public boolean getTuitionStatus(){
        return tuitionStatus;
    }
    
    public void setStudentName(String name){
        if(name.length() == 0){
            System.out.println("No name entered.");
        } else{
            studentName = name;
            }
    }
    
    public void setStudentID(String ID){
        if(ID.length() == 0){
            System.out.println("No ID entered.");
        } else{
            studentID = ID;
            }
    }
    
    public void setTuitionStatus(boolean tuition){
        tuitionStatus = tuition;
    }
    
    public String toString(){
        return studentName + " (" + studentID + ")";
    }
}