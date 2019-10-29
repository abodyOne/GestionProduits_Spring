package org.sid;

import org.sid.Entities.Produit;
import org.sid.dao.ProduitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatMvc1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CatMvc1Application.class, args);
	   ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
	   produitRepository.save(new Produit("TV SAMSUNG",456,90));
	   produitRepository.save(new Produit("HP LASER",500,10));
	   produitRepository.save(new Produit("DELL XPS",7000,100));
	   produitRepository.save(new Produit("HP 700",7600,20));
	   produitRepository.save(new Produit("TOSHIBA 600",7000,6));
	   produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}
	
 
}
