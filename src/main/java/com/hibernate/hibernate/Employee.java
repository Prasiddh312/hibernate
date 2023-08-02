package com.hibernate.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {//POJO

    @Id
    @Column(name="emp_id")
    private int empId;

    @Column(name="emp_name")
    private String empName;

    @Column(name="emp_dept")
    private String empDept;
}
