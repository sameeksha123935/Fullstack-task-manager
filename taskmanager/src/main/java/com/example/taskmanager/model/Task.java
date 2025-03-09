package com.example.taskmanager.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Corrected import
    private String title;

    @Enumerated(EnumType.STRING) // Corrected import
    private Taskstatus status; // Changed from boolean completed

    // Constructors
    public Task() {
    }

    public Task(String title, String description, Taskstatus status, LocalDateTime createdAt) {
        this.title = title;
        this.status = status;
    }

    public Object getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    public void setTitle(Object title2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }

    public Object getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }

    public void setDescription(Object description) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescription'");
    }

    public Object getStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
    }

    public void setStatus(Object status2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }

    // Getters and Setters (add these if you don't have them)
    // ...
}