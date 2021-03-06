/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.Schambes.Hangman.GUI.Registry;

/**
 *
 * @author Schambes
 */
@SuppressWarnings("serial")
public class PlayerGUI extends javax.swing.JPanel implements Comparable<PlayerGUI>{

    /**
     * Creates new form Player
     */
    public PlayerGUI(de.Schambes.Hangman.GUI.Registry.PlayerRegistryGUI registry, int playerID) {
        this.registry = registry;
        this.playerID = playerID;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayerPanel = new javax.swing.JPanel();
        navigatePnl = new javax.swing.JPanel();
        upBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        namePnl = new javax.swing.JPanel();
        numLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        deletePnl = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        navigatePnl.setLayout(new javax.swing.BoxLayout(navigatePnl, javax.swing.BoxLayout.Y_AXIS));

        upBtn.setText("^");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        navigatePnl.add(upBtn);

        downBtn.setText("v");
        downBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downBtnActionPerformed(evt);
            }
        });
        navigatePnl.add(downBtn);

        numLabel.setText("" + (this.playerID + 1));

        NameField.setText("Enter Name");
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namePnlLayout = new javax.swing.GroupLayout(namePnl);
        namePnl.setLayout(namePnlLayout);
        namePnlLayout.setHorizontalGroup(
            namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        namePnlLayout.setVerticalGroup(
            namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteBtn.setText("X");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePnlLayout = new javax.swing.GroupLayout(deletePnl);
        deletePnl.setLayout(deletePnlLayout);
        deletePnlLayout.setHorizontalGroup(
            deletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePnlLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(deleteBtn)
                .addGap(0, 0, 0))
        );
        deletePnlLayout.setVerticalGroup(
            deletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PlayerLayout = new javax.swing.GroupLayout(PlayerPanel);
        PlayerPanel.setLayout(PlayerLayout);
        PlayerLayout.setHorizontalGroup(
            PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(namePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navigatePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PlayerLayout.setVerticalGroup(
            PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navigatePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        add(PlayerPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        this.registry.deletePlayer(this.playerID);
    }//GEN-LAST:event_deleteBtnActionPerformed
    
    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
    	this.registry.up(this.playerID);
    }//GEN-LAST:event_upBtnActionPerformed
    
    private void downBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downBtnActionPerformed
    	this.registry.down(this.playerID);
    }//GEN-LAST:event_downBtnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameField;
    private javax.swing.JPanel PlayerPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel deletePnl;
    private javax.swing.JButton downBtn;
    private javax.swing.JPanel namePnl;
    private javax.swing.JPanel navigatePnl;
    private javax.swing.JLabel numLabel;
    private javax.swing.JButton upBtn;
    
    @SuppressWarnings("unused")
	private de.Schambes.Hangman.Player player;
    private final de.Schambes.Hangman.GUI.Registry.PlayerRegistryGUI registry;
    private int playerID;
    // End of variables declaration//GEN-END:variables
    
    public int getID() {
    	return this.playerID;
    }
    
    public void setID(int ID) {
    	this.playerID = ID;
    }
    
    public de.Schambes.Hangman.Player getPlayer() {
    	return this.player = new de.Schambes.Hangman.Player(this.NameField.getText(), this.playerID);
    }

	@Override
	public int compareTo(PlayerGUI o) {
		return new Integer(this.playerID).compareTo(new Integer(o.getID()));
	}
    
}
