package xyz.chaobei.generate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.chaobei.api.CommonResult;
import xyz.chaobei.generate.entity.TableEntity;
import xyz.chaobei.generate.service.GenerateService;

import java.util.List;

/**
 * Copyright (C), 2015-2020
 * FileName: ApiGenerateController
 * Author:   MRC
 * Date:     2020/9/27 17:39
 * Description:
 * History:
 */
@RestController
@RequestMapping("api")
public class ApiGenerateController {

    @Autowired
    private GenerateService generateService;

    /**
     * @return xyz.chaobei.api.CommonResult
     * @Author MRC
     * @Description 获取当前所有的表格信息
     * @Date 17:40 2020/9/27
     * @Param []
     **/
    @GetMapping("list")
    public CommonResult tableList(@RequestParam(value = "current", defaultValue = "1") Integer current, @RequestParam("size") Integer size) {

        Page
        List<TableEntity> list = generateService.tableList();
        return CommonResult.success(list);
    }


}
