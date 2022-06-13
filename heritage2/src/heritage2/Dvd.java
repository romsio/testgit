package heritage2;

public class Dvd extends Multimedia  {

	private String bonnus;
	
	
public String getBonnus() {
	return bonnus;
}

public void setBonnus(String bonnus) {
	this.bonnus = bonnus;
}
//création de mon constructor
public Dvd(String $_Auteur, String $_Titre, String $_Reference, String duree,String bonnus) {
	super($_Auteur, $_Titre, $_Reference, duree);
	// TODO Auto-generated constructor stub
	this.bonnus = bonnus;
}





}
