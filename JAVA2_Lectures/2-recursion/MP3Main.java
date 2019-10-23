/*
 * File: MP3Main.java
 * Author: Jonas Lundberg
 * Date: 11 feb 2013
 */
package recursion;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * @author jlnmsi
 *
 */
public class MP3Main {

	
	public static void main(String[] args) throws IOException {
		try {
			//String mp3Path = "C:\\software\\java_kurser\\mp3\\";  // My PC
			String mp3Path = "/Users/jlnmsi/Documents/Software/java_kurser/mp3/";  // My Mac
			String filename = mp3Path+"Kylie Minogue.mp3";

			FileInputStream fis     = new FileInputStream(filename);
			BufferedInputStream bis = new BufferedInputStream(fis);
			Player player = new Player(bis);
			player.play();
			System.out.println("Done - MP3 track completed!");
		}
		catch(JavaLayerException e){
			e.printStackTrace();
		}
	}

}
