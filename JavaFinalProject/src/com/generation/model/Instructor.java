package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instructor   //the Instructor class and it has all the methods of Person class
    extends Person
{

    private int experienceMonths;

    private final List<Course> teachingCourses = new ArrayList<>();  //the List, teachingCourses is generic where
    // list is an interface and ArrayList is an implementation of the List interface.

    protected Instructor( String id, String name, String email, Date birthDate ) //constructor method
    {
        super( id, name, email, birthDate );  //super keyword refers to superclass (Person) objects
    }

    public int getExperienceMonths() // getter method
    {
        return experienceMonths;
    }

    public void setExperienceMonths( int experienceMonths ) // setter method
    {
        this.experienceMonths = experienceMonths;
    }
}

//In this file we have a class called Instructor that extends the Person class, which means that it has access to all
// the methods of the Person class. We declared an int called experienceMonths, which is only available to the
// Instructor class. From my understanding, teachingCourses is a generic list and is implemented as an ArrayList. You
// can change it teachingCourses to something else, like LinkedList if you wanted to. Contains a constructor method.
// The super keyword refers to superclass (parent) objects. In this case, it is the Person class. It is used to call
// superclass methods, and to access the superclass constructor. Then we have a getter method, getExperienceMonths,
// and a setter method, setExperienceMonths.
