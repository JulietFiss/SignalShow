package signals.operation;

import java.awt.image.renderable.ParameterBlock;

import signals.core.CombineOpsRule;
import signals.core.DataGeneratorTypeModel;
import signals.core.Function;
import signals.core.Function2D;
import signals.core.FunctionFactory;
import signals.core.UnaryOperation;
import signals.gui.operation.DirectionOptionsPanel;
import signals.gui.operation.OperationOptionsPanel;

public class ReverseOp2D extends UnaryOperation implements Directional2DOperation {
	
	public ReverseOp2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReverseOp2D(ParameterBlock paramBlock, int priority) {
		super(paramBlock, priority);
		// TODO Auto-generated constructor stub
	}


	boolean x; //true if the derivative should be done in the x direction

	public ReverseOp2D(ParameterBlock paramBlock) {
		super(paramBlock, CombineOpsRule.UNARY_OP_TIER_2);
		x = true; 
	}
	
	public Function create( Function input ) {
		
		double[] real = input.getReal(); 
		double[] imag = input.getImaginary(); 
		
		boolean zeroCentered = input.isZeroCentered();
		
		String prefix = x ? "reverse_x(" : "reverse_y(";
		String name = prefix + input.getCompactDescriptor() + ")"; 
		
		int x_dimension = ((Function2D)input).getDimensionX();
		int y_dimension = ((Function2D)input).getDimensionY();
	
		double[] realOut = ArrayMath.reverse2D(real, x_dimension, y_dimension, x );
		double[] imagOut = ArrayMath.reverse2D(imag, x_dimension, y_dimension, x );

		return FunctionFactory.createFunction2D( realOut, imagOut, zeroCentered, name, 
				x_dimension, y_dimension ); 
			
	}

	@Override
	public OperationOptionsPanel getOptionsInterface() {
		return new DirectionOptionsPanel(this);
	}

	public void initTypeModel(DataGeneratorTypeModel model) {
		
		super.initTypeModel(model);
//		model.setLargeIcon("/operationIcons/ReverseLarge.png");
//		model.setSmallIcon("/operationIcons/ReverseSmall.png");
		model.setName("Reverse");
		
		model.setDocPath("/operationdoc/reverse.html");
	}

	@Override
	public String getOpIconPath() {

		return "/operationIcons/ReverseOp.png"; 
		
	}


	public boolean isXDirection() {
		
		return x;
	}


	public void setXDirection(boolean x) {
		this.x = x;
	}

	
}