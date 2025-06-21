package com.example.Springbootplay.model;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
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

    //    @Transient
    //id can not be marked transient, it wont function even if we mark it transient
    private String id;
    private int empId;
    private String name;
    //    @Transient
    private int age;
    private double sal;
    private String dept;


}
