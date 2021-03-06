package com.mywebcrawler.webcrawlerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

/**
 * @author Keerthi Badugu
 * 
 * This class is a Configuration for Spring Cloud Ribbon for Load Balancing.
 * From Web Crawler Service to Crawler.
 *
 */
public class RibbonConfiguration {
	
	@Autowired
	IClientConfig ribbonClientConfig;
	
	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl();
	}
	
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new WeightedResponseTimeRule();
	}
	
}
