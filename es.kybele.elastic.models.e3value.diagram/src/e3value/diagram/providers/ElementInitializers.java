package e3value.diagram.providers;

import e3value.diagram.part.E3valueDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = E3valueDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			E3valueDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
