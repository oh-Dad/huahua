package com.huahua.spit.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/18
 * \* Time: 9:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class Spit implements Serializable {


    private static final long serialVersionUID = 923854195842574538L;

    @Id
    private String _id;

    private String content;

    private Date publishtime;

    private String userid;


    private String nickname;

    private  Integer visits;

    private Integer thumbup;

    private Integer share;

    private Integer comment;

    private String state;

    private String parentid;

}
