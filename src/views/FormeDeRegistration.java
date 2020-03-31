package views;


import javax.swing.*;

import application.User;

import bd.Select;

import java.awt.*; 
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream; 
  

public class FormeDeRegistration
    extends JFrame 
    implements ActionListener { 
  
  
	// Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel nom; 
    private JTextField tnom; 
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel age; 
//  private JComboBox day; 
//  private JComboBox month; 
    private JComboBox tage; 
    private JLabel poid; 
    private JComboBox tpoid; 
    private JLabel taille; 
    private JComboBox ttaille;
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
  /*  private String days[] 
            = { 
            		"01", "02", "03", "04", "05", 
                    "06", "07", "08", "09", "10", 
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20","21","22","23","24","25","26","27","28","29", "30", "31"};
	
    private String months[] 
        = { 
        		"01", "02", "03", "04", "05", 
                "06", "07", "08", "09", "10", 
                "11", "12"};*/
    
    int[] intAge = IntStream.range(0, 120).toArray();
	private String age_ [] = Arrays.stream(intAge)
							.mapToObj(String::valueOf)
							.toArray(String[]::new);

    int[] intPoids = IntStream.range(0, 250).toArray();
	private String poids [] = Arrays.stream(intPoids)
							.mapToObj(String::valueOf)
							.toArray(String[]::new);
	
	int[] intTailles = IntStream.range(0, 250).toArray();
	private String tailles [] = Arrays.stream(intTailles)
							.mapToObj(String::valueOf)
							.toArray(String[]::new);
  
    // constructor, to initialize the components 
    // with default values. 

    public FormeDeRegistration() {
		setTitle("Registration Form"); 
        setBounds(300, 90, 900, 500); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
  
        nom = new JLabel("Nom"); 
        nom.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nom.setSize(100, 20); 
        nom.setLocation(100, 100); 
        c.add(nom); 
  
        tnom = new JTextField(); 
        tnom.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tnom.setSize(180, 20); 
        tnom.setLocation(200, 100); 
        c.add(tnom); 
        
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 150); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 150); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(305, 150); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        age = new JLabel("Age"); 
        age.setFont(new Font("Arial", Font.PLAIN, 20)); 
        age.setSize(100, 20); 
        age.setLocation(100, 200); 
        c.add(age); 
  
        tage = new JComboBox(age_); 
        tage.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tage.setSize(60, 20); 
        tage.setLocation(200, 200); 
        c.add(tage); 
        
        
        taille = new JLabel("Taille"); 
        taille.setFont(new Font("Arial", Font.PLAIN, 20)); 
        taille.setSize(100, 20); 
        taille.setLocation(100, 250); 
        c.add(taille);
        
       ttaille = new JComboBox(tailles); 
       ttaille.setFont(new Font("Arial", Font.PLAIN, 15)); 
       ttaille.setSize(60, 20); 
       ttaille.setLocation(200, 250); 
       c.add(ttaille); 
  
       
        poid = new JLabel("Poids"); 
        poid.setFont(new Font("Arial", Font.PLAIN, 20)); 
        poid.setSize(100, 20); 
        poid.setLocation(100, 300); 
        c.add(poid);
        
       tpoid = new JComboBox(poids); 
       tpoid.setFont(new Font("Arial", Font.PLAIN, 15)); 
       tpoid.setSize(60, 20); 
       tpoid.setLocation(200, 300); 
       c.add(tpoid); 
       
      
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 375); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 375); 
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(350, 300); 
        tout.setLocation(450, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
  
        setVisible(true); 
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e)
    { 
    	int poid = Integer.parseInt((String)tpoid.getSelectedItem());
        int taille = Integer.parseInt((String)ttaille.getSelectedItem());

        int age = Integer.parseInt((String)tage.getSelectedItem());
        if (e.getSource() == sub) { 
                String data1; 
                String data3;
                String data 
                    = "Bonjour, "
                      + tnom.getText() + "\n"+ "et bienvenue sur SmartCalories" + "\n"+
                "Vos parametres :" + "\n";
                String data2 
                = 
                "Age : "
                  + (String)tage.getSelectedItem() + "\n"+
                "Poids : "
                + (String)tpoid.getSelectedItem() + "\n"+
                "Taille : "
                + (String)ttaille.getSelectedItem() + "\n";
                if (male.isSelected()) {
                    data1 = "Gender : Male"
                            + "\n"; 
                    double result = 88.36 + 13.4 *poid + 4.8 * taille  -5.7*age;
                    data3= "Votre apport calorique quotidien est "+Double.toString(result) + "kkal";
                }
                else {
                    data1 = "Gender : Female"
                            + "\n"; 
                    double result = 447.6 + 9.2 *poid + 3.1 * taille - 4.3*age;
                    data3= "Votre apport calorique quotidien est "+Double.toString(result)+ "kkal";
                }
                              
				tout.setText(data + data1 + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
                User.getUser().setNom(tnom.getText());
                User.getUser().setPoids(Integer.parseInt((String) tpoid.getSelectedItem()));
                User.getUser().setTaille(Integer.parseInt((String) ttaille.getSelectedItem()));
                User.getUser().setAge(Integer.parseInt((String) tage.getSelectedItem()));
  //              User.getUser().setDatedeNaissance(LocalDate.parse((String) year.getSelectedItem()+"-"+(String) month.getSelectedItem()+"-"+(String) day.getSelectedItem()));
                User.getUser().setGenre(male.isSelected()); 
                User.getUser().AfficherNorme();
//        		System.out.println( User.getUser().hashCode());
//       		System.out.println( User.getUser().toString());
        		try {
					User.getUser().cerateJsonUser ();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        		Menu m = new Menu();
            } 
       
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tnom.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            tage.setSelectedIndex(0); 
            resadd.setText(def); 
           
        } 
    } 
}
