package com.kalinowskim.chucknorrisjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    @Override
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
