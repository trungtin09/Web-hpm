package ptithcm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class district {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name_district;
	
	@OneToMany(mappedBy = "district", fetch = FetchType.EAGER)
	private Set<post> post = new HashSet<post>();
	
	public district() {
		super();
	}
	
	public district(int id, String name_district, post post) {
		super();
		this.id = id;
		this.name_district = name_district;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_district() {
		return name_district;
	}

	public void setName_district(String name_district) {
		this.name_district = name_district;
	}

	public Set<post> getPost() {
		return post;
	}

	public void setPost(Set<post> post) {
		this.post = post;
	}
	
}
