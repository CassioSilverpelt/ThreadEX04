package view;

import controller.ThreadSaposController;

public class ThreadSaposMain {
	public static void main (String[] args) {
		
		for (int i = 0; i < 5; i++) {
			ThreadSaposController sapos = new ThreadSaposController(i+1);
			sapos.start();
			
		}
	}
}
