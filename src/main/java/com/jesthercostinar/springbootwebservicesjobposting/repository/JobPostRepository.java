package com.jesthercostinar.springbootwebservicesjobposting.repository;

import com.jesthercostinar.springbootwebservicesjobposting.entity.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository extends JpaRepository<JobPost, Long> {
}
