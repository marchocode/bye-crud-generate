package xyz.chaobei.generate.mapper;

import xyz.chaobei.generate.entity.TableEntity;

public interface GenerateMapper {
    /**
     * @Author MRC
     * @Description 通过表名查询表信息和字段信息
     * @Date 10:43 2019/11/5
     * @Param [tableName]
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    TableEntity selectTable(String name);
}
