import static java.lang.System.out;

public class NonAcademicCourse extends Course{
    private String instructorName;
    private int duration;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        //set initial values
        this.prerequisite=prerequisite;
        startDate="";
        completionDate="";
        examDate="";
        isRegistered=false;
        isRemoved=false;
    }
    //access values private variables outside the class
    public String getInstructorName(){
        return instructorName;
    }
    public int getDuration(){
        return duration;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getCompletionDate(){
        return completionDate;
    }
    public String getExamDate(){
        return examDate;
    }
    public String getPrerequisite(){
        return prerequisite;
    }
    public boolean getRegistered(){
        return isRegistered;
    }
    public boolean getRemoved(){
        return isRemoved;
    }
    //set values of private variables from outside the class
    public void setInstructorName(String instructorName){
        if(!isRegistered){
            this.instructorName=instructorName;
        }else{
            out.println("It is not possible to change instructor name since non academic course has already been registered");
        }
    }
    //set initial value of variable in superclass
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(!isRegistered){
            setInstructorName(instructorName);
            isRegistered=true; //if block will not be executed if instructorName is not empty
        }else{
            out.println("The course has already been registered");
        }
    }
    //reset values
    public void remove(){
        if(isRemoved){
            out.println("The course has already been removed");
        }else{
            super.setCourseLeader("");
            startDate="";
            completionDate="";
            examDate="";
            isRegistered=false; //code blocks to set values can run on next check again
            isRemoved=true;
        }
    }
    //display values if user is registered and if values are not empty/null
    public void display(){
            out.println("Course ID: "+super.getCourseID());
            out.println("Course Name: "+super.getCourseName());
            out.println("Duration: "+super.getDuration());
        if(isRegistered){
            out.println("Instructor Name: "+instructorName);
            out.println("Starting Date: "+startDate);
            out.println("Completion Date: "+completionDate);
            out.println("Exam Date: "+examDate);
        }
    }
}