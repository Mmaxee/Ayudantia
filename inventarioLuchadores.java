import java.util.ArrayList;
import java.util.Scanner;

public class inventarioLuchadores {
	
	private int maxLuchadores = 25;
	ArrayList<Luchador> luchadores = new ArrayList<>();
		
	public void agregarLuchador(ArrayList<Luchador> luchadorsito) {	
		if (luchadorsito.size()==0) { //Empieza si o si con un luchador al iniciar la partida
			luchadorsito.add(new Luchador());
			}
		
		if (luchadorsito.size()<maxLuchadores) {
			luchadorsito.add(new Luchador());
			}
			else {
				System.out.println("Inventario de luchadores lleno");
			}
	}
	
	public void quitarLuchador(ArrayList<Luchador> luchadorsito) {
		System.out.println("**********************************************************");
		System.out.println("Que luchador desea eliminar, guíese por el [x]");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadorsito.remove(i-1);
	}
	
	public void mostrarLuchadores(ArrayList<Luchador> luchadorsito) {
		for(int i=0; i<luchadorsito.size();i++) {
			System.out.println("Luchador ["+(i+1)+"]");
			luchadorsito.get(i).mostrarLuchador();
		}
	}
	
	public void mostrarEstadistica(ArrayList<Luchador> luchadorsito) {
		System.out.println("De que luchador desea ver sus estadísticas, guíese por el [x]");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadorsito.get(i-1).mostrarEstadisticas();
	}
	
	public void filtroFaccion(ArrayList<Luchador> luchadorsito) {
		ArrayList<Luchador> faccion = new ArrayList<>();
		String aux  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por , escriba el nombre correctamente:");
    	System.out.println("Fire");
    	System.out.println("Water");
    	System.out.println("Earth");
    	aux = sc.nextLine();
    	
    		for(int i=0; i<luchadorsito.size(); i++) {
    			if(luchadorsito.get(i).getFaccion().equals(aux)) {
    				faccion.add(luchadorsito.get(i));
    				}
    			}
    		for(int i=0; i<faccion.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			faccion.get(i).mostrarLuchador();	
    	}
	}
    	
	public void filtroRarity(ArrayList<Luchador> luchadorsito) {
		ArrayList<Luchador> Rarity = new ArrayList<>();
		int aux = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por estrellas[x], guíese por [x]:");
    	aux = sc.nextInt();
    	
    		for(int i=0; i<luchadorsito.size(); i++) {
    			if(luchadorsito.get(i).getRarity() == aux) {
    				Rarity.add(luchadorsito.get(i));
    				}
    			}
    		for(int i=0; i<Rarity.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			Rarity.get(i).mostrarLuchador();	
    				}
    	
		}	
	}
