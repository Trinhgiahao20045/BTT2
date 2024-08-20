/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    public double dai;
    public double rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    public double getchuvi(){
        return (dai+rong)*2;                
    }
    public double getdientich(){
        return (dai*rong);
    }
    public void xuat(){
        System.out.println("Hinh chu nhat[dai:"+dai+",rong:"+rong+",dien tich:"+getdientich()+"chu vi:"+getchuvi());
    }
    
}
