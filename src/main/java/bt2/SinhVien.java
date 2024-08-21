/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author ADMIN
 */
abstract public class SinhVien {
    public String hoten;
    public String nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
abstract public double getDiem();

public String gethocluc()
{
    String kq="";
    double dtb=getDiem();
    if (dtb<5)
    {
        kq="yeu";
    }else if(dtb<6.5)
    {
        kq="trung binh";
    }else if (dtb<7.5)
    {
        kq="kha";
    }else if (dtb<9)
    {
        kq="gioi";
    }else
    {
        kq="xuat sac";
    }
    return kq;
}

public void xuat()
{
    System.out.println("ho ten:"+hoten+"nganh:"+nganh+"dtb:"+getDiem()+"hoc luc:"+gethocluc());
}
    
}
