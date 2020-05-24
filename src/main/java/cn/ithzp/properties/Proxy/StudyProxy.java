package cn.ithzp.properties.Proxy;

import cn.ithzp.properties.entity.StudyEntity;
import cn.ithzp.properties.util.StudyUtil;
import org.springframework.stereotype.Component;

@Component
public class StudyProxy {
    public StudyProxy(StudyEntity studyEntity) {
        StudyUtil.initStaticProperties(studyEntity);
    }
}
