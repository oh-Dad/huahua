package com.huahua.search.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/22
 * \* Time: 13:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
@Document(indexName ="huahua_article", type = "articleEs")
public class ArticleEs implements Serializable {


    private static final long serialVersionUID = 4945224268287390109L;

    @Id
    private String id;//id对应的是我们数据库中的id

    @Field(index= true,analyzer="ik_max_word",searchAnalyzer="ik_max_word")
    private String title;//标题

    @Field(index= true,analyzer="ik_max_word",searchAnalyzer="ik_max_word")
    private String content;//文章正文

    private String state;//审核状态

}
