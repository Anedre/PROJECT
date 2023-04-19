package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Padredefamilia;
import pe.edu.upc.tfsafeport.repositories.IPadredefamiliaRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IPadredefamiliaService;

import java.util.List;
import java.util.Optional;

@Service
public class PadredefamiliaServiceImpl implements IPadredefamiliaService {

    @Autowired
    private IPadredefamiliaRepository pR;

    @Override
    public void insert(Padredefamilia padredefamilia) {
        pR.save(padredefamilia);
    }

    @Override
    public List<Padredefamilia> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int Id) {
        pR.deleteById(Id);
    }

    @Override
    public Optional<Padredefamilia> listarId(int Id) {
        return Optional.of(pR.findById(Id).orElse(new Padredefamilia()));
    }

    @Override
    public List<Padredefamilia> search(String nombre) {
        return pR.search(nombre);
    }

}
