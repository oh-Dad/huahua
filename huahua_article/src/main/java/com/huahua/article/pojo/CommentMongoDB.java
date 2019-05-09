package com.huahua.article.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/19
 * \* Time: 18:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class CommentMongoDB implements Serializable {
    private static final long serialVersionUID = 1191474727362608831L;
    @Id
    private String _id;

    private String articleid;

    private String content;

    private String userid;

    private String parentid;

    private Date   publishdate;
}
