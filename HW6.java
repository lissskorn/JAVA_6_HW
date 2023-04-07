/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw6;

import java.util.Scanner;

/**
 *
 * @author olesiyakorgueva
 */
public class HW6 {

    public static void main(String[] args) {
        System.out.println("Вариант 4; РИБО-04-21; Коргуева Олеся");
        System.out.println(Thread.currentThread().getName());
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("where does the plant live? ");
        String place = myObj.nextLine();
        
        System.out.println("what type of plant? ");
        String type = myObj.nextLine();
        
        System.out.println("what is the name of the plant? ");
        String name = myObj.nextLine();
        
        System.out.println("what is the size of the plant? ");
        int size = Integer.parseInt(myObj.nextLine());
        
        System.out.println("what colour is the plant? ");
        String color = myObj.nextLine();
        
        Plant p = new Plant(place, type, name,size, color);
        System.out.println(p.toString());
        
        SaverRunnable sr = new SaverRunnable(p, "C:\HW6_Plant.txt");
        Thread th = new Thread(sr);
        th.start();
    }
}
