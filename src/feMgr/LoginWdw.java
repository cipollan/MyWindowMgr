package feMgr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import FeBeCommonData.FeBeData;
import common.UserMgr;
import model.User;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class LoginWdw {

	private JFrame 		frmLoginForm;
	private JTextField textFieldUserLogin;
	private JTextField textFieldUserPassword;
	private FeWindowMgr feWindowMgrCallBackObj;
	
	

	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the application.
	 */

	public LoginWdw(FeWindowMgr feWindowMgrCallBackObj) 
	{
		 
		initialize();
		System.out.println("LoginWdw Prima:" + FeBeData.getInstance().getCaller());
		FeBeData.getInstance().setCaller("LoginWdw Constructor");
		System.out.println("LoginWdw Dopo" + FeBeData.getInstance().getCaller());
		this.setCallBackObj(feWindowMgrCallBackObj);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmLoginForm(new JFrame());
		getFrmLoginForm().setTitle("Login Form");
		getFrmLoginForm().setBounds(100, 100, 253, 118);
		getFrmLoginForm().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmLoginForm().getContentPane().setLayout(null);
		
		textFieldUserLogin = new JTextField();
		textFieldUserLogin.setToolTipText("Username");
		textFieldUserLogin.setBounds(22, 11, 109, 20);
		getFrmLoginForm().getContentPane().add(textFieldUserLogin);
		textFieldUserLogin.setColumns(10);
		
		textFieldUserPassword = new JTextField();
		textFieldUserPassword.setToolTipText("Password");
		textFieldUserPassword.setBounds(22, 46, 109, 20);
		getFrmLoginForm().getContentPane().add(textFieldUserPassword);
		textFieldUserPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				System.out.println("Begin --> mouseClicked:" + arg0.toString());
				FeBeData.getInstance().setCaller("LoginWdw mouseClicked");
				FeBeData.getInstance().setCallerName("LoginWdw");
				FeBeData.getInstance().setUserLogin(textFieldUserLogin.getText().toString());
				FeBeData.getInstance().setUserPwd(textFieldUserPassword.getText().toString());
				UserMgr userMgr = new UserMgr(new User(textFieldUserLogin.getText().toString(),textFieldUserPassword.getText().toString()));
				
				User u = userMgr.verifyUser();
				
				
				if (u.isValid())
				{
					frmLoginForm.setVisible(false);
					FeBeData.getInstance().setUser(userMgr.getUser());
					
					System.out.println("  --> mouseClicked:" + this.getClass());
					FeBeData.getInstance().setCaller(this.getClass().toString());
					FeBeData.getInstance().setCallerC(this.getClass());
					
					feWindowMgrCallBackObj.callBackMethod(frmLoginForm,FeBeData.getInstance());
					
					
				}
				else
				{
					
				}
					
			}
		});
		
		btnNewButton.setToolTipText("Click To Confirm");
		btnNewButton.setBounds(155, 45, 72, 23);
		getFrmLoginForm().getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("PC");
		lblNewLabel.setBounds(155, 14, 46, 14);
		frmLoginForm.getContentPane().add(lblNewLabel);
	}

	public FeWindowMgr getCallBackObj() {
		return feWindowMgrCallBackObj;
	}

	public void setCallBackObj(FeWindowMgr feWindowMgr) {
		this.feWindowMgrCallBackObj = feWindowMgr;
	}

	public JFrame getFrmLoginForm() {
		return frmLoginForm;
	}

	public void setFrmLoginForm(JFrame frmLoginForm) {
		this.frmLoginForm = frmLoginForm;
	}
}
