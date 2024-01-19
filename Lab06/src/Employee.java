/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Wallet getWallet() {
        return wallet; 
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void eat(Food f) {
       this.setEnergy(this.getEnergy() + f.getEnergy());
    }
    public boolean buyFood(Seller s) {
         if (s.sell(this) != null) {
             eat(s.sell(this));
             return true;
        }
         else {
             return false;
         }
    }
    public boolean equals(Employee e) {
        if (e.getName().equals(this.getName())) {
            return true;
        } else {return false;}
    }
    public String toString() {
        return ("My name is "+this.getName()+". \nI have "+this.getEnergy()+" energy left.\nI have a balance of "+this.getWallet().getBalance()+" baht.");
    }
}
