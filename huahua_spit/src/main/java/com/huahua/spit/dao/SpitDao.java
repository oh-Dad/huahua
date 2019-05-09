package com.huahua.spit.dao;

import com.huahua.spit.entity.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/18
 * \* Time: 9:09
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

public interface SpitDao extends MongoRepository<Spit,String> {

    Page<Spit> findByParentid(String parentid, Pageable pageable);
}
