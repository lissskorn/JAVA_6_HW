/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author olesiyakorgueva
 */
public class SaverRunnable implements Runnable {

   private Plant plant;
   private String path;
   
   public SaverRunnable(Plant plant, String path) {
       this.plant = plant;
       this.path = path;
   }

    @Override
    public void run() {
        if(this.path != null && plant != null) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(this.path);
                ObjectOutputStream oss = new ObjectOutputStream(fos);
                oss.writeObject(plant);
                oss.close();
                System.out.println("The file is saved and located: " + this.path);  
            } catch (IOException ex) {
                System.out.println("Error saving object to path: " + this.path);
            }
        }
    }    
}
