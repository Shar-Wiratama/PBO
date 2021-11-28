
public class MainClass {
    public static void main (String [] args){
        SideClass sc = new SideClass();
        sc.setName("IS-2");
        sc.setCountry("Uni Soviet");
        sc.setWeight("46 tons");
        sc.setSpeed("20km/h");
        sc.setMaingun("122 mm D-25T gun");
        sc.setYear(1943);
        
        System.out.println("Isi objek: ");
        System.out.println("Name = "+sc.getName());
        System.out.println("Country origin = "+sc.getCountry());
        System.out.println("Weight = "+sc.getWeight());
        System.out.println("Speed = "+sc.getSpeed());
        System.out.println("Main armament = "+sc.getMaingun());
        System.out.println("Year of production = "+sc.getYear());
    }
}
