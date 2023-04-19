package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Estado;

import java.util.List;
import java.util.Optional;

public interface IEstadoService {
    public void insert(Estado estado);
    List<Estado>list();
    public void delete(int idEstado);
    public Optional<Estado>listarId(int idEstado);
    List<Estado>search(String direccionPartida);
}
