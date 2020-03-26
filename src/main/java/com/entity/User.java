package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qbanxiaoli
 * @description
 * @create 2020-03-26 13:33
 */
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;

}
