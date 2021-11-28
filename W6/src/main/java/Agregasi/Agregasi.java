package Agregasi;

public class Agregasi{
	static public void main(String[] args) {
            Skill s1 =new Skill("Power Shoot","Arrow Rain","Paralysis Shoot");  
            Skill s2 =new Skill("Fireball","Storm","Thunder");  
			  
            HeroClass  h1=new HeroClass ("Archer","Bow", s1);  
            HeroClass  h2=new HeroClass ("Mage","Staff", s2);  
			      
            h1.display();  
            h2.display();  

	}

}