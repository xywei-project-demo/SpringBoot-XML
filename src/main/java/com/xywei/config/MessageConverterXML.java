package com.xywei.config;

import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//TODO 加上声明<?xml version="1.0" encoding="utf-8"?>
public class MessageConverterXML {//extends WebMvcConfigurationSupport{
//
//	@Override
//	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
////		super.configureMessageConverters(converters);
//		Jackson2ObjectMapperBuilder builder = Jackson2ObjectMapperBuilder.xml();
//		builder.indentOutput(true);
//		converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
//	}

	
}
