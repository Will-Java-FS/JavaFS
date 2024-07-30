package repositories;

import models.Movie;
import util.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
Interfaces of JDBC:
    - Connection
    - Statement
    - PreparedStatement
    - CallableStatement
    - ResultSet
 */

public class MovieRepoImpl implements MovieRepo {

    public static Connection conn = JDBCConnection.getConnection();

    @Override
    public Movie getMovie(int id) {

        String sql = "SELECT * FROM movies WHERE m_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildMovie(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Movie> getAllMovies() {

        String sql = "SELECT * FROM movies";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while(rs.next()) {
                movies.add(buildMovie(rs));
            }

            return movies;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Movie addMovie(Movie m) {

        String sql = "INSERT INTO movies VALUES (DEFAULT,?,?,?,DEFAULT,NULL) RETURNING *";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, m.getTitle());
            ps.setDouble(2, m.getPrice());
            ps.setBoolean(3, m.isAvailable());

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                return buildMovie(rs);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Movie updateMovie(Movie change) {
        try {
            String sql = "UPDATE movies SET title=?, price=?, available=?,return_date=? WHERE m_id = ? RETURNING *";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, change.getTitle());
            ps.setDouble(2, change.getPrice());
            ps.setBoolean(3, change.isAvailable());
            ps.setLong(4, change.getReturnDate());
            ps.setInt(5, change.getId());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildMovie(rs);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Movie deleteMovie(int id) {
        try {
            String sql = "DELETE FROM movies WHERE m_id = ? RETURNING *";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildMovie(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    //Helper Method
    private Movie buildMovie(ResultSet rs) throws SQLException {
        Movie m = new Movie();
        m.setId(rs.getInt("m_id"));
        m.setTitle(rs.getString("title"));
        m.setGenreId(rs.getInt("genre_id"));
        m.setPrice(rs.getDouble("price"));
        m.setAvailable(rs.getBoolean("available"));
        m.setReturnDate(rs.getLong("return_date"));

        return m;
    }
}