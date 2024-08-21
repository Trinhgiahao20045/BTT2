/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program_run {
static ArrayList<SinhVien>ds= new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    private static void menu(){
        Scanner sc=new Scanner (System.in);
        int chon=0;
        do{
            System.out.println("---cuong trinh qun ly sinh vien---");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.xuat danh sach sinh vien");
            System.out.println("3.xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4.sap xep nhan vien theo diem");
            System.out.println("5.thoat");
            System.out.println("---------------------------------");
            System.out.println("Ban chon(1->5):");
            chon=sc.nextInt();
            //xet chon de xu li
            switch(chon)
            {
            case 1:
            nhapds();
               break;
            case 2:
            xuatds();
               break;
            case 3:
                xautdssvgioi();
               break;
            case 4:
                sapxep();
               break;
            case 5:
                System.out.println("goobye. see you next time");
               break;
            }
         }while(chon !=5);
    }

    private static void nhapds() {
        System.out.println("Thuc hien nhap");
        SinhVien sv=null;
        int chon=0;
        string tieptuc="y";
        Scanner sc =new Scanner (System.in);
        System.out.println("cho biet loai sinh vien()IT-1,BIZ-2:");
        chon=sc.nextInt();
        sc.nextLine();
        if(chon==1)
        {
            //1.nhap thong tin cua sinh vien
            System.out.println("Nhap ten sinh vien: ");
            String hoten=sc.nextLine();
            System.out.println("Nhap diem java:");
            double java=sc.nextDouble();
            System.out.println("Nhap diem css:");
            double css=sc.nextDouble();
            System.out.println("Nhap diem html:");
            double html=sc.nextDouble();
            //2.tao doi tuong sinh vien nganh it
            sv = new SinhVienIt(java, css, html, hoten, hoten);
        }else if (chon==2)
        {
            //1.nhap thong tin cua sinh vien
            System.out.println("Nhap ten sinh vien: ");
            String hoten=sc.nextLine();
            System.out.println("Nhap diem marketing:");
            double Marketing=sc.nextDouble();
            System.out.println("Nhap diem sales:");
            double Sales=sc.nextDouble();
            //2.tao doi tuong sinh vien nganh biz
            sv = new SinhVienBiz(Marketing, Sales, hoten, hoten);
        }
        //3.them sinh vien vao danh sach
        ds.add(sv);
    }

    private static void xuatds() {
        System.out.println("xuat danh sach sv");
        
        
    }

    private static void xautdssvgioi() {
        System.out.println("xuat danh sach sv gioi");
    }

    private static void sapxep() {
        System.out.println("thuc hien sap xep");
    }
}
