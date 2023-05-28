package dk.sdu.mmmi.cbse.main;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Main {
	
	public static void main(String[] args) {
		
		Lwjgl3ApplicationConfiguration cfg =
			new Lwjgl3ApplicationConfiguration();
		cfg.setWindowSizeLimits(1200,700,1000,600);
		cfg.setTitle("Asteroids5000");
		
		new Lwjgl3Application(new Game(), cfg);
		
	}
	
}
