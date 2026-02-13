package com.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){

        return List.of(
                new SoftwareEngineer("James", 1, "js,node,react"),
                new SoftwareEngineer("Jamila", 2, "java,spring,springboot")

        );


    }
}
