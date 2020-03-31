package album.gui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import album.controladora.Controladora;
import album.controladora.PhotoAlbumException;

public class Login  extends JFrame {

	private Controladora controladora;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Login() throws PhotoAlbumException {
		controladora = new Controladora();
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{122, 107, 191, 0};
		gbl_contentPane.rowHeights = new int[]{14, 20, 20, 20, 23, 23, 20, 23, 23, 2, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblingresar = new JLabel("Ingresar al sistema");
		GridBagConstraints gbc_lblingresar = new GridBagConstraints();
		gbc_lblingresar.anchor = GridBagConstraints.NORTH;
		gbc_lblingresar.insets = new Insets(0, 0, 5, 5);
		gbc_lblingresar.gridx = 1;
		gbc_lblingresar.gridy = 0;
		contentPane.add(lblingresar, gbc_lblingresar);
		
		JLabel lblcorreo = new JLabel("Correo:");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 0;
		gbc_lblCorreo.gridy = 1;
		contentPane.add(lblcorreo, gbc_lblCorreo);
		
	}
	
	
	
	
}
