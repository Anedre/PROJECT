package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Historialviaje;
import pe.edu.upc.tfsafeport.servicesinterfaces.IHistorialviajeService;

import java.util.List;

@RestController
@RequestMapping("/historialviaje")
public class HistorialviajeController {

    @Autowired
    private IHistorialviajeService hService;

    @PostMapping
    public void registrar(@RequestBody Historialviaje h){ hService.Insert(h);}

    @GetMapping
    public List<Historialviaje> list() {return hService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id")Integer id){hService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Historialviaje historialviaje) {hService.Insert(historialviaje);}

    @PostMapping("/buscar")
    public List<Historialviaje> buscar(@RequestBody Historialviaje historialviaje){
        List<Historialviaje> lista;
        historialviaje.setObservaciones(historialviaje.getObservaciones());
        lista=hService.search(historialviaje.getObservaciones());
        return lista;
    }

}
