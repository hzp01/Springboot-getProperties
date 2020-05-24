package cn.ithzp.properties.util;

import cn.ithzp.properties.entity.StudyEntity;

public class StudyUtil {
    private static String theme;
    private static String result;
    public static void initStaticProperties(StudyEntity studyEntity){
        theme = studyEntity.getTheme();
        result = studyEntity.getResult();
    }

    public static String getStaticProperties() {
        return theme + ":" + result;
    }
}
