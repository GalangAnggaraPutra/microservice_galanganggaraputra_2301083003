package com.teknologiindormasi.restapi.repository;
import com.teknologiindormasi.restapi.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}


