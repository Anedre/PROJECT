package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Solicitud;

import java.util.List;
import java.util.Optional;

public interface ISolicitudService {

    public void Insert(Solicitud solicitud);

    List<Solicitud>list();

    public void delete(int idSolicitud);

    public Optional<Solicitud>ListarId(int idSolicitud);

    List<Solicitud>search(String nombrehijo);
}
