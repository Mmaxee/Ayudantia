import java.util.ArrayList;
import java.util.Scanner;

public class inventarioLuchadores {

	public static void main(String[]args) {
		ArrayList<Luchador> luchadores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int o = 0;
		while(o != 6){
		System.out.println("***************************************");	
		System.out.println("1. Agregar luchador");
        System.out.println("2. Quitar luchador");
        System.out.println("3. Mostrar Luchadores");
        System.out.println("4. Ver estadísticas de un luchador");
        System.out.println("5. Filtar por facción");
        System.out.println("6. Filtrar por rareza");
        System.out.println("7. Salir");
            o = sc.nextInt();
        switch (o) {
            case 1:
                agregarLuchador(luchadores);
                System.out.println("Creación realizada :D" );
                break;

            case 2:
            	mostrarLuchadores(luchadores);
            	quitarLuchador(luchadores);
                break;
                     
            case 3:
               mostrarLuchadores(luchadores);
               break;
            
            case 4:
            	mostrarLuchadores(luchadores);
            	mostrarEstadistica(luchadores);
            	break;
            	
            case 5:
            	filtroFaccion(luchadores);
            	break;
            	
            case 6:
            	filtroRarity(luchadores);
            	break;
            	
            case 7:System.exit(0);

                break;
          }
	}
		}
		

	public static void agregarLuchador(ArrayList<Luchador> luchadorsito) {
		luchadorsito.add(new Luchador());
	}
	public static void quitarLuchador(ArrayList<Luchador> luchadorsito) {
		System.out.println("**********************************************************");
		System.out.println("Que luchador desea eliminar, guíese por el [x]");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadorsito.remove(i-1);
	}
	public static void mostrarLuchadores(ArrayList<Luchador> luchadorsito) {
		for(int i=0; i<luchadorsito.size();i++) {
			System.out.println("Luchador ["+(i+1)+"]");
			luchadorsito.get(i).mostrarLuchador();
		}
	}
	public static void mostrarEstadistica(ArrayList<Luchador> luchadorsito) {
		System.out.println("De que luchador desea ver sus estadísticas, guíese por el [x]");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadorsito.get(i-1).mostrarEstadisticas();
	}
	
	public static void filtroFaccion(ArrayList<Luchador> luchadorsito) {
		ArrayList<Luchador> faccion = new ArrayList<>();
		int aux = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por , guíese por [x]:");
    	System.out.println("Fire[1]");
    	System.out.println("Water[2]");
    	System.out.println("Earth[3]");
    	aux = sc.nextInt();
    	switch (aux){
    	
    	case 1:
    		for(int i=0; i<luchadorsito.size(); i++) {
    			if(luchadorsito.get(i).getFaccion() == "Fire") {
    				faccion.add(luchadorsito.get(i));
    				}
    			}
    		for(int i=0; i<faccion.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			faccion.get(i).mostrarLuchador();	
    	}
    		
    			break;
    	
    	case 2:
    		for(int i=0; i<luchadorsito.size(); i++) {
				if(luchadorsito.get(i).getFaccion() == "Water") {
					faccion.add(luchadorsito.get(i));
					}
				}
			for(int i=0; i<faccion.size();i++) {
				System.out.println("Luchador ["+(i+1)+"]");
				faccion.get(i).mostrarLuchador();	
		}
			
				break;
				
    	case 3:
			for(int i=0; i<luchadorsito.size(); i++) {
				if(luchadorsito.get(i).getFaccion() == "Earth") {
					faccion.add(luchadorsito.get(i));
					}
				}
			for(int i=0; i<faccion.size();i++) {
				System.out.println("Luchador ["+(i+1)+"]");
				faccion.get(i).mostrarLuchador();	
		}

    	
				break;
    	}
    }
	public static void filtroRarity(ArrayList<Luchador> luchadorsito) {
		ArrayList<Luchador> Rarity = new ArrayList<>();
		int aux = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por , guíese por [x]:");
    		System.out.println("1 Estrella[1]");
    		System.out.println("2 Estrellas[2]");
    		System.out.println("3 Estrellas[3]");
    		System.out.println("4 Estrellas[4]");
    		System.out.println("5 Estrellas[5]");
    		aux = sc.nextInt();
    	
    		for(int i=0; i<luchadorsito.size(); i++) {
    			if(luchadorsito.get(i).getRarity() == 1) {
    				Rarity.add(luchadorsito.get(i));
    				}
    			}
    		for(int i=0; i<Rarity.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			Rarity.get(i).mostrarLuchador();	
    		}
    	
	    }	
	} 
