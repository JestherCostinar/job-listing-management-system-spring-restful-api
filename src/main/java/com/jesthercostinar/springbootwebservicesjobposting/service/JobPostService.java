package com.jesthercostinar.springbootwebservicesjobposting.service;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;

import java.util.List;
import java.util.Optional;

public interface JobPostService {
    JobPost createJob(JobPost jobPost);
    JobPost getJobById(Long id);
    List<JobPost> getAllJobs();
    JobPost updateJob(JobPost jobPost);
    void deleteJob(Long id);
}
