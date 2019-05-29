package online.yjyy.springcloud.cfgBean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import online.yjyy.springcloud.entities.Dept;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //开启Ribbon负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
//注册   自定义负载均衡算法 IRULE 默认轮询算法
    @Bean
    public IRule myRule(){
       // return new RandomRule();//随机算法
      return new RoundRobinRule();//轮询算法
    }
}
