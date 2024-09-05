package common.config

import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun publicApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("member")
            .pathsToMatch("/member/**")
            .build()
    }

    @Bean
    fun apiInfo(): Info {
        return Info()
            .title("MaPay API")
            .description("API documentation for MaPay")
            .version("v1.0")
    }
}
