package heritage2;

public class Cd extends Multimedia {

	
protected int $_nbPage;


// Cr�ation de mon constructor
public Cd(int $_nbPage,String $_Auteur, String $_Titre, String $_Reference, String duree,String bonnus) {
	super( $_Auteur, $_Titre, $_Reference, duree );
	this.$_nbPage = $_nbPage;
}// Get permet de r�cup�rer  
public int get$_nbPage() {
	return $_nbPage;
}//Set permet de modifier
public void set$_nbPage(int $_nbPage) {
	this.$_nbPage = $_nbPage;
}










}
