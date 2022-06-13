package heritage2;

public class Support {
	protected String $_Auteur;
	protected String $_Titre;
	protected String $_Reference;

	
		// TODO Auto-generated constructor stub
		
	
// création de mon constructor
	public Support(String $_Auteur, String $_Titre, String $_Reference) {
		super();
		this.$_Auteur = $_Auteur;
		this.$_Titre = $_Titre;
		this.$_Reference = $_Reference;
	}


	public String get$_Auteur() {
		return $_Auteur;
	}


	public void set$_Auteur(String $_Auteur) {
		this.$_Auteur = $_Auteur;
	}


	public String get$_Titre() {
		return $_Titre;
	}


	public void set$_Titre(String $_Titre) {
		this.$_Titre = $_Titre;
	}


	public String get$_Reference() {
		return $_Reference;
	}


	public void set$_Reference(String $_Reference) {
		this.$_Reference = $_Reference;
	}


}
