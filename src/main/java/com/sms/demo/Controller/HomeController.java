package com.sms.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.demo.Admin;
import com.sms.demo.AdminRepository;
import com.sms.demo.Admission;
import com.sms.demo.AdmissionRepository;

@Controller
public class HomeController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private AdmissionRepository admissionRepository;
    @GetMapping("/")
    public String home() {
        System.err.println("Home Controller");
        return "home1.html"; // Assuming your HTML file is named home1.html
    }  
    @GetMapping("/admission")
    public String admission() {
        return "admission.html"; // Return the name of your admission.html file
    }
    @GetMapping("/adminsignup")
    public String adminsignup() {
        return "adminsignup.html"; // Return the name of your admission.html file
    }
    @GetMapping("/adminlogin")
    public String adminlogin() {
        return "adminlogin.html";}
    @GetMapping("adminclick")
    public String adminclick() {
        return "adminclick.html";
    }
    @GetMapping("studentclick")
    public String studentclick(){
        return "studentclick.html";
    }
    @GetMapping("teacherclick")
    public String teacherclick(){
        return "teacherclick.html";
    }
    @PostMapping("/submitAdminSignup")
    public String submitAdminsignup(@ModelAttribute Admin admin) {
        // Save admission details to the database
        adminRepository.save(admin);
        return "redirect:/"; // Redirect to the home page after submission
    }
    @PostMapping("admin_dashboard")
    public String admin_dashboard() {
        return "admin_dashboard.html";
    }
    @PostMapping("adminlogin")
    public String adminlogin(@ModelAttribute Admin admin) {
        Admin existingAdmin = adminRepository.findByUsername(admin.getUsername());
    
    // Check if the admin record exists and if the password matches
    if (existingAdmin != null && existingAdmin.getPassword().equals(admin.getPassword())) {
        // Admin login successful
        System.err.println("Admin login successful");
        return "admin_dashboard"; // Redirect to the admin panel or any other page
    } else {
        System.err.println("Admin login failed");
        // Admin login failed, handle accordingly (e.g., show error message)
        return "redirect:/"; // Redirect back to the login page with an error message
    }
    }

    @PostMapping("/submitAdmission")
    public String submitAdmission(@ModelAttribute Admission admission) {
        // Save admission details to the database
        admissionRepository.save(admission);
        return "redirect:/"; // Redirect to the home page after submission
    }
     // Import and autowire the AdminRepository
}
// package com.sms.demo.Controller;
// @Controller
// public class AdmissionController {

//     @Autowired
//     private AdmissionService admissionService;

//     @PostMapping("/admission")
//     public String submitAdmissionForm(@ModelAttribute AdmissionForm admissionForm) {
//         // Save admission details to the database
//         admissionService.saveAdmissionDetails(admissionForm);
//         // Redirect to a success page or display a confirmation message
//         return "admissionSuccess";
//     }
// }

// // Service class
// @Service
// public class AdmissionService {

//     @Autowired
//     private AdmissionRepository admissionRepository;

//     public void saveAdmissionDetails(AdmissionForm admissionForm) {
//         // Map form data to entity and save to database
//         Admission admission = mapToAdmissionEntity(admissionForm);
//         admissionRepository.save(admission);
//     }

//     private Admission mapToAdmissionEntity(AdmissionForm admissionForm) {
//         // Create Admission entity from form data
//         Admission admission = new Admission();
//         admission.setName(admissionForm.getName());
//         admission.setAge(admissionForm.getAge());
//         // Map other form fields to entity properties
//         return admission;
//     }
// }

// // Entity class
// @Entity
// public class Admission {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;
//     private int age;
//     // Add other fields as needed

//     // Getters and setters
// }

