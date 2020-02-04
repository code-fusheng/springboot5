/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentHandler
 * Author:   25610
 * Date:     2020/2/3 22:05
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.entity.Student;
import xyz.fusheng.repository.StudentRepository;

import java.util.List;

@RestController
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PutMapping("/update")
    public int update(@RequestBody Student student){
        return studentRepository.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Long id){
        return studentRepository.deleteById(id);
    }
}
