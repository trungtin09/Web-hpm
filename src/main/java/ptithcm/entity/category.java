package ptithcm.entity;

import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Set;

@Entity
@Table
public class category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name_category;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Set<post> post = new HashSet<post>();
	
	public category() {
		super();
	}
	public category(int id, String name_category, post post) {
		super();
		this.id = id;
		this.name_category = name_category;
		this.post = post;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_category() {
		return name_category;
	}
	public void setName_category(String name_category) {
		this.name_category = name_category;
	}
	public Set<post> getPost() {
		return post;
	}
	public void setPost(Set<post> post) {
		this.post = post;
	}
	
}
