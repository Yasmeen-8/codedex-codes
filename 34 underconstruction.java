// The Neopet class has been created for you! 💖

class Neopet {
	String name;
    String species;
	String color;
	char gender; 
	Boolean hasScarf;	

    // Add additional attributes here 💖
    double strength;
    double defense;
    double movement;
    // Add a constructor here 💖
    public Neopet(){
         strength = 0.0;
        defense = 0.0;
        movement = 0.0;
    }

    
}

public class Main {
    public static void main(String[] args) {
       Neopet gravatia = new Neopet();

        gravatia.name = "Gravatia";
        gravatia.species = "Eyrie";
        gravatia.color = "blue";
        gravatia.gender = 'F';
        gravatia.hasScarf = false;

       // Add print statement here 💖
       System.out.println("S: " + gravatia.strength);
        System.out.println("D: " + gravatia.defense);
        System.out.println("M: " + gravatia.movement);

    }
}
