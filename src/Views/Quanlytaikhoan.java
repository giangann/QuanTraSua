package Views;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Quanlytaikhoan extends JPanel {
	private JTextField Txtsearch;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Quanlytaikhoan() {
		setBackground(new Color(32, 178, 170));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 755, 59);
		add(panel);
		panel.setLayout(null);
		
		Txtsearch = new JTextField();
		Txtsearch.setForeground(new Color(169, 169, 169));
		Txtsearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Txtsearch.setText("search");
		Txtsearch.setBounds(366, 6, 176, 19);
		panel.add(Txtsearch);
		Txtsearch.setColumns(10);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 178, 170));
		panel_1.setBounds(553, 57, 202, 458);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton Btnthem = new JButton("Thêm");
		Btnthem.setBounds(69, 110, 85, 21);
		panel_1.add(Btnthem);
		
		JButton Btnsua = new JButton("Sửa");
		Btnsua.setBounds(69, 209, 85, 21);
		panel_1.add(Btnsua);
		
		JButton Btnxoa = new JButton("Xóa");
		Btnxoa.setBounds(69, 162, 85, 21);
		panel_1.add(Btnxoa);
		
		JButton Btnload = new JButton("Load");
		Btnload.setBounds(69, 258, 85, 21);
		panel_1.add(Btnload);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(604, 5, 141, 21);
		panel.add(comboBox);
		
		table = new JTable();
		table.setBounds(10, 57, 545, 460);
		add(table);

	}
}
