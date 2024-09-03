package controller;

public class ThreadSaposController extends Thread{
	private int sapo;
	private static int posicao = 0;
	
	public ThreadSaposController(int sapo) {
		this.sapo = sapo;
	}
	
	@Override
	public void run() {
		correr();
	}

	private void correr() {
		int distancia = 0;
		int salto;
		
		while (distancia < 100) {
			salto = (int) (Math.random() * 5 + 1);
			distancia += salto;
			System.out.println("O sapo " + sapo + " saltou " + salto + "m e alcançou " + distancia + "m da corrida!\n");
		}
		
		posicao++;
		System.out.println("O sapo " + sapo + " termina a corrida na " + posicao + "a posição!");
	}
}
