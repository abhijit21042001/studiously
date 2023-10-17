package com.jdbc.dao;

import java.util.List;

import com.jdbc.model.Student;

public interface StudentDao {

	public int create(Student student);

	public List<Student> read();

	public List<Student> findStudentById(int studentId);

	public int update(Student student);

	public int delete(int studentId);

}