public class Ilhas_Matriz {
	static int x, y, f, g, resp, cont, indX, indY;
	static readerVector vetor = new readerVector();
	static int[][] vetorFinal;
	
	public static void main(String[] args) {
		vetorFinal = vetor.reader();
		writer(vetorFinal);
	}	

	public static void writer(int[][] val) {
		 for (int i = 0; i < vetor.largura(); i++) {
			for (int j = 0; j < vetor.altura(); j++) {
				System.out.print(val[j][i]);
			}
			System.out.print("\n");
		}
		System.out.println("\n"+cont);		
	}
}