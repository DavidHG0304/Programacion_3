package pacman;

import java.awt.Graphics;
import java.util.Iterator;

public class JugadoresElementos {
	
	private int x;
	private int y;
	private int w;
	private int h;
	
	public JugadoresElementos(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	public boolean verificarColisiones(JugadoresElementos elementos[], JugadoresElementos jugador, int newX, int newY) {
		for (JugadoresElementos elemento : elementos) {
			if (newX < elemento.getX() + elemento.getW() && newX + jugador.getW() > elemento.getX()
					&& newY < elemento.getY() + elemento.getH() && newY + jugador.getH() > elemento.getY()) {
				return true;
			}
		}
		return false;
	}
}