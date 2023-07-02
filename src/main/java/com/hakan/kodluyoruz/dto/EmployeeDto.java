package com.hakan.kodluyoruz.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailName;
}
