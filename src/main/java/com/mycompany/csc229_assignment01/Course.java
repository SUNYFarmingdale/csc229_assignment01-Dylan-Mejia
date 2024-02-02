package com.mycompany.csc229_assignment01;

/**
 *
 * @author Dylan Mejia
 */
public class Course {
    // Default Constructor
    public Course(){

    }
    // Overloaded Constructor
    public Course(int ID, String code, String name){
        this.ID = ID;
        this.code = code;
        this.name = name;

    }
    // Declaring Private Variables
    private int ID;
    private String code;
    private String name;

    // Setter and Getter Methods
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
