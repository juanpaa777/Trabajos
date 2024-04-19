package mx.utng.s31;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class TodaLogica {

    private final CasaRepository repository;

    @Autowired
    public TodaLogica(CasaRepository repository) {
        this.repository = repository;
    }
    @RequestMapping(value ="", method = RequestMethod.POST)
    public void guardarCasa (@RequestBody Casa casa){
        if(casa.getJefeDeFamilia()==null)
            throw new RuntimeException("El jefe de familia es requerido.");
        
        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());
        ArrayList<String> otrasMayusculas= new ArrayList<>();
        for (String integrante : casa.getOtros()){
            otrasMayusculas.add(integrante.toUpperCase());
            casa.setOtros(otrasMayusculas);
            repository.save(casa);
        }
        

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Casa getCasa(@PathVariable String id){
        Long idInt = Long.parseLong(id);
        return repository.findById(idInt).get();

    }
    
}
