package in.bushansirgur.JwtToken.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Data
public class Role {
	
	@Id
	private String roleName;
	
	private String roleDescription;

	public Role() {
		super();
	}

	public Role(String roleName, String roleDescription) {
		super();
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
}


/*
 * Hibernate: create table role (role_name varchar(255) not null,
 * role_description varchar(255), primary key (role_name)) engine=InnoDB
 
 * Hibernate: create table user (user_name varchar(255) not null,
 * user_first_name varchar(255), user_last_name varchar(255), user_password
 * varchar(255), primary key (user_name)) engine=InnoDB 
 * 
 * Hibernate: create table user_role (user_id varchar(255) not null, role_id varchar(255) not null,
 * primary key (user_id, role_id)) engine=InnoDB 
 * 
 * Hibernate: alter table user_role add constraint FKa68196081fvovjhkek5m97n3y 
 * foreign key (role_id) references role (role_name) 
 * 
 * Hibernate: alter table user_role add constraint FK859n2jvi8ivhui0rl0esws6o 
 * foreign key (user_id) references user (user_name)
 */