package signals.gui.datagenerator;

import java.util.ArrayList;
import java.util.HashMap;

import signals.core.Core;
import signals.core.DataGenerator;

@SuppressWarnings("serial")
public class CreateUnaryOperation1DPanel extends CreateOperationPanel {

	public CreateUnaryOperation1DPanel(GUIEventBroadcaster broadcaster) {
		super(broadcaster);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Class< ? extends DataGenerator>> getDataGeneratorList() {
		return Core.getDataGeneratorCollections().getUnary1DList();
	}

	@Override
	public HashMap<String, ArrayList<Class< ? extends DataGenerator>>> getDataGeneratorMap() {
		return Core.getDataGeneratorCollections().getUnary1DMap();
	}

}