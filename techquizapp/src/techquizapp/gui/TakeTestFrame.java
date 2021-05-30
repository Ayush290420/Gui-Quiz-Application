/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDAO;
import techquizapp.dao.QuestionDAO;
import techquizapp.pojo.Answer;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Performance;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author AYUSH
 */
public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeTest
     */
    Color oldColor;
    private int pos=0,qno;
    Exam exam;
    AnswerStore astore;
    QuestionStore qstore;
    TimerThread tth;
    boolean check=false;
    public TakeTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
          tth=new TimerThread();
        tth.start();
       lbUserName.setText("Hello "+UserProfile.getUserName().toUpperCase());
       astore=new AnswerStore();
       qstore=new QuestionStore();
       qno=1;
       lbQno.setText(lbQno.getText()+qno);
               
    }
    public TakeTestFrame(Exam e){
        this();
        this.exam=e;
        lblSubjectName.setText(exam.getLanguage().toUpperCase()+" Paper");
        loadQuestion();
        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbUserName = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbQuestionNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblSubjectName = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        lbQno = new javax.swing.JLabel();
        rbOption1 = new javax.swing.JRadioButton();
        rbOption2 = new javax.swing.JRadioButton();
        rbOption3 = new javax.swing.JRadioButton();
        rbOption4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lbTimer = new javax.swing.JLabel();
        lbTimeLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));

        lbUserName.setBackground(new java.awt.Color(0, 0, 0));
        lbUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 102, 0));

        lbLogout.setBackground(new java.awt.Color(0, 0, 0));
        lbLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 102, 0));
        lbLogout.setText("Logout");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogoutMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans\\TechQuizApp\\src\\Images\\good luck2.jpg")); // NOI18N

        lbQuestionNo.setBackground(new java.awt.Color(0, 0, 0));
        lbQuestionNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQuestionNo.setForeground(new java.awt.Color(255, 102, 0));

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 102, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 102, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 102, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblSubjectName.setBackground(new java.awt.Color(0, 0, 0));
        lblSubjectName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSubjectName.setForeground(new java.awt.Color(255, 102, 0));

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 102, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lbQno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbQno.setForeground(new java.awt.Color(255, 102, 0));
        lbQno.setText("Question No:");

        rbOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbOption1);
        rbOption1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbOption1.setForeground(new java.awt.Color(255, 102, 0));

        rbOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbOption2);
        rbOption2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbOption2.setForeground(new java.awt.Color(255, 102, 0));

        rbOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbOption3);
        rbOption3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbOption3.setForeground(new java.awt.Color(255, 102, 0));

        rbOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbOption4);
        rbOption4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbOption4.setForeground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Timer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        lbTimer.setForeground(new java.awt.Color(255, 102, 0));

        lbTimeLeft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTimeLeft.setForeground(new java.awt.Color(255, 102, 0));
        lbTimeLeft.setText("Time Left:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbTimeLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbTimeLeft)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbQuestionNo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbUserName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbLogout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbOption3)
                                    .addComponent(rbOption1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnNext)
                        .addGap(54, 54, 54)
                        .addComponent(btnPrevious)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancel)
                        .addGap(59, 59, 59)
                        .addComponent(btnDone))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(lbQno)
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbOption2)
                                .addComponent(rbOption4)))))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogout)
                    .addComponent(lbUserName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOption1)
                            .addComponent(rbOption2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbQuestionNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOption3)
                    .addComponent(rbOption4))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseEntered
        oldColor=lbLogout.getForeground();
        lbLogout.setForeground(Color.white);
    }//GEN-LAST:event_lbLogoutMouseEntered

    private void lbLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseExited
        lbLogout.setForeground(oldColor);
    }//GEN-LAST:event_lbLogoutMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
     String choosenAnswer=getUserAnswer();
     if(choosenAnswer!=null){
         Question quest=qstore.getQuestion(pos);
         Answer ans=new Answer(quest.getExamId(),qno,quest.getCorrectAnswer(),choosenAnswer,quest.getLanguage());
         Answer attempted=astore.getAnswerByQno(qno);
         if(attempted==null){
         astore.addAnswer(ans);
         }
         else{
             String prevAnswer=attempted.getChosenAns();
             if(prevAnswer.equals(choosenAnswer)==false){
                 int apos=astore.removeAnswer(attempted);
                 astore.setAnswerAt(apos, ans);
             }
         }
     }
     pos++;
     if(pos>=qstore.getCount()){
        
         pos=0;  
         
     }
          qno++;
          if(qno>qstore.getCount()){
              qno=1;
          }
          lbQno.setText("Question No:"+qno);
          showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChoosePaperFrame choosePaper=new ChoosePaperFrame();
       choosePaper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
      check=true;
        String choosenAnswer=getUserAnswer();
        System.out.println("run");
     if(choosenAnswer!=null){
         Question quest=qstore.getQuestion(pos);
         Answer ans=new Answer(quest.getExamId(),qno,quest.getCorrectAnswer(),choosenAnswer,quest.getLanguage());
         Answer attempted=astore.getAnswerByQno(qno);
         if(attempted==null){
         astore.addAnswer(ans);
         }
         else{
             String prevAnswer=attempted.getChosenAns();
             if(prevAnswer.equals(choosenAnswer)==false){
                 int apos=astore.removeAnswer(attempted);
                 astore.setAnswerAt(apos, ans);
             }
         }
     }
         int right=0,wrong=0,unattempted=0;
         for(Question qus:qstore.getAllQuestions()){
               int qno=qus.getQno();
               Answer result=astore.getAnswerByQno(qno);
               if(result==null)
                   continue;
               String attemptedAnswer=result.getChosenAns();
               String correctAnswer=result.getCorrectAns();
               if(attemptedAnswer.equals(correctAnswer)){
                   right++;
               }
               else{
                   wrong++;
               }
         }
               StringBuilder sb=new StringBuilder();
               sb.append("\nRight Answers "+right);
               sb.append("\nWrong Answer "+wrong );
               unattempted=qstore.getCount()-(right+wrong);
               sb.append("\nUnattempted "+unattempted);
               double per=((double)right/qstore.getCount())*100;
               System.out.println(per);
               JOptionPane.showMessageDialog(null, sb.toString(),"Result!",JOptionPane.INFORMATION_MESSAGE);
               try{
                   Performance prf=new Performance(UserProfile.getUserName(),exam.getExamId(),right,wrong,unattempted,per,exam.getLanguage());
                   PerformanceDAO.addPerformance(prf);
                   ChoosePaperFrame chooseFrame=new ChoosePaperFrame();
                   chooseFrame.setVisible(true);
                   this.dispose();
               }
               catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "DB Error","Error",JOptionPane.ERROR_MESSAGE);
             sqle.printStackTrace();
       }
         
     
     
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
       String choosenAnswer=getUserAnswer();
     if(choosenAnswer!=null){
         Question quest=qstore.getQuestion(pos);
         Answer ans=new Answer(quest.getExamId(),qno,quest.getCorrectAnswer(),choosenAnswer,quest.getLanguage());
         Answer attempted=astore.getAnswerByQno(qno);
         if(attempted==null){
         astore.addAnswer(ans);
         }
         else{
             String prevAnswer=attempted.getChosenAns();
             if(prevAnswer.equals(choosenAnswer)==false){
                 int apos=astore.removeAnswer(attempted);
                 astore.setAnswerAt(apos, ans);
             }
         }
     }
     pos--;
     if(pos<0){
         
         pos=qstore.getCount()-1;  
         
     }
          qno--;
          if(qno<=0){
              qno=qstore.getCount();
          }
          lbQno.setText("Question No:"+qno);
          showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void loadQuestion(){
    try
        {
            ArrayList<Question>questionList=QuestionDAO.getQuestionByExamId(exam.getExamId());
            for(Question q:questionList)
            {
                qstore.addQuestion(q);
            }
            
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"DB Error","Edit Question Error!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }

}
    private void showQuestion(){//
    Question q=qstore.getQuestion(pos); 
    buttonGroup1.clearSelection();
        txtQuestion.setText(q.getQuestion());
        rbOption1.setText(q.getAnswer1());
        rbOption2.setText(q.getAnswer2());
        rbOption3.setText(q.getAnswer3());
        rbOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null){
            return;
        }
          String str=ans.getChosenAns();
          switch(str){
              case "Answer1":
                      rbOption1.setSelected(true);
                      break;
              case "Answer2":
                      rbOption2.setSelected(true);
                      break;
              case "Answer3":
                      rbOption3.setSelected(true);
                      break;
              case "Answer4":
                      rbOption4.setSelected(true);
                      break;
          }
        }
    private String getUserAnswer(){
        if(rbOption1.isSelected())
            return "Answer1";
        else if(rbOption2.isSelected())
            return "Answer2";
        else if(rbOption3.isSelected())
            return "Answer3";
        else if(rbOption4.isSelected())
            return "Answer4";
        else 
            return null;
    }
    
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbQno;
    private javax.swing.JLabel lbQuestionNo;
    private javax.swing.JLabel lbTimeLeft;
    private javax.swing.JLabel lbTimer;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JLabel lblSubjectName;
    private javax.swing.JRadioButton rbOption1;
    private javax.swing.JRadioButton rbOption2;
    private javax.swing.JRadioButton rbOption3;
    private javax.swing.JRadioButton rbOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
class TimerThread extends Thread{
   int i;
    public void run(){
        lbTimer.setText("2:00");
        
            try{
               
           lbTimer.setText("02:00");
          for( i=1;i>=0;i--){
              for(int j=59;j>-1;j--){
               Thread.sleep(1000);
               if(check==true)
                   tth.stop();
               if(j<10){
                   lbTimer.setText("0"+i+":0"+j);
               }
               else
               lbTimer.setText("0"+i+":"+j);
          }
          }
           if(i==-1){
               JOptionPane.showMessageDialog(null, "Sorry! time is over.Answers has been saved ","Time Over",JOptionPane.INFORMATION_MESSAGE);
               String choosenAnswer=getUserAnswer();
        System.out.println("run");
     if(choosenAnswer!=null){
         Question quest=qstore.getQuestion(pos);
         Answer ans=new Answer(quest.getExamId(),qno,quest.getCorrectAnswer(),choosenAnswer,quest.getLanguage());
         Answer attempted=astore.getAnswerByQno(qno);
         if(attempted==null){
         astore.addAnswer(ans);
         }
         else{
             String prevAnswer=attempted.getChosenAns();
             if(prevAnswer.equals(choosenAnswer)==false){
                 int apos=astore.removeAnswer(attempted);
                 astore.setAnswerAt(apos, ans);
             }
         }
     }
         int right=0,wrong=0,unattempted=0;
         for(Question qus:qstore.getAllQuestions()){
               int qno=qus.getQno();
               Answer result=astore.getAnswerByQno(qno);
               if(result==null)
                   continue;
               String attemptedAnswer=result.getChosenAns();
               String correctAnswer=result.getCorrectAns();
               if(attemptedAnswer.equals(correctAnswer)){
                   right++;
               }
               else{
                   wrong++;
               }
         }
               StringBuilder sb=new StringBuilder();
               sb.append("\nRight Answers "+right);
               sb.append("\nWrong Answer "+wrong );
               unattempted=qstore.getCount()-(right+wrong);
               sb.append("\nUnattempted "+unattempted);
               double per=((double)right/qstore.getCount())*100;
               System.out.println(per);
               JOptionPane.showMessageDialog(null, sb.toString(),"Result!",JOptionPane.INFORMATION_MESSAGE);
               try{
                   Performance prf=new Performance(UserProfile.getUserName(),exam.getExamId(),right,wrong,unattempted,per,exam.getLanguage());
                   PerformanceDAO.addPerformance(prf);
                   ChoosePaperFrame chooseFrame=new ChoosePaperFrame();
                   chooseFrame.setVisible(true);
                   dispose();
               }
               catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "DB Error","Error",JOptionPane.ERROR_MESSAGE);
             sqle.printStackTrace();
       }
         
     
     
           }
            }
            catch(InterruptedException ie){
                      JOptionPane.showMessageDialog(null, "Exception in Thread","Error",JOptionPane.ERROR_MESSAGE);
                      ie.printStackTrace();
                           }
        
    }
}
}