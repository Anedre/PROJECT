package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Historialviaje;
import pe.edu.upc.tfsafeport.repositories.IHistorialviajeRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IHistorialviajeService;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialviajeServiceImpl implements IHistorialviajeService {

    @Autowired
    private IHistorialviajeRepository hR;

    @Override
    public void Insert(Historialviaje historialviaje) {
        hR.save(historialviaje);
    }

    @Override
    public List<Historialviaje> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHistorial) {
        hR.deleteById(idHistorial);
    }

    @Override
    public Optional<Historialviaje> ListarId(int idHistorial) {
        return Optional.of(hR.findById(idHistorial).orElse(new Historialviaje()));
    }

    @Override
    public List<Historialviaje> search(String observaciones) {
        return hR.search(observaciones);
    }
}
