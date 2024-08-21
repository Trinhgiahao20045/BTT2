/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author ADMIN
 */
public class SinhVienIt extends SinhVien {
    public double java;
    public double css;
    public double html;

    public SinhVienIt(double java, double css, double html,String hoten,String nganh) {
        super(hoten,"It");
        this.java = java;
        this.css = css;
        this.html = html;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getDiem(){
       return (java*2+css+html)/4;
    }
    
}
