package signals.gui.datagenerator;

import java.util.ArrayList;
import java.util.HashMap;

import signals.core.Core;
import signals.core.DataGenerator;

@SuppressWarnings("serial")
public class CreateBinaryOperation2DPanel extends CreateOperationPanel {

	public CreateBinaryOperation2DPanel(GUIEventBroadcaster broadcaster) {
		super(broadcaster);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Class< ? extends DataGenerator>> getDataGeneratorList() {
		return Core.getDataGeneratorCollections().getBinary2DList();
	}

	@Override
	public HashMap<String, ArrayList<Class< ? extends DataGenerator>>> getDataGeneratorMap() {
		return Core.getDataGeneratorCollections().getBinary2DMap();
	}

}