package com.learning.jobApp;

import com.learning.jobApp.model.JobPost;
import com.learning.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }



    @PostMapping("jobPost")
    public String addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return "Success";
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost/{id}")
    public String deletePost(@PathVariable int id){
        service.deletePost(id);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }
}
