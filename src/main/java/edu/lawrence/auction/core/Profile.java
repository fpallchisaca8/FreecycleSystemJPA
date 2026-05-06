package edu.lawrence.auction.core;

import edu.lawrence.auction.interfaces.dtos.ProfileDTO;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String profile_id;
	@OneToOne
	private String user;
	private String fullname;
	private String email;
	private String phone;
	private String general_location;
	private String bio;
	private boolean ispublic;
	
	public Profile() {}
	
	public Profile(ProfileDTO core) {
		this.user = core.getUserId();
		this.fullname = core.getFullName();
		this.email = core.getEmail();
		this.phone = core.getPhone();
		this.general_location = core.getGeneral_location();
		this.bio = core.getBio();
		this.ispublic = core.getIsPublic();
	}


	public String getUserId() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFullName() {
		return fullname;
	}

	public void setFullName(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGeneral_location() {
		return general_location;
	}

	public void setGeneral_location(String general_location) {
		this.general_location = general_location;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean getIsPublic() {
		return ispublic;
	}

	public void setIsPublic(boolean ispublic) {
		this.ispublic = ispublic;
	}
}
