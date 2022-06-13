package heritage2;

public class Livre extends Support {
private int NbPage;
	
		// TODO Auto-generated constructor stub
//création de mon constructor
public Livre(String $_Auteur, String $_Titre, String $_Reference, int nbPage) {
		super($_Auteur, $_Titre, $_Reference);
		setNbPage(nbPage);
	}

public int getNbPage() {
	return NbPage;
}

public void setNbPage(int nbPage) {
	NbPage = nbPage;
}

}
