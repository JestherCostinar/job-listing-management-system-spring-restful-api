package com.jesthercostinar.springbootwebservicesjobposting.controller;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;
import com.jesthercostinar.springbootwebservicesjobposting.service.JobPostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobs")
@AllArgsConstructor
@Tag(
        name = "CRUD REST APIs for Job Listing Management",
        description = "Create, Read, Update and Delete functionality for User management"
)
public class JobPostController {

    private JobPostService jobPostService;
    // Post Mapping to save JobPost in the database
    @Operation(
            summary = "Create Job REST API",
            description = "Create Job Rest API used to save job information to database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping
    public ResponseEntity<JobPost> createJob(@RequestBody JobPost jobPost) {
        JobPost saveJobPost = jobPostService.createJob(jobPost);
        return new ResponseEntity<>(saveJobPost, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Job by Id REST API",
            description = "Get Job by Id Rest API used to retrieve specific job from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{id}")
    public ResponseEntity<JobPost> getJobById(@PathVariable("id") Long id) {
        JobPost jobPost = jobPostService.getJobById(id);

        return new ResponseEntity<>(jobPost, HttpStatus.OK);
    }

    @Operation(
            summary = "Get all Job REST API",
            description = "Get all Job Rest API used to retrieve all job from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping
    public ResponseEntity<List<JobPost>> getAllJobs() {
        List<JobPost> jobs = jobPostService.getAllJobs();

        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @Operation(
            summary = "Update Job REST API",
            description = "Update Job Rest API used to update specific job information from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @PutMapping("{id}")
    public ResponseEntity<JobPost> updateJob(@PathVariable("id") Long jobId,
                                             @RequestBody JobPost jobPost) {
        jobPost.setId(jobId);
        JobPost updateJob = jobPostService.updateJob(jobPost);
        return new ResponseEntity<>(updateJob, HttpStatus.OK);
    }

    @Operation(
            summary = "Delete Job REST API",
            description = "Delete Job Rest API used to delete specific job record from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id") Long jobId) {
        jobPostService.deleteJob(jobId);

        return new ResponseEntity<>("Job successfully deleted", HttpStatus.OK);
    }
}
