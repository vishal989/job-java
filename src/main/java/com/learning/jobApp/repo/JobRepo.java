package com.learning.jobApp.repo;

import com.learning.jobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}

//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                3, List.of("HTML", "CSS", "JavaScript", "React")),
//        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                List.of("Python", "Machine Learning", "Data Analysis"))
//));
//
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int id) {
//    for(JobPost job : jobs){
//        if(job.getPostId() == id){
//            return job;
//        }
//    }
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jp : jobs){
//        if(jp.getPostId() == jobPost.getPostId()){
//            jp.setPostDesc(jobPost.getPostDesc());
//            jp.setPostProfile(jobPost.getPostProfile());
//            jp.setReqExperience(jobPost.getReqExperience());
//            jp.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//
//
//}
//
//public void deletePost(int id) {
//    for(JobPost jp : jobs){
//        if(jp.getPostId() == id){
//            jobs.remove(jp);
//        }
//    }
//}
