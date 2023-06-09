package com.jesthercostinar.springbootwebservicesjobposting.service.impl;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;
import com.jesthercostinar.springbootwebservicesjobposting.repository.JobPostRepository;
import com.jesthercostinar.springbootwebservicesjobposting.service.JobPostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<JobPost> getAllJobs() {
        List<JobPost> jobs = jobPostRepository.findAll();
        return jobs;
    }

    @Override
    public JobPost updateJob(JobPost jobPost) {
        JobPost currentJob = jobPostRepository.findById(jobPost.getId()).get();

        currentJob.setName(jobPost.getName());
        currentJob.setDescription(jobPost.getDescription());
        currentJob.setSalary(jobPost.getSalary());
        currentJob.setYearsOfExpertise(jobPost.getYearsOfExpertise());
        currentJob.setCompanyName(jobPost.getCompanyName());
        currentJob.setLocation(jobPost.getLocation());
        currentJob.setCompanNameHidden(jobPost.isCompanNameHidden());
        currentJob.setActive(jobPost.isActive());

        JobPost updatedJob = jobPostRepository.save(currentJob);
        return updatedJob;
    }

    @Override
    public void deleteJob(Long id) {
        jobPostRepository.deleteById(id);
    }
}
