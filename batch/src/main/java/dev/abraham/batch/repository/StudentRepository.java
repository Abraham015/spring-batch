package dev.abraham.batch.repository;

import dev.abraham.batch.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
