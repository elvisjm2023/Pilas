package EjercicioPilasD;

import java.util.Random;

public class PilaCaramelo {
	
	public static void main (String[]args) {
		
		PilaDinamica pila = new PilaDinamica();
		Random random = new Random();
		
		int totalImperio = 0;
	    int totalRebeldes = 0;
	    int totalJediHabil = 0;
	    int totalJediMaestro = 0;
	    int totalSith = 0;
	    
	    for (int i = 0; i < 15; i++) {
	        String color = "";
	        String personaje = "";
	        String figura = "";
	        
	        if (random.nextInt(100) < 25) {
	            color = "negro";
	            personaje = "Storm Trooper";
	            totalImperio++;
	          } else if (random.nextInt(100) < 25) { 
	             color = "blanco";
	             personaje = "Soldado Rebelde";
	             totalRebeldes++;
	          } else if (random.nextInt(100) < 25) {
	            color = "azul";
	            personaje = "Jedi Hábil";
	            totalJediHabil++;  
	          } else if (random.nextInt(100) < 15) {
	            color = "verde";
	            personaje = "Maestro Jedi";
	            totalJediMaestro++;
	          } else {
	            color = "rojo";
	            personaje = "Lord Sith";
	            totalSith++;
	          }
	        
	        figura = "Figura" + i;
	        Caramelo caramelo = new Caramelo(color, personaje, figura); 

	        pila.push(caramelo);
	    	
	    }
	    
	    while(pila.cima != null) {
	        Caramelo c = pila.pop();
	        System.out.println(c.color + " - " + c.personaje + " - " + c.figura);
	      }
	    
	    System.out.println("Total Imperio: " + totalImperio);
	    System.out.println("Total Rebeldes: " + totalRebeldes);
	    System.out.println("Total Jedi Hábil: " + totalJediHabil);
	    System.out.println("Total Maestros Jedi: " + totalJediMaestro);
	    System.out.println("Total Sith: " + totalSith);
	    
	}

}
