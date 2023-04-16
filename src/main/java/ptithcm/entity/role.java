package ptithcm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class role {
	@Id
	private String name;
	
	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	private List<account> account = new ArrayList<account>();
	
	public role() {
		super();
	}
	public role(String name, List<account> account) {
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<account> getAccount() {
		return account;
	}
	public void setAccount(List<account> account) {
		this.account = account;
	}
	
}
