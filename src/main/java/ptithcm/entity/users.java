package ptithcm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import antlr.collections.List;

@Entity
@Table(name="users")
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String full_name;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/đd/yyyy")
	private Date created_date;
	private String phone;
	private String email;
	private String address;
	private String gender;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="username")
	private account account;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/đd/yyyy")
	private Date update_date;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Set<report_post> report_post = new HashSet<report_post>(); 
	
	// create new post
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Set<post> created_post = new HashSet<post>();
	
	public Set<post> getPostsCreate() {
		return created_post;
	}
	
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "saved_post", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "post_id"))
	private List<post> post = new ArrayList<post>();

//	public void addLikePost(Post post) {
//		posts.add(post);
//		post.getUsers().add(this);
//	}
//
//	public void removeLikeRole(Post post) {
//		posts.remove(post);
//		post.getUsers().remove(this);
//	}
	
	public users() {
		super();
	}
	public users(String id, String full_name, Date created_date, String phone, String email, String address, String gender,account account, Set<post> created_post, Set<report_post> report_post) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.address = address;
		this.created_date = created_date;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.account = account;
		this.created_post = created_post;
		this.report_post = report_post;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public account getAccount() {
		return account;
	}
	public void setAccount(account account) {
		this.account = account;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public Set<report_post> getReport_post() {
		return report_post;
	}
	public void setReport_post(Set<report_post> report_post) {
		this.report_post = report_post;
	}
	public Set<post> getCreated_post() {
		return created_post;
	}
	public void setCreated_post(Set<post> created_post) {
		this.created_post = created_post;
	}
}
