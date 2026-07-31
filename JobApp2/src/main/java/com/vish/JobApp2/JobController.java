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
    @PostMapping("/jobs")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @PutMapping("/jobs")
    public void updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
    }
    @DeleteMapping("/jobs/{id}")
    public void deleteJob(@PathVariable int id){
        service.deleteJob(id);
    }

    @GetMapping("/jobs/load")
    public String load(){
        return service.loadData();
    }

    @GetMapping("/jobs/search/{keyword}")
    public List<JobPost> search(@PathVariable String keyword){
        return service.searchByKeyword(keyword);
    }

}
