package online.yjyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableFeignClients(basePackages= {"online.yjyy.springcloud"})
@ComponentScan("online.yjyy.springcloud")
public class DeptConsumer80_APP
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_APP.class, args);
	}
}
