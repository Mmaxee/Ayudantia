
public class Dados {

	private int restaDados;
	private int dadoSeis;
	private int dadoOcho;
	
	public Dados() {
		Resta();
	}
	
   private void crearDados() {
	   dadoSeis = (int) (Math.random()*6+1);
	   dadoOcho = (int) (Math.random()*8+1);
	   
   }
   private void Resta() {
	   restaDados = dadoSeis - dadoOcho;
	   
   }
   public int getResta() {
	   return restaDados;
   }
	
}

