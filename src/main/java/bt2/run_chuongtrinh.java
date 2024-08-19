/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class run_chuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhTron htron = new HinhTron(4);
        System.out.println("hinh tron: "+ htron.toString());
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap bankinh: ");
//        htron.bankinh = sc.nextDouble();
//        System.out.println("hinh tron: " + htron.toString());

        HinhTru htru = new HinhTru(5, 3);
        System.out.println("hinh tru: " + htru.toString());

//        Scanner scd = new Scanner(System.in);
//        System.out.print("nhap bankinh: ");
//        htru.bankinh = scd.nextDouble();
//        System.out.print("nhap chieucao: ");
//        htru.chieucao = scd.nextDouble();
//        System.out.println("hinh tru: " + htru.toString());

    }

}
