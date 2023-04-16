package ptithcm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public String file_name;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private post post;
	
	public image() {
		super();
	}
	public image(int id, String file_name, post post) {
		this.id = id;
		this.file_name = file_name;
		this.post = post;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public post getPost() {
		return post;
	}
	public void setPost(post post) {
		this.post = post;
	}
	
}

