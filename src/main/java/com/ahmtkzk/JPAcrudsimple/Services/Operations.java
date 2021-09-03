package com.ahmtkzk.JPAcrudsimple.Services;

import com.ahmtkzk.JPAcrudsimple.Models.Notes;
import com.ahmtkzk.JPAcrudsimple.Repositories.forCrudRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Operations {

    private forCrudRepo repo;

    public void insertOp(String note){
        Notes notes = new Notes(note);
        repo.save(notes);
    }

    public void updateOp(String id, String upNote){
        Notes notes = repo.findById(id).get();
        notes.setNote(upNote);
        repo.save(notes);
    }

    public Notes getByIDOp(String id){
        return repo.findById(id).get();
    }

    public List<Notes> getAllOp(){
        return (List<Notes>) repo.findAll();
    }

    public void deleteOp(String id){
        repo.deleteById(id);
    }

}
