package cc.mobireach.api.model;
// Generated 24-Oct-2016 18:15:56 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "Admin", catalog = "estorywo_webapp")
public class Admin implements java.io.Serializable {

	private Integer adminId;
	private User user;
	private boolean active;

	public Admin() {
	}

	public Admin(User user, boolean active) {
		this.user = user;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "adminId", unique = true, nullable = false)
	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
