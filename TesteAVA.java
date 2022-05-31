public class Teste{
	
	public static void main(String [] args){
		
		System.out.println ("");
		System.out.println ("Testando Classe Caminhao");
		
		Caminhao ca = new Caminhao();
		ca.movimento(15);
		ca.movimento(30);
		ca.movimento(65);
		
		ca.carregaCaminhao(50);
		ca.carregaCaminhao(60);
		
		ca.descarregaCaminhao(20);
		ca.descarregaCaminhao(100);
		
		System.out.println ("");
		System.out.println ("Testando Classe Onibus");

		Onibus onibus = new Onibus();  
		onibus.embarca(50);
		onibus.acelera(30);
		onibus.freia(30);
		onibus.desembarca(10);
		onibus.embarca(3);
		onibus.acelera(30);
		
		System.out.println(onibus.toString());

		System.out.println ("");
		System.out.println ("Testando Classe Veiculo");

		Veiculo carro1 = new Veiculo();
        carro1.setAno(2019);
        carro1.setCor("AZUL");
        carro1.setModelo("PICK-UP");

        Veiculo carro2 = new Veiculo();
        carro2.setAno(2020);
        carro2.setCor("Branca");
        carro2.setModelo("FIORINO");

		String imprime1 = carro1.exibe();
        System.out.println(imprime1);
        String imprime2 = carro2.exibe();
        System.out.println(imprime2);
	}
}