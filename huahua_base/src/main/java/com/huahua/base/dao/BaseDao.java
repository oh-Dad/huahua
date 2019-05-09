package com.huahua.base.dao;

import com.huahua.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 标签数据访问接口
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/12
 * \* Time: 8:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
//JpaRepository 提交了基本的增删改查
//JpaSpecificationExecutor 用于做复杂的条件查询
public interface BaseDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {


    /*
    * 推荐标签列表
    * */
    List<Label> findAllByRecommendOrderByFansDesc(String recommend);

    /*
    *有效标签列表
    * */
    List<Label> findAllByStateOrderByFansDesc(String state);

    //Query查询语句 nativeQuery执行SQL语句 “？”单个参数  如果多个参数 已"?1"开始  依次累加
    @Query(nativeQuery = true,value = "select * from tb_label where id = ?")
    Label queryById(String id);
}
