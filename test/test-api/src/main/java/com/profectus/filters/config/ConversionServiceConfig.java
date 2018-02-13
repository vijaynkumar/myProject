package com.profectus.filters.config;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class ConversionServiceConfig {

	@Autowired
	private Set<Converter> converters;

	@Bean(name = "conService")
	@Primary
	public ConversionService conService() {
		ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
		factory.setConverters(converters);
		factory.afterPropertiesSet();
		return factory.getObject();
	}
}