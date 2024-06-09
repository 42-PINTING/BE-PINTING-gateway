package pinting.backend.repository.oauth2;

import pinting.backend.entity.oauth2.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
	UserEntity save(UserEntity member);
	Optional<UserEntity> findById(Long id);
	Optional<UserEntity> findByName(String name);
	Optional<UserEntity> findByUsername(String username);
	List<UserEntity> findAll();
}
