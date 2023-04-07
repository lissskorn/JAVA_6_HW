/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw6;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author olesiyakorgueva
 */
public class Plant implements Externalizable {
    
    private String place;
    private String type;
    private String name;
    private int size;
    private String color;
    
    
    private static final long serialVersionUID = 1890384309832841580L;
    
    public Plant() {}
    
    public Plant(String place, String type, String name, int size,
            String color) {
        this.place = place;
        this.type = type;
        this.name = name;
        this.size = size;
        this.color = color;
    }
    
    //public Plant() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getPlace());
        out.writeObject(this.getType());
        out.writeObject(this.getName());
        out.writeObject(this.getSize());
        out.writeObject(this.getColor());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.place = (String)in.readObject();
        this.type = (String)in.readObject();
        this.name = (String)in.readObject();
        this.size = (Integer)in.readObject();
        this.color = (String)in.readObject();
    }
    
    

    
    public String getPlace() {
        return place;
    }
    
    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }
   
    @Override
    public String toString() {
         return "place = " + place + ", type = " + type + ", name =  " + name +
                 ", size = " + size + ", color =  " + color; 
        }
}
