package com.jihuiweb.pet.service.impl;

import com.jihuiweb.pet.dao.ApiUserMapper;
import com.jihuiweb.pet.model.ApiUser;
import com.jihuiweb.pet.service.ApiUserService;
import com.jihuiweb.core.AbstractService;
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
