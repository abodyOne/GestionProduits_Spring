package org.sid.dao;



import java.io.Serializable;



import org.sid.Entities.Produit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProduitRepository extends JpaRepository<Produit, Long>{
	//methode de recherche
    @Query("select p from Produit p where p.designation like :x") 
	public Page<Produit> chercher(@Param("x")String mc,Pageable pageable);
    
}
