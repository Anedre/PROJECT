package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Padredefamilia;
import pe.edu.upc.tfsafeport.servicesinterfaces.IPadredefamiliaService;

import java.util.List;
@RestController
@RequestMapping("/padresdefamilia")
public class PadredefamiliaController {
    @Autowired
    private IPadredefamiliaService pService;

    @PostMapping
    public void registrar(@RequestBody Padredefamilia p){
        pService.insert(p);
    }

    @GetMapping
    public List<Padredefamilia> listar() {return pService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Padredefamilia padredefamilia){
        pService.insert(padredefamilia);
    }

    @PostMapping("/buscar")
    public List<Padredefamilia> buscar(@RequestBody Padredefamilia padredefamilia)
    {
        List<Padredefamilia> lista;
        padredefamilia.setNombre(padredefamilia.getNombre());
        lista=pService.search(padredefamilia.getNombre());
        return lista;
    }
}
