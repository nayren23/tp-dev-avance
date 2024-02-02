package bdd;

import bean.Annonce;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnnonceDAO extends DAO<Annonce>{

    public AnnonceDAO(Connection connect) {
        super(connect);
    }

    @Override
    public boolean create(Annonce obj) {
        PreparedStatement preparedStatement = null;
        try {
            String sql = "INSERT INTO annonce (title, description, address, mail) VALUES (?, ?, ?, ?)";
            preparedStatement = this.connect.prepareStatement(sql);
            preparedStatement.setString(1, obj.getTitle());
            preparedStatement.setString(2, obj.getDescription());
            preparedStatement.setString(3, obj.getAdresse());
            preparedStatement.setString(4, obj.getMail());

            int result = preparedStatement.executeUpdate();
            return result > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Override
    public boolean update(Annonce entity) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public Annonce read(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Annonce> fetchAll() throws SQLException {
        List<Annonce> annonces = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM annonce");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String address = resultSet.getString("address");
                String mail = resultSet.getString("mail");

                Annonce annonce = new Annonce(id, title, description, address, mail);
                annonces.add(annonce);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return annonces;
    }


}
