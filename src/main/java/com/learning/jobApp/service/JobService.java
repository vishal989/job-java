package com.learning.jobApp.service;

import com.learning.jobApp.model.JobPost;
import com.learning.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int id) {
        return repo.getJob(id);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }
}
