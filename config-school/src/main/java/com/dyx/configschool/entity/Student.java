package com.dyx.configschool.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
}
