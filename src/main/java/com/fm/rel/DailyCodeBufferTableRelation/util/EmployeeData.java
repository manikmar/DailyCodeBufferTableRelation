package com.fm.rel.DailyCodeBufferTableRelation.util;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeData {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
}
