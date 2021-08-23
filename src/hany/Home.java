/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.awt.ComponentOrientation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm l ;
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs; 
    public String y; 
    public String type;
    public Home(String x) throws IOException, ParseException {
        initComponents();
         con=DBConnect.connect();
         jMenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        name11.setText(x);
        name11.setVisible(true);
        y=x;
        backuppp();
        Calendar cal = new GregorianCalendar();
        int dayy = cal.get(Calendar.DAY_OF_MONTH);
       checkusertype();
        if(type2.getText().equals("admin"))
        {
            jMenuItem15.setEnabled(true);
            jMenuItem26.setEnabled(true);
            jMenuItem27.setEnabled(true);
            jMenuItem28.setEnabled(true);
            jMenuItem29.setEnabled(true);
            jMenuItem35.setEnabled(true);
            meall1.setEnabled(true);
        }
   
       /* 
        if( type2.getText().equals("admin") )
        {
            reportt.setEnabled(true);
            jButton4.setEnabled(true);
            jMenuItem10.setEnabled(true);
            jMenuItem13.setEnabled(true);
            jMenuItem14.setEnabled(true);
            jMenuItem27.setEnabled(true);
            jMenuItem19.setEnabled(true);
            jMenu5.setEnabled(true);
            jMenuItem28.setEnabled(true);
            jMenuItem15.setEnabled(true);
            
           
        }
       if(type2.getText().equals("financial")  )
        { 
            reportt.setEnabled(true);
        }*/
                
           
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
        reportt = new javax.swing.JButton();
        meall1 = new javax.swing.JButton();
        meall = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportt.setBackground(new java.awt.Color(204, 255, 255));
        reportt.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        reportt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/payment-64.png"))); // NOI18N
        reportt.setText("البيع");
        reportt.setPreferredSize(new java.awt.Dimension(169, 89));
        reportt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporttActionPerformed(evt);
            }
        });
        jPanel1.add(reportt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 220, 70));

        meall1.setBackground(new java.awt.Color(204, 255, 255));
        meall1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        meall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        meall1.setText("مقدمات");
        meall1.setPreferredSize(new java.awt.Dimension(169, 89));
        meall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meall1ActionPerformed(evt);
            }
        });
        jPanel1.add(meall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 220, 70));

        meall.setBackground(new java.awt.Color(204, 255, 255));
        meall.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        meall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        meall.setText("العملاء");
        meall.setPreferredSize(new java.awt.Dimension(169, 89));
        meall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meallActionPerformed(evt);
            }
        });
        jPanel1.add(meall, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 220, 70));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton2.setText("مصروفات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 220, 70));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton1.setText("تقفيل حسابات");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 220, 70));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(980, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 970, 640));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/student-100.png"))); // NOI18N
        jButton3.setText("اضافة منتج");
        jButton3.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 220, 70));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton4.setText("الايام والاسابيع");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 220, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setMinimumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 720));

        name11.setBackground(new java.awt.Color(204, 153, 0));
        name11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 255));
        name11.setText("jLabel2");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("jLabel1");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

        jMenuBar1.setBackground(new java.awt.Color(122, 134, 162));

        jMenu1.setText("الرئيسية");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem15.setText("نسخه");
        jMenuItem15.setActionCommand("");
        jMenuItem15.setEnabled(false);
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem37.setText("انواع المنتجات");
        jMenuItem37.setActionCommand("");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem37);

        jMenuItem26.setText("الموظفين");
        jMenuItem26.setActionCommand("");
        jMenuItem26.setEnabled(false);
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem26);

        jMenuItem27.setText("سلفه");
        jMenuItem27.setActionCommand("");
        jMenuItem27.setEnabled(false);
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem27);

        jMenuItem36.setText("الرئيسية");
        jMenuItem36.setActionCommand("");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem36);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("تقارير");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("تقرير مصروفات");
        jMenuItem5.setActionCommand("");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem29.setText("سلف موظفين");
        jMenuItem29.setActionCommand("");
        jMenuItem29.setEnabled(false);
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem29);

        jMenuItem9.setText("تقريرنوع مصروفات");
        jMenuItem9.setActionCommand("");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem28.setText("المرتبات بعد السلف");
        jMenuItem28.setActionCommand("");
        jMenuItem28.setEnabled(false);
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem28);

        jMenuItem35.setText("المرتبات");
        jMenuItem35.setActionCommand("");
        jMenuItem35.setEnabled(false);
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem35);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            jDesktopPane1.removeAll();
            additems addd = new additems();
            jDesktopPane1.add(addd).setVisible(true);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reporttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporttActionPerformed
      
    }//GEN-LAST:event_reporttActionPerformed

    private void meallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meallActionPerformed
        jDesktopPane1.removeAll();
        customer addd = new customer();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_meallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      /*  try {
            jDesktopPane1.removeAll();
            item addd = new item();
            jDesktopPane1.add(addd).setVisible(true);
        }
        catch(Exception e)
        {
        }*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDesktopPane1.removeAll();
        msrofat addd = new msrofat();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      /*   try {
            dayfollow m = new dayfollow();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
         
        String x = "D:\\eslam\\data";
        Process pp = null;
       try{
           Runtime runtime = Runtime.getRuntime();
          
           pp=runtime.exec("C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe -uroot -proot --add-drop-database -B eslam -r"+x+".bat");
           int processComplete = pp.waitFor();
       }
       catch(Exception e )
       {
           
       }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void meall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meall1ActionPerformed
       /* jDesktopPane1.removeAll();
        mokdmat addd = new mokdmat();
        jDesktopPane1.add(addd).setVisible(true);*/
    }//GEN-LAST:event_meall1ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
       /* jDesktopPane1.removeAll();
        employee addd = new employee();
        jDesktopPane1.add(addd).setVisible(true);*/
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
         jDesktopPane1.removeAll();
        advancepayment addd = new advancepayment();
        jDesktopPane1.add(addd).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
         try {
            this.dispose();
            String k =name11.getText().toString();
            MainPage ll = new MainPage(k);
            ll.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        InputStream in=null;
        try {
            in = this.getClass().getResourceAsStream("/reports/mortbat.jasper");
            String reportpath= "\\\\192.168.1.15\\sadam\\mortbat.jasper";
            Map<String,Object> para = new HashMap<String,Object>();
            JasperPrint j = JasperFillManager.fillReport(in, para,con);
            JasperViewer.viewReport(j,false);
        }
        catch (JRException ex) {

            JOptionPane.showMessageDialog(null, ex);
        } finally {
        }
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        mortbat m = new mortbat();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        msrofatreporttype m = new msrofatreporttype();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
      /*  employeereport m = new employeereport();
        m.setVisible(true);*/
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        msrofatreport m = new msrofatreport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
         jDesktopPane1.removeAll();
        addtypes addd = new addtypes();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton meall;
    public javax.swing.JButton meall1;
    private javax.swing.JLabel name11;
    public javax.swing.JButton reportt;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables

   public void checkusertype()
   {
         try {
            String sqll = "SELECT type from eslam.users WHERE username='"+name11.getText()+"'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
         while (rs.next())
                {
                 type=rs.getString("type");
                 type2.setText(type);
                }
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
            
        }
   }
   public void backuppp()
   {
          String x = "D:meal/MrHossamReport/mat";
        Process p = null;
       try{
           Runtime runtime = Runtime.getRuntime();
           p=runtime.exec("C:/Program Files (x86)/MySQL/MySQL Server 5.6/bin/mysqldump.exe -uroot -proot --add-drop-database -B mrahmed -r"+x+".jasper");
           int processComplete = p.waitFor();
           
           }
       catch(Exception e )
       {
           
       }
   }

  
}