package Pack01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// @EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication extends SpringBootServletInitializer{
	// 이 부분을 추가함 (war 배포를 위한 소스)
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ZuulServerApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
}
