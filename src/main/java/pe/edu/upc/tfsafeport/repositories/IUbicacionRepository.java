package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Ubicacion;

import java.util.List;

@Repository
public interface IUbicacionRepository extends JpaRepository<Ubicacion,Integer> {
    @Query("from Ubicacion p where p.distrito like %:distrito")
    List<Ubicacion> search(@Param("distrito")String distrito);
}
