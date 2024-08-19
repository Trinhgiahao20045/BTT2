/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

/**
 *
 * @author ADMIN
 */
public class HinhTron {

    
    
    
    
   //KHAI bao DU LIEU
    private double bankinh;
    //dinhnghia cac phuong thuc

    public HinhTron() {
        bankinh=3.0;
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    
    public double tinhdientich(){
        return Math.PI*bankinh*bankinh;
        
    }
    public double tinhchuvi(){
        return Math.PI*2*bankinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "bankinh:" + bankinh +",Dien tich: "+tinhdientich()+",chuvi:"+tinhchuvi()+'}';
    }
    
}
