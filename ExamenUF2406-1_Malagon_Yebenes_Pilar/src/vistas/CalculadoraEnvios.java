package vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import modelo.Envio;
import net.miginfocom.swing.MigLayout;

public class CalculadoraEnvios extends JFrame {

	private JPanel contentPane;
	private JTextField txtCiudadOrigen;
	private JTextField txtCiudadDestino;
	private final ButtonGroup grupoCiudadOrigen = new ButtonGroup();
	private final ButtonGroup grupoCiudadDestino = new ButtonGroup();
	private JComboBox comboTipo;
	private JSpinner spinnerPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEnvios frame = new CalculadoraEnvios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraEnvios() {
		setTitle("Calculadora env\u00EDos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		txtCiudadOrigen = new JTextField();
		contentPane.add(txtCiudadOrigen, "cell 1 0,growx");
		txtCiudadOrigen.setColumns(10);
		
		JRadioButton rdbCONacional = new JRadioButton("Nacional");
		rdbCONacional.setSelected(true);
		grupoCiudadOrigen.add(rdbCONacional);
		contentPane.add(rdbCONacional, "flowx,cell 1 1");
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad Destino:");
		contentPane.add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		txtCiudadDestino = new JTextField();
		contentPane.add(txtCiudadDestino, "cell 1 2,growx");
		txtCiudadDestino.setColumns(10);
		
		JRadioButton rdbCDNacional = new JRadioButton("Nacional");
		rdbCDNacional.setSelected(true);
		grupoCiudadDestino.add(rdbCDNacional);
		contentPane.add(rdbCDNacional, "flowx,cell 1 3");
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de env\u00EDo:");
		contentPane.add(lblNewLabel_2, "cell 0 4,alignx trailing");
		
		comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 h", "Paq 14 - Antes de las 14 h", "Paq 24 - Al d\u00EDa siguiente"}));
		contentPane.add(comboTipo, "cell 1 4,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Peso:");
		contentPane.add(lblNewLabel_3, "cell 0 5");
		
		JRadioButton rdbCOExtranjero = new JRadioButton("Extranjero");
		grupoCiudadOrigen.add(rdbCOExtranjero);
		contentPane.add(rdbCOExtranjero, "cell 1 1");
		
		JRadioButton rdbCDExtranjero = new JRadioButton("Extranjero");
		grupoCiudadDestino.add(rdbCDExtranjero);
		contentPane.add(rdbCDExtranjero, "cell 1 3");
		
		spinnerPeso = new JSpinner();
		spinnerPeso.setModel(new SpinnerNumberModel(1, 1, 40, 1));
		contentPane.add(spinnerPeso, "cell 1 5");
		
		JButton btnCalcularPrecio = new JButton("Calcular Precio");
		btnCalcularPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularPrecio();
			}
		});
		contentPane.add(btnCalcularPrecio, "cell 1 6,alignx center");
	}

	
	//3.1
	protected void calcularPrecio() {
		if(txtCiudadOrigen.getText()==null || txtCiudadOrigen.getText().isBlank()||
			txtCiudadDestino.getText()==null || txtCiudadDestino.getText().isBlank())  {
			
			JOptionPane.showMessageDialog(this,
			"Debe introducir los campos de Ciudad Origen y de Ciudad Destino, por favor",
		     "Compruebe los datos por favor",JOptionPane.WARNING_MESSAGE);
			
		return;
			
		}
		
		//3.2
		//Recogida Datos
		String ciudadOrigen = txtCiudadOrigen.getText();
		String ciudadDestino = txtCiudadDestino.getText();
		Object tipo = comboTipo.getSelectedItem();
		int peso = (int) spinnerPeso.getValue();
		
		//Instanciar envio
		
		Envio env = new Envio();
		
		
	}

}
