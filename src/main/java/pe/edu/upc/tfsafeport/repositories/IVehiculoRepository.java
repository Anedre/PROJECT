package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Vehiculo;

import java.util.List;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculo,Integer> {
    @Query("from Vehiculo p where p.placa like %:placa")
    List<Vehiculo> search(@Param("placa")String placa);

    @Query("from Vehiculo p where p.conductor.nombre like %:nombre%")
    List<Vehiculo> searchConductor(@Param("nombre") String nombre);
}
