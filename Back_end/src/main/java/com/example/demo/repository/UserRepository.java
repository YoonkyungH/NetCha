package com.example.demo.repository;

import com.example.demo.info.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 상속받은 JPA Repository 안에는 save(), findAll() 등등 여러가지가 들어있음
// 안에 없는 함수라면 직접 구현해 사용하면 됨
public interface UserRepository extends JpaRepository<UserInfo, Long> {

    Optional<UserInfo> findByEmail(String email);
}
