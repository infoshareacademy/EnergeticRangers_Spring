package com.jjdzr.energeticRangers.repository;

import com.jjdzr.energeticRangers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);

    @Query("SELECT p.id FROM User p WHERE p.email =:c")
    public Long findUserByUserName (@Param("c") String keyword);

}
