package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;

import controller.FileReader;
import controller.SourceCodeChecker;
import custom_codes.CheckerResult;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class MainGUI extends JFrame implements ActionListener, DocumentListener, FocusListener, KeyListener, MouseListener, WindowListener
{
	private ButtonGroup radioButtonGroup;
	private JButton buttonFile, buttonAST;
	private JLabel labelLog;
	private JPanel jpanel;
	private JRadioButton rdbtnInput, rdbtnFile;
	private JScrollPane scrollPaneCode, scrollPaneLog;
	private JTextArea textAreaCode, textAreaLine, textAreaLog;
	private JTextField textFieldDirectory;
	private LinePainter linePainter;
	private JButton buttonCompile;
	
	private int caretStart;
	private boolean activeASTWindow = false;
	private String inputSourceCode = "";

	private SourceCodeChecker controller;

	private AbstractSyntaxTreeGUI abstractSyntaxTreeGUI;
	
	public MainGUI( SourceCodeChecker controller )
	{
		this.controller = controller;
		this.controller.setView(this);

		jpanel = new JPanel();
		jpanel.setBackground(Color.GRAY);
		jpanel.setSize(1300, 700);
		jpanel.setLayout(null);
		
		rdbtnInput = new JRadioButton("Input");
		rdbtnInput.setForeground(Color.WHITE);
		rdbtnInput.setBackground(Color.GRAY);
		rdbtnInput.setBounds(6, 7, 75, 23);
		rdbtnInput.setSelected(true);
		rdbtnInput.addActionListener(this);
		jpanel.add(rdbtnInput);
		
		rdbtnFile = new JRadioButton("File");
		rdbtnFile.setForeground(Color.WHITE);
		rdbtnFile.setBackground(Color.GRAY);
		rdbtnFile.setBounds(85, 7, 80, 23);
		rdbtnFile.addActionListener(this);
		jpanel.add(rdbtnFile);
		
		// group the radio buttons
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(rdbtnFile);
		radioButtonGroup.add(rdbtnInput);
		
		textFieldDirectory = new JTextField();
		textFieldDirectory.setBackground(Color.GRAY);
		textFieldDirectory.setForeground(Color.WHITE);
		textFieldDirectory.setBounds(171, 8, 240, 20);
		textFieldDirectory.setColumns(10);
		textFieldDirectory.setMargin(new Insets(0, 3, 0, 0));
		textFieldDirectory.setCaretColor(Color.WHITE);
		textFieldDirectory.addFocusListener(this);
		jpanel.add(textFieldDirectory);
		
		buttonFile = new JButton("...");
		buttonFile.setForeground(Color.BLACK);
		buttonFile.setBounds(421, 7, 45, 23);
		buttonFile.addActionListener(this);
		jpanel.add(buttonFile);
		
		buttonCompile = new JButton("Compile");
		buttonCompile.setBounds(476, 7, 89, 23);
		buttonCompile.addActionListener(this);
		jpanel.add(buttonCompile);
		
		buttonAST = new JButton("Abstract Syntax Tree");
		buttonAST.setBounds(575, 7, 155, 23);
		buttonAST.setEnabled(false);
		buttonAST.addActionListener(this);
		jpanel.add(buttonAST);
		
		textAreaLine = new JTextArea("1");
		textAreaLine.setFont(new Font("Courier New", Font.PLAIN, 13));
		textAreaLine.setForeground(Color.WHITE);
		textAreaLine.setBackground(Color.DARK_GRAY);
		textAreaLine.setBounds(6, 35, 40, 470);
		textAreaLine.setMargin(new Insets(3, 2, 0, 0));
		textAreaLine.setEditable(false);
		
		textAreaCode = new JTextArea();
		textAreaCode.setFont(new Font("Courier New", Font.PLAIN, 13));
		textAreaCode.setForeground(Color.WHITE);
		textAreaCode.setBackground(Color.DARK_GRAY);
		textAreaCode.setTabSize(3);
		textAreaCode.setMargin(new Insets(3, 10, 10, 10));
		textAreaCode.setCaretColor(Color.WHITE);
		textAreaCode.addKeyListener(this);
		textAreaCode.addMouseListener(this);
		textAreaCode.getDocument().addDocumentListener(this);
		
		scrollPaneCode = new JScrollPane(textAreaCode, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneCode.setBounds(6, 35, 1278, 470);
		scrollPaneCode.setRowHeaderView(textAreaLine);
		jpanel.add(scrollPaneCode);
		
		linePainter = new LinePainter(textAreaCode, new Color(149, 165, 166));
		
		labelLog = new JLabel("Log");
		labelLog.setForeground(Color.WHITE);
		labelLog.setBounds(8, 516, 46, 14);
		jpanel.add(labelLog);
		
		textAreaLog = new JTextArea();
		textAreaLog.setFont(new Font("Courier New", Font.PLAIN, 13));
		textAreaLog.setForeground(Color.WHITE);
		textAreaLog.setBackground(Color.DARK_GRAY);
		textAreaLog.setMargin(new Insets(3, 10, 10, 10));
		textAreaLog.setCaretColor(Color.WHITE);
		scrollPaneLog = new JScrollPane(textAreaLog, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneLog.setBounds(6, 537, 1278, 123);
		jpanel.add(scrollPaneLog);
		
		this.setTitle("Java Binks 1.0");
		this.setSize(1300, 700);
		this.setContentPane(jpanel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("src/view/Java Binks.jpg").getImage());
		textAreaCode.requestFocusInWindow();
	}

	// ACTION LISTENER - buttons and radio buttons
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if( e.getSource() == rdbtnInput )
		{
			textAreaCode.setText(inputSourceCode);
		}
		else if( e.getSource() == rdbtnFile )
		{
			// save copy of the data of input
			inputSourceCode = textAreaCode.getText().toString();
			
			readFile();
		}
		else if( e.getSource() == buttonFile )
		{
			if( chooseFile() )
			{
				readFile();
			}	
		}
		else if( e.getSource() == buttonCompile )
		{
			//TODO: Call lexer, parser
			checkCode();
		}
		else if( e.getSource() == buttonAST )
		{
			abstractSyntaxTreeGUI = new AbstractSyntaxTreeGUI(controller);
			abstractSyntaxTreeGUI.addWindowListener(this);
			buttonAST.setEnabled(false);
			buttonAST.setToolTipText("Only one Abstract Syntax Tree Window may be open at a time.");
			activeASTWindow = true;
		}
	}

	private boolean chooseFile()
	{
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(getParent());
		if(returnVal == JFileChooser.APPROVE_OPTION) 
		{
			textFieldDirectory.setText(chooser.getSelectedFile().getAbsolutePath());
			rdbtnFile.setSelected(true);
			return true;
		}
		return false;
	}
	
	private void readFile()
	{
		String sourceCode = "";
		sourceCode = FileReader.read(textFieldDirectory.getText().toString());
		
		if( sourceCode == null )
		{
			textAreaCode.setText("");
			JOptionPane.showMessageDialog(null, "File not found.");
		}
		else
		{
			textAreaCode.setText(sourceCode);
			textAreaCode.setCaretPosition(0);
			checkCode();
		}
	}
	
	// DOCUMENT LISTENER - source code text area
	@Override
	public void changedUpdate(DocumentEvent e)
	{
		// TODO Auto-generated method stub
		textAreaLine.setText(getText());
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		// TODO Auto-generated method stub
		textAreaLine.setText(getText());
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		// TODO Auto-generated method stub
		textAreaLine.setText(getText());
	}

	private String getText()
	{
		int caretPosition = textAreaCode.getDocument().getLength();
		Element root = textAreaCode.getDocument().getDefaultRootElement();
		String text = "1" + System.getProperty("line.separator");
		for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
			text += i + System.getProperty("line.separator");
		}
		return text;
	}
	
	// FOCUS LISTENER - text field
	@Override
	public void focusGained(FocusEvent e)
	{
		// TODO Auto-generated method stub
		if( e.getSource() == textFieldDirectory )
		{
			textFieldDirectory.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.YELLOW));
		}
	}

	@Override
	public void focusLost(FocusEvent e)
	{
		// TODO Auto-generated method stub
		if( e.getSource() == textFieldDirectory )
		{
			textFieldDirectory.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
		}
	}

	// KEY LISTENER - to update the abstract syntax tree whenever the user modifies the file
	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		//checkCode();
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		checkCode();
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		checkCode();
	}

	public void checkCode()
	{
		String input = textAreaCode.getText().toString();

		CheckerResult checkerResult = controller.check(input);

		if( checkerResult == CheckerResult.NO_ERROR )
		{
			textAreaLog.setText("No Lexical and Syntactical Errors.\n\nThe abstract syntax tree can now be viewed.");

			if( abstractSyntaxTreeGUI != null )
			{
				abstractSyntaxTreeGUI.update();
			}

			if( !activeASTWindow )
			{
				buttonAST.setEnabled(true);
			}
		}
		else if( checkerResult == CheckerResult.LEXICAL_ERROR )
		{
			textAreaLog.setText(controller.getLexicalError());
			buttonAST.setEnabled(false);
		}
		else if( checkerResult == CheckerResult.SYNTAX_ERROR )
		{
			textAreaLog.setText(controller.getSyntaxError());
			buttonAST.setEnabled(false);
		}
	}

	// MOUSE LISTENER
	@Override
	public void mouseClicked(MouseEvent arg0){}

	@Override
	public void mouseEntered(MouseEvent arg0){}

	@Override
	public void mouseExited(MouseEvent arg0){}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
//		caretStart = textAreaCode.getCaretPosition();
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
//		int caretEnd = textAreaCode.getCaretPosition();
//		
//		Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
//		try
//		{
//			textAreaCode.getHighlighter().addHighlight(caretStart, caretEnd, painter);
//		}
//		catch (BadLocationException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void windowActivated(WindowEvent e){}

	@Override
	public void windowClosed(WindowEvent e){}

	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		if( e.getSource() == abstractSyntaxTreeGUI )
		{
			activeASTWindow = false;
			buttonAST.setEnabled(true);
			buttonAST.setToolTipText(null);
		}
	}

	@Override
	public void windowDeactivated(WindowEvent e){}

	@Override
	public void windowDeiconified(WindowEvent e){}

	@Override
	public void windowIconified(WindowEvent e){}

	@Override
	public void windowOpened(WindowEvent e){}
}
