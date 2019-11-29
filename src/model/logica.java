package model;

import java.util.LinkedList;
import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;

public class logica {

	PApplet app;

	private PImage bart;
	private PImage homero;
	private PImage lisa;

	LinkedList<simpson> simpsons;

	public logica(PApplet app) {

		this.app = app;
		simpsons = new LinkedList<simpson>();

		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
					for (int cont = 0; cont < simpsons.size(); cont++) {

					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}).start();

	}

	public void preCargarImagenes() {
		homero = app.loadImage("simpson/homero_simpson.png");
		bart = app.loadImage("simpson/bart_simpson.png");
		lisa = app.loadImage("simpson/lisa_simpson.png");

	}

	public void dibujarPersonajes() {

		for (simpson personaje : this.simpsons) {
			personaje.dibujar();
		}
	}

	public void clickMouse() {
		simpson newSimpson = new simpson(this.app);
		this.simpsons.add(newSimpson);
		newSimpson.run();
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getBart() {
		return bart;
	}

	public void setBart(PImage bart) {
		this.bart = bart;
	}

	public PImage getHomero() {
		return homero;
	}

	public void setHomero(PImage homero) {
		this.homero = homero;
	}

	public PImage getLisa() {
		return lisa;
	}

	public void setLisa(PImage lisa) {
		this.lisa = lisa;
	}

	public LinkedList<simpson> getSimpsons() {
		return simpsons;
	}

	public void setSimpsons(LinkedList<simpson> simpsons) {
		this.simpsons = simpsons;
	}
}
