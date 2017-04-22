package com.xuqian.admin.common;

import com.xuqian.admin.common.util.MybatisGeneratorUtil;
import com.xuqian.admin.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by xuq on 2017/4/22.
 */
public class GeneratorTest {

    //根据命名规范，只修改此常量值即可
    private static String MODULE = "";
    private static String DATABASE = "";
    private static String TABLE_PREFIX = "";
    private static String PACKAGE_NAME = "";
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
    //需要insert后返回主键的表配置，key：表名,value:主键名
    private static Map<String,String> LAST_INSERT_ID_TABLES = new HashMap<String, String>();
    static {
        LAST_INSERT_ID_TABLES.put("upms_user","user_id");
    }

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        System.out.println(JDBC_PASSWORD);
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
    }
}
