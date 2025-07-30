package model;

public class Candidate {
    private int partyID;
    private String candidateName;
    private int votes;

    public Candidate(int partyID, String candidateName, int votes){
        this.partyID = partyID;
        this.candidateName = candidateName;
        this.votes = votes;
    }

    public int getPartyID(){
        return partyID;
    }
    public void setPartyID(int partyID){
        this.partyID = partyID;
    }

    public String getCandidateName(){
        return candidateName;
    }

    public void setCandidateName(String candidateName){
        this.candidateName = candidateName;
    }

    public int getVotes(){
        return votes;
    }
    public void setVotes(int votes){
        this.votes = votes;
    }
}
