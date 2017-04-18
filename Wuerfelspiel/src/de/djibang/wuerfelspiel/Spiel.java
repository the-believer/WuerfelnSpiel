package de.djibang.wuerfelspiel;

import javax.swing.JOptionPane;

public class Spiel {

	private Spieler[] spieler;
	static int siegPunkte;

    public Spiel(int siegPunkte, int anzSpieler){

    	this.siegPunkte = siegPunkte;
    	spieler = new Spieler[anzSpieler];
    	String input;
    	String outputNachricht;
    	//String[] options ={" Abbrechen ", "  Ok  "};
    	for(int i=0;i<anzSpieler;i++){
    		outputNachricht= "Name des Spieler "+(i+1)+":";
    		input = JOptionPane.showInputDialog(null,outputNachricht,"Eingabe",JOptionPane.OK_CANCEL_OPTION);
    		if(input!="null")
    		spieler[i] = new Spieler(input); // diese Zeile kann verbessern werden.
    	    
    	}
    }
    public void spielen(){
    	int index = 0;
    	while(true){
    		spieler[index].wuerfeln();
    		if(spieler[index].istSiegPkterreicht())break;
    		if(index==(spieler.length-1)) index=0;
    		index++;
    	}
    }
}
