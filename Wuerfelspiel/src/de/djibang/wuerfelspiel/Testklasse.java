package de.djibang.wuerfelspiel;

import javax.swing.UIManager;

public class Testklasse {

	public static void main(String[] args){
		try{
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		    Spiel wuerfeln =new Spiel(30,3);
		    wuerfeln.spielen();	
		}
		catch(Exception e){ e.printStackTrace();}

	}
}
