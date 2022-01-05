package com.peter.myapp;

import com.peter.myapp.entity.Employee;
import com.peter.myapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MyAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("Peter")
                .lastName("Aideloje")
                .email("aidelojepeter123@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Love")
                .lastName("Ubadina")
                .email("loveivy@gmail.com")
                .build();
        
        Employee employee3 = Employee.builder()
                .firstName("Solomon")
                .lastName("Esenyi")
                .email("lordghost@gmail.com")
                .build();

        employeeRepository.saveAll(List.of(employee1,employee2,employee3));
//        employeeRepository.save(employee1);
//        employeeRepository.save(employee2);
//        employeeRepository.save(employee3); ]
    }
}
