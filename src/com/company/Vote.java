package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Vote implements Serializable
{
    private String voterId;
    static ArrayList<String> voterIds = new ArrayList<String>();
    private String voteParty;


    public Vote(String voterId, String voteParty)
    {
        this.voterId=voterId;
        this.voteParty=voteParty;
    }
    public boolean verifyVote()
    {
        for (int i=0;i<voterIds.size() ;i++ ) {
            //if encrypted try to decrpyt here.
            if(voterIds.get(i).equals(voterId))
            {
                return false;
            }
        }
        addVoter();
        return true;
    }
    public void addVoter()
    {
        //can even encrypt the voterIds before adding to arrayList.
        voterIds.add(voterId);
    }
    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public String getVoteParty() {
        return voteParty;
    }

    public void setVoteParty(String voteParty) {
        this.voteParty = voteParty;
    }
}
