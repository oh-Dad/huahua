package com.huahua.search.dao;

import com.huahua.search.pojo.ArticleEs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/22
 * \* Time: 14:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface SearchDao extends ElasticsearchRepository<ArticleEs,String> {
    //select * from table where title = keywords or content =keywords  类似于
    Page<ArticleEs> findAllByTitleLikeOrContentLike(String title,String content, Pageable pageable);
}
