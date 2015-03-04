package com.mkyong.common.service;

import com.mkyong.common.DAO.MovieDAO;
import com.mkyong.common.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by elizaveta on 01.03.2015.
 */

@Service
public class FileSystemServiceImpl implements FileSystemService {
    @Autowired
    MovieDAO movieDAO;
    
    @Override
    public void save(Movie movie) {
        try {
            movieDAO.save(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Movie findByName(String name) {
        try {
            return movieDAO.findByName(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
