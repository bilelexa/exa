package com.exa.gestcmd.web.rest;

import com.exa.gestcmd.domain.Detail_commande;
import com.exa.gestcmd.repository.Detail_commandeRepository;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class Detail_commandeResource {

    private final Detail_commandeRepository detail_commandeRepository;

    public Detail_commandeResource(Detail_commandeRepository detail_commandeRepository) {
        this.detail_commandeRepository = detail_commandeRepository;
    }

    @PostMapping("/detail-commandes")
    public void createDetail_commande(@Valid @RequestBody Detail_commande detail_commande) {
       detail_commandeRepository.save(detail_commande);
    }

    @PutMapping("/detail-commandes")
    public void updateDetail_commande(@Valid @RequestBody Detail_commande detail_commande) {
        detail_commandeRepository.save(detail_commande);
    }

    @GetMapping("/detail-commandes")
    public List<Detail_commande> getAllDetail_commandes() {
        return detail_commandeRepository.findAll();
    }

    @GetMapping("/detail-commandes/{id}")
    public Optional<Detail_commande> getDetail_commande(@PathVariable Long id) {
        Optional<Detail_commande> detail_commande = detail_commandeRepository.findById(id);
        return detail_commande;
    }

    @DeleteMapping("/detail-commandes/{id}")
    public void deleteDetail_commande(@PathVariable Long id) {
        detail_commandeRepository.deleteById(id);
    }
}
