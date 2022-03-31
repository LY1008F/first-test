package com.yu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private int did;
    private String dname;
    private List<Employee> emps;
}
