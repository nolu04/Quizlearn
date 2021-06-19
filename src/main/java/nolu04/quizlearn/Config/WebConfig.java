package nolu04.quizlearn.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //Adds the navigation
        registry.addViewController("/home").setViewName("forward:/index.html");
        registry.addViewController("/detail").setViewName("forward:/detail.html");
//        registry.addViewController("/**").setViewName("forward:/index.html");
    }
}
