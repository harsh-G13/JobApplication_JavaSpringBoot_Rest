package com.HarshG.SpringBootRest;

import com.HarshG.SpringBootRest.model.JobPost;
import com.HarshG.SpringBootRest.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobRestController {

    @Autowired
    private jobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
    @GetMapping("jobPost/{PostId}")
    public JobPost getPost(@PathVariable("PostId") int PostId){
        return service.getPost(PostId);
    }
   @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        return service.addJobPost(jobPost);
    }
}
