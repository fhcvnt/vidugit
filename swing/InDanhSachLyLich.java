package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import org.apache.xmlbeans.impl.values.JavaBooleanHolder;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InDanhSachLyLich {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InDanhSachLyLich window = new InDanhSachLyLich();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InDanhSachLyLich() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 880);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		scrollPane.setAutoscrolls(true);

		JPanel panel = new JPanel();
		// frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(36, 69, 796, 20);
		panel.add(panel2);

		panel2.setLayout(null);
		scrollPane.setViewportView(panel);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		panel2.setAutoscrolls(true);
		panel2.setPreferredSize(new Dimension(796, 1122));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lbDonVi = new JLabel("Đơn vị");
		panel_1.add(lbDonVi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"s fsf", "s", "fsa", "f", "á afsafsa                           sa fsfas f"}));
		panel_1.add(comboBox);
		
		JLabel lbLoai = new JLabel("Loại");
		panel_1.add(lbLoai);
		
		JComboBox comboBoxLoai = new JComboBox();
		comboBoxLoai.setModel(new DefaultComboBoxModel(new String[] {"CPU", "Monitor", "UPS"}));
		panel_1.add(comboBoxLoai);
	}
}
