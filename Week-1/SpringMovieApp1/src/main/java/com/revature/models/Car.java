package com.revature.models;

import lombok.*;
import org.springframework.stereotype.Component;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Car {

    private int id;
    private String make;
    private String model;
    private int year;
    private int mileage;

}