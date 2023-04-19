package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Viaje;

import java.util.List;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Integer> {
    @Query("from Viaje v where v.horainicio like %:horainicio")
    List<Viaje> search(@Param("horainicio")String horainicio);
}
