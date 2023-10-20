package atm;

import java.util.*;

public class Client {
	
	 private String nom;
	 private String prenom;
	 private String cin;
	 private List<Account> a;                               
	 
	 public Client(List<Account> a, String cardNumber) {
		 this.a = new ArrayList<>();
		 for(int i=0; i<a.size(); i++) {
			 if(cardNumber.equals(a.get(i).getCardNumber())) {
				this.nom = a.get(i).getNom();
				this.prenom = a.get(i).getPrenom();
				this.cin = a.get(i).getCin();
				this.a.add(a.get(i));
				
			 }
		 }
	 }
	
	public void getInfoClient(String cardNumber) { // I passed the cardNumber to display information related to this specific client. He could have two different accounts with the same credit card.
		 for(int i=0 ; i<a.size(); i++) {
			 if(cardNumber.equals(a.get(i).getCardNumber())) {
				 System.out.println(a.get(i).toString());
				
			 }
		 }
	 }
	
	//getters and setters
	
	 public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public List<Account> getA() {
			return a;
		}
		public void setA(List<Account> a) {
			this.a = a;
		}
 
	
 
}
