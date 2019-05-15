package ficheros;

import java.io.FileReader;
import java.io.IOException;

public class Lee_Fichero {

	public void lee() {
		try {
			FileReader entrada=new FileReader("C:/Users/USUARIO");
					
			int f=0;
			while (f!=-1) {
				f=entrada.read();
				char letra=(char)f;
				System.out.println(letra);
			}
			entrada.close();
		}catch (IOException e) {
			System.out.println("ERROR NO SE ENCUENTRA EL FICHERO");
		}
	}
}
