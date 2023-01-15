package feMgr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import FeBeCommonData.FeBeData;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.InetAddress;

public class FeWindowMgr {

	public JFrame frame;
	private static FeBeData feBeData;
	private static GeneralJFrame generalJframe;
	
	private static LoginWdw window2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					System.out.println("Prima:" + FeBeData.getInstance().getCaller());
					FeBeData.getInstance().setCaller("FeMgr Constructor");
					
					System.getProperty("user.name");
					
					System.out.println("1)" + FeBeData.getInstance().getCaller() );
					FeWindowMgr window = new FeWindowMgr();
					System.out.println("2)" + FeBeData.getInstance().getCaller() );
					System.out.println("2.1)" + System.getProperty("user.name")  );
					System.out.println("2.2)" + System.getenv("USERNAME")   );
					System.out.println("2.3)" + InetAddress.getLocalHost().getHostName());
					
					FeBeData.getInstance().setPcName(InetAddress.getLocalHost().getHostName());
					 
					window.frame.setVisible(false);
					
					window2 = new LoginWdw(window);
					System.out.println("3)" + FeBeData.getInstance().getCaller() );
					window2.getFrmLoginForm().setVisible(true);
					System.out.println("4)" + FeBeData.getInstance().getCaller() );
					
					System.out.println("Dopo:" + FeBeData.getInstance().getCaller());
					
					generalJframe = new GeneralJFrame(window);
					generalJframe.setVisible(false);
					
					
					System.out.println("Dopo --------------------------------------> :");
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public FeWindowMgr() {
		initialize();
		System.out.println("FeWindowMgr Prima:" + FeBeData.getInstance().getCaller());
		FeBeData.getInstance().setCaller("FeWindowMgr Constructor1");
		System.out.println("FeWindowMgr Dopo:" + FeBeData.getInstance().getCaller());
	}

	 

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				//System.out.println("FeWindowMgr mouseEntered:" + e.toString());
				System.out.println("FeWindowMgr GetUserpwd:" + FeBeData.getInstance().getUserPwd().toString());
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void callBackMethod(Object whoIsCallingMeBack, FeBeData feBeData)
	{
		System.out.println("1  FeWindowMgr callBackMethod whoIsCallingMeBack	:" + whoIsCallingMeBack.toString());
		System.out.println("2 FeWindowMgr callBackMethod whoIsCallingMeBack	:" + whoIsCallingMeBack.getClass());
		//System.out.println("FeWindowMgr callBackMethod whoIsCallingMeBack	:" + whoIsCallingMeBack.getClassC());
		//System.out.println("3 FeWindowMgr callBackMethod feBeData				:" + FeBeData.getInstance().toString());
		System.out.println("FeWindowMgr callBackMethod FeBeData.getInstance().getCaller				:" + FeBeData.getInstance().getCaller());
		 
		System.out.println("FeWindowMgr callBackMethod feBeData				:" + FeBeData.getInstance().getCallerC());
		
		System.out.println("FeWindowMgr callBackMethod feBeData				:" + FeBeData.getInstance().toString());
		 
		generalJframe.setVisible(true);
		
		
		
	}

	
	
	

}
