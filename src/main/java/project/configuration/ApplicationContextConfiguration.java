package project.configuration;

import project.bean.InboundChannel;
import project.bean.PropertySourcesPlaceholder;
import project.processor.FunctionMappingAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rogov on 12.11.2017.
 */
@Configuration
public class ApplicationContextConfiguration {

    @Bean
    public FunctionMappingAnnotationBeanPostProcessor functionMappingAnnotationBeanPostProcessor() {
        return new FunctionMappingAnnotationBeanPostProcessor();
    }

    @Bean
    public InboundChannel inboundChannel() {
        return new InboundChannel();
    }

    @Bean
    public PropertySourcesPlaceholder propertySourcesPlaceholder() {
        return new PropertySourcesPlaceholder();
    }

}
