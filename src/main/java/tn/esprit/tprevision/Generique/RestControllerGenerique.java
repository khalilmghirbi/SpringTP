package tn.esprit.tprevision.Generique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RestControllerGenerique <T,ID>{
    @Autowired
    IGeneriqueService<T, ID> iGeneriqueService;

    @PostMapping
    public T add(@RequestBody T entity) {

        return iGeneriqueService.add(entity);


    }
    @DeleteMapping("/{idEtud}")
    public void delete(@PathVariable ID idEtud) {
        iGeneriqueService.remove(idEtud);

    }
    @GetMapping
    public List<T> getAll()
    {
        return iGeneriqueService.getAll();
    }

    @GetMapping("/{idEtud}")
    public T getById(@PathVariable ID idEtud)
    {
        return iGeneriqueService.getById(idEtud);
    }


    @PutMapping
    public ResponseEntity<T> update(@RequestBody T entity) {
        try {
            return new ResponseEntity(iGeneriqueService.update(entity), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }}