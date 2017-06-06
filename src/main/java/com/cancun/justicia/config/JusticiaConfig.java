package com.cancun.justicia.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cancun.justicia.service.ExpedienteService;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@ComponentScan({"com.cancun.justicia.service"})
public class JusticiaConfig {

	@Bean
	public ExpedienteService getExpedienteService(){
		return new ExpedienteService();
	}
}
