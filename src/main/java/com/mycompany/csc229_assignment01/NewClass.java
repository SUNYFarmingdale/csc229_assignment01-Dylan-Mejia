package com.mycompany.csc229_assignment01;

/**
 *
 * @author Dylan Mejia
 */
public class NewClass {
    
     public static void main(String[] args) {
         // Instance of Course Class
         Course crs = new Course();
         crs.setID(32767);
         crs.setCode("CSC 229");
         crs.setName("Dylan Mejia");
         // Printing out the information
         System.out.println("ID number: " + crs.getID());
         System.out.println("Code: " + crs.getCode());
         System.out.println("Name: " + crs.getName());
    }
    
}
