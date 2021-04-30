public class TestCourse{
    public static void main(String[] args){
        AcademicCourse academicCourse=new AcademicCourse("id0","computing",6,"1","300 hours",4);
        academicCourse.register("cLead","cName","sDate","cDate");
        academicCourse.display();
        //new NonAcademicCourse("id0","computing",6,"should be a human being");
    }
}