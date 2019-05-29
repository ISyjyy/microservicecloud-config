package online.yjyy.springcloud;

import online.yjyy.myRule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
//在启动该微服务时候会找自定义的Ribbon  MyselfRule配置类 从而使配置生效
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class) //自定义Ribbon算法
public class DeptConsumer80_APP
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_APP.class, args);
	}
}
