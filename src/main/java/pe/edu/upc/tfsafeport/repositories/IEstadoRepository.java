package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Estado;

import java.util.List;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado,Integer> {
    @Query("from Estado e where e.direccionPartida like %:direccionPartida")
    List<Estado>search(@Param("direccionPartida")String direccionPartida);

}
