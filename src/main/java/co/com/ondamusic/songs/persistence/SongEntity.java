package co.com.ondamusic.songs.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.com.ondamusic.songs.domain.Artist;

@Entity
@Table(name = "SONG")
public class SongEntity {
	
	private Long id;
	private Artist artist;
	private String secondaryArtists;
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	
	@Column(name = "ARTIST")
	public Artist getArtist() {
		return artist;
	}
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "SECONDARY_ARTISTS")
	public String getSecondaryArtists() {
		return secondaryArtists;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public void setSecondaryArtists(String secondaryArtist) {
		this.secondaryArtists = secondaryArtist;
	}
	public void setName(String name) {
		this.name = name;
	}
}
