package com.vish.JobApp2;

import com.vish.JobApp2.model.JobPost;
import com.vish.JobApp2.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService service;

    @GetMapping("/jobs/{id}")
    public JobPost getJobById(@PathVariable int id){
        return service.getJobById(id);
    }

    @GetMapping("/jobs")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
    @PutMapping("/jobs")
    public void updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
    }
    @DeleteMapping("/jobs/{id}")
    public void deleteJob(@PathVariable int id){
        service.deleteJob(id);
    }

}
