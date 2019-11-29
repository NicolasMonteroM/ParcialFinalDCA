package model;

import processing.core.PApplet;

public class simpson implements Runnable {

	PApplet app;
	int edad;
	int suerte;
	int velocidad;
	int direccion;
	float x;
	float y;

	public simpson(PApplet app) {
		this.app = app;
		this.edad = (int)app.random(1,50);
		this.suerte = (int)app.random(1,10);
		this.x = app.random(100, this.app.width - 100);
		this.y = app.random(100, this.app.width - 100);

	}
	
	@Override
	public void run() {

		mover();

	}

	private void mover() {

		this.x += this.velocidad * this.direccion;

		if (this.x <= 0 || this.x >= this.app.width - 40) {
			this.direccion *= -1;
		}
	}

	public void dibujar() {
		
	}

}
