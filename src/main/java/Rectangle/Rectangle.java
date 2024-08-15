/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Rectangle;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
        //khai báo thuoc tinh
       private double length;
       private double width;
       //dinh nghia cac phuong thuc 

    public Rectangle() {
       length=1.0;
       width=1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //phuong thuc setter, getter

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double findArea()
    {
        double area =length*width;
        return area;
    }
    public double findPerimetr()
    {
        double result =(length+width)*2;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}

