
public class Monstruo {

	private int atk,def,spd,hp;
	
	
	public Monstruo() {
		crearMonstruo();
	}
	
	private void crearMonstruo() {
		this.atk = (int) (Math.random()*4000+3500);
		this.def = (int) (Math.random()*1500+1000);
		this.def = (int) (Math.random()*25+5);
		this.spd = (int) (Math.random()*100*25);
	}
	public void crearObjetoDropeable() {
		objetoEquipable drop = new objetoEquipable();
		System.out.println("Item drop:");
		drop.mostrarObjeto();
	}
}
