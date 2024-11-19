package com.HarshG.SpringBootRest.service;

import com.HarshG.SpringBootRest.model.JobPost;
import com.HarshG.SpringBootRest.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {
    @Autowired
    public jobRepo repo;

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
    public void addJobPost(JobPost job){
        repo.addJobPost(job);
    }
}
