/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class bai3 {
    
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        Rectangle r=new Rectangle(s.nextDouble(),s.nextDouble(),s.next());
        System.out.println("thuoc tinh: chieu rong: "+r.getWidth()+" chieu dai: "+r.getHeight()+" mau sac: "+r.getColor());
        System.out.println("dien tich: "+r.findArea());
        System.out.println("chu vi: "+ r.findPerimeter());
    }
}
