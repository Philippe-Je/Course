package org.example;

public class Course {

    //instance Varibles
    private int id;
    private String name;
    private int code;

    //setter for id
    public void setId(int id) {
        this.id = id;
    }

    //getter for id
    public int getId() {
        return id;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for name
    public String getName() {
        return name;
    }

    //setter for code
    public void setCode(int code) {
        this.code = code;
    }

    //getter for code
    public int getCode() {
        return code;
    }

    //default constructor assigned with default variables
    public Course() {
        id = -1;
        name = "Unknown";
        code = 0;
    }

    //Paramatized constructor
    public Course(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    //Method to display
    public void display() {
        System.out.println("Student Id:" + id);
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
    }

    //main method
    public static void main(String[] args) {

        //Creating a course object
        Course myCourse = new Course();
        //using the setter method to set the id
        myCourse.setId(256);
        //using the setter method to set the name
        myCourse.setName("Philippe Jean");
        //using the getter method to get the code
        myCourse.getCode();

        //Displaying information
        myCourse.display();

    }
}