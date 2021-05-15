package com.xywei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

//@Configuration
public class XMLConfiguration {

//	@Bean
//	public XmlMapper jacksonXmlMapper(Jackson2ObjectMapperBuilder builder) {
//		XmlMapper xmlMapper=new XmlMapper();
//		xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
//		return xmlMapper;
//	}

//	@Bean
	public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter(
			Jackson2ObjectMapperBuilder builder) {
		ObjectMapper mapper = builder.createXmlMapper(true).build();
		((XmlMapper) mapper).enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
		return new MappingJackson2XmlHttpMessageConverter(mapper);
	}

}
