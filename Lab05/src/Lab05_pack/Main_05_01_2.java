/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05_pack;

/**
 *
 * @author GF65
 */
public class Main_05_01_2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate AND");
        if (p1.isSameTeam(p2)) {
            System.out.println(p1.getName() + " is a same team with " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is not a same team with " + p2.getName());
        }
    }
}
