import java.util.ArrayList;
import java.util.Scanner;
public class inventarioObjetos {

	private int maxItems;
	private ArrayList<objetoEquipable> item;
	
	public inventarioObjetos() {
		maxItems=10;
		item = new ArrayList<objetoEquipable>();
	}
	
	private void agregarItem() {
		if (item.size()<maxItems) {
		item.add(new objetoEquipable());
		}
		else {
			System.out.println("Inventario lleno");
		}
	}
	private void quitarItem() {
		System.out.println("Que item desea eliminar, gu�ese por el [x]");
		mostrarItems();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		item.remove(i-1);
	}
	
	public void mostrarItems() {
		for(int i=0; i<item.size();i++) {
			System.out.println("Item ["+(i+1)+"]");
			item.get(i).mostrarObjeto();
		}
	}
	
	public void filtroRarity() {
		ArrayList<objetoEquipable> Rarity = new ArrayList<>();
		int aux = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Filtrar por x estrellas, gu�ese por [x]:");
    	aux = sc.nextInt();
    	
    		for(int i=0; i<item.size(); i++) {
    			if(item.get(i).getRarity() == aux) {
    				Rarity.add(item.get(i));
    				}
    			}
    		for(int i=0; i<Rarity.size();i++) {
    			System.out.println("Item ["+(i+1)+"]");
    			Rarity.get(i).mostrarObjeto();	
    				}
    	
		}
}
