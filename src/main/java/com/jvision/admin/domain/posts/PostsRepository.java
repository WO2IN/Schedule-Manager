package com.jvision.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // CRUD
    @Query("SELECT p from Posts p ORDER BY p.id ASC")
    List<Posts> findAllDesc();
}
