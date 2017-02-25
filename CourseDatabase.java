import structure5.*;

public class CourseDatabase{
  protected Vector<Course> courses;
  protected Course newCourse;
  public CourseDatabase(Course aCourse){
    newCourse = aCourse;
    courses = new Vector<Course>();
    populateDatabase(newCourse);
  }
  public void populateDatabase(Course course){
    courses.add(course);
  }
}
