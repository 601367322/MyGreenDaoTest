package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * 创建db类
 * <p/>
 * 生成操作数据库所需的bean和dao
 */
public class MyClass {

    public static void main(String[] args) throws Exception {
        //参数1是版本号
        //参数2是生成文件的包
        Schema schema = new Schema(2, "com.test.greendao");
        addNewsDetail(schema);
        try {
            //后面的目录是在gradle中配置的路径
            new DaoGenerator().generateAll(schema, "lib-greendao/src/main/java-gen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建表
     * 生成dao和bean
     *
     * @param schema
     */
    private static void addNewsDetail(Schema schema) {
        Entity newsDetail = schema.addEntity("TestBean");
        newsDetail.setHasKeepSections(true);
        newsDetail.setActive(true);
        newsDetail.addStringProperty("id").primaryKey().index();
        newsDetail.addStringProperty("title");
        newsDetail.addStringProperty("content");
    }
}
