/*
 Yahtzee
 Simulates the game yahtzee for two players, keeping score automatically
 Gabrielle Otchet 
 June 2, 2023
 Last updated: June 20, 2023
 */

public class YahtzeeGUI extends javax.swing.JFrame {
    private Players p1;//player object p1
    private Players p2;//player object p2

    public YahtzeeGUI(Players p1, Players p2) {
        //Obtains and assigns the passed in p1 and p2 objects
        this.p1 = p1;
        this.p2 = p2;
        initComponents();
        
        //sets headers with player names
        lblP1Display.setText(p1.getplayerName());
        lblP2Display.setText(p2.getplayerName());
        lblPlayerTurn.setText("Player: " + p1.getplayerName() + "  Roll: 0");
        
        //hides access to the scoring and finish game buttons
        hideScoringButtons();
        btnFinish.setVisible(false);
    }

    
    Dice dice = new Dice();//Calls the dice constructor
    //creates dice change variables - indicates whether the user would or would not like to reroll dice
    boolean dice1change = true;
    boolean dice2change = true;
    boolean dice3change = true;
    boolean dice4change = true;
    boolean dice5change = true;

    int totalRolls = 0;//total rolls completed
    int rollCount = 0;//the current roll that a user is on (1-3)
    int playerTurn = 1;//indicates whose turn it is

    int p1YBonus = 0;//player one yahtzee bonus score
    int p2YBonus = 0;//player two yahtzee bonus score

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnKeep1 = new javax.swing.JButton();
        btnKeep2 = new javax.swing.JButton();
        btnKeep3 = new javax.swing.JButton();
        btnKeep4 = new javax.swing.JButton();
        btnKeep5 = new javax.swing.JButton();
        lblDice1 = new javax.swing.JLabel();
        lblDice2 = new javax.swing.JLabel();
        lblDice3 = new javax.swing.JLabel();
        lblDice4 = new javax.swing.JLabel();
        lblDice5 = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        txtPlayerTurn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblP1Display = new javax.swing.JLabel();
        lblP2Display = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblPlayerTurn = new javax.swing.JLabel();
        lblP1Aces = new javax.swing.JLabel();
        lblP1Twos = new javax.swing.JLabel();
        lblP1Threes = new javax.swing.JLabel();
        lblP1Fours = new javax.swing.JLabel();
        lblP1Fives = new javax.swing.JLabel();
        lblP1Sixes = new javax.swing.JLabel();
        lblP1Upper = new javax.swing.JLabel();
        lblP1UpperBonus = new javax.swing.JLabel();
        lblP1UpperTotal = new javax.swing.JLabel();
        lblP2Aces = new javax.swing.JLabel();
        lblP2Twos = new javax.swing.JLabel();
        lblP2Threes = new javax.swing.JLabel();
        lblP2Fours = new javax.swing.JLabel();
        lblP2Fives = new javax.swing.JLabel();
        lblP2Sixes = new javax.swing.JLabel();
        lblP2Upper = new javax.swing.JLabel();
        lblP2UpperBonus = new javax.swing.JLabel();
        lblP2UpperTotal = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        lblP13ofK = new javax.swing.JLabel();
        lblP14ofK = new javax.swing.JLabel();
        lblP1FullHouse = new javax.swing.JLabel();
        lblP1SmSt = new javax.swing.JLabel();
        lblP1Chance = new javax.swing.JLabel();
        lblP1YahtzeeBonus = new javax.swing.JLabel();
        lblP1LowerTotal = new javax.swing.JLabel();
        lblP1UpperTotal2 = new javax.swing.JLabel();
        lblP1GrandTotal = new javax.swing.JLabel();
        lblP1LgSt = new javax.swing.JLabel();
        lblP1Yahtzee = new javax.swing.JLabel();
        lblP23ofK = new javax.swing.JLabel();
        lblP24ofK = new javax.swing.JLabel();
        lblP2FullHouse = new javax.swing.JLabel();
        lblP2SmSt = new javax.swing.JLabel();
        lblP2UpperTotal2 = new javax.swing.JLabel();
        lblP2Yahtzee = new javax.swing.JLabel();
        lblP2YahtzeeBonus = new javax.swing.JLabel();
        lblP2LowerTotal = new javax.swing.JLabel();
        lblP2GrandTotal = new javax.swing.JLabel();
        lblP2LgSt = new javax.swing.JLabel();
        lblP2Chance = new javax.swing.JLabel();
        btnAces = new javax.swing.JButton();
        btnTwos = new javax.swing.JButton();
        btnThrees = new javax.swing.JButton();
        btnFours = new javax.swing.JButton();
        btnFives = new javax.swing.JButton();
        btnSixes = new javax.swing.JButton();
        btn3ofK = new javax.swing.JButton();
        btn4ofK = new javax.swing.JButton();
        btnfullHouse = new javax.swing.JButton();
        btnSmSt = new javax.swing.JButton();
        btnLgSt = new javax.swing.JButton();
        btnYahtzee = new javax.swing.JButton();
        btnChance = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnInstructionFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnScoringFrame = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee  Game");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Dice");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 379, -1, -1));

        btnKeep1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeep1.setText("Keep");
        btnKeep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeep1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 439, -1, -1));

        btnKeep2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeep2.setText("Keep");
        btnKeep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeep2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 483, -1, -1));

        btnKeep3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeep3.setText("Keep");
        btnKeep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeep3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 527, -1, -1));

        btnKeep4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeep4.setText("Keep");
        btnKeep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeep4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 571, -1, -1));

        btnKeep5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeep5.setText("Keep");
        btnKeep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeep5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 615, -1, -1));

        lblDice1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDice1.setText("--");
        getContentPane().add(lblDice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 439, -1, -1));

        lblDice2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDice2.setText("--");
        getContentPane().add(lblDice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 482, -1, -1));

        lblDice3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDice3.setText("--");
        getContentPane().add(lblDice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 525, -1, -1));

        lblDice4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDice4.setText("--");
        getContentPane().add(lblDice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 568, -1, -1));

        lblDice5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDice5.setText("--");
        getContentPane().add(lblDice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 611, -1, -1));

        btnRoll.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRoll.setText("Roll");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 659, -1, -1));

        txtPlayerTurn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPlayerTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1369, 371, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("UPPER SECTION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 24, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Aces = 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 54, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Twos = 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 84, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Threes = 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 114, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Fours = 4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 144, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Fives = 5");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 174, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Sixes = 6");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 208, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Total Score");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("BONUS (score is 63+)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 268, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Total (Upper section)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("How to Score");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 24, -1, -1));

        jLabel14.setText("Counts and adds only 1s");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 54, -1, -1));

        jLabel15.setText("Counts and adds only 2s");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 84, -1, -1));

        jLabel16.setText("Counts and adds only 3s");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 114, -1, -1));

        jLabel17.setText("Counts and adds only 4s");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 144, -1, -1));

        jLabel18.setText("Counts and adds only 5s");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 174, -1, -1));

        jLabel19.setText("Counts and adds only 6s");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 210, -1, -1));

        jLabel20.setText("-");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 242, -1, -1));

        jLabel21.setText("Adds 35");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("-");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 316, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("LOWER SECTION");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 348, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("How to Score");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("3 of a Kind");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 383, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("4 of a Kind");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 411, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Full House");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 444, -1, -1));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Sm. Straight");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 474, -1, -1));

        jLabel30.setText("(sequence of 4)");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 499, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Lg. Straight");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 519, -1, -1));

        jLabel32.setText("(sequence of 5)");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 539, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("YAHTZEE");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 561, -1, -1));

        jLabel34.setText("(5 of a Kind)");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 579, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Chance");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 601, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("YAHTZEE BONUS");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 645, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Lower Total");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 679, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Upper Total");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 707, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Grand Total");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 735, -1, -1));

        jLabel40.setText("Adds total of all dice");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 411, -1, -1));

        jLabel41.setText("Adds total of all dice");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 383, -1, -1));

        jLabel42.setText("+ 25");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 444, -1, -1));

        jLabel43.setText("+30");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 474, -1, -1));

        jLabel44.setText("+40");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 524, -1, -1));

        jLabel45.setText("+50");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 561, -1, -1));

        jLabel46.setText("Adds total of all dice");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 601, -1, -1));

        jLabel47.setText("-");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 679, -1, -1));

        jLabel48.setText("-");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 707, -1, -1));

        jLabel49.setText("+100 for every extra Yahtzee");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 645, -1, -1));

        lblP1Display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP1Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblP1Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        lblP2Display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP2Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblP2Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/330-3307905_thin-vertical-line-straight-vertical-line-png.png"))); // NOI18N
        jLabel52.setText("jLabel52");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 23, 837));

        lblPlayerTurn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlayerTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerTurn.setText("Player: 1   Roll: 1");
        getContentPane().add(lblPlayerTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 327, 270, -1));

        lblP1Aces.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Aces.setText("-");
        getContentPane().add(lblP1Aces, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, -1, -1));

        lblP1Twos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Twos.setText("-");
        getContentPane().add(lblP1Twos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 82, -1, -1));

        lblP1Threes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Threes.setText("-");
        getContentPane().add(lblP1Threes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 116, -1, -1));

        lblP1Fours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Fours.setText("-");
        getContentPane().add(lblP1Fours, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 146, -1, -1));

        lblP1Fives.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Fives.setText("-");
        getContentPane().add(lblP1Fives, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 176, -1, -1));

        lblP1Sixes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Sixes.setText("-");
        getContentPane().add(lblP1Sixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 210, -1, -1));

        lblP1Upper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Upper.setText("-");
        getContentPane().add(lblP1Upper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 234, -1, -1));

        lblP1UpperBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1UpperBonus.setText("-");
        getContentPane().add(lblP1UpperBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 268, -1, -1));

        lblP1UpperTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblP1UpperTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1UpperTotal.setText("-");
        getContentPane().add(lblP1UpperTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 316, -1, -1));

        lblP2Aces.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Aces.setText("-");
        getContentPane().add(lblP2Aces, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 50, -1, -1));

        lblP2Twos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Twos.setText("-");
        getContentPane().add(lblP2Twos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 80, -1, -1));

        lblP2Threes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Threes.setText("-");
        getContentPane().add(lblP2Threes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 116, -1, -1));

        lblP2Fours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Fours.setText("-");
        getContentPane().add(lblP2Fours, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 146, -1, -1));

        lblP2Fives.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Fives.setText("-");
        getContentPane().add(lblP2Fives, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 176, -1, -1));

        lblP2Sixes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Sixes.setText("-");
        getContentPane().add(lblP2Sixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 210, -1, -1));

        lblP2Upper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Upper.setText("-");
        getContentPane().add(lblP2Upper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 236, -1, -1));

        lblP2UpperBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2UpperBonus.setText("-");
        getContentPane().add(lblP2UpperBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 268, -1, -1));

        lblP2UpperTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblP2UpperTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2UpperTotal.setText("-");
        getContentPane().add(lblP2UpperTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 316, -1, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("-");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 735, -1, -1));

        lblP13ofK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP13ofK.setText("-");
        getContentPane().add(lblP13ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 380, -1, -1));

        lblP14ofK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP14ofK.setText("-");
        getContentPane().add(lblP14ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 410, -1, -1));

        lblP1FullHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1FullHouse.setText("-");
        getContentPane().add(lblP1FullHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 440, -1, -1));

        lblP1SmSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1SmSt.setText("-");
        getContentPane().add(lblP1SmSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 470, -1, -1));

        lblP1Chance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Chance.setText("-");
        getContentPane().add(lblP1Chance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 600, -1, -1));

        lblP1YahtzeeBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1YahtzeeBonus.setText("-");
        getContentPane().add(lblP1YahtzeeBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 640, -1, -1));

        lblP1LowerTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1LowerTotal.setText("-");
        getContentPane().add(lblP1LowerTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 680, -1, -1));

        lblP1UpperTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1UpperTotal2.setText("-");
        getContentPane().add(lblP1UpperTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 710, -1, -1));

        lblP1GrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP1GrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1GrandTotal.setText("-");
        getContentPane().add(lblP1GrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 740, -1, -1));

        lblP1LgSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1LgSt.setText("-");
        getContentPane().add(lblP1LgSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 530, -1, -1));

        lblP1Yahtzee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1Yahtzee.setText("-");
        getContentPane().add(lblP1Yahtzee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, -1, -1));

        lblP23ofK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP23ofK.setText("-");
        getContentPane().add(lblP23ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 380, -1, -1));

        lblP24ofK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP24ofK.setText("-");
        getContentPane().add(lblP24ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 412, -1, -1));

        lblP2FullHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2FullHouse.setText("-");
        getContentPane().add(lblP2FullHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 440, -1, -1));

        lblP2SmSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2SmSt.setText("-");
        getContentPane().add(lblP2SmSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 470, -1, -1));

        lblP2UpperTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2UpperTotal2.setText("-");
        getContentPane().add(lblP2UpperTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 710, -1, -1));

        lblP2Yahtzee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Yahtzee.setText("-");
        getContentPane().add(lblP2Yahtzee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 561, -1, -1));

        lblP2YahtzeeBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2YahtzeeBonus.setText("-");
        getContentPane().add(lblP2YahtzeeBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 641, -1, -1));

        lblP2LowerTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2LowerTotal.setText("-");
        getContentPane().add(lblP2LowerTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 679, -1, -1));

        lblP2GrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP2GrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2GrandTotal.setText("-");
        getContentPane().add(lblP2GrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 740, -1, -1));

        lblP2LgSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2LgSt.setText("-");
        getContentPane().add(lblP2LgSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 530, -1, -1));

        lblP2Chance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2Chance.setText("-");
        getContentPane().add(lblP2Chance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 602, -1, -1));

        btnAces.setText("Choose");
        btnAces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAces, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 51, -1, -1));

        btnTwos.setText("Choose");
        btnTwos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTwos, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 81, -1, -1));

        btnThrees.setText("Choose");
        btnThrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreesActionPerformed(evt);
            }
        });
        getContentPane().add(btnThrees, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 111, -1, -1));

        btnFours.setText("Choose");
        btnFours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoursActionPerformed(evt);
            }
        });
        getContentPane().add(btnFours, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 141, -1, -1));

        btnFives.setText("Choose");
        btnFives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFivesActionPerformed(evt);
            }
        });
        getContentPane().add(btnFives, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 171, -1, -1));

        btnSixes.setText("Choose");
        btnSixes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 205, -1, -1));

        btn3ofK.setText("Choose");
        btn3ofK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ofKActionPerformed(evt);
            }
        });
        getContentPane().add(btn3ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 376, -1, -1));

        btn4ofK.setText("Choose");
        btn4ofK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ofKActionPerformed(evt);
            }
        });
        getContentPane().add(btn4ofK, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 404, -1, -1));

        btnfullHouse.setText("Choose");
        btnfullHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfullHouseActionPerformed(evt);
            }
        });
        getContentPane().add(btnfullHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 438, -1, -1));

        btnSmSt.setText("Choose");
        btnSmSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmStActionPerformed(evt);
            }
        });
        getContentPane().add(btnSmSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 472, -1, -1));

        btnLgSt.setText("Choose");
        btnLgSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLgStActionPerformed(evt);
            }
        });
        getContentPane().add(btnLgSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 518, -1, -1));

        btnYahtzee.setText("Choose");
        btnYahtzee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYahtzeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnYahtzee, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 558, -1, -1));

        btnChance.setText("Choose");
        btnChance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnChance, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 598, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 810, -1, -1));

        btnInstructionFrame.setText("Instructions");
        btnInstructionFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionFrameActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstructionFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 309, -1, -1));

        btnScoringFrame.setText("Scoring");
        btnScoringFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoringFrameActionPerformed(evt);
            }
        });
        getContentPane().add(btnScoringFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 91, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yahtzeepic.jpeg"))); // NOI18N
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 53, -1, -1));

        lblErrorMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 6, -1, -1));

        btnFinish.setText("Finish Game");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 790, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);//exits the program
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        //calls the roll method for the dice object, passing in the dice change variables
        //displays the value of each dice in the dice object
        
        dice.roll(dice1change, dice2change, dice3change, dice4change, dice5change);
        lblDice1.setText(Integer.toString(dice.getdice1()));
        lblDice2.setText(Integer.toString(dice.getdice2()));
        lblDice3.setText(Integer.toString(dice.getdice3()));
        lblDice4.setText(Integer.toString(dice.getdice4()));
        lblDice5.setText(Integer.toString(dice.getdice5()));

        //sets each dice change variable back to true, ensures that each dice will be rerolled unless the user selects keep
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;

        //increases rollCount and totalsRolls
        rollCount++;
        totalRolls++;
        
        //if a player's third roll has been completed, the roll and keep buttons are hidden, and the scoring buttons are shown
        if (rollCount == 3) {
            hideRoll();
            hideKeep();//hiding this button ensures that the next player cannot keep a previous players roll
            showScoringButtons();
        }

        
        playerDisplay();//calls the playerDisplay method
        
        //displays the keep buttons if rollCount does not equal 3 (it is not the end of a players turn
        if (rollCount!=3){
            showKeep();
        }

    }//GEN-LAST:event_btnRollActionPerformed

    private void btnInstructionFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionFrameActionPerformed
        //opens the Yahtzee Instructions jframe
        new YahtzeeInstructions(p1, p2).setVisible(true);
        YahtzeeInstructions.btnExit.setVisible(false);
        YahtzeeInstructions.btnExit.setVisible(false);

        //hides the buttons on the frame, forcing the user to close the frame using the x button, which disposes the frame rather than closing the entire program
        YahtzeeInstructions.btnScoring.setEnabled(false);
        YahtzeeInstructions.btnScoring.setVisible(false);
    }//GEN-LAST:event_btnInstructionFrameActionPerformed

    private void btnScoringFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoringFrameActionPerformed
        //opens the Yahtzee Instructions 2 jframe
        new YahtzeeIntsructions2(p1, p2).setVisible(true);

        //hides the buttons on the frame, forcing the user to close the frame using the x button, which disposes the frame rather than closing the entire program
        YahtzeeIntsructions2.btnExit.setEnabled(false);
        YahtzeeIntsructions2.btnExit.setVisible(false);

        YahtzeeIntsructions2.btnBegin.setEnabled(false);
        YahtzeeIntsructions2.btnBegin.setVisible(false);
    }
    
   /***********************************
   hideKeep
   Method to hide the keep buttons
   No parameters 
   No return
   ************************************/
    private void hideKeep() {
        btnKeep1.setVisible(false);
        btnKeep2.setVisible(false);
        btnKeep3.setVisible(false);
        btnKeep4.setVisible(false);
        btnKeep5.setVisible(false);
    }
    
   /***********************************
   showKeep
   Method to show the keep buttons
   No parameters 
   No return
   ************************************/
    private void showKeep() {
        btnKeep1.setVisible(true);
        btnKeep2.setVisible(true);
        btnKeep3.setVisible(true);
        btnKeep4.setVisible(true);
        btnKeep5.setVisible(true);
    }

   /***********************************
   hideRoll
   Method to hide the roll and keep buttons, forces the user to choose a category to score under
   No parameters 
   No return
   ************************************/
    private void hideRoll() {
        btnRoll.setVisible(false);
        btnKeep1.setVisible(false);
        btnKeep2.setVisible(false);
        btnKeep3.setVisible(false);
        btnKeep4.setVisible(false);
        btnKeep5.setVisible(false);
    }

   /***********************************
   showRoll
   Method to show the roll and keep buttons
   No parameters 
   No return
   ************************************/
    private void showRoll() {
        btnRoll.setVisible(true);
        btnKeep1.setVisible(true);
        btnKeep2.setVisible(true);
        btnKeep3.setVisible(true);
        btnKeep4.setVisible(true);
        btnKeep5.setVisible(true);
    }

   /***********************************
   hideScoringButtons
   Method to hide the scoring buttons, prohibits users from scoring points at the wrong time
   No parameters 
   No return
   ************************************/
    private void hideScoringButtons() {
        btnAces.setVisible(false);
        btnTwos.setVisible(false);
        btnThrees.setVisible(false);
        btnFours.setVisible(false);
        btnFives.setVisible(false);
        btnSixes.setVisible(false);
        btn3ofK.setVisible(false);
        btn4ofK.setVisible(false);
        btnfullHouse.setVisible(false);
        btnSmSt.setVisible(false);
        btnLgSt.setVisible(false);
        btnYahtzee.setVisible(false);
        btnChance.setVisible(false);
    }//GEN-LAST:event_btnScoringFrameActionPerformed
   /***********************************
   showScoringButtons
   Method to show the scoring buttons
   No parameters 
   No return
   ************************************/
    private void showScoringButtons() {
        btnAces.setVisible(true);
        btnTwos.setVisible(true);
        btnThrees.setVisible(true);
        btnFours.setVisible(true);
        btnFives.setVisible(true);
        btnSixes.setVisible(true);
        btn3ofK.setVisible(true);
        btn4ofK.setVisible(true);
        btnfullHouse.setVisible(true);
        btnSmSt.setVisible(true);
        btnLgSt.setVisible(true);
        btnYahtzee.setVisible(true);
        btnChance.setVisible(true);
    }
    
    private void btnFoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoursActionPerformed
        rollCount = 0;//sets roll count back to 0
        lblErrorMessage.setText("");//resets the error message, incase an old message is stored
        
        //occurs if it is player 1's turn
        if (playerTurn == 1) {
            if (p1.scoreCard[3] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[3] = scoreFours();//calls the scoreFours method
                lblP1Fours.setText(Integer.toString(p1.scoreCard[3]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            //occurs if it is player 2's turn
            if (p2.scoreCard[3] == null) {//check that this category hasn't been scored under
                p2.scoreCard[3] = scoreFours();//calls the scoreFours method
                lblP2Fours.setText(Integer.toString(p2.scoreCard[3]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnFoursActionPerformed
    
   /***********************************
   playerDisplay
   Method to display whose turn it is, and what roll they are on
   No parameters 
   No return
   ************************************/
    private void playerDisplay() {
        if (playerTurn == 1) {//occurs if it is player 1's turn
            lblPlayerTurn.setText("Player: " + p1.getplayerName() + "  Roll: " + rollCount);
        } else {
            lblPlayerTurn.setText("Player: " + p2.getplayerName() + "  Roll: " + rollCount);//occurs if it is player 2's turn
        }
    }
    private void btnAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcesActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        //occurs if it is player 1's turn
        if (playerTurn == 1) {
            if (p1.scoreCard[0] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[0] = scoreOnes();//calls the scoreOnes method
                lblP1Aces.setText(Integer.toString(p1.scoreCard[0]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
             //occurs if it is player 2's turn
            if (p2.scoreCard[0] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[0] = scoreOnes();//calls the scoreOnes method
                lblP2Aces.setText(Integer.toString(p2.scoreCard[0]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnAcesActionPerformed

    private void btnTwosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwosActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[1] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[1] = scoreTwos();//calls the scoreTwos method
                lblP1Twos.setText(Integer.toString(p1.scoreCard[1]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
             //occurs if it is player 2's turn
            if (p2.scoreCard[1] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[1] = scoreTwos();//calls the scoreTwos method
                lblP2Twos.setText(Integer.toString(p2.scoreCard[1]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
       
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnTwosActionPerformed

    private void btnThreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreesActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[2] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[2] = scoreThrees();//calls the scoreThrees method
                lblP1Threes.setText(Integer.toString(p1.scoreCard[2]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            //occurs if it is player 2's turn
            if (p2.scoreCard[2] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[2] = scoreThrees();//calls the scoreThrees method
                lblP2Threes.setText(Integer.toString(p2.scoreCard[2]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnThreesActionPerformed

    private void btnFivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFivesActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[4] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[4] = scoreFives();//calls the scoreFives method
                lblP1Fives.setText(Integer.toString(p1.scoreCard[4]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            //occurs if it is player 2's turn
            if (p2.scoreCard[4] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[4] = scoreFives();//calls the scoreFives method
                lblP2Fives.setText(Integer.toString(p2.scoreCard[4]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnFivesActionPerformed

    private void btnSixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixesActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[5] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[5] = scoreSixes();//calls the scoreSixes method
                lblP1Sixes.setText(Integer.toString(p1.scoreCard[5]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            //occurs if it is player 2's turn
            if (p2.scoreCard[5] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[5] = scoreSixes();//calls the scoreSixes method
                lblP2Sixes.setText(Integer.toString(p2.scoreCard[5]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnSixesActionPerformed

    
    private void btnKeep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeep1ActionPerformed
        dice1change = false;
    }//GEN-LAST:event_btnKeep1ActionPerformed

    private void btnKeep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeep2ActionPerformed
        dice2change = false;
    }//GEN-LAST:event_btnKeep2ActionPerformed

    private void btnKeep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeep3ActionPerformed
        dice3change = false;
    }//GEN-LAST:event_btnKeep3ActionPerformed

    private void btnKeep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeep4ActionPerformed
        dice4change = false;
    }//GEN-LAST:event_btnKeep4ActionPerformed

    private void btnKeep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeep5ActionPerformed
        dice5change = false;
    }//GEN-LAST:event_btnKeep5ActionPerformed

    private void btn3ofKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ofKActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[9] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[9] = score3ofK();//calls the score3ofK method
                lblP13ofK.setText(Integer.toString(p1.scoreCard[9]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[9] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[9] = score3ofK();//calls the score3ofK method
                lblP23ofK.setText(Integer.toString(p2.scoreCard[9]));//sets the score to the screen
                //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btn3ofKActionPerformed

    private void btn4ofKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ofKActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[10] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[10] = score4ofK();//calls the score4ofK method
                lblP14ofK.setText(Integer.toString(p1.scoreCard[10]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[10] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[10] = score4ofK();//calls the score4ofK method
                lblP24ofK.setText(Integer.toString(p2.scoreCard[10]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btn4ofKActionPerformed

    private void btnfullHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfullHouseActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[11] == null) {
                p1.scoreCard[11] = scoreFullHouse();//calls the scoreFullHouse method
                lblP1FullHouse.setText(Integer.toString(p1.scoreCard[11]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[11] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[11] = scoreFullHouse();//calls the scoreFullHouse method
                lblP2FullHouse.setText(Integer.toString(p2.scoreCard[11]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnfullHouseActionPerformed

    private void btnSmStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmStActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[12] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[12] = scoreSmSt();//calls the scoreSmSt method
                lblP1SmSt.setText(Integer.toString(p1.scoreCard[12]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[12] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[12] = scoreSmSt();//calls the scoreSmSt method
                lblP2SmSt.setText(Integer.toString(p2.scoreCard[12]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnSmStActionPerformed

    private void btnLgStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLgStActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[13] == null) {
                p1.scoreCard[13] = scoreLgSt();//calls the scoreLgSt method
                lblP1LgSt.setText(Integer.toString(p1.scoreCard[13]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[13] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[13] = scoreLgSt();//calls the scoreLgSt method
                lblP2LgSt.setText(Integer.toString(p2.scoreCard[13]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnLgStActionPerformed

    private void btnYahtzeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYahtzeeActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn
            if (p1.scoreCard[14] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[14] = scoreYahtzee();//calls the scoreYahtzee method
                lblP1Yahtzee.setText(Integer.toString(p1.scoreCard[14]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[14] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[14] = scoreYahtzee();//calls the scoreYahtzee method
                lblP2Yahtzee.setText(Integer.toString(p2.scoreCard[14]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnYahtzeeActionPerformed

    private void btnChanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChanceActionPerformed
        //sets roll count to 0, and resets the error message
        rollCount = 0;
        lblErrorMessage.setText("");
        
        if (playerTurn == 1) {//occurs if it is player 1's turn

            if (p1.scoreCard[15] == null) {//checks that this category hasn't been scored under
                p1.scoreCard[15] = scoreChance();//calls the scoreChance method
                lblP1Chance.setText(Integer.toString(p1.scoreCard[15]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 2;
                playerDisplay();
                 checkP1YahtzeeBonus();//calls the checkP1YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }
        } else {
            if (p2.scoreCard[15] == null) {//checks that this category hasn't been scored under
                p2.scoreCard[15] = scoreChance();//calls the scoreChance method
                lblP2Chance.setText(Integer.toString(p2.scoreCard[15]));//sets the score to the screen
                 //switches back to rolling and switches player turn
                showRoll();
                hideScoringButtons();
                hideKeep();
                playerTurn = 1;
                playerDisplay();
                checkP2YahtzeeBonus();//calls the checkP2YahtzeeBonus method
            } else {
                scoringErrorMessage();//displays an error message if this category has already been scored under
            }

        }
        //sets each dice change variable back to true
        dice1change = true;
        dice2change = true;
        dice3change = true;
        dice4change = true;
        dice5change = true;
        
        if (totalRolls == 78) {
            endGame();//calls the endGame method if 78 rolls have been completed (total rolls for a two player game)
        }
    }//GEN-LAST:event_btnChanceActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
       //closes this jframe and opens the Yahtzee End jframe
       new YahtzeeGUI(p1,p2).setVisible(false);
       YahtzeeEnd form5 = new YahtzeeEnd(p1, p2);//passes in the player objects
       new YahtzeeEnd(p1, p2).setVisible(true);
    }//GEN-LAST:event_btnFinishActionPerformed

   /***********************************
   scoreOnes
   Method to calculate the aces category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreOnes() {
        int onesScore = 0;
        if (dice.getdice1() == 1) {
            onesScore = onesScore + 1;
        }
        if (dice.getdice2() == 1) {
            onesScore = onesScore + 1;
        }
        if (dice.getdice3() == 1) {
            onesScore = onesScore + 1;
        }
        if (dice.getdice4() == 1) {
            onesScore = onesScore + 1;
        }
        if (dice.getdice5() == 1) {
            onesScore = onesScore + 1;
        }
        return onesScore;
    }

   /***********************************
   scoreTwos
   Method to calculate the twos category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreTwos() {
        int twosScore = 0;

        if (dice.getdice1() == 2) {
            twosScore = twosScore + 2;
        }
        if (dice.getdice2() == 2) {
            twosScore = twosScore + 2;
        }
        if (dice.getdice3() == 2) {
            twosScore = twosScore + 2;
        }
        if (dice.getdice4() == 2) {
            twosScore = twosScore + 2;
        }
        if (dice.getdice5() == 2) {
            twosScore = twosScore + 2;
        }
        return twosScore;
    }

   /***********************************
   scoreThrees
   Method to calculate the threes category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreThrees() {
        int threesScore = 0;

        if (dice.getdice1() == 3) {
            threesScore = threesScore + 3;
        }
        if (dice.getdice2() == 3) {
            threesScore = threesScore + 3;
        }
        if (dice.getdice3() == 3) {
            threesScore = threesScore + 3;
        }
        if (dice.getdice4() == 3) {
            threesScore = threesScore + 3;
        }
        if (dice.getdice5() == 3) {
            threesScore = threesScore + 3;
        }
        return threesScore;
    }

   /***********************************
   scoreFours
   Method to calculate the fours category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreFours() {
        int foursScore = 0;

        if (dice.getdice1() == 4) {
            foursScore = foursScore + 4;
        }
        if (dice.getdice2() == 4) {
            foursScore = foursScore + 4;
        }
        if (dice.getdice3() == 4) {
            foursScore = foursScore + 4;
        }
        if (dice.getdice4() == 4) {
            foursScore = foursScore + 4;
        }
        if (dice.getdice5() == 4) {
            foursScore = foursScore + 4;
        }
        return foursScore;
    }

   /***********************************
   scoreFives
   Method to calculate the fives category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreFives() {
        int fivesScore = 0;

        if (dice.getdice1() == 5) {
            fivesScore = fivesScore + 5;
        }
        if (dice.getdice2() == 5) {
            fivesScore = fivesScore + 5;
        }
        if (dice.getdice3() == 5) {
            fivesScore = fivesScore + 5;
        }
        if (dice.getdice4() == 5) {
            fivesScore = fivesScore + 5;
        }
        if (dice.getdice5() == 5) {
            fivesScore = fivesScore + 5;
        }
        return fivesScore;
    }

   /***********************************
   scoreSixes
   Method to calculate the sixes category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreSixes() {
        int sixesScore = 0;

        if (dice.getdice1() == 6) {
            sixesScore = sixesScore + 6;
        }
        if (dice.getdice2() == 6) {
            sixesScore = sixesScore + 6;
        }
        if (dice.getdice3() == 6) {
            sixesScore = sixesScore + 6;
        }
        if (dice.getdice4() == 6) {
            sixesScore = sixesScore + 6;
        }
        if (dice.getdice5() == 6) {
            sixesScore = sixesScore + 6;
        }
        return sixesScore;
    }

   /***********************************
   score3ofK
   Method to calculate the 3 of a kind category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer score3ofK() {
        int score = 0;
        //amount of each dice values
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array to make looping through values easier

        //identifies how many of each value there are
        for (int i = 0; i < diceNums.length; i++) {
            if (diceNums[i] == 1) {
                ones++;
            } else if (diceNums[i] == 2) {
                twos++;
            } else if (diceNums[i] == 3) {
                threes++;
            } else if (diceNums[i] == 4) {
                fours++;
            } else if (diceNums[i] == 5) {
                fives++;
            } else if (diceNums[i] == 6) {
                sixes++;
            }
        }

        //calculates score if the roll qualifies under this category
        if (ones >= 3 || twos >= 3 || threes >= 3 || fours >= 3 || fives >= 3 || sixes >= 3) {
            score = dice.getdice1() + dice.getdice2() + dice.getdice3() + dice.getdice4() + dice.getdice5();
        }
        return score;
    }

   /***********************************
   score4ofK
   Method to calculate the 4 of a kind category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer score4ofK() {
        int score = 0;
        //amount of each dice values
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array to make looping through values easier

        //identifies how many of each value there are
        for (int i = 0; i < diceNums.length; i++) {
            if (diceNums[i] == 1) {
                ones++;
            } else if (diceNums[i] == 2) {
                twos++;
            } else if (diceNums[i] == 3) {
                threes++;
            } else if (diceNums[i] == 4) {
                fours++;
            } else if (diceNums[i] == 5) {
                fives++;
            } else if (diceNums[i] == 6) {
                sixes++;
            }
        }

        //calculates score if the roll qualifies under this category
        if (ones >= 4 || twos >= 4 || threes >= 4 || fours >= 4 || fives >= 4 || sixes >= 4) {
            score = dice.getdice1() + dice.getdice2() + dice.getdice3() + dice.getdice4() + dice.getdice5();
        }
        return score;
    }

   /***********************************
   scoreFullHouse
   Method to calculate the Full House category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreFullHouse() {
        int score = 0;
        //amount of each dice values
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array to make looping through values easier
        
         //identifies how many of each value there are
        for (int i = 0; i < diceNums.length; i++) {
            if (diceNums[i] == 1) {
                ones++;
            } else if (diceNums[i] == 2) {
                twos++;
            } else if (diceNums[i] == 3) {
                threes++;
            } else if (diceNums[i] == 4) {
                fours++;
            } else if (diceNums[i] == 5) {
                fives++;
            } else if (diceNums[i] == 6) {
                sixes++;
            }
        }
        //calculates score if the roll qualifies under this category
        if (ones == 3 && (twos == 2 || threes == 2 || fours == 2 || fives == 2 || sixes == 2)) {
            score = 25;
        }
        if (twos == 3 && (ones == 2 || threes == 2 || fours == 2 || fives == 2 || sixes == 2)) {
            score = 25;
        }
        if (threes == 3 && (twos == 2 || ones == 2 || fours == 2 || fives == 2 || sixes == 2)) {
            score = 25;
        }
        if (fours == 3 && (twos == 2 || threes == 2 || ones == 2 || fives == 2 || sixes == 2)) {
            score = 25;
        }
        if (fives == 3 && (twos == 2 || threes == 2 || fours == 2 || ones == 2 || sixes == 2)) {
            score = 25;
        }
        if (sixes == 3 && (twos == 2 || threes == 2 || fours == 2 || fives == 2 || ones == 2)) {
            score = 25;
        }
        return score;
    }

  /***********************************
   scoreSmSt
   Method to calculate the Small Straight category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreSmSt() {
        int score = 0;
        //amount of each dice values
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array to make looping through values easier

         //identifies how many of each value there are
        for (int i = 0; i < diceNums.length; i++) {
            if (diceNums[i] == 1) {
                ones++;
            } else if (diceNums[i] == 2) {
                twos++;
            } else if (diceNums[i] == 3) {
                threes++;
            } else if (diceNums[i] == 4) {
                fours++;
            } else if (diceNums[i] == 5) {
                fives++;
            } else if (diceNums[i] == 6) {
                sixes++;
            }
        }

        //calculates score if the roll qualifies under this category
        if (ones >= 1 && twos >= 1 && threes >= 1 && fours >= 1) {
            score = 30;
        }
        if (twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1) {
            score = 30;
        }
        if (threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1) {
            score = 30;
        }
        return score;
    }

   /***********************************
   scoreLgSt
   Method to calculate the large straight category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreLgSt() {
        int score = 0;
        //amount of each dice values
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array to make looping through values easier

         //identifies how many of each value there are
        for (int i = 0; i < diceNums.length; i++) {
            if (diceNums[i] == 1) {
                ones++;
            } else if (diceNums[i] == 2) {
                twos++;
            } else if (diceNums[i] == 3) {
                threes++;
            } else if (diceNums[i] == 4) {
                fours++;
            } else if (diceNums[i] == 5) {
                fives++;
            } else if (diceNums[i] == 6) {
                sixes++;
            }
        }

        //calculates score if the roll qualifies under this category
        if (ones >= 1 && twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1) {
            score = 40;
        }
        if (twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1) {
            score = 40;
        }
        return score;
    }

   /***********************************
   scoreYahtzee
   Method to calculate the yahtzee category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreYahtzee() {
        int score = 0;
        Integer[] diceNums = {dice.getdice1(), dice.getdice2(), dice.getdice3(), dice.getdice4(), dice.getdice5()};//puts the dice values into an array 

        if ((diceNums[0] == diceNums[1]) && (diceNums[1] == diceNums[2]) && (diceNums[2] == diceNums[3]) && (diceNums[3] == diceNums[4])) {
            score = 50;
        }
        return score;
    }

   /***********************************
   scoreChance
   Method to calculate the chance category
   No parameters 
   Returns the calculated score int for the category
   ************************************/
    public Integer scoreChance() {
        int score = 0;

        score = dice.getdice1() + dice.getdice2() + dice.getdice3() + dice.getdice4() + dice.getdice5();
        return score;
    }

    private void scoringErrorMessage() {
        lblErrorMessage.setText("You have already scored under this category. Please select a new one.");//displays message if a player selects a category they have already scored under
    }

   /***********************************
   checkP1YahtzeeBonus
   Method to check if p1's roll qualifies for a yahtzee bonus, and adds this to the according spot in the scorecard array
   No parameters 
   No return
   ************************************/
    private void checkP1YahtzeeBonus(){
        if (p1.scoreCard[14] != null && scoreYahtzee() == 50) {
                    p1YBonus = p1YBonus + 100;
                    p1.scoreCard[16] = p1YBonus;
                    lblP1YahtzeeBonus.setText(Integer.toString(p1YBonus));
                }
    }
    
   /***********************************
   checkP2YahtzeeBonus
   Method to check if p2's roll qualifies for a yahtzee bonus, and adds this to the according spot in the scorecard array
   No parameters 
   No return
   ************************************/
     private void checkP2YahtzeeBonus(){
        if (p2.scoreCard[14] != null && scoreYahtzee() == 50) {
                    p2YBonus = p2YBonus + 100;
                    p2.scoreCard[16] = p2YBonus;
                    lblP2YahtzeeBonus.setText(Integer.toString(p2YBonus));
                }
    }
    
   /***********************************
   endGame
   Method to calculate and display final scores at the end of the game
   No parameters 
   No return
   ************************************/
    private void endGame() {
        hideRoll();
        hideScoringButtons();
        
        if (p1.scoreCard[16] == null){
            p1.scoreCard[16] = 0;
        }
        if (p2.scoreCard[16] == null){
            p2.scoreCard[16] = 0;
        }

        p1.scoreCard[6] = p1.scoreCard[0] + p1.scoreCard[1] + p1.scoreCard[2] + p1.scoreCard[3] + p1.scoreCard[4] + p1.scoreCard[5];
        lblP1Upper.setText(Integer.toString(p1.scoreCard[6]));

        if (p1.scoreCard[6] >= 63) {
            p1.scoreCard[7] = p1.scoreCard[6] + 35;
            lblP1UpperBonus.setText("35");
        } else {
            p1.scoreCard[7] = p1.scoreCard[6];
            lblP1UpperBonus.setText("0");
        }
        p1.scoreCard[8] = p1.scoreCard[7];
        lblP1UpperTotal.setText(Integer.toString(p1.scoreCard[8]));

        p1.scoreCard[17] = p1.scoreCard[9] + p1.scoreCard[10] + p1.scoreCard[11] + p1.scoreCard[12]
                + p1.scoreCard[13] + p1.scoreCard[14] + p1.scoreCard[15] + p1.scoreCard[16];
        
        

        lblP1LowerTotal.setText(Integer.toString(p1.scoreCard[17]));

        p1.scoreCard[18] = p1.scoreCard[8];
        lblP1UpperTotal2.setText(Integer.toString(p1.scoreCard[18]));

        p1.scoreCard[19] = p1.scoreCard[17] + p1.scoreCard[18];
        lblP1GrandTotal.setText(Integer.toString(p1.scoreCard[19]));
        
        lblP1YahtzeeBonus.setText(Integer.toString(p1.scoreCard[16]));

        p2.scoreCard[6] = p2.scoreCard[0] + p2.scoreCard[1] + p2.scoreCard[2] + p2.scoreCard[3] + p2.scoreCard[4] + p2.scoreCard[5];
        lblP2Upper.setText(Integer.toString(p2.scoreCard[6]));

        if (p2.scoreCard[6] >= 63) {
            p2.scoreCard[7] = p2.scoreCard[6] + 35;
            lblP2UpperBonus.setText("35");
        } else {
            p2.scoreCard[7] = p2.scoreCard[6];
            lblP2UpperBonus.setText("0");
        }
        p2.scoreCard[8] = p2.scoreCard[7];
        lblP2UpperTotal.setText(Integer.toString(p2.scoreCard[8]));

        p2.scoreCard[17] = p2.scoreCard[9] + p2.scoreCard[10] + p2.scoreCard[11] + p2.scoreCard[12]
                + p2.scoreCard[13] + p2.scoreCard[14] + p2.scoreCard[15] + + p2.scoreCard[15];

        lblP2LowerTotal.setText(Integer.toString(p2.scoreCard[17]));

        p2.scoreCard[18] = p2.scoreCard[8];
        lblP2UpperTotal2.setText(Integer.toString(p2.scoreCard[18]));

        p2.scoreCard[19] = p2.scoreCard[17] + p2.scoreCard[18];
        lblP2GrandTotal.setText(Integer.toString(p2.scoreCard[19]));
        lblP2YahtzeeBonus.setText(Integer.toString(p2.scoreCard[16]));

        btnFinish.setVisible(true);//makes the finish button visible
    }

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YahtzeeWelcomePage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3ofK;
    private javax.swing.JButton btn4ofK;
    private javax.swing.JButton btnAces;
    private javax.swing.JButton btnChance;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnFives;
    private javax.swing.JButton btnFours;
    public javax.swing.JButton btnInstructionFrame;
    private javax.swing.JButton btnKeep1;
    private javax.swing.JButton btnKeep2;
    private javax.swing.JButton btnKeep3;
    private javax.swing.JButton btnKeep4;
    private javax.swing.JButton btnKeep5;
    private javax.swing.JButton btnLgSt;
    private javax.swing.JButton btnRoll;
    public javax.swing.JButton btnScoringFrame;
    private javax.swing.JButton btnSixes;
    private javax.swing.JButton btnSmSt;
    private javax.swing.JButton btnThrees;
    private javax.swing.JButton btnTwos;
    private javax.swing.JButton btnYahtzee;
    private javax.swing.JButton btnfullHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDice1;
    private javax.swing.JLabel lblDice2;
    private javax.swing.JLabel lblDice3;
    private javax.swing.JLabel lblDice4;
    private javax.swing.JLabel lblDice5;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblP13ofK;
    private javax.swing.JLabel lblP14ofK;
    private javax.swing.JLabel lblP1Aces;
    private javax.swing.JLabel lblP1Chance;
    public javax.swing.JLabel lblP1Display;
    private javax.swing.JLabel lblP1Fives;
    private javax.swing.JLabel lblP1Fours;
    private javax.swing.JLabel lblP1FullHouse;
    private javax.swing.JLabel lblP1GrandTotal;
    private javax.swing.JLabel lblP1LgSt;
    private javax.swing.JLabel lblP1LowerTotal;
    private javax.swing.JLabel lblP1Sixes;
    private javax.swing.JLabel lblP1SmSt;
    private javax.swing.JLabel lblP1Threes;
    private javax.swing.JLabel lblP1Twos;
    private javax.swing.JLabel lblP1Upper;
    private javax.swing.JLabel lblP1UpperBonus;
    private javax.swing.JLabel lblP1UpperTotal;
    private javax.swing.JLabel lblP1UpperTotal2;
    private javax.swing.JLabel lblP1Yahtzee;
    private javax.swing.JLabel lblP1YahtzeeBonus;
    private javax.swing.JLabel lblP23ofK;
    private javax.swing.JLabel lblP24ofK;
    private javax.swing.JLabel lblP2Aces;
    private javax.swing.JLabel lblP2Chance;
    public javax.swing.JLabel lblP2Display;
    private javax.swing.JLabel lblP2Fives;
    private javax.swing.JLabel lblP2Fours;
    private javax.swing.JLabel lblP2FullHouse;
    private javax.swing.JLabel lblP2GrandTotal;
    private javax.swing.JLabel lblP2LgSt;
    private javax.swing.JLabel lblP2LowerTotal;
    private javax.swing.JLabel lblP2Sixes;
    private javax.swing.JLabel lblP2SmSt;
    private javax.swing.JLabel lblP2Threes;
    private javax.swing.JLabel lblP2Twos;
    private javax.swing.JLabel lblP2Upper;
    private javax.swing.JLabel lblP2UpperBonus;
    private javax.swing.JLabel lblP2UpperTotal;
    private javax.swing.JLabel lblP2UpperTotal2;
    private javax.swing.JLabel lblP2Yahtzee;
    private javax.swing.JLabel lblP2YahtzeeBonus;
    private javax.swing.JLabel lblPlayerTurn;
    private javax.swing.JLabel txtPlayerTurn;
    // End of variables declaration//GEN-END:variables
}
