package com.javawebtutor;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="USER_TBL")
public class User
{

        @Id
        @Column(name="USER_ID")
        private int userId;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}
             
 
}