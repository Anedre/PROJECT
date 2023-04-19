package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Ubicacion;
import pe.edu.upc.tfsafeport.servicesinterfaces.IUbicacionService;


import java.util.List;
@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
    @Autowired
    private IUbicacionService uService;

    @PostMapping
    public void registrar(@RequestBody Ubicacion u){
        uService.insert(u);
    }

    @GetMapping
    public List<Ubicacion> listar() {return uService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id){
        uService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Ubicacion ubicacion){
        uService.insert(ubicacion);
    }
    @PostMapping("/buscar")
    public List<Ubicacion> buscar(@RequestBody Ubicacion propietario){
        List<Ubicacion> lista;
        propietario.setDistrito(propietario.getDistrito());
        lista=uService.search(propietario.getDistrito());
        return lista;
    }
}
