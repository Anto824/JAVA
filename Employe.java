package personne_heritage;

import java.util.*;

public class Employe extends Personne {
	private int salaire;
	private GregorianCalendar date_embauche;
	
	public Employe(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse,int salaire,GregorianCalendar date_embauche) {
		super(leNom,lePrenom,laDate,lAdresse);
		if(2022-laDate.get(Calendar.YEAR)>16 && 2022-laDate.get(Calendar.YEAR)<65) {
			this.salaire = salaire;
			this.date_embauche = date_embauche;
	}
		else {
			System.err.println("erreur");
		}
	}
	
	
	
}
