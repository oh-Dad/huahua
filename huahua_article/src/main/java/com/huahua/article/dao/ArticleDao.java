package com.huahua.article.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.huahua.article.pojo.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ArticleDao extends JpaRepository<Article,String>,JpaSpecificationExecutor<Article>{

	@Query(nativeQuery = true,value = "select * from tb_article where  id = ?")
	Article findOneById(String id);


	//@Modifying 如果直接执行增删改的方法  需要加上Modifying的注解  否则不起效

	@Modifying
	@Query(value = "update  tb_article set thumbup = thumbup+1 where id =?",nativeQuery = true)
	void updateArticleThumbup(String id);

	@Modifying
	@Query(value = "update tb_article set state = '1' where id = ?",nativeQuery = true)
	void updateArticleStateByArticleId(String articleId);


    @Query(nativeQuery = true,value = "select  * from  tb_article, tb_channel c where 1 = 1 " +
            " and c.id = channelid " +
            " and channelid = ?")
	Page<Article> channelList(String channelid, Pageable pageable);

    @Query(nativeQuery = true,value = "select  * from  tb_article, tb_column c where 1 = 1 " +
            " and c.id = columnid " +
            " and columnid = ?")
    Page<Article> columnlist(String columnid, Pageable pageable);

	@Query(nativeQuery = true,value = "select * from tb_article where  istop = 1 order by thumbup desc ")
	 List<Article> findByisTop();
}

