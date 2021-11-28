package Asosiasi;
import java.io.*;

public class Asosiasi {
    static public void main (String [] args){
        CapitalCity Capital = new CapitalCity("Jakarta");
        Country Country = new Country ("Indonesia");
        Island Island = new Island ("Java");
        
        System.out.println(Capital.getCapitalCityName()+ " is the capital city of " + Country.getCountryName());
        System.out.println(Capital.getCapitalCityName()+ " is located in " + Island.getIslandName() + " island ");
    }
}
