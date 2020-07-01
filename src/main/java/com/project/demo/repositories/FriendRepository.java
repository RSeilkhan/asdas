package com.project.demo.repositories;

import com.project.demo.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {


}
