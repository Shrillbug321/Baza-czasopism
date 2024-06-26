package pl.bazaczasopism.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabeledTextField extends JPanel
{
	private TextField textField = new TextField();
	public LabeledTextField(String label)
	{
		add(new JLabel(label));
		setLayout( new GridLayout(2, 1) );
		add(textField);
	}
	public LabeledTextField(String label, boolean editable)
	{
		textField.setEditable(editable);
		add(new JLabel(label));
		setLayout( new GridLayout(2, 1) );
		add(textField);
	}
	
	public String getText()
	{
		return textField.getText();
	}
	
	public void setText(String text)
	{
		textField.setText(text);
	}
}
