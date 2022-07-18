package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Module
{
    private final String code;

    private final String name;

    private final String description;

    private final Map<String, Module> prerequisites = new HashMap<>();  //Hashmap called prerequisites, key is a string, Module is the value

    public Module( String code, String name, String description ) //constructor method
    {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public void addPrerequisite( Module module )
    {
        prerequisites.put( module.code, module );
    }


    public String getCode() //getter method
    {
        return code;
    }

    public String getName() //getter method
    {
        return name;
    }

    public String getDescription() //getter method
    {
        return description;
    }

    public Map<String, Module> getPrerequisites() //getter method for HashMap?
    {
        return prerequisites;
    }

    @Override
    public String toString()
    {
        return "Module{" + "name='" + name + '\'' + '}';
    }
}

//Module class has 4 instance variables: code, name, description, and prerequisites. Code, name, and description are
// all strings, and I believe prerequisites is a map interface and is implemented as a HashMap. In between the <>
// String is the key and Module is the value assigned to the key. There is a method called addPrerequisite that takes
// a parameter of module. Inside this method you see the .put method on prerequisites
// (prerequisites.put(module.code, module)).
// The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map. This means we can insert a
// specific key and the value it is mapping to into a particular map.
// Hash_Map.put(key, value)
//key: This refers to the key element that needs to be inserted into the Map for mapping.
//value:This refers to the value that the above key would map into.
//So module.code is the key, and module is value
//Lastly, have 4 getter methods: .getCode, .getName, .getDescription, .getPrerequisites and a toString method.