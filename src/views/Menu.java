package views;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import bd.Select;

//import application.User.Genre;

import java.awt.*; 
import java.awt.event.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream; 
  
public class Menu
    extends JFrame 
    implements ActionListener { 
  
  
	// Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel repas;
    private JLabel date;
    private JLabel produit;
    private JRadioButton petitDejeuner; 
    private JRadioButton dejeuner; 
    private JRadioButton dinner; 
    private ButtonGroup gengp; 
    private JComboBox year; 
    private JComboBox day; 
    private JComboBox month; 
    private JList tproduit;
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
    private Select select = new Select();
    
  
    private String days[] 
            = { 
            		"01", "02", "03", "04", "05", 
                    "06", "07", "08", "09", "10", 
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20","21","22","23","24","25","26","27","28","29", "30", "31"};
	
    private String months[] 
        = { 
        		"01", "02", "03", "04", "05", 
                "06", "07", "08", "09", "10", 
                "11", "12"};
    
    int[] intYear = IntStream.range(2019, 2021).toArray();
	private String years [] = Arrays.stream(intYear)
							.mapToObj(String::valueOf)
							.toArray(String[]::new);
	
	private String [] selections = Arrays.copyOf(select.getResult(), select.getResult().length);

		//{"1", "2","3"};

	
	
	
		//	; 
    // constructor, to initialize t0e components 
    // with default values. 

    public Menu() {
		setTitle("Menu"); 
        setBounds(300, 90, 900, 750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        
        
        
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Menu"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(400, 30); 
        c.add(title); 
  
        repas = new JLabel("Repas"); 
        repas.setFont(new Font("Arial", Font.PLAIN, 20)); 
        repas.setSize(100, 20); 
        repas.setLocation(100, 150); 
        c.add(repas); 
  
        petitDejeuner = new JRadioButton("Petit dejeuner"); 
        petitDejeuner.setFont(new Font("Arial", Font.PLAIN, 15)); 
        petitDejeuner.setSelected(true); 
        petitDejeuner.setSize(120, 20); 
        petitDejeuner.setLocation(200, 150); 
        c.add(petitDejeuner); 
  
        dejeuner = new JRadioButton("Dejeuner"); 
        dejeuner.setFont(new Font("Arial", Font.PLAIN, 15)); 
        dejeuner.setSelected(false); 
        dejeuner.setSize(100, 20); 
        dejeuner.setLocation(325, 150); 
        c.add(dejeuner); 
        
        dinner = new JRadioButton("Dinner"); 
        dinner.setFont(new Font("Arial", Font.PLAIN, 15)); 
        dinner.setSelected(false); 
        dinner.setSize(70, 20); 
        dinner.setLocation(425, 150); 
        c.add(dinner); 
  
        gengp = new ButtonGroup(); 
        gengp.add(petitDejeuner); 
        gengp.add(dejeuner); 
        gengp.add(dinner); 
  
        date = new JLabel("Date"); 
        date.setFont(new Font("Arial", Font.PLAIN, 20)); 
        date.setSize(100, 20); 
        date.setLocation(100, 100); 
        c.add(date); 
  
        day = new JComboBox(days); 
        day.setFont(new Font("Arial", Font.PLAIN, 15)); 
        day.setSize(60, 20); 
        day.setLocation(200, 100); 
        c.add(day);
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(260, 100); 
        c.add(month); 
        
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 100); 
        c.add(year);
        
        produit = new JLabel("Produits"); 
        produit.setFont(new Font("Arial", Font.PLAIN, 20)); 
        produit.setSize(100, 20); 
        produit.setLocation(100, 200); 
        c.add(produit);  
        
        tproduit = new JList(selections);
       // tproduit.setSelectedIndex(1);
        tproduit.setFont(new Font("Arial", Font.PLAIN, 20));
//        System.out.println(produit.getSelectedValue());
        tproduit.setSize(150, 150); 
        tproduit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tproduit.setLocation(200, 200);
        c.add(tproduit);
 /*       tproduit.addListSelectionListener(
                new ListSelectionListener() {
                          Object element = tproduit.getSelectedValue();
                          tout.setText(element.toString());
                     }
                });*/
        

      
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 600); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 600); 
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(200, 650); 
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
    /**
     *
     */
    public void actionPerformed(ActionEvent e)
    { 
    	
        if (e.getSource() == sub) { 
        /*	tproduit.addListSelectionListener(
                    new ListSelectionListener() {
                         public void valueChanged(ListSelectionEvent e) {
                              Object element = tproduit.getSelectedValue();
                              tout.setText(element.toString());
                         }
                    });*/
        	
        	String data1; 
//            String data3;
        	List data2 = tproduit.getSelectedValuesList();
        	
            String data 
                = (String)day.getSelectedItem()+ "."+ (String)month.getSelectedItem() +"."+(String)year.getSelectedItem() + "\n"+
            "Vous avez consommé " + "\n";
          
            if (petitDejeuner.isSelected()) {
                data1 = "pour votre petit dejeuner" +"\n";
            }
            else {
            	if (dejeuner.isSelected()) {
                    data1 = "pour votre dejeuner"+"\n";
                }
            	else 
            		data1 = "pour votre dinner"+"\n";
            }
                          
			tout.setText(data + data1+data2); 
            tout.setEditable(false);  
            res.setText("Enregistré");
            System.out.println(Arrays.toString(select.getResult()));
            select.selectAllProd();
            } 
       
  
        else if (e.getSource() == reset) { 
        	 String def = ""; 
 //            tnom.setText(def); 
             res.setText(def); 
             tout.setText(def); 
  //           tlist.setSelectedIndex(0); 
             resadd.setText(def); 
           
        } 
    } 
}

