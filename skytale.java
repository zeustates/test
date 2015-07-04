package krypto1;



public class Skytale {
	private String text; // zu Versclüsselnder Text
	private int ecken; //Anzahl der Seiten des imaginären Stifts 
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

}
