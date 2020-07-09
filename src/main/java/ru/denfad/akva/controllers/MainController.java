package ru.denfad.akva.controllers;


import org.springframework.web.bind.annotation.*;
import ru.denfad.akva.models.Data;
import ru.denfad.akva.repository.Repository;

@RestController
@RequestMapping(path = "/index")
public class MainController {

    private final Repository repository = Repository.getInstance();

    @PutMapping(path = "/", consumes = "application/json")
    public void addData(@RequestBody Data data){
        repository.data = data;
    }

    @GetMapping(path = "/",produces = "application/json")
    public Data getData(){
        return repository.data;
    }

}
