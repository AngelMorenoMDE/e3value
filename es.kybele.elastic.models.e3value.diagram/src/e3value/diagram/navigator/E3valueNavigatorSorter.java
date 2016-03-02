package e3value.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class E3valueNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof E3valueNavigatorItem) {
			E3valueNavigatorItem item = (E3valueNavigatorItem) element;
			return E3valueVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
