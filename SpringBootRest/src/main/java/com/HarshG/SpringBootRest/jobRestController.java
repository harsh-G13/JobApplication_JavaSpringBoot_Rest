package com.HarshG.SpringBootRest;

import com.HarshG.SpringBootRest.model.JobPost;
import com.HarshG.SpringBootRest.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class jobRestController {

    @Autowired
    private jobService service;

    @GetMapping("jobPost")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
