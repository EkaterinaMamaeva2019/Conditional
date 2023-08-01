package ru.netology.conditional1.JavaConfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import ru.netology.conditional1.SystemProfile.DevProfile;
import ru.netology.conditional1.SystemProfile.ProductionProfile;
import ru.netology.conditional1.SystemProfile.SystemProfile;

public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
