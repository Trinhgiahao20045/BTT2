/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVien {
    public double Marketing;
    public double Sales;

    public SinhVienBiz(double Marketing,double Sales,String hoten, String nganh) {
        super(hoten,"Biz");
        this.Marketing=Marketing;
        this.Sales=Sales;
    }

    @Override
    public double getDiem() {
        return (Marketing*2+Sales)/3;
    }
}
