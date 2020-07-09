package ru.denfad.akva.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.denfad.akva.models.Data;

import java.util.ArrayList;
import java.util.List;

@Service
public class Repository {

    private static Repository repository;

    public Data data;

    private Repository(){
    }

    public static Repository getInstance(){
        if(repository==null){
            repository = new Repository();
        }
        return repository;
    }

}
