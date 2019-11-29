
import model.logica;
import processing.core.PApplet;

public class Main extends PApplet{

	logica logic;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	
	public void settings() {
		size(600,600);
	}

	public void setup() {
		logic = new logica(this);
		
	}

	public void draw() {
		
	}
	
	public void mouseCLicked() {
		
	}
	
	public void preLoad() {
		
	}
}
