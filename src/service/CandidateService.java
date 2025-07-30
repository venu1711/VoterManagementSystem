package service;
// For candidate to register in the voting booth

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Candidate;
import dao.DBUtil;

import static dao.DBUtil.conn;
import static dao.DBUtil.pmst;

public class CandidateService {
    DBUtil db = new DBUtil();
    public void register(Candidate c) throws SQLException {
        db.connect();
        String sql = "INSERT INTO candidates VALUES(?,?,?);";
        pmst = conn.prepareStatement(sql);
        pmst.setInt(1,c.getPartyID());
        pmst.setString(2,c.getCandidateName());
        pmst.setInt(3,0);
        pmst.executeUpdate(sql);
    }

    public int getVotes(String name) throws SQLException {
        db.connect();
        ResultSet rs = pmst.executeQuery("SELECT no_of_votes FROM candidates WHERE " +
                "candidate_name = '" + name + "';");
        return rs.getInt("no_of_votes");
    }
}
