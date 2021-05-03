public class TestCourse{
    public static void main(String[] args){
        TestCourse testCourse = new TestCourse();
        //check if AcademicCourse class is running as intended
        testCourse.checkAcademicCourse();
        System.out.println("_________End of AcademicCourse test_________");
        //check if NonAcademicCourse class is running as intended
        testCourse.checkNonAcademicCourse();
    }

    public void checkAcademicCourse(){
        AcademicCourse academicCourse=new AcademicCourse("id0","computing",6,"1","300 hours",4);
        academicCourse.display(); //before registering 
        System.out.println("_________First display() invoked. Values above_________");
        academicCourse.register("cLead","cName","sDate","cDate");
        academicCourse.display(); //after registering 
    }

    public void checkNonAcademicCourse(){
        NonAcademicCourse nonAcademicCourse=new NonAcademicCourse("id0_nonAcademics","computing",6,"No prerequisites");
        nonAcademicCourse.display(); //before registering 
        System.out.println("_________First display() invoked. Values above_________");
        nonAcademicCourse.register("cLead","iName","sDate","cDate","eDate");
        nonAcademicCourse.display(); // after registering 
        System.out.println("_________isRemoved==true_________");
        nonAcademicCourse.remove();
        nonAcademicCourse.setRemoved(true); //change value of isRemoved
        nonAcademicCourse.display(); // after updating isRemoved
    }
}