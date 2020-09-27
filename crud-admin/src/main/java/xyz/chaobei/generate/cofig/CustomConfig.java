package xyz.chaobei.generate.cofig;

import lombok.Data;

/**
 * Copyright (C), 2015-2020
 * FileName: CustomConfig
 * Author:   MRC
 * Date:     2020/9/17 11:30
 * Description: 自定义配置信息。包含需要生成的表名称、生成类型等
 * History:
 */
@Data
public class CustomConfig {
    /**
     * 表名称
     */
    private String table;
    /**
     * 作者信息
     */
    private String author = "Admin";
    /**
     * 描述信息
     */
    private String desc;
    /**
     * 包路径 例如 org.spring
     */
    private String packages;
    /**
     * 生成路径、例如：E:/test/
     */
    private String filePath;
}
