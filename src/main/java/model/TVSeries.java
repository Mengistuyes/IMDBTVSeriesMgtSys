package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class TVSeries {
	private int TVid;
	@OneToMany
	@JoinColumn(name="SeasonId")
	private List<Season> seasons;
	private String Studio;
	@OneToMany
	@JoinColumn(name="DirectorId")
	private List<Director> directors;
	private String Description;
	private String PosterUrl;
	TVSeries()
	{
		
	}
	public int getTVid() {
		return TVid;
	}
	public void setTVid(int tVid) {
		TVid = tVid;
	}
	public List<Season> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	public String getStudio() {
		return Studio;
	}
	public void setStudio(String studio) {
		Studio = studio;
	}
	public List<Director> getDirectors() {
		return directors;
	}
	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPosterUrl() {
		return PosterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		PosterUrl = posterUrl;
	}
	

}
