package mx.utng.s26.sesion26.controller;
@controller
@sessionAttributes ("student")

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import mx.utng.s26.sesion26.model.entity.Student;
import mx.utng.s26.sesion26.model.service.IStudentsService;

@Controller
public class TeacherController {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name:

    @Column(length = 90)
    private String name;
    @Min(0)
    @Max(50)
    private Float yearsOfServisce;
    

    @Autowired
    private IStudentsService service;

    @GetMapping({"","/","/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de maestro");
        model.addAttribute("teacher", service.list());
        return "list";
    }

    @GetMapping("/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de maestro");
        model.addAttribute("teacher", new Teacher());
        return "form";
    }

    @PostMapping("/form")
    public String save(@Valid Student student,BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de estudiantes");
            return "form";
        }
        service.save(student);
        return "redirect:list";

    }
    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id,Model model){
        Student student=null;
        if(id>0){
            student=service.getById(id);
        }else{
            return "redirect:list";
        }
        model.addAttribute("title", "Editar estudiante");
        model.addAttribute("student",student);
        return "form";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0){
            service.delete(id);
        }
        return "redirect:/list";
    }

}
