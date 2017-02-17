package com.manish.blogaggregator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.blogaggregator.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
