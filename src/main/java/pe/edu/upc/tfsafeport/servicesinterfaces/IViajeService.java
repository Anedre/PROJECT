package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Viaje;

import java.util.List;
import java.util.Optional;

public interface IViajeService {

    public void Insert(Viaje viaje);

    List<Viaje>list();

    public void delete(int idViaje);

    public Optional<Viaje>listarId(int idViaje);

    List<Viaje>search(String horainicio);
}
