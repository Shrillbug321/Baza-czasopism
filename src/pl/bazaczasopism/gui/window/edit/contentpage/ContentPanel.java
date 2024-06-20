package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JPanel;

public class ContentPanel extends JPanel
{
	public ContentPanel(JPanel panel)
	{
		add(new TablePanel());
		add(new ContentPanelInputs(panel));
	}
}
