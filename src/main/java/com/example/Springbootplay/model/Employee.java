package com.example.Springbootplay.model;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Document(collection = "Employee")
public class Employee {

    private int empId;
    private String name;
    private int age;
    private double sal;
    private String dept;



}
