import static java.lang.System.out; //import out variable from System class to avoid writing System.out multiple times in this class

public class Course{
    //fields are private for encapsulation 
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    //constructor method runs when calling virtual/instance methods (or when making instance(Object) of the class to be precise)
    public Course(String courseID, String courseName, int duration){
        //set initial values
        //Premitive datatypes have a default value if not initialised but non premitive datatypes get null value
        this.courseID=courseID;//setting value of variable in field equal to the value of respective fields in parameter 
        this.courseName=courseName;
        this.duration=duration;
        courseLeader="";
    }
    //access value stored in private fields in subclasses
    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCourseLeader(){
        return courseLeader;
    }

    public int getDuration(){
        return duration;
    }
    //set values of private field from outside the class.
    public void setCourseLeader(String courseLeader){
        this.courseLeader=courseLeader;
    }
    //display suitable values
    public void display(){
        out.println("courseID: "+courseID);
        out.println("courseName: "+courseName);
        out.println("duration: "+duration);
        if(!courseLeader.isEmpty()){ //check if courseLeader variable is empty("" or length is equal to 0)
            out.println("courseLeader: "+courseLeader);
        }
    }
}