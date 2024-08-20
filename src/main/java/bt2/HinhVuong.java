/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author Admin
 */
public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh);
    }
    @Override
    public void xuat(){
        System.out.println("vuong [canh="+super.dai+",dientich:"+super.getdientich()+",chuvi:"+super.getchuvi());
    }
}
