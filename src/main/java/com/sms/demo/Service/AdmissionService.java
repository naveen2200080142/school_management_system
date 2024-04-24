package com.sms.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.demo.Model.Admission;
import com.sms.demo.Repository.AdmissionRepository;

@Service
public class AdmissionService {

    @Autowired
    private AdmissionRepository admissionRepository;

    public void saveAdmission(Admission admission) {
        admissionRepository.save(admission);
    }
}
