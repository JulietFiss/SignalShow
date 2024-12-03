package signals.functionterm;

import java.awt.image.renderable.ParameterBlock;


public class SaltAndPepperNoiseFunctionTerm2D extends NoiseFunctionTerm2D {

	public SaltAndPepperNoiseFunctionTerm2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaltAndPepperNoiseFunctionTerm2D(ParameterBlock paramBlock) {
		super(paramBlock);
	}

	@Override
	public NoiseFunctionTerm1D getNoise1DInstance() {

		return (NoiseFunctionTerm1D) (new SaltAndPepperNoiseFunctionTerm1D(null)).getDefaultInstance();
	}

}