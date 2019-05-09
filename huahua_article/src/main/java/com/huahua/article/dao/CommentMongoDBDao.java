package com.huahua.article.dao;

import com.huahua.article.pojo.CommentMongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/19
 * \* Time: 19:28
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
/**
 * 评论Dao
 * 操作mongdb
 */
public interface CommentMongoDBDao extends MongoRepository<CommentMongoDB,String> {

    List<CommentMongoDB> findAllByArticleidOrderByPublishdateDesc(String articleId);

}
