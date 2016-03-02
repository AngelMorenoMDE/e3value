package e3value.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import e3value.diagram.providers.E3valueElementTypes;
import e3value.diagram.providers.E3valueModelingAssistantProvider;

/**
 * @generated
 */
public class E3valueModelingAssistantProviderOfElementaryActorEditPart extends
		E3valueModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(E3valueElementTypes.ValueInterface_3001);
		return types;
	}

}
