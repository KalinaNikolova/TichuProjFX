package DarkTichu.controller;

import DarkTichu.model.DarkTichuModel;
import DarkTichu.view.DarkTichuView;

public class DarkTichuController {
	private DarkTichuModel model;
	private DarkTichuView view;

	public DarkTichuController(DarkTichuModel model, DarkTichuView view) {
		this.model = model;
		this.view = view;
	}	
}

