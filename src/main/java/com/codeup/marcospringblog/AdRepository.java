package com.codeup.marcospringblog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {

    Ad findByTitle(String title);

    Ad findByTitleLike(String searchPattern); //find by title "%INPUT%"

}
