package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Viaje;
import pe.edu.upc.tfsafeport.servicesinterfaces.IViajeService;

import java.util.List;

@RestController
@RequestMapping("/viaje")
public class ViajeController {

    @Autowired
    private IViajeService vService;

    @PostMapping
    public void registrar(@RequestBody Viaje v){
        vService.Insert(v);
    }

    @GetMapping
    public List<Viaje> listar() {return vService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {vService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Viaje viaje){vService.Insert(viaje);}

    @PostMapping("/buscar")
    public List<Viaje> buscar(@RequestBody Viaje viaje)
    {
        List<Viaje> lista;
        viaje.setHorainicio(viaje.getHorainicio());
        lista=vService.search(viaje.getHorainicio());
        return lista;
    }

}
