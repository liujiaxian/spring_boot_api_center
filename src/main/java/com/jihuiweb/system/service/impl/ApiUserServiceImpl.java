package com.jihuiweb.system.service.impl;

import com.jihuiweb.core.AbstractService;
import com.jihuiweb.system.dao.ApiUserMapper;
import com.jihuiweb.system.model.ApiUser;
import com.jihuiweb.system.service.ApiUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/28.
 */
@Service
@Transactional
public class ApiUserServiceImpl extends AbstractService<ApiUser> implements ApiUserService {
    @Resource
    private ApiUserMapper apiUserMapper;

}
