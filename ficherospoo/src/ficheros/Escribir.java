package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

	public void escribe() {
		
		String frase="Hola mundo, estoy escribiendo ficheros";
		
		try {
			FileWriter escritor = new FileWriter("C:/");
					
					for(int i =0; i<frase.length();i++) {
						escritor.write(frase.charAt(i));
					}
			escritor.close();
		}catch (IOException e) {
			System.out.println("Errrrrrror!");
		}
		
	}
}
