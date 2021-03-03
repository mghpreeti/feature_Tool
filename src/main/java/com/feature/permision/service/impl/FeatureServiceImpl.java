package com.feature.permision.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.feature.permision.model.Feature;
import com.feature.permision.repository.FeatureRepository;
import com.feature.permision.service.IService;

@Service
public class FeatureServiceImpl implements IService<Feature> {
	
	@Autowired
	private FeatureRepository featureRepository;

	@Override
	public Collection<Feature> findAll() {
		return featureRepository.findAll();
	}

	@Override
	public Feature findByName(String name) {
		return featureRepository.findById(name).get();
	}

	@Override
	public Feature saveOrUpdate(Feature feature) {		
		return featureRepository.saveAndFlush(feature);
	}

	
	@Override
	public String deletebyName(String name) {
		JSONObject jsonObject = new  JSONObject();	
		try {
			featureRepository.deleteById(name);	
			 jsonObject.put("message", "entry deleted sucessfully");		 
		}
		catch(JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();	
	}

}
