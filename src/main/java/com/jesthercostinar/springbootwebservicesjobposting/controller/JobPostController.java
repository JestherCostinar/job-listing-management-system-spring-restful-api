package com.jesthercostinar.springbootwebservicesjobposting.controller;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;
import com.jesthercostinar.springbootwebservicesjobposting.service.JobPostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/jobs")
@AllArgsConstructor
public class JobPostController {

    private JobPostService jobPostService;
    // Post Mapping to save JobPost in the database
    @PostMapping
    public ResponseEntity<JobPost> createJob(@RequestBody JobPost jobPost) {
        JobPost saveJobPost = jobPostService.createJob(jobPost);
        return new ResponseEntity<>(saveJobPost, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<JobPost> getJobById(@PathVariable("id") Long id) {
        JobPost jobPost = jobPostService.getJobById(id);

        return new ResponseEntity<>(jobPost, HttpStatus.OK);
    }
}
