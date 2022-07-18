package com.generation.model;

public class Course
{
    private final String code;

    private final String name;

    private final int credits;

    private final Module module;


    public Course( String code, String name, int credits, Module module ) //constructor
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;
    }

    public String getCode() //getter
    {
        return code;
    }

    public String getName() //getter
    {
        return name;
    }

    public int getCredits() //getter
    {
        return credits;
    }

    public Module getModule() //getter
    {
        return module;
    }

    @Override
    public String toString()
    {
        return "Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
            + module + '}';
    }
}


//There is a class, called Course. The private keyword is an access modifier used for attributes, methods and
// constructors, making them only accessible within the declared class. The final keyword is a non-access modifier
// used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
// There are 4 getter methods for the 4 instance variables. To represent any object as a string, you use the toString()
// method, which returns the String representation of the object
