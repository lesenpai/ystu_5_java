package lab7.part1;

/**
 *
 * @author xTCry
 */
public class IntlFrame_About extends javax.swing.JInternalFrame {

		public IntlFrame_About() {
		initComponents();
		
		editArea_Text.setText(
			"Author:\n"
				+ "Khrychev Vladislav Olegovich\n"
				+ "EIS-36, YSTU"
		);
	}

	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        editArea_Text = new javax.swing.JTextArea();

        setClosable(true);
        setResizable(true);
        setTitle("Справка");

        editArea_Text.setColumns(20);
        editArea_Text.setRows(5);
        jScrollPane1.setViewportView(editArea_Text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea editArea_Text;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}