package com.jesthercostinar.springbootwebservicesjobposting.service.impl;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;
import com.jesthercostinar.springbootwebservicesjobposting.repository.JobPostRepository;
import com.jesthercostinar.springbootwebservicesjobposting.service.JobPostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class JobPostServiceImpl implements JobPostService {

    private JobPostRepository jobPostRepository;
    @Override
    public JobPost createJob(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }

    @Override
    public JobPost getJobById(Long id) {
        Optional<JobPost> job = jobPostRepository.findById(id);
        return job.get();
    }
}
