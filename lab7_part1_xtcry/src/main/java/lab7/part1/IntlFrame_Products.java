package lab7.part1;

import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author xTCry
 */
public class IntlFrame_Products extends javax.swing.JInternalFrame {

		public IntlFrame_Products() {
		initComponents();
	}

	private void updateTable() {
		try {
			table_Products.setModel(SqlUtils.buildTableModel("SELECT * FROM Product ORDER BY ID"));
		}
		catch (SQLException ex) {
			Logger.getLogger(IntlFrame_Products.class.getName()).log(Level.SEVERE, null, ex);
		}
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

        jLable1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_AddProduct = new javax.swing.JButton();
        btn_DeleteProduct = new javax.swing.JButton();
        btn_ShowAllProducts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Products = new javax.swing.JTable();
        edit_Product_Id = new javax.swing.JTextField();
        edit_Product_Name = new javax.swing.JTextField();
        edit_Product_ManId = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Продукты");

        jLable1.setText("Id");

        jLabel3.setText("Имя");

        jLabel5.setText("Id Производителя");

        btn_AddProduct.setText("Добавить");
        btn_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductActionPerformed(evt);
            }
        });

        btn_DeleteProduct.setText("Удалить");
        btn_DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteProductActionPerformed(evt);
            }
        });

        btn_ShowAllProducts.setText("Показать все");
        btn_ShowAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowAllProductsActionPerformed(evt);
            }
        });

        table_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Man Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Products);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLable1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ShowAllProducts)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_AddProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_DeleteProduct))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit_Product_Name)
                            .addComponent(edit_Product_Id)
                            .addComponent(edit_Product_ManId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLable1)
                    .addComponent(edit_Product_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edit_Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_Product_ManId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddProduct)
                    .addComponent(btn_DeleteProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ShowAllProducts)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ShowAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowAllProductsActionPerformed
		updateTable();
    }//GEN-LAST:event_btn_ShowAllProductsActionPerformed

    private void btn_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductActionPerformed
		try {
			String pName = edit_Product_Name.getText(),
				pManId = edit_Product_ManId.getText();
			// if man exists
			if (!pManId.equals("") && SqlUtils.isExists("SELECT 1 FROM Manufacturer WHERE id=%s".formatted(pManId))) {
				// check if product NOT exists
				if (!SqlUtils.isExists("SELECT 1 FROM Product WHERE name='%s'".formatted(pName))) {
					// add product
					SqlUtils.execute("INSERT INTO Product (name, man_id) VALUES ('%s', %s)".formatted(pName, pManId));
					updateTable();
				}
				// error (product already exists)
				else {
					MyUtils.showErrorMessage(this, "Такой продукт уже существует");
				}
			}
			// show error (no man)
			else {
				MyUtils.showErrorMessage(this, "Такой производитель не существует");
			}
		}
		catch (SQLException ex) {
			Logger.getLogger(IntlFrame_Products.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btn_AddProductActionPerformed

    private void btn_DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteProductActionPerformed
		try {
			String pId = edit_Product_Id.getText();
			// if product exists
			if (!pId.equals("") && SqlUtils.isExists("SELECT 1 FROM Product WHERE id=%s".formatted(pId))) {
				// delete product
				SqlUtils.execute("DELETE FROM Product WHERE id=%s".formatted(pId));
				updateTable();
			}
			// error (no product)
			else {
				MyUtils.showErrorMessage(this, "Такой продукт не существует");
			}
		}
		catch (SQLException ex) {
			Logger.getLogger(IntlFrame_Products.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btn_DeleteProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProduct;
    private javax.swing.JButton btn_DeleteProduct;
    private javax.swing.JButton btn_ShowAllProducts;
    private javax.swing.JTextField edit_Product_Id;
    private javax.swing.JTextField edit_Product_ManId;
    private javax.swing.JTextField edit_Product_Name;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLable1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Products;
    // End of variables declaration//GEN-END:variables
}
