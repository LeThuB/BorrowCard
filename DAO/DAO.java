package BorrowCard.DAO;

import BorrowCard.ConnestionDB.ConnectionDB;
import BorrowCard.entity.BorrowCard;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public List<BorrowCard> getAll() {
        List<BorrowCard> list = new ArrayList<>();

        String sql = "{CALL getBorrowCards()}";

        try (
                Connection conn = ConnectionDB.getConnection();
                CallableStatement cs = conn.prepareCall(sql);
                ResultSet rs = cs.executeQuery()
        ) {
            while (rs.next()) {
                BorrowCard card = new BorrowCard(
                        rs.getInt("card_id"),
                        rs.getString("book_title"),
                        rs.getString("borrower_name"),
                        rs.getDate("borrow_date").toLocalDate(),
                        rs.getDate("return_deadline").toLocalDate(),
                        rs.getInt("quantity"),
                        rs.getString("status")
                );
                list.add(card);
            }
        } catch (SQLException e) {
            System.out.println("Loi " + e.getMessage());
        }
        return list;
    }

    private static void addCard() {
        String sql = "{CALL addBorrowCards(?,?,?,?,?,?)}";
        try (
                Connection conn = ConnectionDB.getConnection();
                CallableStatement cs = conn. {
        } catch (SQLException e) {
            System.out.println("Loi " + e.getMessage());
//    public void addCard(){
//        String sql = "{CALL addBorrowCards(?,?,?,?,?,?)}";
//        try (
//                Connection conn = ConnectionDB.getConnection();
//                CallableStatement cs = conn.prepareCall(sql)) {
//        cs.setString(1,book_title);
//
//        }

        }
    }