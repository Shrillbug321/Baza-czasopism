package pl.bazaczasopism.gui.window.edit;

import javax.swing.JPanel;

import pl.bazaczasopism.gui.window.edit.contentpage.AddContentPanelButton;
import pl.bazaczasopism.gui.window.edit.magazine.AddMagazinePanelButton;
import pl.bazaczasopism.gui.window.edit.number.AddNumberPanelButton;
import pl.bazaczasopism.gui.window.edit.publisher.AddPublisherPanelButton;

public class WhatPanel extends JPanel
{
	public WhatPanel()
	{
		add(new AddPublisherPanelButton("Wydawnictwo", this));
		add(new AddMagazinePanelButton("Czasopismo", this));
		add(new AddNumberPanelButton("Numer", this));
		add(new AddContentPanelButton("Spis treści", this));
	}
}
