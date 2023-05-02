package pl.bazaczasopism.gui.window.edit.contentpage;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.window.edit.contentpage.TablePanel;

public class ContentPanel extends JPanel
{
	public ContentPanel(JPanel panel)
	{
		add( new TablePanel(panel));
		add( new ContentPanelInputs(panel));
	}
}
