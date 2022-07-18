package com.generation.model;

import java.util.Date;

abstract public class Person
{
    private final String id;

    private final String name;

    private final String email;

    private final Date birthDate;

    protected Person( String id, String name, String email, Date birthDate ) //constructor method
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getId()
    {
        return id;
    } // getter method for student/instructor id

    public String getName()
    {
        return name;
    } // getter method for student/instructor name name

    public String getEmail()
    {
        return email;
    }   // getter method student/instructor email

    public Date getBirthDate()
    {
        return birthDate;
    }   // getter method student/instructor birthDate

    @Override
    public String toString()
    {
        return id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate;
    }
}

//Person class that has 4 instance variables, id, name, email, and birthDate that are private and final. A
// constructor method, to build person object, and 4 getter methods that return the variables. The string method
// returns a string representation of the person object. In the string method, the \' is used to insert a single
// quote character(') in the text at the point it is located. So above, I think it should be something like ,
// name='Tyler', email='email@gamil.com'
