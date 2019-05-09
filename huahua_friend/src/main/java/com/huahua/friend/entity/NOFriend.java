package com.huahua.friend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/29
 * \* Time: 11:44
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

@Data
@IdClass(NOFriend.class)
@Entity
@Table(name = "tb_nofriend")
public class NOFriend implements Serializable {


    private static final long serialVersionUID = 93507967622563394L;
    @Id
    private String userid;
    @Id
    private String friendid;



}
