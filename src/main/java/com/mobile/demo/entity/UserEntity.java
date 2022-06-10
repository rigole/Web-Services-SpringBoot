package com.mobile.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

 @Entity(name="users")
public class UserEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = -813609743029083029L;

    @Id
    @GeneratedValue
    private long id;
}
