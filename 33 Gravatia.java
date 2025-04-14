class Neopet {
    String name;
    String species;
    String color;
    char gender; 
    boolean hasScarf;	
}

public class HelloWorld {
    
    public static void main(String[] args) {
        // Write your code here 💖
        Neopet gravatia = new Neopet();
        gravatia.name = "Gravatia";
        gravatia.species = "Eyrie";
        gravatia.color = "blue";
        gravatia.gender = 'F';
        gravatia.hasScarf = false;

        Neopet idk = new Neopet();
        idk.name = "namename";
        idk.species = "cat";
        idk.color = "yellow";
        idk.gender = 'f';
        idk.hasScarf = true;
    }
}
