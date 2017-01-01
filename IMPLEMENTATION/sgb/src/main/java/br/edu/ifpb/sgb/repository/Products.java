package br.edu.ifpb.sgb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.sgb.model.Product;

@Repository
public interface Products extends JpaRepository<Product, Long>{

}
