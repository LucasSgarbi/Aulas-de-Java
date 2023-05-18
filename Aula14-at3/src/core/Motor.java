package core;

import user.Engine;

public class Motor implements Engine  {
	private int cycles;

	public int getCycles() {
		return cycles;
	}

	public void setCycles(int cycles) {
		this.cycles = cycles;
	}


	public void walk(int steps) {		
	}

	public int pos() {
		return 0;
	}

	public void run() {	
	}
	
	
	
}
