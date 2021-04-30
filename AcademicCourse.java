import static java.lang.System.out;

public class AcademicCourse extends Course{
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int noOfAssignments;
    private boolean isRegistered;
    private boolean courseRemovedStatus;
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int noOfAssignments){
        super(courseID, courseName, duration);
        //initialize some variables
        lecturerName="";
        startingDate="";
        completionDate="";
        isRegistered=false;/*non premitive datatype gets defaultValue false but the value has to be set here for the variable to reset 
                            its value every time the constructor object is invoked(called)*/
    }
    //access private variables outside the class
    public String getLecturerName(){
        return lecturerName;
    }
    public String getLevel(){
        return level;
    }
    public String getCredit(){
        return credit;
    }
    public String getStartingDate(){
        return startingDate;
    }
    public String getCompletionDate(){
        return completionDate;
    }
    public boolean getRegistered(){
        return isRegistered;
    }
    public int getNoOfAssignments(){
        return noOfAssignments;
    }
    //set values of private variables from outside the class
    public void setLecturerName(String lecturerName){
        this.lecturerName=lecturerName;
    }
    public void setNoOfAssignments(int noOfAssignments){
        this.noOfAssignments=noOfAssignments;
    }
    //set initial value(register value) of variable in superclass if not registered
    //else display values
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
        if(isRegistered){
            out.println("Instructor name: "+lecturerName);
            out.println("Starting date: "+startingDate);
            out.println("Completion date: "+completionDate);
        }else{
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            super.setCourseLeader(courseLeader);
            isRegistered=true;
            courseRemovedStatus=false;
            //register(courseLeader, lecturerName, startingDate, completionDate); //recursion
        }
    }
    //display values if registered
    public void display(){
        if(isRegistered){
            out.println("Course ID: "+super.getCourseID());
            out.println("Course Name: "+super.getCourseName());
            out.println("Duration: "+super.getDuration());
            String courseLeader = super.getCourseLeader();
            if(!courseLeader.isEmpty()){
                out.println("Course Leader: "+super.getCourseLeader());
            }
        }
    }
}