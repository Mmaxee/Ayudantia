
public class objetoEquipable {

	
	private int probabilidad;
	private int base;
	private int baseFinal;
	private String[] atributoAzar = {"Atk","Def","Spd","Hp"};
	private String atributoMejorado;
	
	public objetoEquipable() {
		crearObjeto();
	}	
		
	public void crearObjeto() {
		base = (int) (Math.random()*9+1);
		setRarity();
		setBaseFinal();
		setmejoraAtributo();
		tipoObjeto();
		
	}
	
	public void tipoObjeto() {
		if (atributoMejorado.equals("Atk")) {
			tipo = "Espada";
		}	else if (atributoMejorado.equals("Def")) {
			tipo = "Armadura";
		}else if (atributoMejorado.equals("Spd")) {
			tipo = "Botas";
		}else if (atributoMejorado.equals("Hp")) {
			tipo = "Accesorio";
		}	
	}
	
	public String getTipo() {
		return tipo;
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
	public void setBase(int base) {
		this.base = base ;
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
	
	public void setmejoraAtributo() {
		atributoMejorado = atributoAzar[(int) (Math.random()*4)];
	}
	
	public String getmejoraAtributo() {
		return atributoMejorado;
	}
	
	public void mostrarObjeto() {
		System.out.println(getTipo());
		System.out.println(getmejoraAtributo()+"+"+getBaseFinal());
		System.out.println("Estrellas : "+getRarity());
	}


	}
	
