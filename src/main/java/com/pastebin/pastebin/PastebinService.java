package com.pastebin.pastebin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class PastebinService {

    @Autowired
    private PastebinRepository repo;

    public List<Pastebin> listAll() {
        return repo.findAll();
    }

    public void save(Pastebin pas) {
        repo.save(pas);
    }

    public Pastebin get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
