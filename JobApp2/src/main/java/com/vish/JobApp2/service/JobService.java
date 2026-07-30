package com.vish.JobApp2.service;

import com.vish.JobApp2.model.JobPost;
import com.vish.JobApp2.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job){
        repo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.getallJobs();
    }

    public JobPost getJobById(int id) {
        return repo.getJobById(id);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }
    public void deleteJob(int id){
        repo.deleteJob(id);
    }
}
