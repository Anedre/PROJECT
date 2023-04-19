package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Solicitud;

import java.util.List;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Integer> {
    @Query("from Solicitud s where s.nombrehijo like %:nombrehijo")
    List<Solicitud> search(@Param("nombrehijo")String nombrehijo);
}
