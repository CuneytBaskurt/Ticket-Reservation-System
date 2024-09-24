package ui;

import main.*;
import logic.*;
import logic.Vehicle.yakit;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
//import javax.swing.JList;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import javax.swing.JCheckBox;
import java.awt.Font;
import logic.Trip.Tarih;
import logic.Route.MyEnum;
import logic.Route.MyEnum;;

public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFldUserName;
	private JPasswordField passwordField;
	private JTextField textFieldFirmaAd;
	private JTextField textFieldFirmaSifre;
	private JTextField textFieldHizmetBedel;
	private JTextField textFieldCompanyName;
	private JPasswordField passwordFieldCompanyPass;
	

	/**
	 * Launch the application.
	 */

	 String secilenFirma ;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Create the frame.
	 */
	public gui(Admin adminn,ArrayList<Company> companyList) {
		setResizable(false);
		setTitle("Kayra Bilet");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 32, 1176, 739);
		contentPane.add(tabbedPane);
		
		JPanel user = new JPanel(); 
		tabbedPane.addTab("user", null, user, null);
		user.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Kalkıs Yeri");
		lblNewLabel_11.setBounds(126, 92, 96, 14);
		user.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Varış Yeri");
		lblNewLabel_12.setBounds(126, 144, 46, 14);
		user.add(lblNewLabel_12);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(248, 88, 96, 22);
		user.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(248, 140, 96, 22);
		user.add(comboBox_1);
		
		JLabel lblNewLabel_13 = new JLabel("Tarih");
		lblNewLabel_13.setBounds(126, 209, 46, 14);
		user.add(lblNewLabel_13);
		
		JButton btnNewButton_3 = new JButton("Bilet Bul");
		btnNewButton_3.setBounds(255, 280, 89, 23);
		user.add(btnNewButton_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(248, 209, 96, 22);
		user.add(comboBox_2);
		
		JLabel lblNewLabel_14 = new JLabel("Seferler");
		lblNewLabel_14.setBounds(566, 94, 46, 22);
		user.add(lblNewLabel_14);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(661, 92, 433, 26);
		user.add(comboBox_3);
		
		JButton btnNewButton_4 = new JButton("Seç");
		btnNewButton_4.setBounds(1005, 144, 89, 23);
		user.add(btnNewButton_4);
		
		JLabel lblNewLabel_15 = new JLabel("Ad");
		lblNewLabel_15.setBounds(566, 242, 67, 14);
		user.add(lblNewLabel_15);
		
		textField = new JTextField();
		textField.setBounds(661, 239, 139, 20);
		user.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(661, 280, 139, 20);
		user.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Soyad");
		lblNewLabel_16.setBounds(566, 283, 67, 14);
		user.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Yaş");
		lblNewLabel_17.setBounds(566, 328, 46, 14);
		user.add(lblNewLabel_17);
		
		textField_2 = new JTextField();
		textField_2.setBounds(661, 325, 86, 20);
		user.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Yolcu Sayısı");
		lblNewLabel_18.setBounds(869, 242, 67, 14);
		user.add(lblNewLabel_18);
		
		textField_3 = new JTextField();
		textField_3.setBounds(946, 239, 37, 20);
		user.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Güncelle");
		btnNewButton_6.setBounds(894, 324, 89, 23);
		user.add(btnNewButton_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(661, 358, 37, 22);
		user.add(comboBox_5);
		
		JLabel lblNewLabel_19 = new JLabel("Yolcu");
		lblNewLabel_19.setBounds(566, 362, 46, 14);
		user.add(lblNewLabel_19);
		
		JLabel lblNewLabel_15_1 = new JLabel("Ad");
		lblNewLabel_15_1.setBounds(566, 409, 67, 14);
		user.add(lblNewLabel_15_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(661, 406, 139, 20);
		user.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(661, 447, 139, 20);
		user.add(textField_5);
		
		JLabel lblNewLabel_16_1 = new JLabel("Soyad");
		lblNewLabel_16_1.setBounds(566, 450, 67, 14);
		user.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Yaş");
		lblNewLabel_17_1.setBounds(566, 495, 46, 14);
		user.add(lblNewLabel_17_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(661, 492, 86, 20);
		user.add(textField_6);
		
		JButton btnNewButton_8 = new JButton("Ekle");
		btnNewButton_8.setBounds(911, 540, 89, 23);
		user.add(btnNewButton_8);
		
		JLabel lblNewLabel_20 = new JLabel("Boş Koltuk Seç");
		lblNewLabel_20.setBounds(566, 549, 85, 14);
		user.add(lblNewLabel_20);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(661, 545, 67, 22);
		user.add(comboBox_6);
		
		JButton btnNewButton_9 = new JButton("Satın Al");
		btnNewButton_9.setBounds(911, 594, 89, 23);
		user.add(btnNewButton_9);
		 
	       for (Company item : companyList) {
	    	   if(item.kullaniciAdi.equals(secilenFirma)) {
	    		   
	    		   
	    		   
	    		   break;
	    		   
	    	   }
	        }
		
		JPanel firma = new JPanel();
		tabbedPane.addTab("Firma", null, firma, null); 
		firma.setLayout(null); 
		
		textFieldCompanyName = new JTextField();
		textFieldCompanyName.setColumns(10);
		textFieldCompanyName.setBounds(187, 28, 86, 20);
		firma.add(textFieldCompanyName);
		
		JLabel lblCompanyName = new JLabel("Company Name : ");
		lblCompanyName.setBounds(35, 31, 107, 14);
		firma.add(lblCompanyName);
		
		JPanel panelfirma1 = new JPanel(); 
		panelfirma1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelfirma1.setBounds(35, 189, 445, 465);
		firma.add(panelfirma1);
		panelfirma1.setLayout(null);
		
		JComboBox<String> comboBoxFArac = new JComboBox<String>();
		comboBoxFArac.setBounds(150, 65, 183, 22);
		panelfirma1.add(comboBoxFArac);
		

		
		
		JLabel lblNewLabel_3 = new JLabel("Araçlar");
		lblNewLabel_3.setBounds(45, 69, 62, 14);
		panelfirma1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ARAÇ EKLEME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(169, 173, 125, 31);
		panelfirma1.add(lblNewLabel_4);
		
		JCheckBox chckbxBus = new JCheckBox("Otobüs");
		chckbxBus.setBounds(76, 227, 97, 23);
		panelfirma1.add(chckbxBus);
		
		JCheckBox chckbxTrain = new JCheckBox("Tren");
		chckbxTrain.setBounds(193, 227, 97, 23);
		panelfirma1.add(chckbxTrain);
		
		JCheckBox chckbxAirplane = new JCheckBox("Uçak");
		chckbxAirplane.setBounds(292, 227, 97, 23);
		panelfirma1.add(chckbxAirplane);
		
		
		chckbxBus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (chckbxBus.isSelected()) {
                	chckbxTrain.setSelected(false);
                	chckbxAirplane.setSelected(false);
                } 
            }
        });
		
		chckbxTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (chckbxTrain.isSelected()) {
                	chckbxBus.setSelected(false);
                	chckbxAirplane.setSelected(false);
                } 
            }
        });
		
		chckbxAirplane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (chckbxAirplane.isSelected()) { 
                	chckbxTrain.setSelected(false);
                	chckbxBus.setSelected(false);
                } 
            }
        });
		
		
		
		JButton btnAracEkle = new JButton("Ekle");
		


		btnAracEkle.setBounds(178, 297, 89, 23);
		panelfirma1.add(btnAracEkle);
		
		JButton btnAracSil = new JButton("Aracı Sil");

		btnAracSil.setBounds(244, 115, 89, 23);
		panelfirma1.add(btnAracSil);
		panelfirma1.setVisible(false);
		
		JPanel panelfirma2 = new JPanel();
		panelfirma2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelfirma2.setBounds(513, 28, 632, 626);
		firma.add(panelfirma2);
		panelfirma2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Seferler");
		lblNewLabel_5.setBounds(10, 86, 68, 14);
		panelfirma2.add(lblNewLabel_5);
		
		
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        JComboBox<String> comboBoxSeferler = new JComboBox<>(comboBoxModel);
        
 
		
//		JComboBox<Route.RouteEnum> comboBoxSeferler = new JComboBox<>(new DefaultComboBoxModel<>(Route.RouteEnum.values()));
		comboBoxSeferler.setBounds(60, 82, 562, 22);
		panelfirma2.add(comboBoxSeferler);
		
		JButton btnNewButton_5 = new JButton("Seferi Sil");

		btnNewButton_5.setBounds(345, 123, 119, 23);
		panelfirma2.add(btnNewButton_5);
		
		JComboBox<Trip> comboBoxGun1 = new JComboBox<Trip>();
		comboBoxGun1.setModel(new DefaultComboBoxModel(Trip.Tarih.values()));
		comboBoxGun1.setBounds(60, 42, 119, 22);
		panelfirma2.add(comboBoxGun1);
		
		JLabel lblNewLabel_6 = new JLabel("Gün");
		lblNewLabel_6.setBounds(10, 46, 46, 14);
		panelfirma2.add(lblNewLabel_6);
		
		JButton btnSeferListele = new JButton("Seferleri Listele");
		


		btnSeferListele.setBounds(345, 42, 119, 23);
		panelfirma2.add(btnSeferListele);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sefer");
		lblNewLabel_5_1.setBounds(10, 274, 89, 14);
		panelfirma2.add(lblNewLabel_5_1);
		
		JComboBox<MyEnum> comboBoxSeferEkle = new JComboBox<MyEnum>();
		comboBoxSeferEkle.setModel(new DefaultComboBoxModel(MyEnum.values()));
		comboBoxSeferEkle.setBounds(60, 270, 562, 22);
		panelfirma2.add(comboBoxSeferEkle);
		
		JButton btnNewSeferEkle = new JButton("Seferi Ekle");



		btnNewSeferEkle.setBounds(345, 353, 119, 23);
		panelfirma2.add(btnNewSeferEkle);
		
		JComboBox<logic.Route.Tarih> comboBoxgun2 = new JComboBox<logic.Route.Tarih>();
		comboBoxgun2.setModel(new DefaultComboBoxModel(logic.Route.Tarih.values()));
		comboBoxgun2.setBounds(60, 230, 119, 22);
		panelfirma2.add(comboBoxgun2);
		
		JLabel lblNewLabel_6_1 = new JLabel("Gün");
		lblNewLabel_6_1.setBounds(10, 234, 46, 14);
		panelfirma2.add(lblNewLabel_6_1);
		
		JComboBox<String> comboBoxUygunArac = new JComboBox<String>();
		comboBoxUygunArac.setBounds(60, 316, 119, 22);
		panelfirma2.add(comboBoxUygunArac);
		
		JLabel lblNewLabel_7 = new JLabel("Araç");
		lblNewLabel_7.setBounds(10, 320, 78, 14);
		panelfirma2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("-");
		lblNewLabel_8.setBounds(120, 530, 97, 22);
		panelfirma2.add(lblNewLabel_8);
		
		JButton btnNewButton_7 = new JButton("Kar Hesapla");
		btnNewButton_7.setBounds(10, 530, 89, 23);
		panelfirma2.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel("Gün");
		lblNewLabel_9.setBounds(10, 465, 46, 14);
		panelfirma2.add(lblNewLabel_9);
		
		JComboBox comboBox_4 = new JComboBox<String>();
		comboBox_4.setModel(new DefaultComboBoxModel(Tarih.values()));
		comboBox_4.setBounds(93, 461, 119, 22);
		panelfirma2.add(comboBox_4);
		
		JLabel lblNewLabel_10 = new JLabel("SEFER EKLEME");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(225, 180, 130, 30);
		panelfirma2.add(lblNewLabel_10);
		panelfirma2.setVisible(false);
		
		JLabel lblCompPass = new JLabel("Password : ");
		lblCompPass.setBounds(35, 80, 86, 14);
		firma.add(lblCompPass);
		
		JLabel lblcompcorrect = new JLabel("");
		lblcompcorrect.setBounds(187, 139, 107, 20);
		firma.add(lblcompcorrect);
		
		passwordFieldCompanyPass = new JPasswordField();
		passwordFieldCompanyPass.setBounds(187, 77, 86, 20);
		firma.add(passwordFieldCompanyPass);
		
		
		  
		JButton btnLogout = new JButton("Çıkış Yap");
		JButton btncomplogin = new JButton("Login");
		btnLogout.setBounds(371, 135, 89, 23);
		firma.add(btnLogout);
		btnLogout.setEnabled(false);
		btncomplogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				var inputCompanyName = textFieldCompanyName.getText();
				var inputCompanyPassword = passwordFieldCompanyPass.getPassword();
				String inputCompanyName1 = String.valueOf(inputCompanyName);
				String inputCompanyPassword1 = String.valueOf(inputCompanyPassword);
				 
			       for (Company item : companyList) {
			           if( item.girisYap(inputCompanyName1, inputCompanyPassword1)) { 
			        	   
							lblcompcorrect.setText("Giris Basarili");
							btncomplogin.setEnabled(false);
							btnLogout.setEnabled(true);
							panelfirma2.setVisible(true);
							panelfirma1.setVisible(true);
							
							secilenFirma = item.kullaniciAdi;
							
				    		   for(Bus itemB : item.busList) {
				    			   
				    			   comboBoxFArac.addItem("bus "+itemB.aracID);   
				    		   }
				    		   for(Train itemC : item.trainList) {
				    			   
				    			   comboBoxFArac.addItem("train "+itemC.aracID);   
				    		   }
				    		   for(Airplane itemD : item.airplaneList) {
				    			   
				    			   comboBoxFArac.addItem("airplane "+itemD.aracID);   
				    		   }
				    		    
				    			btnAracSil.addActionListener(new ActionListener() {
				    				public void actionPerformed(ActionEvent e) {
				    					
				    					
				    					String selected = (String) comboBoxFArac.getSelectedItem();

				    					  String sadeceSayisal = selected.replaceAll("[^0-9]", "");
				    					  
				    					  
				    					  
				    				    for (Bus itemF : item.busList) {
				    				    	
				    				    	if(Integer.valueOf(sadeceSayisal) == itemF.aracID) {
				    				    		
				    				    		item.busList.remove(item.busList.indexOf(itemF));
				    				    		comboBoxFArac.removeAllItems();
				    				    		break;
				    				    			
				    				    	}	
				    				    }
				    				    for (Train itemE : item.trainList) {
				    				    	
				    				    	if(Integer.valueOf(sadeceSayisal) == itemE.aracID) {
				    				    		
				    				    		item.trainList.remove(item.trainList.indexOf(itemE));
				    				    		comboBoxFArac.removeAllItems();
				    				    		break;
				    				    			
				    				    	}	 
				    				    }
				    				    for (Airplane itemG : item.airplaneList) {
				    				    	
				    				    	if(Integer.valueOf(sadeceSayisal) == itemG.aracID) {
				    				    		
				    				    		item.airplaneList.remove(item.airplaneList.indexOf(itemG)); 
				    				    		comboBoxFArac.removeAllItems();
				    				    		break;
				    				    			
				    				    	}	
				    				    }
				    				    
				    				    
							    		   for(Bus itemB : item.busList) {
							    			   
							    			   comboBoxFArac.addItem("bus "+itemB.aracID);   
							    		   }
							    		   for(Train itemC : item.trainList) {
							    			   
							    			   comboBoxFArac.addItem("train "+itemC.aracID);   
							    		   }
							    		   for(Airplane itemD : item.airplaneList) {
							    			   
							    			   comboBoxFArac.addItem("airplane "+itemD.aracID);   
							    		   }
				    				
				    					
				    				}
				    			});
				    			
				    			
				    			 
				    			btnAracEkle.addActionListener(new ActionListener() {
				    				public void actionPerformed(ActionEvent e) {
				    					int max=0;
				    					
				    						
							    		   for(Bus itemB : item.busList) {
							    			   
							    			      if(itemB.aracID>=max) {
							    			    	  
							    			    	  max = itemB.aracID+1;
							    			      }
							    		   }
							    		   for(Train itemC : item.trainList) {
							    			   
							    			   if(itemC.aracID>=max) {
							    			    	   
							    			    	  max = itemC.aracID+1;
							    			      }
							    			        
							    		   }
							    		   for(Airplane itemD : item.airplaneList) {
							    			   
							    			   if(itemD.aracID>=max) {
							    			    	  
							    			    	  max = itemD.aracID+1;
							    			      }
							    			    
							    		   } 
				    						
				    					
				    					
				    					if(chckbxBus.isSelected()) {
				    						
				    						item.busEkle(yakit.BENZIN, 20, max);
				    						
				    						
				    					}
				    					else if(chckbxTrain.isSelected()) {
				    						
				    						item.trainEkle(yakit.ELEKTRIK, 25, max);
				    						
				    						
				    					}
				    					else if(chckbxAirplane.isSelected()) {
				    						
				    						item.airplaneEkle(yakit.GAZ, 30, max);
				    						
				    						
				    					} 
				    					
				    					   comboBoxFArac.removeAllItems();
				    					
							    		   for(Bus itemB : item.busList) {
							    			   
							    			   comboBoxFArac.addItem("bus "+itemB.aracID);   
							    		   }
							    		   for(Train itemC : item.trainList) {
							    			   
							    			   comboBoxFArac.addItem("train "+itemC.aracID);   
							    		   }
							    		   for(Airplane itemD : item.airplaneList) {
							    			   
							    			   comboBoxFArac.addItem("airplane "+itemD.aracID);   
							    		   }
				    					
				    					
							    		   
							    
				    					
				    				}
				    			});
				    			
				    			
				    			btnSeferListele.addActionListener(new ActionListener() {
				    				public void actionPerformed(ActionEvent e) {
				    					comboBoxSeferler.removeAllItems();
				    					
				    					if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.DORT_ARALIK)) {
				    						 
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.DORT_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.BES_ARALIK) ) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.BES_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID); 
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.ALTI_ARALIK)) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.ALTI_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.YEDI_ARALIK)) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.YEDI_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.SEKIZ_ARALIK)) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.SEKIZ_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.DOKUZ_ARALIK)) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.DOKUZ_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					else if(String.valueOf(comboBoxGun1.getSelectedItem()) == String.valueOf(Tarih.ON_ARALIK)) {
				    						
				    						for(Route xxx :item.seferList) {
				    							
				    							if(String.valueOf(xxx.tarih) == String.valueOf(Tarih.ON_ARALIK) ) {
				    								
				    								comboBoxSeferler.addItem(xxx.guzergah.getStringValue() + xxx.arac.aracID);
				    								
				    								
				    							}
				    						}
				    						
				    					}
				    					
				    					
				    					comboBoxUygunArac.removeAllItems();
				    					for( Bus fff  : item.busList ) {
				    						
				    						
				    						if(fff.using == false) {
				    							
				    							comboBoxUygunArac.addItem("Bus"+ fff.aracID);
				    							
				    							
				    						}
				    						
				    						
				    					}
				    					
				    					for( Train fff  : item.trainList ) {
				    						
				    						
				    						if(fff.using == false) {
				    							
				    							comboBoxUygunArac.addItem("train"+ fff.aracID);
				    							
				    							
				    						}
				    						
				    						
				    					}
				    					
				    					
				    					for( Airplane fff  : item.airplaneList ) {
				    						
				    						
				    						if(fff.using == false) {
				    							
				    							comboBoxUygunArac.addItem("Airplane"+ fff.aracID);
				    							
				    							
				    						}
				    						
				    						
				    					}
				    					
				    					
				    					
				    					
				    				}
				    			});
				    			
				    			
				    			btnNewButton_5.addActionListener(new ActionListener() {
				    				public void actionPerformed(ActionEvent e) {
				    					
				    					
				    				
				    					
				    					String selected = (String) comboBoxSeferler.getSelectedItem();

				    					String sadeceSayisal = selected.replaceAll("[^0-9]", "");
				    					
				    					
				    					for( Route aaa : item.seferList  ) {
				    						
				    						if(aaa.arac.aracID ==Integer.valueOf(sadeceSayisal)) {
				    							
				    							item.seferList.remove(aaa);
				    							
				    							break;
				    							
				    						}
				    						
				    						 
				    						
				    					}
				    					
				    					
				    					
				    					
				    					
				    					
				    					
				    					
				    				}
				    			});
				    			
				    			
				    		
				    					

				    					
				    					
				    					btnNewSeferEkle.addActionListener(new ActionListener() {
				    						public void actionPerformed(ActionEvent e) {
				    							
				    							MyEnum myenum1 = (MyEnum) comboBoxSeferEkle.getSelectedItem();
				    							String secilenarac = comboBoxUygunArac.getSelectedItem().toString();
				    							String sadeceSayisal = secilenarac.replaceAll("[^0-9]", "");
				    							int aaracID = 0 ;
				    							int index = -1;
				    							int select = 0;
				    							
				    							logic.Route.Tarih gun = (logic.Route.Tarih) comboBoxgun2.getSelectedItem();
				    							
				    							
				    							 
				    							
						    					for( Route aaaa : item.seferList  ) {
						    						
						    						if(aaaa.arac.aracID == Integer.valueOf(sadeceSayisal)) {
						    							
						    							aaracID = aaaa.arac.aracID; 
						    							
						    							
						    							break;
						    							
						    						}	
						    					}
						    					
									    		   for(Bus itemB : item.busList) {
									    			   
									    			   if(itemB.aracID == aaracID) { 
									    				   
									    				  index = item.busList.indexOf(itemB);
									    				  select=1;
									    				   break;
									    			   }    
									    			   
									    			   
									    		   }
									    		   for(Train itemC : item.trainList) {
									    			   
									    			   
									    			   if(itemC.aracID == aaracID) {
									    				   
									    				  index = item.trainList.indexOf(itemC);
									    				  select=2; 
									    				   break;  
									    		   }
									    			   }   
									    			   
									    			   
									    		   for(Airplane itemD : item.airplaneList) {
									    			   
									    			   
									    			   if(itemD.aracID == aaracID) {
									    				   
									    				  index = item.airplaneList.indexOf(itemD);
									    				  select=3;
									    				   break; 
									    			   }   
									    			   
									    			    
									    		   }
						    					
						    					
						    					
				    							if(select==1) {
				    								item.seferList.add(new Route(myenum1,item.busList.get(index),gun));
				    								item.busList.get(index).using=true;
				    								
				    							}
				    							else if(select==2) {
				    								item.seferList.add(new Route(myenum1,item.trainList.get(index),gun));
				    								item.trainList.get(index).using=true;
				    								
				    							}
				    							else if(select==3) {
				    								item.seferList.add(new Route(myenum1,item.airplaneList.get(index),gun));
				    								item.airplaneList.get(index).using=true;
				    								
				    							}
				    							
				    							
				    							
				    							
				    							
				    						}
				    					});
				    					
				    	

							break;
			        	   
			           }
			           else {
			        	   
			        	   lblcompcorrect.setText("Giris Basarısız");  
			        	   
			           }

			        }
			      

				
				
			}
		});
		

		
		
		btncomplogin.setBounds(35, 135, 89, 23);
		firma.add(btncomplogin);
		
	
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblcompcorrect.setText("");
				btncomplogin.setEnabled(true); 
				btnLogout.setEnabled(false);
				panelfirma2.setVisible(false);
				panelfirma1.setVisible(false);
				comboBoxFArac.removeAllItems();
				comboBoxSeferler.removeAllItems();
	//			comboBoxSeferEkle.removeAllItems();
				comboBoxUygunArac.removeAllItems();
				
				
			}
		});

		

		
		JPanel admin = new JPanel();
		tabbedPane.addTab("Admin", null, admin, null);
		admin.setLayout(null);
		
		txtFldUserName = new JTextField();
		txtFldUserName.setBounds(185, 19, 86, 20);
		admin.add(txtFldUserName);
		txtFldUserName.setColumns(10); 
		
		JLabel lblAdminName = new JLabel("Admin Name : ");
		lblAdminName.setBounds(33, 22, 86, 14);
		admin.add(lblAdminName);
		
		JLabel lblpassword = new JLabel("Password : ");
		lblpassword.setBounds(33, 71, 86, 14);
		admin.add(lblpassword);
		
		JLabel lblCorrect = new JLabel("");
		lblCorrect.setBounds(193, 140, 100, 14);
		admin.add(lblCorrect);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(null, 2, true));
		panel1.setBounds(304, 19, 753, 644);
		admin.add(panel1);
		panel1.setLayout(null); 
		panel1.setVisible(false);
		
		JComboBox<String> cmbBoxfirmalar = new JComboBox<String>();
		cmbBoxfirmalar.setBounds(294, 45, 356, 36);
		panel1.add(cmbBoxfirmalar);
	       for (Company item : companyList) {
	            cmbBoxfirmalar.addItem(item.getKullaniciAdi());
	        }


		
		
		JLabel lblfirmalar = new JLabel("Firmalar :"); 
		lblfirmalar.setBounds(146, 56, 58, 14);
		panel1.add(lblfirmalar);
		 
		JLabel lblFirmaEkle = new JLabel("Firma Ekle :");
		lblFirmaEkle.setBounds(146, 236, 80, 14);
		panel1.add(lblFirmaEkle);
		
		textFieldFirmaAd = new JTextField(); 
		textFieldFirmaAd.setBounds(294, 233, 86, 20);
		panel1.add(textFieldFirmaAd);
		textFieldFirmaAd.setColumns(10);
		
		textFieldFirmaSifre = new JTextField();
		textFieldFirmaSifre.setBounds(448, 233, 86, 20);
		panel1.add(textFieldFirmaSifre);
		textFieldFirmaSifre.setColumns(10);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				var inputfirmaadi = textFieldFirmaAd.getText();
				var inputfirmasifre = textFieldFirmaSifre.getText(); 
				String inputfirmaadi1 = String.valueOf(inputfirmaadi);
				String inputfirmasifre1 = String.valueOf(inputfirmasifre);
				
				DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cmbBoxfirmalar.getModel();
                model.addElement(inputfirmaadi1);
                
                companyList.add(new Company(inputfirmaadi1,inputfirmasifre1)); 
				
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(561, 232, 89, 23);
		panel1.add(btnNewButton);
		 
		JButton btnNewButton_1 = new JButton("Firmayı Sil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				String selected = (String) cmbBoxfirmalar.getSelectedItem();

				
			       for (Company item : companyList) { 
			            if(item.kullaniciAdi.equals(selected)) { 
			            	
			            	companyList.remove(companyList.indexOf(item));
			            	
			            	cmbBoxfirmalar.removeAllItems();
			            	
			     	       for (Company item2 : companyList) {
			   	            cmbBoxfirmalar.addItem(item2.getKullaniciAdi()); 
			   	        }
			            	
			            	break; 
			            } 
			        } 
		
			      
          
				
			}
		});
		btnNewButton_1.setBounds(545, 146, 105, 23);
		panel1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Hizmet Bedelini Güncelle :");
		lblNewLabel.setBounds(146, 351, 147, 14);
		panel1.add(lblNewLabel);
		
		textFieldHizmetBedel = new JTextField();
		textFieldHizmetBedel.setBounds(294, 348, 86, 20);
		panel1.add(textFieldHizmetBedel);
		textFieldHizmetBedel.setColumns(10);
		textFieldHizmetBedel.setText(String.valueOf(adminn.hizmetBedeli));
		
		JButton btnNewButton_2 = new JButton("Güncelle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminn.hizmetBedeli= Integer.valueOf(textFieldHizmetBedel.getText());
				
				System.out.println(companyList);
				System.out.println(secilenFirma);
				
			}
		});
		btnNewButton_2.setBounds(561, 347, 89, 23);
		panel1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Firma Adı");
		lblNewLabel_1.setBounds(293, 211, 87, 14);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Firma Şifresi");
		lblNewLabel_2.setBounds(448, 211, 86, 14);
		panel1.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	
				
				var inputUserName = txtFldUserName.getText();
				var inputPassword = passwordField.getPassword();
				String inputUserName1 = String.valueOf(inputUserName);
				String inputPassword1 = String.valueOf(inputPassword);
		
				
				if(adminn.girisYap(inputUserName1, inputPassword1)) {
					
					
					lblCorrect.setText("Giris Basarili");
					btnLogin.setEnabled(false);
					panel1.setVisible(true);
					
				}
				else {
					lblCorrect.setText("Giris Basarisiz");
					
				}
				
				
				
			}
			
			
		});
		btnLogin.setBounds(33, 136, 89, 23);
		admin.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 68, 86, 20);
		admin.add(passwordField);
		
		
		
		
		
		
		


	}
}
