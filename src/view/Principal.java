package view;

import java.util.Random;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[3][5];
		for(int i=0; i<3 ; i++){
			for(int j = 0; j < 5; j++){
				matriz[i][j] = random.nextInt(10);
			}
			Thread line = new SomaController(matriz[i], i);
			line.start();
		}
		
	}
	

}
