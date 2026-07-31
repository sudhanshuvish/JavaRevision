package com.vish.JobApp2.repo;

import com.vish.JobApp2.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    public List<JobPost> findByPostProfileContainingOrPostDescContaining(String k, String key);



}


//
//public List<JobPost> getallJobs(){
//
//    return jobs;
//
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//
//public JobPost getJobById(int id) {
//    for(JobPost jp : jobs){
//        if(jp.getPostId() == id){
//            return jp;
//        }
//    }
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//
//
//    for(JobPost jp : jobs){
//        if(jp.getPostId() == jobPost.getPostId()){
//            jp.setPostId(jobPost.getPostId());
//            jp.setPostDesc(jobPost.getPostDesc());
//            jp.setPostProfile(jobPost.getPostProfile());
//            jp.setPostTechStack(jobPost.getPostTechStack());
//            jp.setReqExperience(jobPost.getReqExperience());
//        }
//    }
//}
//
//public void deleteJob(int id){
//    JobPost jp = getJobById(id);
//    jobs.remove(jp);
//}
