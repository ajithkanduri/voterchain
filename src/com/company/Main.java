package com.company;

import java.util.ArrayList;

import static com.company.Vote.voterIds;

public class Main {
    public static int difficulty = 4;
    private static String previousHash ="0";
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static void main(String[] args) {
        Vote vote1 = new Vote("12345","1");
        if(vote1.verifyVote())
        {
            voterIds.add(vote1.getVoterId());
            previousHash = addVoteToBlock(vote1,previousHash);
            System.out.println(vote1.getVoterId()+"has voted with hash:"+previousHash);
        }
        Vote vote2 = new Vote("23456","0");
        if(vote2.verifyVote())
        {
            voterIds.add(vote2.getVoterId());
            previousHash = addVoteToBlock(vote2,previousHash);
            System.out.println(vote2.getVoterId()+"has voted with hash:"+previousHash);
        }
        Vote vote3 = new Vote("34567","1");
        if(vote3.verifyVote())
        {
            voterIds.add(vote3.getVoterId());
            previousHash = addVoteToBlock(vote3,previousHash);
            System.out.println(vote3.getVoterId()+"has voted with hash:"+previousHash);
        }
        Vote vote4 = new Vote("12345","0");
        if(vote4.verifyVote())
        {
            voterIds.add(vote4.getVoterId());
            previousHash = addVoteToBlock(vote4,previousHash);
            System.out.println(vote1.getVoterId()+"has voted with hash:"+previousHash);
        }
        else
        {
            System.out.println("You Have already Voted");
        }
    }
    private static String addVoteToBlock(Vote vote, String previousHash)
    {
        System.out.println("Trying To mineBlock...");
        Block block = new Block(vote,previousHash);
        block.mineBlock(difficulty);
        blockchain.add(block);
        return block.getBlockHash();
    }


    public static boolean verifyChain(){
        for(int i=1;i<blockchain.size();i++){
            if(!(blockchain.get(i).getPreviousHash()==blockchain.get(i-1).getBlockHash()))
            {
                return false;
            }
        }
        return true;
    }
}
