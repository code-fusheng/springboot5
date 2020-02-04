/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Student
 * Author:   25610
 * Date:     2020/2/3 20:14
 * Description: student 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Student {
    private Long id;
    private String name;
    private  Double score;
    private Date birthday;
}
