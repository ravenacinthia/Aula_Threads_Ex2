package controller;

public class Threads extends Thread{

	public Threads(int idThread) {
		super();
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		System.out.println("TID #" + getId());
	}
}

