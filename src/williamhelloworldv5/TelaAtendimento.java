package williamhelloworldv5;

import java.util.Scanner;

class TelaAtendimento {

	private int faixaEtaria; //1 jovem, 2 adulto e 3 idoso

  public void executar() {
		digaOi();
		digaTchau();

	}

  private void setFaixaEtaria(int idade){

		if (idade < 20)
    		faixaEtaria = 1; //jovem
		else if (idade > 60)
				faixaEtaria = 3; //idoso
		else 
				faixaEtaria = 2; //adulto

	}


	private void digaOi(){
    
		Regra regra = new Regra();

		String temp = regra.getMessageRecepcao();
		System.out.println(temp);

		System.out.print("Qual sua idade: ");
		Scanner scanner = new Scanner(System.in);
		int idadeDeAtendimento = scanner.nextInt();
    //scanf("%d", idade);

    setFaixaEtaria(idadeDeAtendimento);

	}

	private void digaTchau(){

		Regra regra = new Regra();
		String msgrecuperada = regra.getMessageDespedida(faixaEtaria);
		System.out.println(msgrecuperada); 

	}
}