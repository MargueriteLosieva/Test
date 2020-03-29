package application;

import javax.swing.*;

//import application.User.Genre;

import java.awt.*; 
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream; 
  
public class RegistrationForme 
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
    private JLabel dob; 
    private JComboBox day; 
    private JComboBox month; 
    private JComboBox year; 
    private JLabel poid; 
    private JComboBox tpoid; 
    private JLabel taille; 
    private JComboBox ttaille;
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
/*    int[] intDays = IntStream.range(1, 30).toArray();
	private String days [] = Arrays.stream(intDays)
							.mapToObj(String::valueOf)
							.toArray(String[]::new);*/
    
    private String days[] 
            = { 
            		"01", "02", "03", "04", "05", 
                    "06", "07", "08", "09", "10", 
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20","21","21","22","23","24","25","26","27","28","29", "30", "31"};
	
    private String months[] 
        = { 
        		"01", "02", "03", "04", "05", 
                "06", "07", "08", "09", "10", 
                "11", "12"
        		
        	/*	"Jan", "Feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec"*/
            }; 
    int[] intYears = IntStream.range(1900, 2020).toArray();
	private String years [] = Arrays.stream(intYears)
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
  /*  private final User user;
    public RegistrationForme(User user) 
    { 
		this.user = user;*/
    public RegistrationForme() {
		setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
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
        tnom.setSize(190, 20); 
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
        female.setLocation(275, 150); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("Né(e) le"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(100, 200); 
        c.add(dob); 
  
        day = new JComboBox(days); 
        day.setFont(new Font("Arial", Font.PLAIN, 15)); 
        day.setSize(50, 20); 
        day.setLocation(200, 200); 
        c.add(day); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 200); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 200); 
        c.add(year); 
        
        
        taille = new JLabel("Taille"); 
        taille.setFont(new Font("Arial", Font.PLAIN, 20)); 
        taille.setSize(100, 20); 
        taille.setLocation(100, 250); 
        c.add(taille);
        
       ttaille = new JComboBox(tailles); 
       ttaille.setFont(new Font("Arial", Font.PLAIN, 15)); 
       ttaille.setSize(50, 20); 
       ttaille.setLocation(200, 250); 
       c.add(ttaille); 
  
       
        poid = new JLabel("Poids"); 
        poid.setFont(new Font("Arial", Font.PLAIN, 20)); 
        poid.setSize(100, 20); 
        poid.setLocation(275, 250); 
        c.add(poid);
        
       tpoid = new JComboBox(poids); 
       tpoid.setFont(new Font("Arial", Font.PLAIN, 15)); 
       tpoid.setSize(50, 20); 
       tpoid.setLocation(350, 250); 
       c.add(tpoid); 
       
      
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
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
        String jour = (String) day.getSelectedItem();
        String mois = (String) month.getSelectedItem();
        String anee = (String) year.getSelectedItem();
        String tire = "-";
        String dateDeNaissance = anee + tire + mois+ tire + jour;
        LocalDate date = LocalDate.parse(dateDeNaissance);
        LocalDate today = LocalDate.now();
  //      LocalDate date = LocalDate.parse(dateDeNaissance.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
  //      LocalDate today = LocalDate.now();
        Period period = Period.between(date, today);
        int age = period.getYears();
        if (e.getSource() == sub) { 
                String data1; 
                String data3;
                String data 
                    = "Bonjour,  "
                      + tnom.getText() + "\n";
                String data2 
                = "DOB : "
                  + (String)day.getSelectedItem() 
                  + "/" + (String)month.getSelectedItem() 
                  + "/" + (String)year.getSelectedItem() 
                  + "\n";
                if (male.isSelected()) {
                    data1 = "Gender : Male"
                            + "\n"; 
                    double result = 88.36 + 13.4 *poid + 4.8 * taille  -5.7*age;
                    data3= Double.toString(result);
                }
                else {
                    data1 = "Gender : Female"
                            + "\n"; 
                    double result = 447.6 + 9.2 *poid + 3.1 * taille -4.3*age;
                    data3= Double.toString(result);
                }
                
                
               
				tout.setText(data + data1 + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
                User.getInstance().hashCode(); 
                User.getInstance().setNom(tnom.getText());
                User.getInstance().setPoids(Integer.parseInt((String) tpoid.getSelectedItem()));
                User.getInstance().setTaille(Integer.parseInt((String) ttaille.getSelectedItem()));
                User.getInstance().setDatedeNaissance(LocalDate.parse((String) year.getSelectedItem()+"-"+(String) month.getSelectedItem()+"-"+(String) day.getSelectedItem()));
                User.getInstance().setGenre(male.isSelected()); 
                User.getInstance().AfficherNorme();
  //      		System.out.println( User.getInstance().hashCode());
        		System.out.println( User.getInstance().toString());

            } 
       
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tnom.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            day.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def); 
           
        } 
    } 

   
} 