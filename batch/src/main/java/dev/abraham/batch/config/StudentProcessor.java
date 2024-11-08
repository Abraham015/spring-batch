package dev.abraham.batch.config;

import dev.abraham.batch.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    public Student process(Student item) throws Exception {
        item.setId(null);
        return item;
    }
}
