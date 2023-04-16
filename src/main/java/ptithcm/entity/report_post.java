package ptithcm.entity;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
@AssociationOverrides({
@AssociationOverride(name = "users", joinColumns = @JoinColumn(name = "user_id")),
@AssociationOverride(name = "post", joinColumns = @JoinColumn(name = "post_id"))
})
public class report_post {
	private String content;
	
	public report_post() {
		super();
	}
	
	public report_post(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
