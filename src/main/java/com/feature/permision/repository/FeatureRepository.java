package com.feature.permision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feature.permision.model.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature,String> {

}
