package com.ayvar.springit.service;

import com.ayvar.springit.domain.Vote;
import com.ayvar.springit.repository.VoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final Logger logger = LoggerFactory.getLogger(VoteService.class);
    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote save(Vote vote) {
        return this.voteRepository.save(vote);
    }
}
