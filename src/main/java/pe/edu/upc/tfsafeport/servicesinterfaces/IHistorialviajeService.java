package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Historialviaje;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

public interface IHistorialviajeService {

    public void Insert(Historialviaje historialviaje);

    List<Historialviaje>list();

    public void delete(int idHistorial);

    public Optional<Historialviaje>ListarId(int idHistorial);

    List<Historialviaje>search(String observaciones);
}
