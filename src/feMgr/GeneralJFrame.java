package feMgr;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import FeBeCommonData.FeBeData;

import javax.swing.JLabel;

public class GeneralJFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable Clienti;
	private JTable Indirizzi;
	private JLabel lblUser;
	private JLabel lblHost;
	private GeneralJFrame generalJFrameRef;
	private FeWindowMgr feWindowMgrCallBackObj;
	 
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 */
	public GeneralJFrame(FeWindowMgr feWindowMgrCallBackObj) 
	{
		
		this.setFeWindowMgrCallBackObj(feWindowMgrCallBackObj); 
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				System.out.println("GeneralJFrame-mouseClicked");
			}
		});
		
		
		generalJFrameRef =  (this);
		setTitle("GeneralJframe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 405, 589, 14);
		contentPane.add(progressBar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 79, 589, 329);
		contentPane.add(tabbedPane);
		contentPane.add(tabbedPane);
		
		Clienti = new JTable();
		Clienti.setModel(new DefaultTableModel(
			new Object[][] {
				{1, 2, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nome", "Cognome", "Codice Fiscale", "Indirizzo", "New column", "New column", "New column", "New column"
			}
		));
		Clienti.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Clienti", null, Clienti, null);
		
		Indirizzi = new JTable();
		tabbedPane.addTab("Indirizzi", null, Indirizzi, null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//generalJFrameRef.setVisible(false);
				System.out.println("mouseClickedOK:" + e.toString());
				
				System.out.println("mouseClickedCancel:" + e.toString());
				
				System.out.println("  --> mouseClicked:" + generalJFrameRef.getClass());
				FeBeData.getInstance().setCaller(generalJFrameRef.getClass().toString());
				FeBeData.getInstance().setCallerC(generalJFrameRef.getClass());
				
				FeBeData.getInstance().setMouseEvt(e);
				
				feWindowMgrCallBackObj.callBackMethod(generalJFrameRef,FeBeData.getInstance());
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//generalJFrameRef.setVisible(false);
				System.out.println("BUTTON actionPerformed:" + arg0.toString());
			}
		});
		
		btnNewButton.setBounds(487, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//generalJFrameRef.setVisible(false);
				//generalJFrameRef.dispose();
				System.out.println("mouseClickedCancel:" + e.toString());
				
				System.out.println("  --> mouseClicked:" + generalJFrameRef.getClass());
				FeBeData.getInstance().setCaller(generalJFrameRef.getClass().toString());
				FeBeData.getInstance().setCallerC(generalJFrameRef.getClass());
				
				System.out.println("mouseClickedCancel:" + e.toString());
				
				System.out.println("  --> mouseClicked:" + generalJFrameRef.getClass());
				FeBeData.getInstance().setCaller(generalJFrameRef.getClass().toString());
				FeBeData.getInstance().setCallerC(generalJFrameRef.getClass());
				
				FeBeData.getInstance().setMouseEvt(e);
				
				feWindowMgrCallBackObj.callBackMethod(generalJFrameRef,FeBeData.getInstance());
				
				generalJFrameRef.setVisible(false);
				generalJFrameRef.dispose();
				
				
				
				
			}
		});
		
		btnNewButton_1.setBounds(487, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(65, 68, 54, -25);
		contentPane.add(table);
		
		lblUser = new JLabel("User");
		lblUser.setBounds(10, 15, 46, 14);
		contentPane.add(lblUser);
		
		lblHost = new JLabel("Host");
		lblHost.setBounds(73, 15, 46, 14);
		contentPane.add(lblHost);
	}
	public JTable getClienti() {
		return Clienti;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("FRAME actionPerformed:" + e.toString());
		
		
		
		
		System.out.println("  --> actionPerformed:" + this.getClass());
		FeBeData.getInstance().setCaller(this.getClass().toString());
		FeBeData.getInstance().setCallerC(this.getClass());
		
		feWindowMgrCallBackObj.callBackMethod(this,FeBeData.getInstance());
		
		
		
	}
	public FeWindowMgr getFeWindowMgrCallBackObj() {
		return feWindowMgrCallBackObj;
	}
	public void setFeWindowMgrCallBackObj(FeWindowMgr feWindowMgrCallBackObj) {
		this.feWindowMgrCallBackObj = feWindowMgrCallBackObj;
	}
	
	 
}
