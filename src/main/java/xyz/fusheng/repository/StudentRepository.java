/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentRepository
 * Author:   25610
 * Date:     2020/2/3 20:20
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Long id);
    public int save(Student student);
    public int update(Student student);
    public int deleteById(Long id);
}
