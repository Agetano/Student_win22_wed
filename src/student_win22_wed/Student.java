
package student_win22_wed;


public class Student {
    private String studentId;
    private String studentName;
    private String address;

    public Student(String address) {
        this.address = address;
    }
    
    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName=studentName;                
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
    
}

    
   
    



    

