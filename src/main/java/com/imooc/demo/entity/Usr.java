package com.imooc.demo.entity;

import java.util.Date;

public class Usr {
		// 主键ID
		private Integer Id;
		// 权重，越大越排前显示
		private Integer userId;
		// 用户名
		private String usrName;

		private String attribute;
		
		private Date inputDate;
		// 密码
		private String usrPassword;
		
		private Date editDate;

		private String affiliatedCompany;

		private Integer isAdmin;
		
		private String bankLeader;

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUsrName() {
			return usrName;
		}

		public void setUsrName(String usrName) {
			this.usrName = usrName;
		}

		public String getAttribute() {
			return attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public Date getInputDate() {
			return inputDate;
		}

		public void setInputDate(Date inputDate) {
			this.inputDate = inputDate;
		}

		public String getUsrPassword() {
			return usrPassword;
		}

		public void setUsrPassword(String usrPassword) {
			this.usrPassword = usrPassword;
		}

		public Date getEditDate() {
			return editDate;
		}

		public void setEditDate(Date editDate) {
			this.editDate = editDate;
		}

		public String getAffiliatedCompany() {
			return affiliatedCompany;
		}

		public void setAffiliatedCompany(String affiliatedCompany) {
			this.affiliatedCompany = affiliatedCompany;
		}

		public Integer getIsAdmin() {
			return isAdmin;
		}

		public void setIsAdmin(Integer isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getBankLeader() {
			return bankLeader;
		}

		public void setBankLeader(String bankLeader) {
			this.bankLeader = bankLeader;
		}
				
		
}
