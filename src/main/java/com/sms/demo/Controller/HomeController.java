package com.sms.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        System.err.println("Home Controller");
        return "home1.html"; // Assuming your HTML file is named home1.html
    }  
    @GetMapping("/admission")
    public String admission() {
        return "admission.html"; // Return the name of your admission.html file
    }
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

