package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation  //  implements keyword is used to implement an interface
{
    private double average;

    private final List<Course> courses = new ArrayList<>(); //A list called courses that is implemented as an ArrayList

    private final Map<String, Course> approvedCourses = new HashMap<>(); //HashMap called approvedCourses

    public Student(String id, String name, String email, Date birthDate)   // constructor method
    {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {
        //TODO implement this method
        this.courses.add(course);
    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }

    //The .getCode() method is in Module.java and the Course.java, and I'm not sure how it can be used here without
    // being imported or if it's because it's a part of the same package.
    // approvedCourses is a Hashmap, and course.getCode is the key, and course is the value assigned to the key
    //I am assuming this method gets the course code as the key and assigns the value of course to that key and puts it
    // in the map approvedCourses.

    public boolean isAttendingCourse(String courseCode) {
        //TODO implement this method
        for (Course course : courses) {
            if (Objects.equals(course.getCode(), courseCode)) {
                return true;
            }
        }
        return false;
    }



    //What is the objective of the isAttendingCourse method? I believe in this method, it should return true if the
    // student is enrolled in the course, else it should return false. If that is the case, I believe an if statement
    // needs to be used.

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}

//class Student extends the Person class and implements the Evaluation interface. An interface is an abstract "class"
// that is used to group related methods with "empty" bodies. The Evaluation interface contains the empty getAverage
// method. The class Student contains the instance variables: average (a double), courses(a List), and
// approvedCourses (a map). The Student constructor extends the Person constructor.
//The method getAverage() is a getter method that returns the average
//The toString() method uses the super keyword, so it uses the toString method in the Person class where it is
// implemented.










