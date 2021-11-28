package Dependensi;

public class Ship {
    public int ManyW, DiaW;
    public String NShip, TypeW;

    public Ship(gShip gship) {
        ManyW = gship.getMany();
        DiaW = gship.getDiameter();
        NShip = gship.getName();
        TypeW = gship.getType();

        System.out.println(NShip + " was provided with main armament "
        + ManyW + " x " + DiaW + " inch " + TypeW);
    }
}