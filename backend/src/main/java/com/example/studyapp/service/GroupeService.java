package com.example.studyapp.service;

import com.example.studyapp.model.Groupe;
import com.example.studyapp.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {

    @Autowired
    private GroupeRepository groupeRepository;

    public Groupe createGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    public List<Groupe> getAllGroupes() {
        return groupeRepository.findAll();
    }

    public Groupe getGroupeById(String id) {
        return groupeRepository.findById(id).orElse(null);
    }

    public Groupe updateGroupe(String id, Groupe groupe) {
        Groupe existingGroupe = groupeRepository.findById(id).orElse(null);
        if (existingGroupe != null) {
            existingGroupe.setName(groupe.getName());
            return groupeRepository.save(existingGroupe);
        }
        return null;
    }

    public void deleteGroupe(String id) {
        groupeRepository.deleteById(id);
    }
}
