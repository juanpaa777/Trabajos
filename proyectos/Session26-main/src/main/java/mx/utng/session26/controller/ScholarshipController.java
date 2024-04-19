
package mx.utng.session26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.session26.model.entity.Scholarship;
import mx.utng.session26.model.service.IScholarshipService;

@Controller
@SessionAttributes("scholarship")
public class ScholarshipController {
    
    @Autowired
    private IScholarshipService service;

    @GetMapping("/scholarship/Scholarship-list")
    public String list(Model model){
        model.addAttribute("title", "Listado de Becas");
        model.addAttribute("scholarships", service.list());
        return "Scholarship-list";
    }

    @GetMapping("/scholarship/Scholarship-Form")
    public String create(Model model){
        model.addAttribute("title", "Crear nueva beca");
        model.addAttribute("scholarship", new Scholarship());
        return "Scholarship-Form";
    }

    @PostMapping("/scholarship/Scholarship-Form")
    public String save(@Valid Scholarship scholarship, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Crear nueva beca");
            return "Scholarship-Form";
        }
        service.save(scholarship);
        return "redirect:/scholarship/Scholarship-list";
    }

    @GetMapping("/scholarship/Scholarship-Form/{id}")
    public String update(@PathVariable Long id, Model model){
        Scholarship scholarship = null;
        if(id > 0){
            scholarship = service.getById(id);
        }else{
            return "redirect:/scholarship/Scholarship-list";
        }
        model.addAttribute("title", "Editar Beca");
        model.addAttribute("scholarship", scholarship);
        return "Scholarship-Form";
    }

    @GetMapping("/scholarship/delete/{id}")
    public String delete(@PathVariable Long id){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/scholarship/Scholarship-list";
    }
}