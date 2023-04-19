package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Viaje;
import pe.edu.upc.tfsafeport.repositories.IViajeRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IViajeService;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeServiceImpl implements IViajeService {

    @Autowired
    private IViajeRepository vj;

    @Override
    public void Insert(Viaje viaje) {
        vj.save(viaje);
    }

    @Override
    public List<Viaje> list() {
        return vj.findAll();
    }

    @Override
    public void delete(int idViaje) {
        vj.deleteById(idViaje);
    }

    @Override
    public Optional<Viaje> listarId(int idViaje) {
        return Optional.of(vj.findById(idViaje).orElse(new Viaje()));
        //return Optional.empty();
    }
    //prueba de merge
    @Override
    public List<Viaje> search(String horainicio) {
        return vj.search(horainicio);
    }
}
