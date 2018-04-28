import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Batalla {

	private int danoDadoLuchador;
	private int danoDadoMonstruo;
	private inventarioLuchadores teamEstrella;
	private Monstruo bowser;
	private int vidaMonstruoTotal;
	private int danoMonstruo;
	private int danoLuchadorFaccion;
	
	public Batalla() {
		this.teamEstrella = new inventarioLuchadores();
		this.bowser = new Monstruo();
		this.danoMonstruo = bowser.getAtk();
		this.vidaMonstruoTotal = bowser.getHp();
		partyBatalla();
		danoDados();
				
	}
	
	public void partyBatalla() {
		elegirTeam((int) Math.random()*6+1);
	}
	
	
	private void elegirTeam(int cantidad) { //Metodo temporal, luego se podrá elegir luchadores a gusto
		for(int i = 0; i<cantidad; i++) {
			this.teamEstrella.agregarLuchador();
		}
	}
	
	private int calculoDano(int vida, int dano, int defensa) {
		if ( dano-defensa < 0 ) {
			return vida;
		}else {
			vida = vida - dano - defensa;
			return vida;
		}
	}
	
	private void danoFaccion( String faccionLuchador, String faccionMonstruo) {
		
		danoLuchadorFaccion=1;
		
		if(faccionLuchador.equals("Fire")){
			if(faccionMonstruo.equals("Water")){
				danoLuchadorFaccion = (int) (danoLuchadorFaccion*0.75);
				danoMonstruo = (int) (danoMonstruo*1.5);
			} else if(faccionMonstruo.equals("Leaf")){
				danoLuchadorFaccion = (int) (danoLuchadorFaccion*1.5);
				danoMonstruo = (int) (danoMonstruo*0.75);
			}
		if(faccionLuchador.equals("Water")){
				if(faccionMonstruo.equals("Water")){
					danoLuchadorFaccion = (int) (danoLuchadorFaccion*0.75);
					danoMonstruo = (int) (danoMonstruo*1.5);
				} else if(faccionMonstruo.equals("Fire")){
					danoLuchadorFaccion = (int) (danoLuchadorFaccion*1.5);
					danoMonstruo = (int) (danoMonstruo*0.75);
				}
		if(faccionLuchador.equals("Leaf")){
			if(faccionMonstruo.equals("Fire")){
				danoLuchadorFaccion = (int) (danoLuchadorFaccion*0.75);
				danoMonstruo = (int) (danoMonstruo*1.5);
			} else if(faccionMonstruo.equals("Water")){
				danoLuchadorFaccion = (int) (danoLuchadorFaccion*1.5);
				danoMonstruo = (int) (danoMonstruo*0.75);
			}			
		}
		if (faccionLuchador.equals(faccionMonstruo)) {
			danoLuchadorFaccion = 1;
			danoMonstruo = 1;
				}
			}
		}
	}
	

		public void danoDados(){
		Dados dado = new Dados();
		if (dado.getResta()>0) {
			System.out.println("Revienta a ese monstruo");
			System.out.println("La fuerza de tus luchadores sera multiplicada por :"+dado.getResta());
			this.danoDadoLuchador = dado.getResta();
			this.danoDadoMonstruo = 1;
		}
		if (dado.getResta()<0) {
			System.out.println("GG WP, yo que tu le pongo escapar");
			System.out.println("La fuerza del monstruo sera multiplicada por :"+Math.abs(dado.getResta()));
			this.danoDadoMonstruo = Math.abs(dado.getResta());
			this.danoDadoLuchador = 1;
		}
		if (dado.getResta() == 0) {
		   this.danoDadoLuchador = 1;
		   this.danoDadoMonstruo = 1;
		}	
	}
	
	public int getDanoDadoLuchador() {
		return danoDadoLuchador;
	}
	public int getDanoDadoMonstruo() {
		return danoDadoMonstruo;
	}
	
	public void teamFight() {
			for(int i=0; i<this.teamEstrella.numeroLuchadores();i++) {
				int vida = this.teamEstrella.getLuchadores().get(i).getHp();
				int ataque = this.teamEstrella.getLuchadores().get(i).getAtk();
				monstruovsLuchador(this.teamEstrella.getLuchadores().get(i),vida,ataque);
			}
	}

	
	private void monstruovsLuchador(Luchador luchador, int vidaLuchador, int ataque) {
		int dañoTotal;
		danoFaccion(luchador.getFaccionLuchador(), bowser.getMonFaccion());
		while ( vidaLuchador > 0) {
			if(bowser.getSpd() < luchador.getSpd()) {
				System.out.println("Turno de: "+ luchador.getNombreLuchador());
				dañoTotal = luchador.getAtk()*getDanoDadoLuchador()*danoLuchadorFaccion;
				vidaMonstruoTotal =  calculoDano(vidaMonstruoTotal,dañoTotal, bowser.getDef());
				System.out.println("El luchador "+luchador.getNombreLuchador()+" a hecho un daño de :"+dañoTotal);
				System.out.println("Vida restante del monstruo :"+vidaMonstruoTotal);
				System.out.println("Turno del monstruo");
				vidaLuchador = calculoDano( vidaLuchador , danoMonstruo*getDanoDadoMonstruo(), luchador.getDef() );
				if (vidaLuchador <= 0) {
				   System.out.println("El luchador: "+luchador.getNombreLuchador()+" a muerto en combate :(");	
				   
				} else {
					System.out.println("El luchador: "+luchador.getNombreLuchador()+" a sobrevivido con Vida = "+vidaLuchador);
				}
				
			} else {
				System.out.println("Turno del monstruo");
				vidaLuchador = calculoDano( vidaLuchador , danoMonstruo*getDanoDadoMonstruo() , luchador.getDef() );
				if (vidaLuchador <= 0) {
					   System.out.println("El luchador: "+luchador.getNombreLuchador()+" a muerto en combate :(");
					   
					} else {
						System.out.println("El luchador :"+luchador.getNombreLuchador()+" a sobrevivido con Vida = "+vidaLuchador);
						System.out.println("Turno de: "+ luchador.getNombreLuchador());
						dañoTotal = luchador.getAtk()*getDanoDadoLuchador()*danoLuchadorFaccion;
						vidaMonstruoTotal =  calculoDano(vidaMonstruoTotal,dañoTotal, bowser.getDef());
						System.out.println("El luchador "+luchador.getNombreLuchador()+" a hecho un daño de :"+dañoTotal);
						System.out.println("Vida restante del monstruo :"+vidaMonstruoTotal);
						
					}
				
			}
		}
	
		
		
	}
	
	public static void main(String []args) {
		Batalla b = new Batalla();
		b.teamFight();
	}
	
	
	
	
}
