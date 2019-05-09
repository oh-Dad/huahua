package com.huahua.search.service;

import com.huahua.search.dao.SearchDao;
import com.huahua.search.pojo.ArticleEs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/22
 * \* Time: 14:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
@Transactional
public class SearchService {

    @Autowired
    private SearchDao searchDao;
    /**
     * 通过title content 查询es引擎中的数据
     */
    public Page<ArticleEs> searchArticle(String keywords, Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        //select * from table where title = keywords or content =keywords


        return searchDao.findAllByTitleLikeOrContentLike(keywords,keywords,pageRequest);
    }

    public void add(ArticleEs articleEs) {
        searchDao.save(articleEs);
    }
}
