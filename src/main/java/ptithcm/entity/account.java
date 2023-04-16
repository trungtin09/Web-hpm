package ptithcm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class account {
	@Id
	private String user_name;
	
	@Column(nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_name"), inverseJoinColumns = @JoinColumn(name = "role_name"))
	private Set<role> role = new HashSet<role>();
	
	public account() {
		super();
	}
	public account(String user_name, String password, Set<role> role) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.role = role;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<role> getRole() {
		return role;
	}
	public void setRole(Set<role> role) {
		this.role = role;
	}
	
}
