package com.pavlo.annotations;

import java.util.HashMap;
import java.util.Map;

public class Map_chesen_frame {

	public static void main(String[] args) {
		
		try {
			loadService("com.pavlo.annotations.Simple_service_frame");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			loadService("com.pavlo.annotations.Lazy_service_frame");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			loadService("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map_chesen_frame chesen_frame =new Map_chesen_frame();
		System.out.println(chesen_frame.getMap());
		
	}

	static Map<String, Object> map = new HashMap<String, Object>();

	public static Map<String, Object> getMap() {
		return map;
	}

	public static void setMap(Map<String, Object> map) {
		Map_chesen_frame.map = map;
	}

	@Override
	public String toString() {
		return "Map_chesen_frame [map=" + map + "]";
	}
	
	static void loadService(String classNema)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class aClass = Class.forName(classNema);
		if(aClass.isAnnotationPresent(Service_frame.class)){
			Object serviceObject = aClass.newInstance();
			map.put(classNema, serviceObject);
		}
	}

}
