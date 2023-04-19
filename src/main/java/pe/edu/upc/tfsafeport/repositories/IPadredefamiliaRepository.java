package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Padredefamilia;

import java.util.List;

@Repository
public interface IPadredefamiliaRepository extends JpaRepository<Padredefamilia, Integer> {
    @Query("from Padredefamilia p where p.nombre like %:nombre")
    List<Padredefamilia> search(@Param("nombre")String nombre);
}
