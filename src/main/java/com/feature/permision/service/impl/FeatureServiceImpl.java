package com.feature.permision.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.feature.permision.model.Feature;
import com.feature.permision.service.FeatureService;

@Service
public class FeatureServiceImpl implements FeatureService {

	private String name="PersonalLoan";
	private Map<String,Feature> featureMap = new HashMap<String, Feature>();
	{
		Feature feature = new Feature();
		feature.setName("100");
		feature.setEmailId("Megha Preeti");
		feature.setEnable(true);
		featureMap.put(feature.getName(), feature);
	}
	
	
	@Override
	public Collection<Feature> findAll() {
		// TODO Auto-generated method stub
		return featureMap.values();
	}

	@Override
	public Feature findByName(String name) {
		// TODO Auto-generated method stub
		return featureMap.get(name);
	}

	@Override
	public Feature save(Feature feature) {
		String name_credit="CreditCard";
		feature.setName(name_credit);
		feature.setEmailId("Harish");
		feature.setEnable(true);
		featureMap.put(name_credit, feature);
		// TODO Auto-generated method stub
		return featureMap.get(name_credit);
	}

	@Override
	public Feature update(Feature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feature deletebyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
