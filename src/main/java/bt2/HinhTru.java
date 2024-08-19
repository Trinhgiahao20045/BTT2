/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron {
        //khai bao du lieu
  //private double bankinh;
    double chieucao;
    //dinh nghia cac phuong thuc
    public HinhTru() {
        super();
        chieucao=5.0;
    }

    public HinhTru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }
    public double Tinhdientich(){
        return 2*super.tinhdientich()+tinhchuvi()*chieucao;
    }
    public double TinhTheTich(){
        return super.tinhdientich()*chieucao;
    }

    @Override
    public String toString() {
        return "HinhTru{" + "Ban kinh: "+super.getBankinh() +"chieucao=" + chieucao + ",dien tich:"+Tinhdientich()+",the tich:"+TinhTheTich()+'}';
    }
    
}
