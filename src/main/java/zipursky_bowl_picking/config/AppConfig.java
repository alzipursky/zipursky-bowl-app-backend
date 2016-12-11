package zipursky_bowl_picking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by aaronzipursky1 on 12/11/16.
 */
@Configuration
public class AppConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("/sql.queries"));
        return propertySourcesPlaceholderConfigurer;
    }
}
