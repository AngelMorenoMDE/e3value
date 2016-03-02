package e3value.diagram.part;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;

import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class E3valuePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createE3ValueModelsTools());
		paletteRoot.add(createE3ValueActorsTools());
		paletteRoot.add(createE3ValuePathTools());
		
		paletteRoot.add(createE3valueConnections2Group());
	}
	
	/**
	 * Creates "e3value" palette tool group
	 * @generated
	 */
	private PaletteContainer createE3ValueActorsTools()
	{
		PaletteDrawer paletteActors = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Actores");
		paletteActors.setId("e3ValueActorsToolGroup");
		paletteActors.add(createMarketSegment1CreationTool());
		paletteActors.add(createElementaryActor2CreationTool());
		paletteActors.add(createCompositeActor3CreationTool());
		paletteActors.add(createValueActivity13CreationTool());
		paletteActors.add(createValueObject7CreationTool());
		return paletteActors;
	}
	
	/**
	 * Creates "e3value" palette tool group
	 * @generated
	 */
	private PaletteContainer createE3ValuePathTools()
	{
		PaletteDrawer palettePathElements = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Elementos de Interconexión");
		palettePathElements.setId("e3ValuePathElementsToolGroup");
		palettePathElements.add(createValueInterface6CreationTool());
		palettePathElements.add(createStartStimulus4CreationTool());
		palettePathElements.add(createEndStimulus5CreationTool());
		
		
		palettePathElements.add(createAndFork8CreationTool());
		palettePathElements.add(createAndJoin9CreationTool());
		palettePathElements.add(createOrFork10CreationTool());
		palettePathElements.add(createOrJoin11CreationTool());
		
		return palettePathElements;
	}
	
	/**
	 * Creates "e3value" palette tool group
	 * @generated
	 */
	private PaletteContainer createE3ValueModelsTools() {

		PaletteDrawer paletteContainer = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Modelos");		
		
		paletteContainer.setId("e3ValueActorsModelsGroup"); //$NON-NLS-1$

		paletteContainer.add(createE3ValueModel12CreationTool());

		return paletteContainer;
	}

	/**
	 * Creates "e3value Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createE3valueConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(/*
				Messages.E3valueConnections2Group_title*/"Conectores");
		paletteContainer.setId("createE3valueConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConnectionElement1CreationTool());
		paletteContainer.add(createValueExchange2CreationTool());
		paletteContainer
				.add(createValueExchangeToValueObjectConnection3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMarketSegment1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MarketSegment1CreationTool_title,
				Messages.MarketSegment1CreationTool_desc,
				Collections
						.singletonList(E3valueElementTypes.MarketSegment_3008));
		entry.setId("createMarketSegment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.MarketSegment_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementaryActor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ElementaryActor2CreationTool_title,
				Messages.ElementaryActor2CreationTool_desc,
				Collections
						.singletonList(E3valueElementTypes.ElementaryActor_3009));
		entry.setId("createElementaryActor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ElementaryActor_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeActor3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CompositeActor3CreationTool_title,
				Messages.CompositeActor3CreationTool_desc,
				Collections
						.singletonList(E3valueElementTypes.CompositeActor_3016));
		entry.setId("createCompositeActor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.CompositeActor_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartStimulus4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.StartStimulus4CreationTool_title, null,
				Collections
						.singletonList(E3valueElementTypes.StartStimulus_3010));
		entry.setId("createStartStimulus4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.StartStimulus_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndStimulus5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EndStimulus5CreationTool_title, null,
				Collections.singletonList(E3valueElementTypes.EndStimulus_3011));
		entry.setId("createEndStimulus5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.EndStimulus_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueInterface6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ValueInterface6CreationTool_title, null,
				Collections
						.singletonList(E3valueElementTypes.ValueInterface_3001));
		entry.setId("createValueInterface6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ValueInterface_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueObject7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		
		types.add(E3valueElementTypes.ValueObject_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ValueObject7CreationTool_title, null, types);
		entry.setId("createValueObject7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ValueObject_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAndFork8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
				types.add(E3valueElementTypes.AndFork_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AndFork8CreationTool_title, null, types);
		entry.setId("createAndFork8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.AndFork_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAndJoin9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AndJoin9CreationTool_title, null,
				Collections.singletonList(E3valueElementTypes.AndJoin_3013));
		entry.setId("createAndJoin9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.AndJoin_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrFork10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.OrFork10CreationTool_title, null,
				Collections.singletonList(E3valueElementTypes.OrFork_3014));
		entry.setId("createOrFork10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.OrFork_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrJoin11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.OrJoin11CreationTool_title, null,
				Collections.singletonList(E3valueElementTypes.OrJoin_3015));
		entry.setId("createOrJoin11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.OrJoin_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createE3ValueModel12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.E3ValueModel12CreationTool_title, null,
				Collections
						.singletonList(E3valueElementTypes.E3ValueModel_2007));
		entry.setId("createE3ValueModel12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.E3ValueModel_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueActivity13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ValueActivity13CreationTool_title, null,
				Collections
						.singletonList(E3valueElementTypes.ValueActivity_3005));
		entry.setId("createValueActivity13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ValueActivity_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionElement1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConnectionElement1CreationTool_title,
				null,
				Collections
						.singletonList(E3valueElementTypes.ConnectionElement_4001));
		entry.setId("createConnectionElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ConnectionElement_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueExchange2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ValueExchange2CreationTool_title, null,
				Collections
						.singletonList(E3valueElementTypes.ValueExchange_4002));
		entry.setId("createValueExchange2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ValueExchange_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueExchangeToValueObjectConnection3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ValueExchangeToValueObjectConnection3CreationTool_title,
				null,
				Collections
						.singletonList(E3valueElementTypes.ValueExchangeHasValueObject_4005));
		entry.setId("createValueExchangeToValueObjectConnection3CreationTool"); //$NON-NLS-1$
		ImageDescriptor image = new ImageDescriptor() {
			
			@Override
			public ImageData getImageData() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		URL url = null;
	    try {
	    url = new URL(E3valueDiagramEditorPlugin.getInstance().getDescriptor().getInstallURL(),
	                  "icons/obj16/ValueExchangeHasValueObject.gif");
	    } catch (MalformedURLException e) {
	    }
	    image = ImageDescriptor.createFromURL(url);		
		
		entry.setSmallIcon(E3valueElementTypes
				.getImageDescriptor(E3valueElementTypes.ValueExchangeHasValueObject_4005));
		
		entry.setSmallIcon(image);
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
