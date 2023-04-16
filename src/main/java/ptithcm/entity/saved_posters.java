package ptithcm.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class saved_posters implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private users user;

	@ManyToOne(cascade = CascadeType.ALL)
	private post post;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(post, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		saved_posters other = (saved_posters) obj;
		return Objects.equals(post, other.post) && Objects.equals(user, other.user);
	}

	public saved_posters() {
		
	}
	public saved_posters(users user, post post) {
		super();
		this.user = user;
		this.post = post;
	}

	public users getUser() {
		return user;
	}

	public void setUser(users user) {
		this.user = user;
	}

	public post getPost() {
		return post;
	}

	public void setPost(post post) {
		this.post = post;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
