package williamhelloworldv5;

class Regra{
	
  public String getMessageRecepcao(){

    Configuracao configuracao = new Configuracao();

		int hora = configuracao.getHoraRef();

    String mensagem;

    if (hora >= 0 && hora < 12)
      mensagem = "BOM DIA World!";
    else if (hora > 18 && hora <= 23)
      mensagem = "BOA NOITE World!";
    else 
      mensagem = "BOA TARDE World!";

    return mensagem;
    
	}

  public String getMessageDespedida(int faixa) {

		String mensagem;

		if (faixa == 1)
			mensagem = "Tchau. Valeu bro!";
		else if(faixa == 3)
			mensagem = "Sr(a), vacina liberada!";
		else 
			mensagem = "Tudo de bom. Até a próxima Sr(a).!"; //adulto

		return mensagem;

	}
}
