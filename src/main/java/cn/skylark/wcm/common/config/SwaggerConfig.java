package cn.skylark.wcm.common.config;

import cn.skylark.wcm.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了 （访问页面就可以看到效果了）
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .ignoredParameterTypes(User.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.skylark.wcm"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Swagger 测试", // 大标题
                "Spring boot + swagger + mybatis + druid", // 小标题
                "1.0", // 版本
                "NO terms of service", "chuhl", // 作者
                "", // 链接显示文字
                ""// 网站链接
        );

        return apiInfo;
    }
}
