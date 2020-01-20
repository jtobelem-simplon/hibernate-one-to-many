package hibernate.otm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
// on ne met pas le nom de la table, donc par defaut, le nom de la classe en minuscule+s = categories
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique=true)
	private String libelle;
	
	// optionnellement, on peut implémenter la relation dans l'autre sens
//	@OneToMany(mappedBy = "categorie") // le nom de l'attribut java
//	private Collection<Animal> animaux;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}
