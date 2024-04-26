package com.sms.demo.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.demo.Repository.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findByUsername(String username);
     
}
