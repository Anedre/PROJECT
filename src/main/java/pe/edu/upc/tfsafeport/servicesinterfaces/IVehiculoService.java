package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    public boolean insert(Vehiculo vehiculo);

    List<Vehiculo> list();
    Optional<Vehiculo>ListarId(int id);
    public void delete(int id);

    List<Vehiculo>search(String placa);
    List<Vehiculo>searchConductor(String nombre);
}
