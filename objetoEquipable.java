
public class objetoEquipable {

	
	private int star;
	private int base;
	private int baseFinal;
	private String tipo;
	private String[] atributoAzar = {"Atk","Def","Spd","Hp"};
	private String atributoMejorado;
	
	public objetoEquipable() {
		base = (int) (Math.random()*9+1);
		setRarity();
		setBaseFinal();
		setmejoraAtributo();
		tipoObjeto();
		
	}
	
	public objetoEquipable(int star) {
		base = (int) (Math.random()*9+1);
		this.star = star;
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
		return star;
	}
	public void setRarity() {
		   int random= (int) (Math.random() * 100 + 1);
	        if (random <= 20) {
	        	star = 1;
	        		}
	        else if (random > 20 && random <= 40) {
	            star=2;
	        		}
	        else if (random > 40 && random <= 60) {
	        	star=3;
	        		}
	        else if (random > 60 && random <= 75) {
		        star=4;
		        }
	        else if (random > 75 && random <= 85) {
			    star=5;
			        }
	        else if (random > 85 && random <= 90) {
			    star=6;
			        }
	        else if (random > 90 && random <= 94) {
			    star=7;
			        }
	        else if (random > 94 && random <= 97) {
			    star=8;
			        }
	        else if (random > 97 && random <= 99) {
			    star=9;
			        }
	        else {
			    star=10;
			        }
		}
	public void setBase(int base) {
		this.base = base;
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


