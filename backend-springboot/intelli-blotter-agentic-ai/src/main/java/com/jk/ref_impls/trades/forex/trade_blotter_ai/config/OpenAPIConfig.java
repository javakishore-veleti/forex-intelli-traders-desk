package com.jk.ref_impls.trades.forex.trade_blotter_ai.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Intelli Blotter Agentic AI")
                        .version("1.0")
                        .description("Copilot-powered decisioning API for trader augmentation"));
    }
}
