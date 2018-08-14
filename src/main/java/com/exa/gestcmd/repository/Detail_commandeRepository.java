package com.exa.gestcmd.repository;

import com.exa.gestcmd.domain.Detail_commande;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface Detail_commandeRepository extends JpaRepository<Detail_commande, Long> {
}
