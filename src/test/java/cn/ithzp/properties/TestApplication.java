package cn.ithzp.properties;

import cn.ithzp.properties.entity.StudyEntity;
import cn.ithzp.properties.util.StudyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {PropertiesApplication.class})
@RunWith(SpringRunner.class)
public class TestApplication {
    @Autowired
    private StudyEntity studyEntity;

    @Test
    public void test() {
        System.out.println(studyEntity);
        System.out.println(StudyUtil.getStaticProperties());
    }
}
