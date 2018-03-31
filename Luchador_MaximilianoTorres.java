import java.util.Random;
public class Luchador {

	Random nAzar = new Random();
	private int Atk;
	private int Def;
	private int Spd;
	private int Hp;
	private int probabilidad;
	private String[] nombres = {"Goku","Vegeta","Freezer","Gohan","Jiren","Topo","Android17","Hit","Beerus","Whis","Kale","Cabbe","Krilin","Dyspo","Caulifla"};
	private String nombreLuchador;
	private String[] faccion = {"Fuego","Agua","Tierra"};
	private String faccionLuchador;
	
	public Luchador() {
		setRarity();
		setAtk();
		setDef();
		setSpd();
		setHp();
		setNombre();
		setFaccion();
	}
	public int getAtk() {
		return Atk;
	}
	public void setAtk() {
		Atk = (nAzar.nextInt(51)+20)*(getRarity());
	}
	public int getDef() {
		return Def;
	}
	public void setDef() {
		Def = (nAzar.nextInt(21)+5)*(getRarity());
	}
	public int getSpd() {
		return Spd;
	}
	public void setSpd() {
		Spd = (nAzar.nextInt(91)+10)*(getRarity());
	}
	public int getHp() {
		return Hp;
	}
	public void setHp() {
		Hp = (nAzar.nextInt(301)+200)*(getRarity());
	}
	public int getRarity() {
		return probabilidad;
	}
	public void setRarity() {
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
	public void setNombre() {
		nombreLuchador = nombres[nAzar.nextInt(15)];
		
	}
	public String getNombre() {
		return nombreLuchador;
	}
	public void setFaccion() {
		faccionLuchador = faccion[nAzar.nextInt(3)];
	}
	public String getFaccion() {
		return faccionLuchador;
	}
	
		public void mostrarLuchador() {
	System.out.println("Nombre = "+getNombre());
	System.out.println("Facción = "+getFaccion());
	System.out.println("Estrellas = "+getRarity());
	}
	public void mostrarEstadisticas() {
		System.out.println("Estadísticas:");
		System.out.println("Ataque = "+getAtk());
		System.out.println("Def = "+getDef());
		System.out.println("Speed = "+getSpd());
		System.out.println("Hp = "+getHp());
		
	}

	}


	
		
