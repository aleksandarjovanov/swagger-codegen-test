package com.example.swaggercodegentest;

import com.swagger.client.codegen.rest.api.BuyNowPayLaterApi;
import com.swagger.client.codegen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {

    @Value("${employee.profiles.host.uri}")
    private String hostInfoBasePath;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient().setBasePath(hostInfoBasePath);
    }

    @Bean
    public BuyNowPayLaterApi employeeProfileControllerApi() {
        return new BuyNowPayLaterApi(apiClient());
    }
}
