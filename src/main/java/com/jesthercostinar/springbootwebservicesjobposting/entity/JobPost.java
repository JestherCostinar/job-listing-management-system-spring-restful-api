package com.jesthercostinar.springbootwebservicesjobposting.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_post")
@Schema(description = "Job list Dto Model Annotation")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Joblist Name")
    @Column(nullable = false)
    private String name;

    @Schema(description = "Joblist Description")
    @Column(nullable = false)
    private String description;

    @Schema(description = "Joblist Salary")
    @Column(nullable = false)
    private BigDecimal salary;

    @Schema(description = "Joblist Years of Expertise")
    @Column(nullable = false)
    private int yearsOfExpertise;

    @Schema(description = "Joblist Company Name")
    @Column(nullable = false)
    private String companyName;

    @Schema(description = "Joblist Location")
    @Column(nullable = false)
    private String location;

    @Schema(description = "Joblist - isCompanyNameHidden(booelean)")
    @Column(nullable = false)
    private boolean isCompanNameHidden;

    @Schema(description = "Joblist - isActive(booelean)")
    @Column(nullable = false)
    private boolean isActive;

    @Schema(description = "Joblist - Date Created")
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Schema(description = "Joblist - Last Update Date")
    @UpdateTimestamp
    private LocalDateTime lastUpdated;
}
