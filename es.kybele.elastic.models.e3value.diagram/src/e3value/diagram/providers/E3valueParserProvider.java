package e3value.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import e3value.E3valuePackage;
import e3value.diagram.edit.parts.CompositeActorNameEditPart;
import e3value.diagram.edit.parts.ElementaryActorNameEditPart;
import e3value.diagram.edit.parts.MarketSegmentNameEditPart;
import e3value.diagram.edit.parts.ValueActivityNameEditPart;
import e3value.diagram.edit.parts.ValueObjectName3EditPart;
import e3value.diagram.parsers.MessageFormatParser;
import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class E3valueParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser marketSegmentName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getMarketSegmentName_5009Parser() {
		if (marketSegmentName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { E3valuePackage.eINSTANCE
					.getBusinessActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			marketSegmentName_5009Parser = parser;
		}
		return marketSegmentName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueActivityName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getValueActivityName_5005Parser() {
		if (valueActivityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { E3valuePackage.eINSTANCE
					.getValueActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueActivityName_5005Parser = parser;
		}
		return valueActivityName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser elementaryActorName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getElementaryActorName_5003Parser() {
		if (elementaryActorName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { E3valuePackage.eINSTANCE
					.getBusinessActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elementaryActorName_5003Parser = parser;
		}
		return elementaryActorName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeActorName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActorName_5004Parser() {
		if (compositeActorName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { E3valuePackage.eINSTANCE
					.getBusinessActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeActorName_5004Parser = parser;
		}
		return compositeActorName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueObjectName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getValueObjectName_5013Parser() {
		if (valueObjectName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { E3valuePackage.eINSTANCE
					.getValueObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueObjectName_5013Parser = parser;
		}
		return valueObjectName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MarketSegmentNameEditPart.VISUAL_ID:
			return getMarketSegmentName_5009Parser();
		case ValueActivityNameEditPart.VISUAL_ID:
			return getValueActivityName_5005Parser();
		case ElementaryActorNameEditPart.VISUAL_ID:
			return getElementaryActorName_5003Parser();
		case CompositeActorNameEditPart.VISUAL_ID:
			return getCompositeActorName_5004Parser();
		case ValueObjectName3EditPart.VISUAL_ID:
			return getValueObjectName_5013Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(E3valueVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(E3valueVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (E3valueElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
