package com.mkyong.common.DAO;

import com.mkyong.common.model.Movie;
import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by elizaveta on 01.03.2015.
 */

@Component
public class MovieDAO {
    public void save(Movie movie) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFileName(movie)))) {
            oos.writeObject(movie);
        }
    }

    private String getFileName(Movie movie) {
        return getFileName(movie.getName());
    }

    private String getFileName(String name) {
        return "C:\\temp/movie_" + name + ".mv";
    }

    public Movie findByName(String name) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFileName(name)))) {
            return (Movie) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
