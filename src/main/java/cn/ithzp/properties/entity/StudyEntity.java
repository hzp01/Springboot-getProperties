package cn.ithzp.properties.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "study")
public class StudyEntity {
    private String theme;
    private String result;
}
