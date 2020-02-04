/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: application
 * Author:   25610
 * Date:     2020/2/3 20:13
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 通过扫包方式，将 MyBatis 相关对象交给 Spring 容器来管理。
@MapperScan("xyz.fusheng.repository")
public class  Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
