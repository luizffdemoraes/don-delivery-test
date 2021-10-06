package com.doncorleone.dondelivery.repositories;

import com.doncorleone.dondelivery.entities.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder, Integer> {
}
