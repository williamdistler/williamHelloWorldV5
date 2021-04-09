package williamhelloworldv5;

import java.util.Date;
import java.text.SimpleDateFormat;

class Configuracao{
  
  public int getHoraRef(){

		Date agora = new Date();
		SimpleDateFormat mascara = new SimpleDateFormat("HH");
		int hora =  Integer.parseInt(mascara.format(agora));

    if (hora == 0 || hora == 1 || hora == 2)
      hora += 21;
    else
      hora -= 3;
    
    return hora;

  }
}
