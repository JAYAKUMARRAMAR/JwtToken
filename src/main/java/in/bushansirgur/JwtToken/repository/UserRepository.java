package in.bushansirgur.JwtToken.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.JwtToken.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, String> {

}