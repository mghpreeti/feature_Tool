package com.feature.permision.service;
import java.util.Collection;

import com.feature.permision.model.Feature;


public interface IService<T> {
	
	Collection<T>findAll();	
	
	T findByName(String name);
	 
	T saveOrUpdate(T t);
	 
	String deletebyName(String name);

}
