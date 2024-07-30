package com.revature.repositories;

import com.revature.models.Movie;
import com.revature.util.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepoImpl {

    public static Connection conn = JDBCConnection.getConnection();


    public Movie getMovie(int id){
        String sql = "SELECT * FROM movie WHERE m_id = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public List<Movie> getAllMovies(int id){
        String sql = "SELECT * FROM movies";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Movie> movies = new ArrayList<>();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
