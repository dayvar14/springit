package com.ayvar.springit.repository;

import com.ayvar.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
    Link findByTitle(String title);
    Link findAllByTitleOrderByCreationDateDesc(String title);
}
