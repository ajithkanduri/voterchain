/*
 * Created by JFormDesigner on Wed Apr 03 14:22:45 IST 2019
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

import static com.company.Vote.voterIds;

/**
 * @author Ajith
 */
public class VotingPanel extends JFrame {
    int status =0;
    public static int difficulty = 4;
    private static String previousHash ="0";
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static ArrayList<Vote> votes = new ArrayList<Vote>();
    int[] result = new int[8];

    public VotingPanel() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        String voterId = textField1.getText();
        if(voterId==null)
        {
            JOptionPane.showMessageDialog(null,"Enter VoterId");
        }
        else
        {
            if(checkBox1.isSelected())
            {
                status = 1;
            }
            else if(checkBox2.isSelected())
            {
                status = 2;
            }
            else if(checkBox3.isSelected())
            {
                status = 3;
            }
            else if(checkBox4.isSelected())
            {
                status = 4;
            } else if(checkBox5.isSelected())
            {
                status = 5;
            } else if(checkBox6.isSelected())
            {
                status = 6;
            } else if(checkBox7.isSelected())
            {
                status = 7;
            }
            else if(checkBox8.isSelected())
            {
                status = 8;
            }
            if(status==0)
            {
                JOptionPane.showMessageDialog(null,"Please Cast your Vote");
            }
            else
            {
                Vote vote = new Vote(voterId,String.valueOf(status));
                if(vote.verifyVote())
                {
                    voterIds.add(vote.getVoterId());
                    votes.add(vote);
                    result[status]++;
//                    previousHash = addVoteToBlock(vote,previousHash);
//                    System.out.println(vote.getVoterId()+"has voted with hash:"+previousHash);
                }
            }

        }
    }


    private void button2ActionPerformed(ActionEvent e) {
        if(!votes.isEmpty())
        {
            previousHash = addVoteToBlock(votes,previousHash);
        }
    }


    private void button3ActionPerformed(ActionEvent e) {

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ajith Kanduri
        textField1 = new JTextField();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox7 = new JCheckBox();
        checkBox8 = new JCheckBox();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- textField1 ----
        textField1.setText("Enter Voter Id");

        //---- checkBox1 ----
        checkBox1.setText("YSRCP");

        //---- checkBox2 ----
        checkBox2.setText("JANA SENA");

        //---- checkBox3 ----
        checkBox3.setText("BJP");

        //---- checkBox5 ----
        checkBox5.setText("TDP");

        //---- checkBox6 ----
        checkBox6.setText("TRS");

        //---- checkBox4 ----
        checkBox4.setText("CONGRESS");

        //---- checkBox7 ----
        checkBox7.setText("CPI");

        //---- checkBox8 ----
        checkBox8.setText("AAP");

        //---- button1 ----
        button1.setText("VOTE");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("MINE BLOCK");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        //---- button3 ----
        button3.setText("VIEW RESULTS");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(checkBox7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(checkBox2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                    .addComponent(button2)
                                    .addGap(9, 9, 9)))))
                    .addGap(200, 200, 200))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(checkBox3)
                        .addComponent(checkBox1))
                    .addGap(26, 26, 26)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(checkBox2)
                        .addComponent(checkBox6))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(checkBox4)
                        .addComponent(checkBox5))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(checkBox8)
                        .addComponent(checkBox7))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(30, 30, 30)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public static String addVoteToBlock(ArrayList<Vote> vote,String previousHash)
    {
        System.out.println("Trying To mineBlock...");
        Block block = new Block(vote,previousHash);
        block.mineBlock(difficulty);
        if(verifyChain(block)) {
            blockchain.add(block);
            votes.clear();
        }
        return block.getBlockHash();
    }


    public static boolean verifyChain(Block block){
        for(int i=1;i<blockchain.size();i++){
            if(!(blockchain.get(i).getPreviousHash()==blockchain.get(i-1).getBlockHash()))
            {
                return false;
            }
        }
        if(!(blockchain.get(blockchain.size()-1).getBlockHash()==block.getPreviousHash()))
        {
            return false;
        }
        return true;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ajith Kanduri
    private JTextField textField1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox4;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
