package com.feature.permision.service;
import java.util.Collection;

import com.feature.permision.model.Feature;


public interface FeatureService {
	
	Collection<Feature>findAll();	
	
	Feature findByName(String name);
	 
	Feature save(Feature feature);
	 
	Feature update(Feature feature);

	Feature deletebyName(String name);

}
