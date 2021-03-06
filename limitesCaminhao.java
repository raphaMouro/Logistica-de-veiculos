public class Caminhao extends Veiculo {
	
	protected final int limitedaestrada = 50; 
	protected int capacidadeDeCarga = 100; 
	protected int qtdCarga; // 
	
	public void movimento(int n){ 
		if ((velocidade + n) <= limitedaestrada){
			velocidade = velocidade + n;
			System.out.println ("Dentro da velocidade permetida");
		}
		else{
			System.out.println("Acima da velocidade permetida, ATENÇÃO.");
		}
	}
				public void carregaCaminhao(int n){
			System.out.println("Carregando Caminhao");
			if ((qtdCarga + n) <= capacidadeDeCarga){
					qtdCarga = qtdCarga + n;
					System.out.println("Colocar Carga >> Carga=" + qtdCarga);
				}
			else{
					qtdCarga = qtdCarga + n;
					System.out.println("Caminhao Carregado >> Carga=" + qtdCarga);
			}
		}
		
		public void descarregaCaminhao(int n){
			System.out.println("Descarregando Caminhao");
			if((qtdCarga - n) >= 0){
					qtdCarga = qtdCarga - n;
					System.out.println("Retirar Carga >> Carga=" + qtdCarga);
				}
			else {
				qtdCarga = qtdCarga - n;
				System.out.println("Caminhao Descarregado >> Carga=" + qtdCarga);
			}
		}
		
		public String toString(){
			return(super.toString() + " Carga: "+qtdCarga);
		}
}