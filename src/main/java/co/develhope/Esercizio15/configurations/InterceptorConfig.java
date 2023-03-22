package co.develhope.Esercizio15.configurations;

import co.develhope.Esercizio15.interceptors.APILoggingInterceptor;
import co.develhope.Esercizio15.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  @Autowired
  private APILoggingInterceptor apiLoggingInterceptor;

  @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor).addPathPatterns("/time");
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy");
    }
}

