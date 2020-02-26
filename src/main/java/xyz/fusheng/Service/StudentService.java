/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentService
 * Author:   25610
 * Date:     2020/2/26 11:41
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.Service;

import org.springframework.web.bind.annotation.*;
import xyz.fusheng.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(Long id);

    public int save(Student student);

    public int update(Student student);

    public int deleteById(Long id);

}
