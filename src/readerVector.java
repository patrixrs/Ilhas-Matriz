import java.io.File;
import java.util.Scanner;

public class readerVector {
	static String padrao;
	static int x, y, f, g, resp, cont, indX, indY;
	static int[][] vetor;

	public int[][] reader() {
		try {
			Scanner file = new Scanner(new File("src/Arquivos/example_3.txt")); 
			x = file.nextInt(); // recebem os primeiros parametros inteiros
			y = file.nextInt();
			vetor = new int[x][y];			
			padrao = file.nextLine();
			while (file.hasNext()) {
				for (int i = 0; i < x; i++) {
					padrao = file.nextLine(); // recebe a linha como string					
					f = 0;
					g = 1;
					for (int j = 0; j < y; j++) {
						int valor = Integer.parseInt(padrao.substring(f, g));
						vetor[j][i] = valor;						
						f++;
						g++;
					}
				}
			}
			file.close();			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return vetor;
	}

}
