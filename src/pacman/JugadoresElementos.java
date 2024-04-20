package pacman;

import java.awt.Graphics;

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

	public boolean colisionaron(JugadoresElementos player, JugadoresElementos rectangulo, int velocidad) {

		if (player.getX() < rectangulo.getX() + rectangulo.getW() && player.getX() + player.getW() > rectangulo.getX() && player.getY() < rectangulo.getY() + rectangulo.getH() && player.getY() + player.getH() > rectangulo.getY()) {
			if (player.getY() + player.getH() == rectangulo.getY() || player.getY() == rectangulo.getY() + rectangulo.getH()) {
				player.setY(player.getY() - velocidad);
			} else if (player.getX() + player.getW() == rectangulo.getX() || player.getX() == rectangulo.getX() + rectangulo.getW()) {
				player.setX(player.getX() - velocidad);
			}
			return true;
		}
		return false;
	}	

}