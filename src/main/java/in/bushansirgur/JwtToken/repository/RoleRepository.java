package in.bushansirgur.JwtToken.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.JwtToken.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
	
	
}