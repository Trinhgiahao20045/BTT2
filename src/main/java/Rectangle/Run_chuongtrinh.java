/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rectangle;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Run_chuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1;
        Rectangle r2;
        //tao doi tuong r1
        r1=new Rectangle();
        //tao doi tuuong r2
        Scanner sc = new Scanner (System.in);
        System.out.print("cho biet chieu dai: ");
        double dai=sc.nextDouble();
         System.out.print("cho biet chieu rong: ");
        double rong=sc.nextDouble();
        
        r2 = new Rectangle (dai,rong);
        //xuat thong tin
        System.out.print ("thong tin hcn thu nhat:");
        System.out.println("Dai:"+r1.getLength()+"- Rong:"+r1.getWidth()+"-Dien tich:"+r1.findArea()+"chu vi:"+r1.findPerimetr());
        
        System.out.print ("thong tin hcn thu hai:");
        System.out.println("Dai:"+r2.getLength()+"- Rong:"+r2.getWidth()+"-Dien tich:"+r2.findArea()+"chu vi:"+r2.findPerimetr());
        
    }
    
}
