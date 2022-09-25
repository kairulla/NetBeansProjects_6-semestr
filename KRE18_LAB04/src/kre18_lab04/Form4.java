package kre18_lab04;

public class Form4 extends javax.swing.JFrame {

    public Form4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(100, 100));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(4);
        jTextArea1.setText("Об\nБоб Дуб Зуб Зоб Куб Люб Луб Лоб Раб Чуб \nВруб Герб Гроб Гриб Граб Горб Клуб Краб Нимб Румб \nВыгиб Желоб Загиб Изгиб Короб Озноб Обруб Отруб Пошиб Падуб \nАпломб Баобаб Микроб Погреб Прораб Прогиб Разруб Разгиб Сугроб Способ \nВзахлеб Генштаб Душегуб Женолюб Лесоруб Ледоруб Масштаб Однолюб Перегиб Раструб \nАнглофоб Вперегиб Водохлеб Гардероб Дифирамб Землероб Книголюб Сучкоруб Хлебороб \nНебоскреб Хлопкороб Ширпотреб \nГерманофоб ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextArea1.setMaximumSize(new java.awt.Dimension(111, 39));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 300, 360);

        jTextArea2.setColumns(1);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jTextArea2.setTabSize(4);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextArea2.setMaximumSize(new java.awt.Dimension(111, 39));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 0, 300, 360);

        jButton1.setText("<html>\nВ<br>\nЫ<br>\nП<br>\nО<br>\nЛ<br>\nН<br>\nИ<br>\nТ<br>\nЬ<br>\n</html>");
        jButton1.setAlignmentY(0.0F);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.setMaximumSize(new java.awt.Dimension(23, 145));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 10, 20, 140);

        setSize(new java.awt.Dimension(650, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void abc1(int word) {
        char[] abc_rus = new char[]{
            'а', 'б', 'в', 'г', 'д',
            'е', 'ё', 'ж', 'з', 'и',
            'й', 'к', 'л', 'м', 'н',
            'о', 'п', 'р', 'с', 'т',
            'у', 'ф', 'х', 'ц', 'ч',
            'ш', 'щ', 'ъ', 'ы', 'ь',
            'э', 'ю', 'я'};
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
