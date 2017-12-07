package jie.iaa.bom.Party;

import java.util.Date;

public class Organisation extends Party {
	private Long id;
	private Long parentId; // is sub organisation of parent(Organisation)
	private Long ownerId; // is owned by owner(Party)
	private Long memberOfId; // is member of (RolePlayer)
	private Date foundationDate; // 成立时间
	private Date dissolutionDate; // 解散时间
	private String status;
	private Date statusDate;
	private String statusReason;

	/**
	 * 维护自身关联关系organisation structure
	 * 
	 * @param parentId
	 *            is sub organisation of parent(Organisation)
	 */
	public void maintainOrganisationStructure(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * 维护Party和Organisation的关联关系organisation ownership
	 * 
	 * @param ownerId
	 *            is owned by owner(Party)
	 */
	public void maintainOrganisationOwnership(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * 维护RolePlayer和Organisation的关联关系organisation membership
	 * 
	 * @param memberOfId
	 *            is member of (RolePlayer)
	 */
	public void maintainOrganisationMembership(Long memberOfId) {
		this.memberOfId = memberOfId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public Long getMemberOfId() {
		return memberOfId;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public Date getDissolutionDate() {
		return dissolutionDate;
	}

	public void setDissolutionDate(Date dissolutionDate) {
		this.dissolutionDate = dissolutionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
}
