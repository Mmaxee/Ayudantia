
public class Monstruo {

	private int atk;
	private int hp;
	private int spd;
	private int def;
	private String monFaccion;
	private objetoEquipable[] itemDropeable;	
	
	public Monstruo() {
		crearMonstruo();
	}
	
	private void crearMonstruo() {
		this.setHp((int) (Math.random()*4000+3500));
		this.setAtk((int) (Math.random()*1500+1000));
		this.setDef((int) (Math.random()*25+5));
		this.setSpd((int) (Math.random()*100*25));
		this.setMonFaccion(monstruoFaccion(nombresFacciones()));
	}
	
    private String[] nombresFacciones() {
    	String[] nombres = {"Fire","Water","Leaf"};
    	return nombres;
    }
    private String monstruoFaccion( String[] faccionMonstruo){
    int nombresFaccion = (int)(Math.random()*3);
    String faccion = faccionMonstruo[nombresFaccion];
    return faccion;
    }
 
    private void crearObjetosDropeables() {
		itemDropeable = new objetoEquipable[3];
		itemDropeable[0] = new objetoEquipable(1);
		itemDropeable[1] = new objetoEquipable(3);
		itemDropeable[2] = new objetoEquipable(5);
	}
    
    public objetoEquipable itemDrop() { 
		objetoEquipable itemDrop = itemDropeable[dropRate()];
		return itemDrop;
	}
    
    private int dropRate() {
		int objetoStar=0;
		int probabilidad = (int) Math.random()*100+1;
		if (probabilidad<=60) {
			objetoStar=0;
		}
		else if(probabilidad<=90){
			objetoStar=1;
		}
		else {
			objetoStar=2;
		}
		return objetoStar;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getMonFaccion() {
		return monFaccion;
	}

	public void setMonFaccion(String monFaccion) {
		this.monFaccion = monFaccion;
	}
	
}
