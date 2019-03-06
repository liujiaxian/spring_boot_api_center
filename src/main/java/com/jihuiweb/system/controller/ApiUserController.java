package com.jihuiweb.system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jihuiweb.core.Result;
import com.jihuiweb.core.ResultGenerator;
import com.jihuiweb.system.model.ApiUser;
import com.jihuiweb.system.service.ApiUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/09/28.
*/
@RestController
@RequestMapping("/api/user")
public class ApiUserController {
    @Resource
    private ApiUserService apiUserService;

    @PostMapping
    public Result add(@RequestBody ApiUser apiUser) {
        apiUserService.save(apiUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        apiUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ApiUser apiUser) {
        apiUserService.update(apiUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ApiUser apiUser = apiUserService.findById(id);
        return ResultGenerator.genSuccessResult(apiUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ApiUser> list = apiUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
