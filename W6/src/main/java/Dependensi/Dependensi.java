package Dependensi;

public class Dependensi{
public static void main(String[] args) {
        gShip S1 = new gShip();
        gShip S2 = new gShip();
        S1.setName("KMS Bismarck");
        S1.setMany(8);
        S1.setDiameter(15);
        S1.setType("SK C/34");
        S2.setName("USS North Carolina");
        S2.setMany(9);
        S2.setDiameter(16);
        S2.setType("/45 caliber mark 6");
        
        Ship Sh1 = new Ship(S1);
        Ship Sh2 = new Ship(S2);
    }
}