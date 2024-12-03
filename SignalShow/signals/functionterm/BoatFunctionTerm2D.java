package signals.functionterm;

import java.awt.image.renderable.ParameterBlock;

import javax.media.jai.Interpolation;
import javax.media.jai.InterpolationBilinear;

import signals.core.DataGeneratorTypeModel;

public class BoatFunctionTerm2D extends PredefinedImageFunctionTerm2D {

	public BoatFunctionTerm2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoatFunctionTerm2D(ParameterBlock paramBlock) {
		super(paramBlock);
	}

	/* (non-Javadoc)
	 * @see signals.core.ImageFunctionTerm2D#initTypeModel(signals.core.DataGeneratorTypeModel)
	 */
	@Override
	public void initTypeModel(DataGeneratorTypeModel model) {
		super.initTypeModel(model);
		
		Object[] source_defaults = { "/images/boat.png" };
		
		model.setSourceDefaults( source_defaults );
		
//		model.setLargeIcon("/functionIcons/Boat2DLarge.png");
//		model.setSmallIcon("/functionIcons/Boat2DSmall.png");
		model.setName("Boat");
	}

	@Override
	public Interpolation getInterpolation() {
		return new InterpolationBilinear();
	}
	
	@Override
	public String getEquation(String[] variables) {
		return amplitudeMultiplierString() + "Boat"; 
	}
}