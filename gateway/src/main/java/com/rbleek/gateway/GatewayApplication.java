package com.rbleek.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r
						.path("/parrot/**")
						.filters(f -> f.stripPrefix(1))
						.uri("http://localhost:8181"))
				.route(r -> r
						.path("/seagull/**")
						.filters(f -> f.stripPrefix(1))
						.uri("http://localhost:8282"))
				.route(r -> r
						.host("**.parrot.com")
						.uri("http://localhost:8181"))
				.route(r -> r
						.host("**.seagull.com")
						.uri("http://localhost:8282"))
				.build();
	}
}
