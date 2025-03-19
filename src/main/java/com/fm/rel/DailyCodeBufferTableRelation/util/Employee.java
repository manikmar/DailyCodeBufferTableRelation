package com.fm.rel.DailyCodeBufferTableRelation.util;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employee{

    private int id;
    private String name;
    private double salary;
    private String department;
}
