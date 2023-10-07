//package com.example.microserviceuserdata.Repo;
//
//import com.example.microserviceuserdata.Entity.UserOtherData;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface UserOtherDataRepo extends JpaRepository<UserOtherData, Long> {
//    @Query("SELECT user from UserOtherData user where user.login = :login")
//    Optional<UserOtherData> getUserByLogin(@Param("login") String login);
//
//}
