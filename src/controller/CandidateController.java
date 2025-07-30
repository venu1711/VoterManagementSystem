package controller;

import model.Candidate;
import service.CandidateService;

import java.sql.SQLException;

public class CandidateController {
    CandidateService service = new CandidateService();

    public void register(Candidate c) throws SQLException {
        service.register(c);
    }

    public int getVotes(String name) throws SQLException {
        return service.getVotes(name);
    }
}
