package com.manish.blogaggregator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.blogaggregator.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
