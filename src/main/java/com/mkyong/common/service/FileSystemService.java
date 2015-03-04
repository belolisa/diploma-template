package com.mkyong.common.service;

import com.mkyong.common.model.Movie;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by elizaveta on 01.03.2015.
 */

@Service
public interface FileSystemService {
    void save(Movie movie);

    Movie findByName(String name) throws IOException;
}
