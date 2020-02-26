/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentServiceImpl
 * Author:   25610
 * Date:     2020/2/26 11:42
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.Service.StudentService;
import xyz.fusheng.entity.Student;
import xyz.fusheng.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public int save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public int update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public int deleteById(Long id) {
        return studentRepository.deleteById(id);
    }
}
