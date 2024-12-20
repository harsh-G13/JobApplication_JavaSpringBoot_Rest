package com.HarshG.SpringBootRest.repo;

import com.HarshG.SpringBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class jobRepo {
    List<JobPost> jobs = new ArrayList<>();
    public jobRepo() {

        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.add(
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));

        // Data Scientist Job Post
        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));

        // Network Engineer Job Post
        jobs.add(new JobPost(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

        // Mobile App Developer Job Post
        jobs
                .add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App")));



    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }
    public JobPost addJobPost(JobPost job){
        jobs.add(job);
        return job;
    }

    public JobPost getPost(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId()==postId)return job;
        }
        return null;
    }

    public void editJob(JobPost jobPost) {
        for(JobPost job: jobs){
            if(jobPost.getPostId()==job.getPostId()){
                job.setPostDesc(jobPost.getPostDesc());
                job.setPostTechStack(jobPost.getPostTechStack());
                job.setPostProfile(jobPost.getPostProfile());
                job.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJob(int postId) {
        jobs.removeIf(job -> postId == job.getPostId());
    }
}
