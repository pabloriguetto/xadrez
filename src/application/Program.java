package application;

import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		
		PartidaXadrez xadrez = new PartidaXadrez();
		UI.printTabuleiro(xadrez.getPecas());
		

	}

}
