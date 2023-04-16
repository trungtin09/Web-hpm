package ptithcm.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(columnDefinition = "TEXT")
	private String title;
	@Column(columnDefinition = "TEXT")
	private String short_description; 
	private String created_date;
	@Column(columnDefinition = "TEXT")
	private String content;
	private String last_update;
	private float price;
	private float area;
	private boolean isHidden;
	private boolean isApprove;
	
	//category of post
	@ManyToOne
	@JoinColumn(name = "category_id")
	private category category;
	
	//user
	@ManyToMany(mappedBy = "post", fetch = FetchType.EAGER)
	private Set<users> users = new HashSet<users>();
	
	//image
	@OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
	private Set<image> image = new HashSet<image>();
	
	//post report
	@OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
	private Set<report_post> report_post = new HashSet<report_post>();
	
	//district
	@ManyToOne
	@JoinColumn(name = "district_id")
	private district district;
	
	//author of post
	@ManyToOne
	@JoinColumn(name = "user_id")
	private users user;
	
	public post() {
		super();
	}
	public post(String id, String title, String short_description, String created_date, String content, String last_update, float price, float area, boolean isHiden, boolean isApproved, category category, Set<users> users, Set<image> image, Set<report_post> report_post, district district, users user) {
		super();
		this.id = id;
		this.title = title;
		this.short_description = short_description;
		this.created_date = created_date;
		this.last_update = last_update;
		this.price = price;
		this.area = area;
		this.isHidden = isHiden;
		this.isApprove = isApproved;
		this.category = category;
		this.image = image;
		this.users = users;
		this.user = user;
		this.report_post = report_post;
		this.district = district;
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public boolean isHidden() {
		return isHidden;
	}
	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
	public boolean isApprove() {
		return isApprove;
	}
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}
	public category getCategory() {
		return category;
	}
	public void setCategory(category category) {
		this.category = category;
	}
	public Set<users> getUsers() {
		return users;
	}
	public void setUsers(Set<users> users) {
		this.users = users;
	}
	public Set<image> getImage() {
		return image;
	}
	public void setImage(Set<image> image) {
		this.image = image;
	}
	public Set<report_post> getReport_post() {
		return report_post;
	}
	public void setReport_post(Set<report_post> report_post) {
		this.report_post = report_post;
	}
	public district getDistrict() {
		return district;
	}
	public void setDistrict(district district) {
		this.district = district;
	}
	public users getUser() {
		return user;
	}
	public void setUser(users user) {
		this.user = user;
	}
}
