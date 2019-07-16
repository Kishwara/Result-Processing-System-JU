package com.rps.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rps.entities.Program;
import com.rps.entities.Student;


public interface ProgramDao  extends CrudRepository<Program, Long>{
	
	Program findByProgramCode(String str);
	Program findByProgramId(Long id);
	List<Program> findByStudent(Student stu);
	List<Program> findByStudentAndProgramCode(Student student, String programCode);
	
	Long deleteByProgramId(Long id);
}

