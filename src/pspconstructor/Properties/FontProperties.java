package pspconstructor.Properties;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import pspconstructor.Components.GCHandler;
import pspconstructor.IOHandler;
import pspconstructor.Main;

/**
 *
 * @author Carlo
 */
public class FontProperties extends javax.swing.JInternalFrame {

    JFileChooser fchFont = new JFileChooser();
    String FilePath = "";
    int Index;

    /** Creates new form infFontProperties */
    public FontProperties(int index) {
        initComponents();
        Index = index;
        fchFont.addChoosableFileFilter(new fntFilter());
        fchFont.setAcceptAllFileFilterUsed(false);
        getInfo();
    }

    public void getInfo() {
        txtFile.setText(GCHandler.Fonts.get(Index).Filename);
        FilePath = GCHandler.Fonts.get(Index).FilePath;
    }

    public void setInfo() {
        GCHandler.Fonts.get(Index).setFileName(txtFile.getText());
        GCHandler.Fonts.get(Index).setFilePath(FilePath);
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

        btnNewFont = new javax.swing.JButton();
        btnLoadFont = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Font Properties");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Font.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(175, 175));
        setMinimumSize(new java.awt.Dimension(175, 175));
        setPreferredSize(new java.awt.Dimension(175, 175));

        btnNewFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/New.png"))); // NOI18N
        btnNewFont.setLabel("New Font");
        btnNewFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFontActionPerformed(evt);
            }
        });

        btnLoadFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Open.png"))); // NOI18N
        btnLoadFont.setLabel("Load Font");
        btnLoadFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFontActionPerformed(evt);
            }
        });

        lblFile.setText("File:");

        txtFile.setEditable(false);
        txtFile.setAutoscrolls(false);

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pspconstructor/Images/Check.png"))); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadFont, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFile, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(btnNewFont, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewFont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoadFont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        setInfo();
        this.dispose();
}//GEN-LAST:event_btnOkActionPerformed

    private void btnNewFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFontActionPerformed
        try {
            Runtime.getRuntime().exec("fonted/fonted.exe");
        } catch (IOException A) {
            JOptionPane.showMessageDialog(null, "Error finding/loading file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNewFontActionPerformed

    private void btnLoadFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFontActionPerformed
        if (fchFont.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File out = new File("./Source/Game/Game/Res/font" + GCHandler.Fonts.get(Index).ID + "." + IOHandler.getExtension(fchFont.getSelectedFile()));
            try {
                IOHandler.copyFile(new File(fchFont.getSelectedFile().getPath()), out);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            txtFile.setText(fchFont.getSelectedFile().getName());
            txtFile.setEditable(false);
        }
    }//GEN-LAST:event_btnLoadFontActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadFont;
    private javax.swing.JButton btnNewFont;
    public javax.swing.JButton btnOk;
    private javax.swing.JLabel lblFile;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}

class fntFilter extends FileFilter {

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
            if (extension.equals("fnt")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getDescription() {
        return "Fonts: '.fnt'";
    }
}
