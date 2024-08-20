/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

/**
 *
 * @author Admin
 */
public class run_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhChuNhat hcn =new HinhChuNhat(3,6);
        HinhVuong hv =new HinhVuong(6);
        
        hcn.xuat();
        hv.xuat();
    }
    
}
