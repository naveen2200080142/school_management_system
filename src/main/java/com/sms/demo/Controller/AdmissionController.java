package com.sms.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.demo.Model.Admission;
import com.sms.demo.Service.AdmissionService;

@Controller
public class AdmissionController {

    @Autowired
    private AdmissionService admissionService;

    @GetMapping("/admission")
    public String showAdmissionForm() {
        return "admission"; // Return the name of your HTML form file
    }

    @PostMapping("/submitAdmission")
    public String submitAdmissionForm(@ModelAttribute Admission admission) {
        admissionService.saveAdmission(admission);
        return "redirect:/admissionSuccess"; // Redirect to a success page
    }
}

