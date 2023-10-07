package com.example.githubuserdata.Repo;

import com.example.githubuserdata.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Long> {
    @Query("SELECT user from UserData user where user.login = :login")
    Optional<UserData> getUserByLogin(@Param("login") String login);

}
