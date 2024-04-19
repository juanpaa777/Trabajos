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
import mx.utng.session26.model.entity.Grupo;
import mx.utng.session26.model.service.IGrupoService;

@Controller
@SessionAttributes("grupo")
public class GrupoController {
        @Autowired
    private IGrupoService service;

    @GetMapping({"/grupo", "/grupo/", "/grupo/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Grupos");
        model.addAttribute("grupos", service.list());
        return "grupo-list";
    }

    @GetMapping("/grupo/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Grupos");
        model.addAttribute("grupo", new Grupo());
        return "grupo-form";
    }

    @PostMapping("/grupo/form")
    public String save(@Valid Grupo grupo, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Grupos");
            return "grupo-form";
        }
        service.save(grupo);
        return "redirect:/grupo/list";
    }

    @GetMapping("/grupo/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Grupo grupo = null;
        if(id>0){
            grupo = service.getById(id);
        }else{
            return "redirect:/grupo/list";
        }
        model.addAttribute("title", "Editar Grupo");
        model.addAttribute("grupo", grupo);
        return "grupo-form";
    }

    @GetMapping("/grupo/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/grupo/list";
    }
}
