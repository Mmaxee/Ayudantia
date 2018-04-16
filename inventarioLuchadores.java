import java.util.ArrayList;
import java.util.Scanner;

public class inventarioLuchadores {
	private int maxLuchadores = 25;
	private ArrayList<Luchador> luchadores = new ArrayList<>();
		
	
	public ArrayList<Luchador> getLuchadores() {
		return luchadores;
	}
	
	public void setLuchadores(ArrayList<Luchador> luchadores) {
		this.luchadores = luchadores;
	}
	
	public void agregarLuchador() {	
		if (luchadores.size()==0) { //Empieza si o si con un luchador al iniciar la partida
			luchadores.add(new Luchador());
			}		
		if (luchadores.size()<maxLuchadores) {
			luchadores.add(new Luchador());
			}
			else {
				System.out.println("Inventario de luchadores lleno");
			}
	}
	public void quitarLuchador() {
		System.out.println("**********************************************************");
		System.out.println("Que luchador desea eliminar, guíese por el [x]");
		mostrarLuchadores();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadores.remove(i-1);
	}
	public void mostrarLuchadores() {
		for(int i=0; i<luchadores.size();i++) {
			System.out.println("Luchador ["+(i+1)+"]");
			luchadores.get(i).mostrarLuchador();
		}
	}
	public void mostrarEstadistica() {
		System.out.println("De que luchador desea ver sus estadísticas, guíese por el [x]");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		luchadores.get(i-1).mostrarEstadisticas();
	}
	
	public void filtroFaccion() {
		ArrayList<Luchador> faccion = new ArrayList<>();
		String aux  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por , escriba el nombre correctamente:");
    	System.out.println("Fire");
    	System.out.println("Water");
    	System.out.println("Earth");
    	aux = sc.nextLine();
    	
    		for(int i=0; i<luchadores.size(); i++) {
    			if(luchadores.get(i).getFaccion().equals(aux)) {
    				faccion.add(luchadores.get(i));
    				}
    			}
    		for(int i=0; i<faccion.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			faccion.get(i).mostrarLuchador();	
    	}
	}
    	
	public void filtroRarity() {
		ArrayList<Luchador> Rarity = new ArrayList<>();
		int aux = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por estrellas[x], guíese por [x]:");
    	aux = sc.nextInt();
    	
    		for(int i=0; i<luchadores.size(); i++) {
    			if(luchadores.get(i).getRarity() == aux) {
    				Rarity.add(luchadores.get(i));
    				}
    			}
    		for(int i=0; i<Rarity.size();i++) {
    			System.out.println("Luchador ["+(i+1)+"]");
    			Rarity.get(i).mostrarLuchador();	
    				}
    	
		}	
	}
