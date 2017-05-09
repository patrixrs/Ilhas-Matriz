public class Ilhas_Matriz {
	static readerVector vetor = new readerVector();
	static int[][] vetorFinal;
	static int numIlhas = 0, x = 0, y = 0;
	static Pilha pilha = new Pilha();
	static String entrada;

	public static void main(String[] args) {
		vetorFinal = vetor.reader();

		while (true) {
			if (y == vetor.altura() - 1 && x == vetor.largura()) {
				if(pilha.size() == 0){
					pilha.append(""+numIlhas);
				}
				break;
			}

			if (x == vetor.largura()) {
				y++;
				x = 0;
			}

			if (vetorFinal[x][y] != 0) {
				entrada = x+"-"+y;
				if(!pilha.validaInfo(entrada)){
					numeroIlhas(vetorFinal, x, y);
				}else{
					x++;
				}
			} else {
				x++;
			}
		}
		writer(vetorFinal);

	}// close main

	public static void numeroIlhas(int[][] val, int xAtual, int yAtual) {
		int novoY = 0, novoX = 0;
		
		entrada = xAtual+"-"+yAtual;
		pilha.append(entrada);

		if (xAtual + 1 < vetor.largura() && val[xAtual + 1][yAtual] == 1) {
			novoX = xAtual + 1;
			numeroIlhas(val, novoX, yAtual);
		} else if (yAtual + 1 < vetor.altura() && val[xAtual][yAtual + 1] == 1) {
			
			if(val[xAtual-1][yAtual + 1] == 1){
				int i = xAtual-1;
				while(val[xAtual-i][yAtual + 1] == 1 && i > 0){
					i--;
				}
				
				if(val[i][yAtual + 1] == 0){
					i++;
				}
				
				novoY = yAtual + 1;
				novoX = i;
				numeroIlhas(val, novoX, novoY);
			}else{
				novoY = yAtual + 1;
				numeroIlhas(val, xAtual, novoY);
			}
			
		} else if ((yAtual + 1 < vetor.altura() && xAtual - 1 >= 0)
				&& ((val[xAtual - 1][yAtual + 1] == 1 && val[xAtual - 1][yAtual] == 1))) {
			novoX = xAtual - 1;
			novoY = yAtual + 1;
			numeroIlhas(val, novoX, novoY);
		} else {
			numIlhas++;
			x = 0;
			y = 0;
			pilha.append(""+numIlhas);
		}
	}// fecha teste de numero de ilhas

	public static void writer(int[][] val) {
		System.out.println(numIlhas); // escreve o numero de ilhas
	}// close function Writer

}// close class