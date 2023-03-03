package com.example.trash01.entity;

import javax.persistence.*;

@Entity
@Table(name = "staff_department")
@IdClass(StaffDepartmentIdClass.class)
public class StaffDepartmentIdEntity {
    @Id
    @Column(name = "staff_id")
    Integer staffId;
    @Id
    @Column(name = "department_id")
    Integer departmentId;
}
