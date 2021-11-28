package Agregasi;

import java.io.*;
import java.util.*;

public class HeroClass {   
String name, weapon;  
Skill skill;  
  
public HeroClass(String name,String weapon,Skill skill) {   
    this.name = name;  
    this.weapon = weapon;
    this.skill = skill;   
}  
  
void display(){ 
    System.out.println(" ");
    System.out.println("Class: " +name); 
    System.out.println("Main Weapon: " +weapon); 
    System.out.println("Skill: +" +skill.skill1);
    System.out.println("       +" +skill.skill2);
    System.out.println("       +" +skill.skill3);
    System.out.println(" ");
    }  
}