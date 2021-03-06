package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	// Country country = (Country) context.getBean(code);
	List<Country> countryList = (List<Country>) context.getBean("countryList");

	public Country getCountry(String code) throws CountryNotFoundException {

		Country response = null;
		for (Country country : countryList) {
			if (country.getCode().equalsIgnoreCase(code)) {
				response = country;
			}

		}
		if (response == null) {
			throw new CountryNotFoundException();
		}
		return response;
	}

	public List<Country> getAllCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = (List<Country>) context.getBean("countryList");
		return countryList;
	}

	public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("in");
		return country;
	}

	public Country addCountry(Country country) {
		// TODO Auto-generated method stub
		if (countryList.add(country))
			return country;
		return null;
	}
}