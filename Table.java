/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujan
 */
public class Table {
    public String name, location, category, parking;
    public Long contact;
    public int ID, numberOfFloors;

    public String name() {
        return name;
    }
    
    public String toString() {
        return "The shopping mall is \n"+"ID: "+ID+" Name: "+name+" Location: "+location+" Contact: "+contact+"Category: "+category+" Parking:"+parking+" Number of Floors: "+numberOfFloors+"/n";
    }

    public Table(String ID, String name, String location, String contact, String category, String parking, String numberOfFloors) {
        this.name = name;
        this.location = location;
        this.category = category;
        this.parking = parking;
        this.contact =Long.parseLong(contact);
        this.ID = Integer.parseInt(ID);
        this.numberOfFloors = Integer.parseInt(numberOfFloors);
    }
    
    public String getName(){
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getParking() {
        return parking;
    }
    
    public int getID(){
        return ID;
    }
    
    
    public String getStringID(){
        return String.valueOf(ID);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    
    public String getStringNumberOfFloors() {
        return String.valueOf(numberOfFloors);
    }

    public Long getContact() {
        return contact;
    }
    
    public String getStringContact(){
        return String.valueOf(contact);
    }
}
