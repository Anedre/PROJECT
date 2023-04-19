package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Solicitud;
import pe.edu.upc.tfsafeport.servicesinterfaces.ISolicitudService;

import java.util.List;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

    @Autowired
    private ISolicitudService sService;

    @PostMapping
    public void registar(@RequestBody Solicitud s){
        sService.Insert(s);
    }

    @GetMapping
    public List<Solicitud> listar() {return sService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id){sService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Solicitud solicitud) {sService.Insert(solicitud);}

    @PostMapping("/buscar")
    public List<Solicitud> buscar(@RequestBody Solicitud solicitud){
        List<Solicitud> lista;
        solicitud.setNombrehijo(solicitud.getNombrehijo());
        lista=sService.search(solicitud.getNombrehijo());
        return lista;
    }
}
