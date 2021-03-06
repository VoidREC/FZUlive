package com.example.base_demo.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class SubjectInfoVO implements Serializable {

    String subjectName;

    Integer classNumber;

    Integer term;

    String average;

    String excellentRate;

    String  passRate;
}
