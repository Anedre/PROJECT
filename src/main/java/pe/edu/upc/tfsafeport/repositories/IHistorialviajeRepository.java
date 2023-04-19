package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Historialviaje;

import java.util.List;

@Repository
public interface IHistorialviajeRepository extends JpaRepository<Historialviaje, Integer> {
    @Query("from Historialviaje h where h.observaciones like %:observaciones")
    List<Historialviaje> search(@Param("observaciones")String observaciones);
    //necesario para el service

}
