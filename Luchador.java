
import java.util.Random;
public class Luchador {

	Random nAzar = new Random();
	private int atk;
	private int def;
	private int hp;
	private int spd;
	private int probabilidad;
	private String nombreLuchador;
	private String faccionLuchador;
	private objetoEquipable objeto;
	
	public Luchador() {
		crearLuchador();
	}
	private void crearLuchador() {
		setRarity();
		this.atk = (nAzar.nextInt(51)+20)*(getRarity());
		this.def = (nAzar.nextInt(21)+5)*(getRarity());
		this.spd = (nAzar.nextInt(91)+10)*(getRarity());
		this.hp = (nAzar.nextInt(301)+200)*(getRarity());
		this.setNombreLuchador(elegirNombre(nombresLuchador()));
		this.setFaccionLuchador(elegirFaccion(nombresFaccion()));
	}
	private String[] nombresLuchador() {
		String[] nombres = {"Goku","Vegeta","Freezer","Gohan","Jiren","Topo","Android17","Hit","Beerus","Whis","Kale","Cabbe","Krilin","Dyspo","Caulifla"};
		return nombres;
	}
	private String elegirNombre(String [] luchadores){
		
		int azarNombre = (int)(Math.random()*15);
		String nombreLuchador = luchadores[azarNombre];
		return nombreLuchador;
		    }	 
	public String getNombreLuchador() {
		return nombreLuchador;
	}
	public void setNombreLuchador(String nombreLuchador) {
		this.nombreLuchador = nombreLuchador;
	}
	
	private String[] nombresFaccion() {
		String[] faccion = {"Fire","Water","Leaf"};
		return faccion;
	}
	
	private String elegirFaccion(String[] faccionLuchadores) {
		int azarFaccion = (int)(Math.random()*3);
		String faccionLuchador = faccionLuchadores[azarFaccion];
		return faccionLuchador;
	}
	public String getFaccionLuchador() {
		return faccionLuchador;
	}
	public void setFaccionLuchador(String faccionLuchador) {
		this.faccionLuchador = faccionLuchador;
	}
	
	
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
	 this.spd = spd;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getRarity() {
		return probabilidad;
	}
	private void setRarity() {
		   int random= (int) (Math.random() * 100 + 1);
	        if (random <= 40) {
	        	probabilidad = 1;
	        } else if (random > 40 && random <= 70) {
	            probabilidad=2;
	        } else if (random > 70 && random <= 85) {
	        	probabilidad=3;
	        }  else if (random > 85 && random <= 95) {
		        probabilidad=4;
	        }else if (random > 95 && random <= 100) {
			    probabilidad=5;
			        }
		}
	
	public void equiparObjeto(Luchador luchador, objetoEquipable objeto) {
		setObjeto(objeto);
		mejorasObjeto(luchador,objeto);
	}
	
	public void mejorasObjeto(Luchador luchador, objetoEquipable objeto) {
		if (objeto.getTipo().equals("Espada")) {
			this.atk += objeto.getBaseFinal();
			}
		if (objeto.getTipo().equals("Armadura")) {
			this.def += objeto.getBaseFinal();
			}
		if (objeto.getTipo().equals("Botas")) {
			this.spd += objeto.getBaseFinal();
			}
		if (objeto.getTipo().equals("Accesorio")) {
			this.hp += objeto.getBaseFinal();
			}
		
	}
	
	public void setObjeto(objetoEquipable objeto) {
		this.objeto = objeto;
	}
	
	public objetoEquipable getObjeto() {
		return objeto;
	}
	
	public void mostrarLuchador() {
	System.out.println("Nombre = "+getNombreLuchador());
	System.out.println("Facción = "+getFaccionLuchador());
	System.out.println("Estrellas = "+getRarity());
	}
	public void mostrarEstadisticas() {
		System.out.println("Estadísticas:");
		System.out.println("Ataque = "+getAtk());
		System.out.println("Def = "+getDef());
		System.out.println("Speed = "+getSpd());
		System.out.println("Hp = "+getHp());
		
	}

	public static void main(String[]args) {
		Luchador l = new Luchador();
		l.crearLuchador();
		l.mostrarLuchador();
		l.mostrarEstadisticas();
	}
	}


	
		
