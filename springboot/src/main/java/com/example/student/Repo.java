package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

interface Repo extends JpaRepository<Student, Integer> {
    // code
}
