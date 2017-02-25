import structure5.*;

public class CourseDatabase{
  protected Vector<Course> courses;
  protected Course newCourse;
  public CourseDatabase(){
    newCourse = aCourse;
    courses = new Vector<Course>();
  }
  public void populateDatabase(Course course){
    courses.add(course);
  }
}
