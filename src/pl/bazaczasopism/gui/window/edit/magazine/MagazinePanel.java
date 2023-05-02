package pl.bazaczasopism.gui.window.edit.magazine;

import javax.swing.JPanel;

public class MagazinePanel extends JPanel{
	public MagazinePanel(JPanel panel)
	{
		add(new TablePanel());
		add(new MagazinePanelInputs(panel));
	}
}
