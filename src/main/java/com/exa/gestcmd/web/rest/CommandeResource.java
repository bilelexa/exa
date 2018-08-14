package com.exa.gestcmd.web.rest;

import com.exa.gestcmd.domain.Commande;
import com.exa.gestcmd.repository.CommandeRepository;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CommandeResource {

    private final CommandeRepository commandeRepository;

    public CommandeResource(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @PostMapping("/commandes")
    public void createCommande(@Valid @RequestBody Commande commande) {
        commandeRepository.save(commande);
    }

    @PutMapping("/commandes")
    public void updateCommande(@Valid @RequestBody Commande commande) {
        commandeRepository.save(commande);
    }

    @GetMapping("/commandes")
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @GetMapping("/commandes/{id}")
    public Optional<Commande> getCommande(@PathVariable Long id) {
        Optional<Commande> commande = commandeRepository.findById(id);
        return commande;
    }

    @DeleteMapping("/commandes/{id}")
    public void deleteCommande(@PathVariable Long id) {
        commandeRepository.deleteById(id);
    }
}
