package com.feature.permision.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feature.permision.model.Feature;
import com.feature.permision.resource.Resource;
import com.feature.permision.service.FeatureService;
@RestController
@RequestMapping("/featureTest")
public class FeatureResourceImpl implements Resource<Feature> {
	
	@Autowired
	private FeatureService featureService;
	@Override
	public ResponseEntity<Collection<Feature>> findAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(featureService.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Feature> findByName(String val) {
		// TODO Auto-generated method stub
		return  new ResponseEntity<>(featureService.findByName(val),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Feature> save(Feature feature) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (featureService.save(feature),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Feature> update(Feature feature) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (featureService.update(feature),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Feature> deletebyName(String val) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (featureService.deletebyName(val),HttpStatus.OK);
	}

}
