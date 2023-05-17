package main.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.GameEnvironment;
import main.UserInterface;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImprovingAthleteGui implements UserInterface{

	private JFrame frmImproving;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {GameEnvironment gameEnvironment
//			public void run() {
//				try {
//					ImprovingAthleteGui window = new ImprovingAthleteGui();
//					window.frmImproving.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	GameEnvironment gameEnvironment;

	/**
	 * Create the application.
	 */
	public ImprovingAthleteGui(GameEnvironment gameEnvironment) {
		setup(gameEnvironment);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void setup(GameEnvironment gameEnvironment) {
		frmImproving = new JFrame();
		frmImproving.setSize(1650,1080);
		frmImproving.setLocation((1925 - frmImproving.getWidth()) / 2, (1080 - frmImproving.getHeight()) / 2);
		frmImproving.getContentPane().setLayout(null);
		
		JButton improveButton = new JButton("Improve!");
		improveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		improveButton.setFont(new Font("Dialog", Font.BOLD, 36));
		improveButton.setBounds(885, 716, 412, 127);
		frmImproving.getContentPane().add(improveButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(301, 122, 457, 721);
		frmImproving.getContentPane().add(panel);
		panel.setLayout(new GridLayout(7, 1, 0, 0));
		
		JButton athlete1 = new JButton("athlete1");
		athlete1.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete1);
		
		JButton athlete2 = new JButton("athlete2");
		athlete2.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete2);
		
		JButton athlete3 = new JButton("athlete3");
		athlete3.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete3);
		
		JButton athlete4 = new JButton("athlete4");
		athlete4.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete4);
		
		JButton athlete5 = new JButton("athlete5");
		athlete5.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete5);
		
		JButton athlete6 = new JButton("athlete6");
		athlete6.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete6);
		
		JButton athlete7 = new JButton("athlete7");
		athlete7.setFont(new Font("Dialog", Font.BOLD, 22));
		athlete7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(athlete7);
		
		JPanel setAthleteInfoPanel = new JPanel();
		setAthleteInfoPanel.setLayout(null);
		setAthleteInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		setAthleteInfoPanel.setBounds(885, 122, 412, 562);
		frmImproving.getContentPane().add(setAthleteInfoPanel);
		
		JLabel athleteInfoTitleLabel = new JLabel("<<Athelte Information>>");
		athleteInfoTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		athleteInfoTitleLabel.setFont(new Font("Dialog", Font.BOLD, 23));
		athleteInfoTitleLabel.setBounds(12, 12, 388, 51);
		setAthleteInfoPanel.add(athleteInfoTitleLabel);
		
		JLabel lblChooseOneAthlete = new JLabel("<html>Your team has been trained for a week! You can pick one athlete to improve significantly!</html>");
		lblChooseOneAthlete.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblChooseOneAthlete.setBounds(22, 118, 366, 418);
		setAthleteInfoPanel.add(lblChooseOneAthlete);

	}
	public void closeWindow() {
		frmImproving.dispose();
	}
	
	public void finishedWindow() {
		gameEnvironment.closeImprovingScreen(this);
	}
	
}
