public class Ilhas_Matriz {	
	static readerVector vetor = new readerVector();
	static int[][] vetorFinal;
	static int numIlhas = 0, x = 0, y = 0;
	
	public static void main(String[] args) {
		vetorFinal = vetor.reader();
		
		while(true){
			System.out.println("X "+x+" Y "+y);
			
			if(y >= vetor.altura()-1 && x >= vetor.largura()){
				break;
			}
			
			if(x >= vetor.largura()){
				y++;
				x = 0;
			}
			
			if(vetorFinal[x][y] != 0){
				numeroIlhas(vetorFinal, x, y);
			}else{
				x++;
			}
			
		}
		
		writer(vetorFinal);
		
	}//close main
	
	    public static void numeroIlhas(int[][] val, int xAtual, int yAtual){
			int novoY = 0, novoX = 0;
			boolean novaIlha = true;
			System.out.println(numIlhas);
			if(xAtual+1 < vetor.largura() && val[xAtual+1][yAtual] == 1){
				novoX = xAtual+1;
				numeroIlhas(val, novoX, yAtual);
			}else if(yAtual+1 < vetor.altura() && val[xAtual][yAtual+1] == 1){
				novoY = yAtual+1;
				numeroIlhas(val, xAtual, novoY);
			}else if((yAtual+1 < vetor.altura() && xAtual-1 >= 0) && ((val[xAtual-1][yAtual+1] == 1 && val[xAtual-1][yAtual] == 1))){
				novoX = xAtual-1;
				novoY = yAtual+1;
				numeroIlhas(val, novoX, novoY);
			}else{
				numIlhas++;
				x = xAtual+1;
				y = yAtual;
			}
	    }//fecha teste de numero de ilhas

	public static void writer(int[][] val) {
		 System.out.println("O numero de ilhas é: " + numIlhas);
		 for (int i = 0; i < vetor.altura(); i++) {
			for (int j = 0; j <  vetor.largura(); j++) {
				System.out.print(val[j][i]);
			}
			System.out.print("\n");
		 }		
				
	}//close function Writer			
	
}//close class