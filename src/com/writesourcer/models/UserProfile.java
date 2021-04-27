package com.writesourcer.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_profile")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="bio")
	private String bio;
	
	@Column(name="favorite_authors")
	private String favoriteAuthors;
	
	@Column(name="favorite_genres")
	private String favoriteGenres;
	
	@Column(name="favorite_works")
	private String favoriteWorks;
	
	@Column(name="hobbies_and_interests")
	private String hobbiesAndInterests;
	
	@Column(name="youtube_channel")
	private String youTubeChannel;
	
	@Column(name="website")
	private String website;
	
	@Column(name="facebook")
	private String facebook;
	
	@Column(name="twitter")
	private String twitter;
	
	@Column(name="instagram")
	private String instagram;
	
	
//	@OneToOne(mappedBy="userProfile", cascade=CascadeType.ALL)
//	@JoinColumn(name="user_profile")
//	public User user;

	@OneToOne(mappedBy="userProfile", cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
				CascadeType.REFRESH})
	@JoinColumn(name="user_profile")
	public User user;
	
	
	public UserProfile(String bio, String favoriteAuthors, String favoriteGenres, String favoriteWorks,
			String hobbiesAndInterests, String youTubeChannel, String website, String facebook, String twitter,
			String instagram) {
		super();
		this.bio = bio;
		this.favoriteAuthors = favoriteAuthors;
		this.favoriteGenres = favoriteGenres;
		this.favoriteWorks = favoriteWorks;
		this.hobbiesAndInterests = hobbiesAndInterests;
		this.youTubeChannel = youTubeChannel;
		this.website = website;
		this.facebook = facebook;
		this.twitter = twitter;
		this.instagram = instagram;
	}
	
	public UserProfile() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getFavoriteAuthors() {
		return favoriteAuthors;
	}

	public void setFavoriteAuthors(String favoriteAuthors) {
		this.favoriteAuthors = favoriteAuthors;
	}

	public String getFavoriteGenres() {
		return favoriteGenres;
	}

	public void setFavoriteGenres(String favoriteGenres) {
		this.favoriteGenres = favoriteGenres;
	}

	public String getFavoriteWorks() {
		return favoriteWorks;
	}

	public void setFavoriteWorks(String favoriteWorks) {
		this.favoriteWorks = favoriteWorks;
	}

	public String getHobbiesAndInterests() {
		return hobbiesAndInterests;
	}

	public void setHobbiesAndInterests(String hobbiesAndInterests) {
		this.hobbiesAndInterests = hobbiesAndInterests;
	}

	public String getYouTubeChannel() {
		return youTubeChannel;
	}

	public void setYouTubeChannel(String youTubeChannel) {
		this.youTubeChannel = youTubeChannel;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	
	
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", bio=" + bio + ", favoriteAuthors=" + favoriteAuthors + ", favoriteGenres="
				+ favoriteGenres + ", favoriteWorks=" + favoriteWorks + ", hobbiesAndInterests=" + hobbiesAndInterests
				+ ", youTubeChannel=" + youTubeChannel + ", website=" + website + ", facebook=" + facebook
				+ ", twitter=" + twitter + ", instagram=" + instagram + "]";
	}

}
