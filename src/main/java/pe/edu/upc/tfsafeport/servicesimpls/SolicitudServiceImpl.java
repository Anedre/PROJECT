package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Solicitud;
import pe.edu.upc.tfsafeport.repositories.ISolicitudRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.ISolicitudService;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudServiceImpl implements ISolicitudService {

    @Autowired
    private ISolicitudRepository sc;

    @Override
    public void Insert(Solicitud solicitud) {sc.save(solicitud);}

    @Override
    public List<Solicitud> list() {return sc.findAll();}

    @Override
    public void delete(int idSolicitud) {sc.deleteById(idSolicitud);}

    @Override
    public Optional<Solicitud> ListarId(int idSolicitud){
        return Optional.of(sc.findById(idSolicitud).orElse(new Solicitud()));
    }

    @Override
    public List<Solicitud> search(String nombrehijo) {return sc.search(nombrehijo);}
}
