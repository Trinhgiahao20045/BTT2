/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Account;

/**
 *
 * @author ADMIN
 */
public class Account {
    //khai bao thanh phan
    private String id;
    private String name;
    private int balance; 
    
    public Account (String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit(int amount){
        balance +=amount;
    }
    public void debit(int amount){
        if(balance >=amount){
            balance-=amount;
        }else
        {
            System.out.print("rut tien that bai");
        }
    }
    public void tranferTo(Account other,int amount){
        if(balance >=amount){
            balance-=amount;
        }else
        {
            System.out.print("chuyen tien that bai");
        }
    }
}
