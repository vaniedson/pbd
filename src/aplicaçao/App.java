package aplicaçao;

import br.com.controle.BancodeDados;
import br.com.view.TelaFuncionario;

public class App {
	
	public static BancodeDados banco = new BancodeDados();

	public static void main(String[] args) {
		
		App.banco.conectar();
		 if(App.banco.estaConectado()){
			 System.out.println("sim");
		 }
		 else{
			 System.out.println("nao");
		 }
		 
		 new TelaFuncionario();
		 
		// App.banco.gravarEmpregado(new Empregado("Zé", 0, "7897987","565", "6767"));
		// App.banco.gravarProdutos(new Produtos("costela", 3232, "0989890", 230, 90, "233242", 1));
		 
		 //hyhjkh
	}

}
