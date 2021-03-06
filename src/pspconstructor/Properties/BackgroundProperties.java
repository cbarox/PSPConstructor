/*
 * BackgroundProperties.java
 *
 * Created on Jun 25, 2009, 8:28:26 PM
 */
package pspconstructor.Properties;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import pspconstructor.Components.GCHandler;
import pspconstructor.IOHandler;
import pspconstructor.Main;


/**
 *
 * @author Carlo
 */
public class BackgroundProperties extends javax.swing.JInternalFrame {

    JFileChooser fchBackground = new JFileChooser();
    backgroundDrawer backgroundPanel = new backgroundDrawer();
    int Index;
    String FilePath = "";

    /** Creates new form BackgroundProperties */
    public BackgroundProperties(int index) {
        initComponents();
        fchBackground.addChoosableFileFilter(new bgdFilter());
        fchBackground.setAcceptAllFileFilterUsed(false);
        pnlDrawing.setLayout(new GridLayout(1, 1));
        pnlDrawing.add(backgroundPanel);
        Index = index;
        backgroundPanel.repaint();
        getInfo();
    }

    public void getInfo() {
        backgroundPanel.imgBackground = GCHandler.Backgrounds.get(Index).Image;
        txtFile.setText(GCHandler.Backgrounds.get(Index).Filename);
    }

    public void setInfo() {
        GCHandler.Backgrounds.get(Index).setFileName(txtFile.getText());
        GCHandler.Backgrounds.get(Index).setImage(backgroundPanel.imgBackground);
        Main.logMain.repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnLoadBackground = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        pnlDrawing = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Background Properties");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Background.png"))); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 677, 0));

        pnlInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInfo.setMaximumSize(new java.awt.Dimension(165, 272));
        pnlInfo.setMinimumSize(new java.awt.Dimension(165, 272));
        pnlInfo.setPreferredSize(new java.awt.Dimension(165, 272));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Check.png"))); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnLoadBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Open.png"))); // NOI18N
        btnLoadBackground.setText("Load Background");
        btnLoadBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBackgroundActionPerformed(evt);
            }
        });

        lblFile.setText("File:");

        txtFile.setEditable(false);

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFile, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoadBackground)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pnlDrawing.setBackground(java.awt.Color.gray);
        pnlDrawing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDrawing.setMaximumSize(new java.awt.Dimension(480, 272));
        pnlDrawing.setMinimumSize(new java.awt.Dimension(480, 272));
        pnlDrawing.setPreferredSize(new java.awt.Dimension(480, 272));

        javax.swing.GroupLayout pnlDrawingLayout = new javax.swing.GroupLayout(pnlDrawing);
        pnlDrawing.setLayout(pnlDrawingLayout);
        pnlDrawingLayout.setHorizontalGroup(
            pnlDrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        pnlDrawingLayout.setVerticalGroup(
            pnlDrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDrawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDrawing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        setInfo();
        this.dispose();
}//GEN-LAST:event_btnOkActionPerformed

    private void btnLoadBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBackgroundActionPerformed
        if (fchBackground.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File out = new File("./Source/Game/Game/Res/background" + GCHandler.Backgrounds.get(Index).ID + "." + IOHandler.getExtension(fchBackground.getSelectedFile()));
            try {
                IOHandler.copyFile(new File(fchBackground.getSelectedFile().getPath()), out);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            ImageIcon tmpBackground = new ImageIcon(fchBackground.getSelectedFile().getPath(), "");
            if (tmpBackground.getIconWidth() == 480 && tmpBackground.getIconHeight() == 272) {
                backgroundPanel.imgBackground = new ImageIcon(fchBackground.getSelectedFile().getPath(), "").getImage();
                txtFile.setText(fchBackground.getSelectedFile().getName());
                txtFile.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(null, "Backgrounds must be 480x272","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        backgroundPanel.repaint();
    }//GEN-LAST:event_btnLoadBackgroundActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadBackground;
    public javax.swing.JButton btnOk;
    private javax.swing.JLabel lblFile;
    private javax.swing.JPanel pnlDrawing;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}
class bgdFilter extends FileFilter {

    String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals("gif") ||
                    extension.equals("jpeg") ||
                    extension.equals("jpg") ||
                    extension.equals("png")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getDescription() {
        return "Images: '.jpg','.jpeg','.png','.gif'";
    }
}

class backgroundDrawer extends JPanel {

    Image imgBackground = new ImageIcon(getClass().getResource("/pspconstructor/Images/Blank.png")).getImage();
    int OriginX = 0, OriginY = 0;

    backgroundDrawer() {
        super();
    }

    void setOrigin(int X, int Y) {
        OriginX = X;
        OriginY = Y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.drawImage(imgBackground, 0, 0, null);
    }
}