package com.sample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.Paciente;
import com.sample.Sangue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nomeTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddPaciente dialog = new AddPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddPaciente() {
		setTitle("Adicionar Paciente");
		setBounds(100, 100, 905, 772);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		nomeTF = new JTextField();
		nomeTF.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner idadeS = new JSpinner();
		idadeS.setModel(new SpinnerNumberModel(18, 0, 130, 1));
		
		JLabel lblIndicadorOms = new JLabel("Indicador OMS:");
		lblIndicadorOms.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner omsS = new JSpinner();
		omsS.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		
		JLabel lblDiagnsticoDeSiewert = new JLabel("Diagn\u00F3stico de Siewert I ou II:");
		lblDiagnsticoDeSiewert.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox siewertCB = new JComboBox();
		siewertCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblDiagnsticoDeDoena = new JLabel("Diagn\u00F3stico de Doen\u00E7a Ressec\u00E1vel:");
		lblDiagnsticoDeDoena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox ressecavelCB = new JComboBox();
		ressecavelCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblBordaSuperiorDo = new JLabel("Dist\u00E2ncia da Borda Superior do Tumor em rela\u00E7\u00E3o ao Esf\u00EDncter Superior do Es\u00F4fago:");
		lblBordaSuperiorDo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner bordaS = new JSpinner();
		bordaS.setModel(new SpinnerNumberModel(3, 0, 100, 1));
		
		JLabel lblNewLabel_1 = new JLabel("cm\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblOPacienteDeu = new JLabel("O Paciente deu o seu consentimento?");
		lblOPacienteDeu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox consentimentoCB = new JComboBox();
		consentimentoCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblDiagnsticoDeDoena_1 = new JLabel("Gr\u00E1vida ou Lactante:");
		lblDiagnsticoDeDoena_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("anos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Crit\u00E9rios de Inclus\u00E3o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_1 = new JLabel("Crit\u00E9rios de Exclus\u00E3o");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JComboBox gravidaCB = new JComboBox();
		gravidaCB.setModel(new DefaultComboBoxModel(new String[] {"False", "True"}));
		
		JLabel lblDiagnsticoDeDoena_1_1 = new JLabel("Radioterapia Tor\u00E1cica Pr\u00E9via:");
		lblDiagnsticoDeDoena_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox radioterapiaCB = new JComboBox();
		radioterapiaCB.setModel(new DefaultComboBoxModel(new String[] {"False", "True"}));
		
		JLabel lblDiagnsticoDeDoena_1_1_1 = new JLabel("Infe\u00E7\u00E3o Ativa:");
		lblDiagnsticoDeDoena_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox infecaoCB = new JComboBox();
		infecaoCB.setModel(new DefaultComboBoxModel(new String[] {"False", "True"}));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Exames Adicionais");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblDiagnsticoDeDoena_1_2 = new JLabel("Broncoscopia:");
		lblDiagnsticoDeDoena_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox broncoscopiaCB = new JComboBox();
		broncoscopiaCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblDiagnsticoDeDoena_1_2_1 = new JLabel("Endoscopia:");
		lblDiagnsticoDeDoena_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox endoscopiaCB = new JComboBox();
		endoscopiaCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblDiagnsticoDeDoena_1_2_1_1 = new JLabel("Est\u00F4mago:");
		lblDiagnsticoDeDoena_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox estomagoCB = new JComboBox();
		estomagoCB.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Crit\u00E9rios de Exclus\u00E3o - Sangue");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblDiagnsticoDeDoena_1_3 = new JLabel("Contagem de Neutr\u00F3filos:");
		lblDiagnsticoDeDoena_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner neutrofilosS = new JSpinner();
		neutrofilosS.setModel(new SpinnerNumberModel(new Long(1500000000), new Long(0), null, new Long(1)));
		
		JLabel lblDiagnsticoDeDoena_1_3_1 = new JLabel("Contagem de Plaquetas:");
		lblDiagnsticoDeDoena_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner plaquetasS = new JSpinner();
		plaquetasS.setModel(new SpinnerNumberModel(new Long(2147483647), new Long(0), null, new Long(1)));
		
		JLabel lblDiagnsticoDeDoena_1_3_1_1 = new JLabel("Concentra\u00E7\u00E3o S\u00E9rica de Bilirrubina Total:");
		lblDiagnsticoDeDoena_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner bilirrubinaS = new JSpinner();
		bilirrubinaS.setModel(new SpinnerNumberModel(new Double(1), new Double(0), null, new Double(1)));
		
		JLabel lblDiagnsticoDeDoena_1_3_1_1_1 = new JLabel("Creatina:");
		lblDiagnsticoDeDoena_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner creatinaS = new JSpinner();
		creatinaS.setModel(new SpinnerNumberModel(new Integer(120), new Integer(0), null, new Integer(1)));
		
		JLabel lblDiagnsticoDeDoena_1_3_1_1_1_1 = new JLabel("FEV1:");
		lblDiagnsticoDeDoena_1_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSpinner fev1S = new JSpinner();
		fev1S.setModel(new SpinnerNumberModel(new Double(1), new Double(0), null, new Double(1)));
		
		JToggleButton adicionar = new JToggleButton("Adicionar Paciente");
		adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        KieServices ks = KieServices.Factory.get();
			    KieContainer kContainer = ks.getKieClasspathContainer();
		    	KieSession kSession = kContainer.newKieSession("ksession-rules");
				
				String nome = nomeTF.getText();
				int idade = (int) idadeS.getValue();
				int OMS = (int) omsS.getValue();
				boolean siewert = Boolean.parseBoolean(siewertCB.getSelectedItem().toString());
				boolean ressecavel =  Boolean.parseBoolean(ressecavelCB.getSelectedItem().toString());
				int borda = (int) bordaS.getValue();
				boolean consentimento =  Boolean.parseBoolean(consentimentoCB.getSelectedItem().toString());
				boolean gravida =  Boolean.parseBoolean(gravidaCB.getSelectedItem().toString());
				boolean radioterapia =  Boolean.parseBoolean(radioterapiaCB.getSelectedItem().toString());
				boolean infecao =  Boolean.parseBoolean(infecaoCB.getSelectedItem().toString());
				long neutrofilos = (long)  neutrofilosS.getValue();
				long plaquetas = (long) plaquetasS.getValue();
				double bilirrubina = (double) bilirrubinaS.getValue();
				int creatina = (int) creatinaS.getValue();
				double fev1 = (double) fev1S.getValue();
				boolean broncoscopia =  Boolean.parseBoolean(broncoscopiaCB.getSelectedItem().toString());
				boolean endoscopia =  Boolean.parseBoolean(endoscopiaCB.getSelectedItem().toString());
				boolean estomago =  Boolean.parseBoolean(estomagoCB.getSelectedItem().toString());
				
				Sangue sangue = new Sangue(neutrofilos, plaquetas, bilirrubina, creatina, fev1);
				
				Paciente p = new Paciente(nome, idade, OMS, siewert, ressecavel, borda, consentimento, gravida, radioterapia, sangue, infecao, broncoscopia, endoscopia, estomago);
		        kSession.insert(p);
		        
		        setVisible(false);
		        dispose();
			}
		});
		adicionar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JToggleButton cancelar = new JToggleButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		cancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nomeTF, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ressecavelCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblIndicadorOms)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(omsS, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeSiewert)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(siewertCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblIdade, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idadeS, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(gravidaCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(infecaoCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblDiagnsticoDeDoena_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioterapiaCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblOPacienteDeu, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(consentimentoCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_3_1_1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bilirrubinaS, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblBordaSuperiorDo, GroupLayout.PREFERRED_SIZE, 601, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bordaS, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_3, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(neutrofilosS, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblDiagnsticoDeDoena_1_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(broncoscopiaCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblNewLabel_2_1_1))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_3_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(plaquetasS, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_3_1_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(creatinaS, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(fev1S, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblDiagnsticoDeDoena_1_2_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(endoscopiaCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(174, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblDiagnsticoDeDoena_1_2_1_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(estomagoCB, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
					.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(adicionar, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addGap(9))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(nomeTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addGap(11)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(idadeS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIndicadorOms, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(omsS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeSiewert, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(siewertCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(ressecavelCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBordaSuperiorDo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(bordaS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOPacienteDeu, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(consentimentoCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(gravidaCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioterapiaCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(infecaoCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(neutrofilosS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_3_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(plaquetasS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_3_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilirrubinaS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_3_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(creatinaS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiagnsticoDeDoena_1_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(fev1S, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDiagnsticoDeDoena_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(broncoscopiaCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDiagnsticoDeDoena_1_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(endoscopiaCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDiagnsticoDeDoena_1_2_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(estomagoCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(35))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addComponent(adicionar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
}
