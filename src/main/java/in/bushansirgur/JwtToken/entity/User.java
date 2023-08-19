package in.bushansirgur.JwtToken.entity;

import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Getter
@Entity
@Data
public class User {

	@Id
	private String userName;
	
	private String userFirstName;
	
	private String userLastName;
	
	private String userPassword;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", 
			joinColumns = {
					@JoinColumn(name = "user_id")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "role_id")
			}
	)
	private Set<Role> roles;

	public User() {
		super();
	}

	public User(String userName, String userFirstName, String userLastName, String userPassword, Set<Role> roles) {
		super();
		this.userName = userName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
		this.roles = roles;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
