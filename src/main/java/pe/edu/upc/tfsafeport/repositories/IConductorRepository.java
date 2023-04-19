package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Conductor;

import java.util.List;

@Repository
public interface IConductorRepository extends JpaRepository<Conductor, Integer> {

    @Query("from Conductor p where p.nombre like %:nombre")
    List<Conductor> search(@Param("nombre")String nombre);

}
