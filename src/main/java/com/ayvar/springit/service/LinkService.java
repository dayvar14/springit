package com.ayvar.springit.service;

import com.ayvar.springit.domain.Link;
import com.ayvar.springit.repository.LinkRepository;
import com.ayvar.springit.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkService {
    private final Logger logger = LoggerFactory.getLogger(LinkService.class);
    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link save(Link link) {
        return linkRepository.save(link);
    }

    public List<Link> findAll() {
        return linkRepository.findAll(Sort.by(Sort.Direction.DESC, "creationDate"));
    }

    public Optional<Link> findById(Long id) {
        return linkRepository.findById(id);
    }
}
