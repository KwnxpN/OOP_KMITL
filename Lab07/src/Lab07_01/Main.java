package Lab07_01;


import Lab07_01.CheckingAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

public static void main(String[] args) {
 CheckingAccount a1 = new CheckingAccount();
 a1.deposit(500);
 System.out.println(a1);
 a1.withdraw(40000.0);
 System.out.println(a1.toString());
 }



}
