package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actor {
	@Id @GeneratedValue
	private int ActorId;
	private String Name;
	@Temporal(TemporalType.DATE)
	private Date PlaceOfBirth;
	private String Biography; 
	@OneToMany
	@JoinColumn(name="PictureId")
	private List<Picture> pictures;
	Actor()
	{
		
	}

}
