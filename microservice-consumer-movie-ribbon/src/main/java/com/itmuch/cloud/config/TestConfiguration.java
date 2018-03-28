package com.itmuch.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itmuch.cloud.ExcludeFromComponentScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
	
//	@Autowired
//	IClientConfig config;
	
	@Bean
	public IRule ribbonRule() {
		
		return new RandomRule();
	}
}
