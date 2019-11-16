/**
 * 
 */
package com.suraj.mm.model;

import javax.persistence.Column;

/**
 * @author Dilip Kirar 2019
 *
 */

public abstract class CommonUtility {

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "updated_date")
	private String updatedDate;

}
