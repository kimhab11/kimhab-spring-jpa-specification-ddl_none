package com.example.trash01.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

public class StaffDepartmentEntity implements Serializable {
    @Column(name = "staff_id")
    Integer staffId;

    @Column(name = "department_id")
    Integer departmentId;
}
