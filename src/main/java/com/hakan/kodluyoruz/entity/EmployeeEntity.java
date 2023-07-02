package com.hakan.kodluyoruz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
@Entity
@Table(name = "employees")
public class EmployeeEntity extends BaseEntity implements Serializable {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String emailName;
}
