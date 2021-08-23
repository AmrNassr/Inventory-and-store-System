/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import hany.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public class customerpay extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Home h;
    public String dayOfWeek;
    String totall;
    public Calendar cal;
    public int day;
    public int month;
    public int year;
    String dayyy;
    public String datee;

    public customerpay() throws ParseException {
        initComponents();
        con = DBConnect.connect();
        comboxfromcombo1();
        suppliers();
        AutoCompleteDecorator.decorate(cmname);
        cal = new GregorianCalendar();
        int dayy = cal.get(Calendar.DAY_OF_MONTH);
        dayyy = String.valueOf(dayy);
        if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
            dayyy = String.valueOf(dayy);
            dayyy = "0" + dayyy;
        }
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        date1.setText(year + "-" + month + "-" + dayyy);
        datee = date1.getText().toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmname = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("المبلغ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, 30));

        amount1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("العميل");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, -1));

        cmname.setEditable(true);
        cmname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 260, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("الكلي");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 30));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 80, 30));

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("دفع");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/64586a0ad51dc03.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jLabel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jLabel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 260));

        date1.setText("jLabel2");
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(474, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        TimeZone tz = TimeZone.getTimeZone("GMT+02");
        Calendar c = Calendar.getInstance(tz);
        String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                + String.format("%02d", c.get(Calendar.MINUTE));
        String fulldatee = datee + " " + time;
        try {
            double totall1 = Double.parseDouble(amount.getText());
            double totall = Double.parseDouble(amount1.getText());
            if (totall < totall1) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                if (dialogResult == 0) {

                    try {
                        String sqla = "UPDATE eslam.customeramount SET total = total-" + totall + " WHERE  name='" + cmname.getSelectedItem().toString() + "'";
                        pst = (PreparedStatement) con.prepareStatement(sqla);
                        pst.executeUpdate();
                        String sqll3 = "INSERT INTO eslam.customerlogs (name,type,date,fulldate,amount) VALUES"
                                + " ('" + cmname.getSelectedItem() + "','دفع','" + datee + "','" + fulldatee + "','" + totall + "')";
                        pst = (PreparedStatement) con.prepareStatement(sqll3);
                        pst.execute();
                        JOptionPane.showMessageDialog(this, "تم خصم المبلغ");
                        cmname.setSelectedIndex(0);
                        amount.setText("");
                        amount1.setText("");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                }
            } else {
                JOptionPane.showMessageDialog(this, "المبلغ الكلي اقل من المراد دفعه");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "الرقم غير صحيح");
        }


    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JComboBox cmname;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
  public void suppliers() {
        try {
            String sql = "SELECT distinct name  FROM eslam.customeramount order by name ";
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmname.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void comboxfromcombo1() {
        cmname.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();

                try {
                    String sql = "SELECT total from eslam.customeramount where name='" + cmname.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount.setText(rs.getString("total"));

                    }

                } catch (SQLException ex) {

                }
            }
        });

    }

}
