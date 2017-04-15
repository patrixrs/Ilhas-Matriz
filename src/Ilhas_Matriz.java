public class Ilhas_Matriz {
	static int x, y, f, g, resp, cont, indX, indY;
	static readerVector vetor = new readerVector();
	static int[][] teste;
	
	public static void main(String[] args) {
		teste = vetor.reader();
		writer(teste);
	}	

	public static void writer(int[][] vetor) {
		 for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				System.out.print("|");
				System.out.print(vetor[i][j] + "|");				
			}
			System.out.print("\n");
		}
		System.out.println("\n"+cont);		
	}
}