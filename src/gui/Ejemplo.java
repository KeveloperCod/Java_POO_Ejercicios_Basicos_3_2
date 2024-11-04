package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Empleado;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame {

	private JPanel contentPane;
	private JButton btnCalcular;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Empleado e1 = new Empleado(2021, 0, 925368212, "mario");
					listado(e1);
					
					
					Empleado e2 = new Empleado(2022, "Eduar");
					listado(e2);
					
					
					Empleado e3 = new Empleado();
					listado(e3);
					
					imprimir("Descuento   :   " + Empleado.descuento);
					imprimir("Cantidad de Empleados   :   " + Empleado.getCantEmpleado());
					imprimir("Sueldo neto acumulado   :   " + Empleado.getsNetos());
					
					
				}
				
				
				void listado(Empleado x){
					
					imprimir("DirMem   :   " + x);
					imprimir("Codigo   :   " + x.getCodigo());
					imprimir("Categoria   :   " + x.getCategoria());
					imprimir("Celular   :   " + x.getCelular());
					imprimir("Nombre   :   " + x.getNombre());
					imprimir(" ****** " + "\n");
				}
				
				void imprimir(String s){
					txtReporte.append(s + "\n");
				}
			});
			btnCalcular.setBounds(214, 27, 89, 23);
			contentPane.add(btnCalcular);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 76, 493, 450);
			contentPane.add(scrollPane);
			{
				txtReporte = new JTextArea();
				scrollPane.setViewportView(txtReporte);
			}
		}
	}
}
