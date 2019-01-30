package com.jmtbg.dailyreport.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author sjw
 * @date 2019/1/22
 */

@Data
public class User implements Serializable {
    @Id
    private String id;
    private String code;
    private String name;
    private String age;
}
