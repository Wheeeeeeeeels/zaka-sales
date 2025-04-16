package com.zaka.salesadv.model.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cold_start_strategies")
public class ColdStartStrategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // 冷启动类型：FREE_TRIAL, REFERRAL_PROGRAM, CONTENT_MARKETING, etc.

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String targetAudience; // 目标用户群体

    @Column(nullable = false)
    private Integer expectedUsers; // 预期获取用户数

    @Column(nullable = false)
    private Double budget;

    @Column(nullable = false)
    private String status; // 状态：PLANNING, ACTIVE, COMPLETED, CANCELLED

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
} 