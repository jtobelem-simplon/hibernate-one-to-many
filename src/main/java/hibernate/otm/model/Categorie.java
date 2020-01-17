package hibernate.otm.model;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
// on ne met pas le nom de la table, donc par defaut, le nom de la classe en minuscule+s = categories
public class Categorie {
	
	@Id
	private long id;
	
	@Basic
	private String libelle;
	
	// optionnellement, on peut implémenter la relation dans l'autre sens
	@OneToMany(mappedBy = "categorie") // le nom de l'attribut java
	private Collection<Animal> animaux;

	
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

	public Collection<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Collection<Animal> animaux) {
		this.animaux = animaux;
	}
	
	

}
