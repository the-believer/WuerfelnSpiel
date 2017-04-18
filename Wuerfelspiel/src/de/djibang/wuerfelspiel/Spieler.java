package de.djibang.wuerfelspiel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler {
private String name;
private int aktStand;
private Random r;

public Spieler(String name){
	this.name=name;
	aktStand=0;
	r = new Random();
}
public boolean wuerfeln(){
	int temp;
	int versuchPunkte=0;
	String s = "Spieler "+name+" ist an der Reihe (bisher "+aktStand+" Punkte)";
	System.out.println(s);
	System.out.println("------------------------------");
	while(true){
		do{
		temp=r.nextInt(6);
		if(temp!=0)break;
		}while(true);
		String s1 = name+" hat eine "+temp+" gewuerfelt";
		System.out.println(s1);
		if(temp==6){
			versuchPunkte=0;
			System.out.println("Versuch zu Ende");
			System.out.println(" AktuellerSpielstand von "+name+" : "+aktStand+" Punkte");
			System.out.println(" Der naechste Spieler ist dran");
			break;
		}
		versuchPunkte+=temp;
		String s2 = "in diesem Versuch bisher "+versuchPunkte+" Punkte -- ingesamt "+(versuchPunkte+aktStand)+" Punkte";
		System.out.println(s2);
        int s3 = JOptionPane.showConfirmDialog(null, name+", wollen Sie weiter wuerfeln?", "Weiter wuerfeln", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(s3==1)break;
		if((versuchPunkte+aktStand)>=Spiel.siegPunkte){
			System.out.println(name+" hat ingesamt "+(versuchPunkte+aktStand)+" Punkte und somit gewonnen !!!");
			break;
		}
	}
	System.out.println(" ");
	aktStand += versuchPunkte;
	return (istSiegPkterreicht())? true:false;
}
public boolean istSiegPkterreicht(){
	return(aktStand >= Spiel.siegPunkte)? true:false;
}
}
