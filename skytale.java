package krypto1;



public class Skytale {

	private String text;
	public int ecken;
	Skytale(String a,int b){
		text=a;
		ecken=b;
		
	}
	
	public String VerschluesselterText(){
		String ausgabe = "";
		String[] s = new String [ecken+1];
		
		for (int i2=0;i2<ecken;i2++){
			s[i2]="";
		for (int i = i2;i<text.length();i+=ecken){
			s[i2]=s[i2]+text.charAt(i);
		 
		}
		ausgabe=ausgabe+s[i2];
		}
		return ausgabe;
	}
	//Folgender Code Funktioniert noch nicht
	
	public String entschluesselung(String a,int eck){
		String []platzhalter=new String[eck+1];
		String ausgabe ="";
		int zaehler=0;
		
		int abschnitt =a.length()/eck;
		for (int i = 0;i<eck;i++){
			platzhalter[i]=String.valueOf(a.subSequence(i*abschnitt,i*abschnitt+abschnitt));
			
		}
		int i=0;
		for (int i2=0;i2<platzhalter[i].length();i2++){
			for (i = 0;i<eck-1;i++){
				
				System.out.println("w");
				if (zaehler<=a.length()){
					ausgabe+=platzhalter[i].charAt(i2);
			}
			zaehler++;

				
			}
		}
		
		return ausgabe;
	}
	
	


}
