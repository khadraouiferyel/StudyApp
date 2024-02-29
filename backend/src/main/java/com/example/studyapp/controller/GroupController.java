package com.example.studyapp.controller;

import com.example.studyapp.model.Groupe;
import com.example.studyapp.service.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groupe")
@CrossOrigin(origins = "*")
public class GroupController {

    @Autowired
    private GroupeService groupeService;

    @PostMapping("/group")
    public Groupe createGroupe(@RequestBody Groupe groupe) {
        return groupeService.createGroupe(groupe);
    }

    @GetMapping("/group")
    public List<Groupe> getAllGroupes() {
        return groupeService.getAllGroupes();
    }

    @GetMapping("/group/{id}")
    public Groupe getGroupeById(@PathVariable String id) {
        return groupeService.getGroupeById(id);
    }

    @PutMapping("/group/{id}")
    public Groupe updateGroupe(@PathVariable String id, @RequestBody Groupe groupe) {
        return groupeService.updateGroupe(id, groupe);
    }

    @DeleteMapping("/group/{id}")
    public void deleteGroupe(@PathVariable String id) {
        groupeService.deleteGroupe(id);
    }
}
