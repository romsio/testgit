package heritage2;

public class Multimedia  extends Support {
private String duree;

	
		
	
	public String getDuree() {
	return duree;
}


public void setDuree(String duree) {
	this.duree = duree;
}



	public Multimedia(String $_Auteur, String $_Titre, String $_Reference,String duree) {
		super($_Auteur, $_Titre, $_Reference);
		this.duree = duree;
		// TODO Auto-generated constructor stub
	}

}
