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
    @GetMapping("jobPost/{postId}")
    public JobPost getPost(@PathVariable("postId") int postId){
        return service.getPost(postId);
    }
   @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        return service.addJobPost(jobPost);
    }
    @PutMapping("jobPost/{postId}")
    public JobPost editJob(@RequestBody JobPost jobPost){
        service.editJob(jobPost);
        return service.getPost(jobPost.getPostId());

    }
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Delete Successful";
    }
}
