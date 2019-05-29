package online.yjyy.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {  //自定义配置类

    @Bean
    public IRule myRule() {
        return new RandomRule_ZY();//自定义算法
    }
}
