
public class objetoEquipable {

	
	private int probabilidad;
	private int base;
	private int baseFinal;
	
	public objetoEquipable() {
		setRarity();
		setBase();
		setBaseFinal();
	}
	
	public int getRarity() {
		return probabilidad;
	}
	public void setRarity() {
		   int random= (int) (Math.random() * 100 + 1);
	        if (random <= 20) {
	        	probabilidad = 1;
	        		}
	        else if (random > 20 && random <= 40) {
	            probabilidad=2;
	        		}
	        else if (random > 40 && random <= 60) {
	        	probabilidad=3;
	        		}
	        else if (random > 60 && random <= 75) {
		        probabilidad=4;
		        }
	        else if (random > 75 && random <= 85) {
			    probabilidad=5;
			        }
	        else if (random > 85 && random <= 90) {
			    probabilidad=6;
			        }
	        else if (random > 90 && random <= 94) {
			    probabilidad=7;
			        }
	        else if (random > 94 && random <= 97) {
			    probabilidad=8;
			        }
	        else if (random > 97 && random <= 99) {
			    probabilidad=9;
			        }
	        else {
			    probabilidad=10;
			        }
		}
	public void setBase() {
		base = (int) (Math.random()*9+1);
	}
	public int getBase() {
		return base;
	}
	public void setBaseFinal() {
		baseFinal = getRarity()*getBase();
	}
	public int getBaseFinal() {
		return baseFinal;
	}
	public void mostrar() {
		System.out.println("Estadística base : "+getBase());
		System.out.println("Estrellas : "+getRarity());
		System.out.println("Estadística final : "+getBaseFinal());
	}

	}
	
