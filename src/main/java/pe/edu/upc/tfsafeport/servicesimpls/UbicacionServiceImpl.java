package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Ubicacion;
import pe.edu.upc.tfsafeport.repositories.IUbicacionRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IUbicacionService;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionServiceImpl implements IUbicacionService {

    @Autowired
    private IUbicacionRepository uR;

    @Override
    public void insert(Ubicacion ubicacion) {
        uR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return uR.findAll();
    }
    @Override
    public Optional<Ubicacion> ListarId(int id) {
        return Optional.of(uR.findById(id).orElse(new Ubicacion()));
    }

    @Override
    public void delete(int id){uR.deleteById(id);}

    @Override
    public List<Ubicacion> search(String nameUbicacion) {
        return uR.search(nameUbicacion);
    }
}
