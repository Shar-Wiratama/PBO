package Komposisi;

import java.io.*;
import java.util.*;

public class Komposisi {
    static public void main(String[] args){
        tank t1 = new tank("M4A3E8 Sherman", "Medium tank", "United State");
        tank t2 = new tank("Tiger II", "Heavy tank", "Germany");
        tank t3 = new tank("SU-152", "Tank destroyer", "Uni Soviet");
        
        List<tank> tanks = new ArrayList<tank>();
        tanks.add(t1);
        tanks.add(t2);
        tanks.add(t3);
        
        Museum museum = new Museum(tanks);
        
        List<tank> tk = museum.getTankInMuseum();
        for(tank tks : tk){
            System.out.println(tks.name + " is a " + tks.type 
                    + " that produced in " + tks.country);
        }
    }
}
