/*
 Yahtzee End
 Determines a winner of the Yahtzee game and determines if a new high score has been set, displays final scores, the winner, and the current high score
 Gabrielle Otchet 
 June 19, 2023
 Last updated: June 20, 2023
*/

import java.io.*;
public class YahtzeeEnd extends javax.swing.JFrame {
   
    Players p1;//player object p1
    Players p2;//player object p2
    String winner;//winner's name
    int thisHighestScore;//highest score in the game
    boolean tie = false;//boolean to identify if a tie has occured
 
    
    public YahtzeeEnd(Players p1, Players p2) {
        //Obtains and assigns the passed in p1 and p2 objects
        this.p1 = p1;
        this.p2 = p2;
        initComponents();
        
         //sets headers with player names anbd scores
        lblP1Name.setText(p1.getplayerName());
        lblP1Score.setText(Integer.toString(p1.scoreCard[19]));
        
        lblP2Name.setText(p2.getplayerName());
        lblP2Score.setText(Integer.toString(p2.scoreCard[19]));
        
        //determines a winner and sets this to the screen
        //if p1 won
        if(p1.scoreCard[19]>p2.scoreCard[19]){
            winner = p1.getplayerName();
            thisHighestScore = p1.scoreCard[19];
            lblWinner.setText("Congrats " + winner + "! You are the winner!");
            
        //if p1 and p2 tied
        } else if (p1.scoreCard[19] == p2.scoreCard[19]){
            winner = p1.getplayerName() + p2.getplayerName();
            thisHighestScore = p1.scoreCard[19];
            lblWinner.setText("Congrats " + winner + "! You tied!");
            tie = true;
        } else {
            //if p2 won
            winner = p2.getplayerName();
            thisHighestScore = p2.scoreCard[19];
            lblWinner.setText("Congrats " + winner + "! You are the winner!");
       
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        lblP1Name = new javax.swing.JLabel();
        lblP2Name = new javax.swing.JLabel();
        lblP1Score = new javax.swing.JLabel();
        lblP2Score = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCheckHighscore = new javax.swing.JButton();
        lblWinner = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblHighScore = new javax.swing.JLabel();
        lblNewHighScoreMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Game Over!");

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Name");

        Name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name1.setText("Score");

        lblP1Name.setText("Player 1");

        lblP2Name.setText("Player 2");

        lblP1Score.setText("Score");

        lblP2Score.setText("Score");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCheckHighscore.setText("Current High Score");
        btnCheckHighscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckHighscoreActionPerformed(evt);
            }
        });

        lblWinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWinner.setText("Congrats Player! You are the winner!");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblHighScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNewHighScoreMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(lblWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(btnCheckHighscore))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(lblHighScore, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNewHighScoreMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(121, 121, 121)
                                            .addComponent(lblP2Score, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Name)
                                                .addComponent(lblP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(121, 121, 121)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Name1)
                                                .addComponent(lblP1Score, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Name1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1Name)
                    .addComponent(lblP1Score))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP2Name)
                    .addComponent(lblP2Score))
                .addGap(69, 69, 69)
                .addComponent(lblWinner)
                .addGap(48, 48, 48)
                .addComponent(btnCheckHighscore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addComponent(lblHighScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(lblNewHighScoreMessage)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);//exits program
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCheckHighscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckHighscoreActionPerformed
      String fileHighScore = "";//high score stored in the file as a string
      int highScore;//high score stored in the file as an int
      String highScoreName = "";//name of player who holds the high score
      
      //reads in the current high score and player from the Highscore file
      try {
            FileReader fr = new FileReader("Highscore.txt");
            BufferedReader br = new BufferedReader(fr);
            fileHighScore = br.readLine();//reads in the high score line and assigns it
            highScoreName = br.readLine();//reads in the high score player name and assigns it
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
      highScore = Integer.valueOf(fileHighScore);//changes the string to an int
      
      //checks if the highest score in the game is greater than the current high score
      if (thisHighestScore>highScore){
       highScore = thisHighestScore;//reassigns score
       highScoreName = winner;//reassigns name
       lblNewHighScoreMessage.setText("Congrats " + highScoreName + "! You have set a new high score!");
      }
      //wr
       try{
            FileWriter fw = new FileWriter ("Highscore.txt");
            PrintWriter pw = new PrintWriter(fw);
            //writes the new high score and name, if there is not a new high score, the old one will just be rewritten
            pw.println(highScore);
            pw.println(highScoreName);
            pw.close();
        } 
           catch(IOException e){
               System.out.println();}
      
       //displays high score and the name of the high score holder
       lblTitle.setText("Currect High Score:");
       lblHighScore.setText(String.valueOf(highScore) + "    Scored by: " + highScoreName);
      
    }//GEN-LAST:event_btnCheckHighscoreActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new YahtzeeWelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JButton btnCheckHighscore;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHighScore;
    private javax.swing.JLabel lblNewHighScoreMessage;
    private javax.swing.JLabel lblP1Name;
    private javax.swing.JLabel lblP1Score;
    private javax.swing.JLabel lblP2Name;
    private javax.swing.JLabel lblP2Score;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWinner;
    // End of variables declaration//GEN-END:variables
}
