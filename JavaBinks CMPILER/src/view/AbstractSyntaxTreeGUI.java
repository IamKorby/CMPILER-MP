package view;

import controller.SourceCodeChecker;
import org.antlr.v4.gui.TreeViewer;

import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;

public class AbstractSyntaxTreeGUI extends JFrame implements ChangeListener
{
	private JLabel labelScale;
	private JPanel jpanel;
	private JScrollPane scrollPane;
	private JSpinner spinnerScale;

	private SourceCodeChecker controller;

	private TreeViewer treeViewer;

	public AbstractSyntaxTreeGUI( SourceCodeChecker controller )
	{
		this.controller = controller;

		jpanel = new JPanel();
		jpanel.setBackground(Color.GRAY);
		jpanel.setSize(1300, 700);
		jpanel.setLayout(null);
		
		scrollPane = new JScrollPane(jpanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setSize(1300, 700);
		
		spinnerScale = new JSpinner();
		spinnerScale.setBounds(59, 11, 54, 20);
		spinnerScale.addChangeListener(this);
		jpanel.add(spinnerScale);
		
		labelScale = new JLabel("Scale:");
		labelScale.setForeground(Color.WHITE);
		labelScale.setBounds(10, 14, 46, 14);
		jpanel.add(labelScale);

		treeViewer = controller.getAbstractSyntaxTree();
		jpanel.add(treeViewer);

		this.setTitle("Java Binks - Abstract Syntax Tree");
		this.setSize(1300, 700);
		this.setContentPane(scrollPane);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setIconImage(new ImageIcon("src/view/Java Binks.jpg").getImage());
	}

	// CHANGE LISTENER - spinner scale
	@Override
	public void stateChanged(ChangeEvent arg0)
	{
		// TODO Auto-generated method stub
		int value = (int) spinnerScale.getValue();

		controller.setScale(value);
	}

	public void update()
	{
		treeViewer = controller.getAbstractSyntaxTree();
	}
}
