package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.repositories.IConductorRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IConductorService;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorServiceImpl implements IConductorService {
    @Autowired
    private IConductorRepository cR;

    @Override
    public void insert(Conductor conductor) {
        cR.save(conductor);
    }

    @Override
    public List<Conductor> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id){
        cR.deleteById(id);
    }

    @Override
     public Optional<Conductor> listarId(int idConductor){
         return Optional.of(cR.findById(idConductor).orElse(new Conductor()));
     }
    @Override
    public List<Conductor> search(String nombre){return cR.search(nombre);
    }
}
