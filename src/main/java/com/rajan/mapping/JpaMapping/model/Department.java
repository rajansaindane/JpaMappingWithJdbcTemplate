package com.rajan.mapping.JpaMapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by rajan on 7/7/17.
 */
@Entity
public class Department {
    @Id
    Integer id;
    String dept_name;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    List<Student> Student;

    public List<Student> getStudent() {
        return Student;
    }

    public void setStudent(List<Student> Student) {
        this.Student = Student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
