package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Padredefamilia;

import java.util.List;
import java.util.Optional;
public interface IPadredefamiliaService {
    public void insert(Padredefamilia padredefamilia);
    List<Padredefamilia>list();

    public void delete (int Id);

    public Optional<Padredefamilia>listarId(int Id);

    List<Padredefamilia> search(String nombre);


}
