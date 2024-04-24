package pacman;

public class Bolitas {
	private int bX;
	private int bY;
	private int bD;
	private boolean tocada;
	
	public Bolitas(int bX, int bY, int bD) {
		this.bX = bX;
		this.bY = bY;
		this.bD = bD;
		this.tocada = true;
	}
	
	public Bolitas() {
		
	}
	public int getbX() {
		return bX;
	}

	public void setbX(int bX) {
		this.bX = bX;
	}

	public int getbY() {
		return bY;
	}

	public void setbY(int bY) {
		this.bY = bY;
	}

	public int getbD() {
		return bD;
	}

	public void setbD(int bD) {
		this.bD = bD;
	}
	
	public boolean isTocada() {
		return tocada;
	}

	public void setTocada(boolean tocada) {
		this.tocada = tocada;
	}

	public boolean bolitaEsTocada(JugadoresElementos jugador) {
		if(jugador.getX() < (getbX()+ bD) && jugador.getY() < (getbY()+ bD) && (jugador.getX() + jugador.getW()) > getbX() && (jugador.getY() + jugador.getH()) > getbY() ) {
			return true;
		}
		return false;
	}
}
