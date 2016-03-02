package e3value.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import e3value.diagram.edit.parts.E3ValueDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.E3valueEditPartFactory;
import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class E3valueEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public E3valueEditPartProvider() {
		super(new E3valueEditPartFactory(),
				E3valueVisualIDRegistry.TYPED_INSTANCE,
				E3ValueDiagramEditPart.MODEL_ID);
	}

}
