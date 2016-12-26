package com.paytong.platform.manager.system.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserRoleModel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_USER_ROLE")
public class PojoUserRole implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6902433615206738497L;
	private Long userRoleId;
	private Long userId;
	private Long roleId;

	// Constructors

	/** default constructor */
	public PojoUserRole() {
	}

	/** full constructor */
	public PojoUserRole(Long userRoleId, Long userId, Long roleId) {
		this.userRoleId = userRoleId;
		this.userId = userId;
		this.roleId = roleId;
	}

	// Property accessors
	@Id
	@Column(name = "USER_ROLE_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	@Column(name = "USER_ID", nullable = false, precision = 10, scale = 0)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "ROLE_ID", nullable = false, precision = 10, scale = 0)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}