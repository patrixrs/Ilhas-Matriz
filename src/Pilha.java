
public class Pilha {

	private String[] coordenadas = new String[20];
	private int numElementos = 0;

	public void append(String valor) {
		aumentaEspaco();
		coordenadas[numElementos] = valor;
		numElementos++;
	}// fecha metodo

	public void aumentaEspaco() {
		if (numElementos >= coordenadas.length) {
			String[] novo = new String[coordenadas.length * 2];
			for (int i = 0; i < coordenadas.length; i++) {
				novo[i] = coordenadas[i];
			} // fecha for
			coordenadas = novo;
		} // fecha if
	}// fecha metodo

	public int size() {
		return numElementos;
	}

	public boolean validaInfo(String info) {
		if (numElementos > 0) {
			for (int i = 0; i < numElementos; i++) {
				if (coordenadas[i].equals(info)) {
					return true;
				}
			}

		}
		return false;
	}// close validaInfo
	
	public void printPilha(){
		int n = 1;
		
		if(coordenadas[0].equals("0")){
			System.out.println("Não existem ilhas neste mapa.");
		}else{
			for(int i = 0; i < numElementos; i++){
				if(coordenadas[i].equals(""+n) ){
					System.out.print("} coordenadas da ilha "+n+"\n");
					n++;
				}else{
					System.out.print(coordenadas[i] + " ");
				}
			}
		}
		
	}

}// close class
