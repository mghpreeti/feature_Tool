package com.feature.permision.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feature.permision.model.Feature;
import com.feature.permision.service.FeatureService;

@RestController
@RequestMapping("/featureTest")
public class FeatureResource {
	@Autowired
	private FeatureService featureService;
	
	@GetMapping
	public Collection<Feature> findAll() {
		// TODO Auto-generated method stub
		return featureService.findAll();
	}

	@GetMapping("{name}")
	public Feature findByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return featureService.findByName(name);
	}

	@PostMapping(consumes =MediaType.APPLICATION_JSON_VALUE) 
	public Feature save(@RequestBody Feature feature) {
		// TODO Auto-generated method stub
		return featureService.save(feature);
	}

	@PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE) 
	public Feature update(@RequestBody Feature feature) {
		// TODO Auto-generated method stub
		return featureService.update(feature);
	}

	@DeleteMapping("{name}")
	public Feature deletebyName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return featureService.deletebyName(name);
	}

}
