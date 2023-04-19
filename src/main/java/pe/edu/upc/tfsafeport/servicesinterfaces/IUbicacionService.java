package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface IUbicacionService {
    public void insert(Ubicacion ubicacion);

    List<Ubicacion>list();
    public Optional<Ubicacion> ListarId(int id);
    public void delete(int id);

    List<Ubicacion>search(String distrito);
}
