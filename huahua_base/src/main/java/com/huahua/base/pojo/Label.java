package com.huahua.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/12
 * \* Time: 8:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Entity
@Table(name="tb_label")
@Data
public class Label implements Serializable {

    private static final long serialVersionUID = 4022470030047664847L;

    @Id
    private String id;

    private String labelname;

    private String state;

    private Long count;

    private Long fans;

    private String recommend;

}
