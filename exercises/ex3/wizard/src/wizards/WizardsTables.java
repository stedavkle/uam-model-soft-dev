/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /wizard/wizards.ecore
 * using:
 *   /wizard/wizards.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package wizards;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import wizards.WizardsPackage;
// import wizards.WizardsTables;

/**
 * WizardsTables provides the dispatch tables for the wizards for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class WizardsTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(WizardsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid__s_ejemplo_s_metamodel_s_wizards_ecore = IdManager.getNsURIPackageId("/ejemplo/metamodel/wizards.ecore", null, WizardsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Button = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Button", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CheckBox = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("CheckBox", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = WizardsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CloseButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("CloseButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EOperation = WizardsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EOperation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NavButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("NavButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ReturnButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("ReturnButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ShowButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("ShowButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TextField = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("TextField", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Wizard = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Wizard", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = WizardsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Button = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_Button);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Wizard = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_Wizard);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TextField = TypeId.ORDERED_SET.getSpecializedId(WizardsTables.CLSSid_TextField);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Button = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_Button);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_Page);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			WizardsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Button = new EcoreExecutorType(WizardsPackage.Literals.BUTTON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _CheckBox = new EcoreExecutorType(WizardsPackage.Literals.CHECK_BOX, PACKAGE, 0);
		public static final EcoreExecutorType _CloseButton = new EcoreExecutorType(WizardsPackage.Literals.CLOSE_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _Field = new EcoreExecutorType(WizardsPackage.Literals.FIELD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NavButton = new EcoreExecutorType(WizardsPackage.Literals.NAV_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(WizardsPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _ReturnButton = new EcoreExecutorType(WizardsPackage.Literals.RETURN_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _ShowButton = new EcoreExecutorType(WizardsPackage.Literals.SHOW_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _TextField = new EcoreExecutorType(WizardsPackage.Literals.TEXT_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _Wizard = new EcoreExecutorType(WizardsPackage.Literals.WIZARD, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Button,
			_CheckBox,
			_CloseButton,
			_Field,
			_NavButton,
			_Page,
			_ReturnButton,
			_ShowButton,
			_TextField,
			_Wizard
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Button__Button = new ExecutorFragment(Types._Button, WizardsTables.Types._Button);
		private static final ExecutorFragment _Button__Field = new ExecutorFragment(Types._Button, WizardsTables.Types._Field);
		private static final ExecutorFragment _Button__OclAny = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Button__OclElement = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CheckBox__CheckBox = new ExecutorFragment(Types._CheckBox, WizardsTables.Types._CheckBox);
		private static final ExecutorFragment _CheckBox__Field = new ExecutorFragment(Types._CheckBox, WizardsTables.Types._Field);
		private static final ExecutorFragment _CheckBox__OclAny = new ExecutorFragment(Types._CheckBox, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CheckBox__OclElement = new ExecutorFragment(Types._CheckBox, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CloseButton__Button = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _CloseButton__CloseButton = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._CloseButton);
		private static final ExecutorFragment _CloseButton__Field = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._Field);
		private static final ExecutorFragment _CloseButton__OclAny = new ExecutorFragment(Types._CloseButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CloseButton__OclElement = new ExecutorFragment(Types._CloseButton, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Field__Field = new ExecutorFragment(Types._Field, WizardsTables.Types._Field);
		private static final ExecutorFragment _Field__OclAny = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Field__OclElement = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NavButton__Button = new ExecutorFragment(Types._NavButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _NavButton__Field = new ExecutorFragment(Types._NavButton, WizardsTables.Types._Field);
		private static final ExecutorFragment _NavButton__NavButton = new ExecutorFragment(Types._NavButton, WizardsTables.Types._NavButton);
		private static final ExecutorFragment _NavButton__OclAny = new ExecutorFragment(Types._NavButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NavButton__OclElement = new ExecutorFragment(Types._NavButton, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, WizardsTables.Types._Page);

		private static final ExecutorFragment _ReturnButton__Button = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _ReturnButton__Field = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._Field);
		private static final ExecutorFragment _ReturnButton__OclAny = new ExecutorFragment(Types._ReturnButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReturnButton__OclElement = new ExecutorFragment(Types._ReturnButton, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReturnButton__ReturnButton = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._ReturnButton);

		private static final ExecutorFragment _ShowButton__Button = new ExecutorFragment(Types._ShowButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _ShowButton__Field = new ExecutorFragment(Types._ShowButton, WizardsTables.Types._Field);
		private static final ExecutorFragment _ShowButton__OclAny = new ExecutorFragment(Types._ShowButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ShowButton__OclElement = new ExecutorFragment(Types._ShowButton, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ShowButton__ShowButton = new ExecutorFragment(Types._ShowButton, WizardsTables.Types._ShowButton);

		private static final ExecutorFragment _TextField__Field = new ExecutorFragment(Types._TextField, WizardsTables.Types._Field);
		private static final ExecutorFragment _TextField__OclAny = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TextField__OclElement = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TextField__TextField = new ExecutorFragment(Types._TextField, WizardsTables.Types._TextField);

		private static final ExecutorFragment _Wizard__OclAny = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Wizard__OclElement = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Wizard__Wizard = new ExecutorFragment(Types._Wizard, WizardsTables.Types._Wizard);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _CloseButton__close = new ExecutorOperation("close", TypeUtil.EMPTY_PARAMETER_TYPES, Types._CloseButton,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _NavButton__navigate = new ExecutorOperation("navigate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._NavButton,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _ReturnButton__return = new ExecutorOperation("return", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ReturnButton,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _ShowButton__show = new ExecutorOperation("show", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ShowButton,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Button__otherTargetPage = new EcoreExecutorProperty(WizardsPackage.Literals.BUTTON__OTHER_TARGET_PAGE, Types._Button, 0);
		public static final ExecutorProperty _Button__targetPage = new EcoreExecutorProperty(WizardsPackage.Literals.BUTTON__TARGET_PAGE, Types._Button, 1);
		public static final ExecutorProperty _Button__Page__buttons = new ExecutorPropertyWithImplementation("Page", Types._Button, 2, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__BUTTONS));

		public static final ExecutorProperty _CheckBox__labelSelected = new EcoreExecutorProperty(WizardsPackage.Literals.CHECK_BOX__LABEL_SELECTED, Types._CheckBox, 0);
		public static final ExecutorProperty _CheckBox__Page__checkbox = new ExecutorPropertyWithImplementation("Page", Types._CheckBox, 1, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__CHECKBOX));

		public static final ExecutorProperty _Field__label = new EcoreExecutorProperty(WizardsPackage.Literals.FIELD__LABEL, Types._Field, 0);

		public static final ExecutorProperty _Page__buttons = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__BUTTONS, Types._Page, 0);
		public static final ExecutorProperty _Page__checkbox = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__CHECKBOX, Types._Page, 1);
		public static final ExecutorProperty _Page__name = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__NAME, Types._Page, 2);
		public static final ExecutorProperty _Page__textFields = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__TEXT_FIELDS, Types._Page, 3);
		public static final ExecutorProperty _Page__title = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__TITLE, Types._Page, 4);
		public static final ExecutorProperty _Page__Button__otherTargetPage = new ExecutorPropertyWithImplementation("Button", Types._Page, 5, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.BUTTON__OTHER_TARGET_PAGE));
		public static final ExecutorProperty _Page__Button__targetPage = new ExecutorPropertyWithImplementation("Button", Types._Page, 6, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.BUTTON__TARGET_PAGE));
		public static final ExecutorProperty _Page__Wizard__initialPage = new ExecutorPropertyWithImplementation("Wizard", Types._Page, 7, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.WIZARD__INITIAL_PAGE));
		public static final ExecutorProperty _Page__Wizard__pages = new ExecutorPropertyWithImplementation("Wizard", Types._Page, 8, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.WIZARD__PAGES));

		public static final ExecutorProperty _ShowButton__message = new EcoreExecutorProperty(WizardsPackage.Literals.SHOW_BUTTON__MESSAGE, Types._ShowButton, 0);

		public static final ExecutorProperty _TextField__maxLength = new EcoreExecutorProperty(WizardsPackage.Literals.TEXT_FIELD__MAX_LENGTH, Types._TextField, 0);
		public static final ExecutorProperty _TextField__minLength = new EcoreExecutorProperty(WizardsPackage.Literals.TEXT_FIELD__MIN_LENGTH, Types._TextField, 1);
		public static final ExecutorProperty _TextField__Page__textFields = new ExecutorPropertyWithImplementation("Page", Types._TextField, 2, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__TEXT_FIELDS));

		public static final ExecutorProperty _Wizard__initialPage = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__INITIAL_PAGE, Types._Wizard, 0);
		public static final ExecutorProperty _Wizard__pages = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__PAGES, Types._Wizard, 1);
		public static final ExecutorProperty _Wizard__title = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__TITLE, Types._Wizard, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Button =
			{
				Fragments._Button__OclAny /* 0 */,
				Fragments._Button__OclElement /* 1 */,
				Fragments._Button__Field /* 2 */,
				Fragments._Button__Button /* 3 */
			};
		private static final int /*@NonNull*/ [] __Button = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CheckBox =
			{
				Fragments._CheckBox__OclAny /* 0 */,
				Fragments._CheckBox__OclElement /* 1 */,
				Fragments._CheckBox__Field /* 2 */,
				Fragments._CheckBox__CheckBox /* 3 */
			};
		private static final int /*@NonNull*/ [] __CheckBox = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CloseButton =
			{
				Fragments._CloseButton__OclAny /* 0 */,
				Fragments._CloseButton__OclElement /* 1 */,
				Fragments._CloseButton__Field /* 2 */,
				Fragments._CloseButton__Button /* 3 */,
				Fragments._CloseButton__CloseButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __CloseButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Field =
			{
				Fragments._Field__OclAny /* 0 */,
				Fragments._Field__OclElement /* 1 */,
				Fragments._Field__Field /* 2 */
			};
		private static final int /*@NonNull*/ [] __Field = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NavButton =
			{
				Fragments._NavButton__OclAny /* 0 */,
				Fragments._NavButton__OclElement /* 1 */,
				Fragments._NavButton__Field /* 2 */,
				Fragments._NavButton__Button /* 3 */,
				Fragments._NavButton__NavButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __NavButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReturnButton =
			{
				Fragments._ReturnButton__OclAny /* 0 */,
				Fragments._ReturnButton__OclElement /* 1 */,
				Fragments._ReturnButton__Field /* 2 */,
				Fragments._ReturnButton__Button /* 3 */,
				Fragments._ReturnButton__ReturnButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReturnButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ShowButton =
			{
				Fragments._ShowButton__OclAny /* 0 */,
				Fragments._ShowButton__OclElement /* 1 */,
				Fragments._ShowButton__Field /* 2 */,
				Fragments._ShowButton__Button /* 3 */,
				Fragments._ShowButton__ShowButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __ShowButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TextField =
			{
				Fragments._TextField__OclAny /* 0 */,
				Fragments._TextField__OclElement /* 1 */,
				Fragments._TextField__Field /* 2 */,
				Fragments._TextField__TextField /* 3 */
			};
		private static final int /*@NonNull*/ [] __TextField = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Wizard =
			{
				Fragments._Wizard__OclAny /* 0 */,
				Fragments._Wizard__OclElement /* 1 */,
				Fragments._Wizard__Wizard /* 2 */
			};
		private static final int /*@NonNull*/ [] __Wizard = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Button.initFragments(_Button, __Button);
			Types._CheckBox.initFragments(_CheckBox, __CheckBox);
			Types._CloseButton.initFragments(_CloseButton, __CloseButton);
			Types._Field.initFragments(_Field, __Field);
			Types._NavButton.initFragments(_NavButton, __NavButton);
			Types._Page.initFragments(_Page, __Page);
			Types._ReturnButton.initFragments(_ReturnButton, __ReturnButton);
			Types._ShowButton.initFragments(_ShowButton, __ShowButton);
			Types._TextField.initFragments(_TextField, __TextField);
			Types._Wizard.initFragments(_Wizard, __Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Button__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__CheckBox = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__CloseButton = {
			WizardsTables.Operations._CloseButton__close /* close() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Field__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NavButton__NavButton = {
			WizardsTables.Operations._NavButton__navigate /* navigate() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NavButton__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NavButton__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NavButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NavButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__ReturnButton = {
			WizardsTables.Operations._ReturnButton__return /* return() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ShowButton__ShowButton = {
			WizardsTables.Operations._ShowButton__show /* show() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ShowButton__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ShowButton__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ShowButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ShowButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TextField__TextField = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__Wizard = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Button__Button.initOperations(_Button__Button);
			Fragments._Button__Field.initOperations(_Button__Field);
			Fragments._Button__OclAny.initOperations(_Button__OclAny);
			Fragments._Button__OclElement.initOperations(_Button__OclElement);

			Fragments._CheckBox__CheckBox.initOperations(_CheckBox__CheckBox);
			Fragments._CheckBox__Field.initOperations(_CheckBox__Field);
			Fragments._CheckBox__OclAny.initOperations(_CheckBox__OclAny);
			Fragments._CheckBox__OclElement.initOperations(_CheckBox__OclElement);

			Fragments._CloseButton__Button.initOperations(_CloseButton__Button);
			Fragments._CloseButton__CloseButton.initOperations(_CloseButton__CloseButton);
			Fragments._CloseButton__Field.initOperations(_CloseButton__Field);
			Fragments._CloseButton__OclAny.initOperations(_CloseButton__OclAny);
			Fragments._CloseButton__OclElement.initOperations(_CloseButton__OclElement);

			Fragments._Field__Field.initOperations(_Field__Field);
			Fragments._Field__OclAny.initOperations(_Field__OclAny);
			Fragments._Field__OclElement.initOperations(_Field__OclElement);

			Fragments._NavButton__Button.initOperations(_NavButton__Button);
			Fragments._NavButton__Field.initOperations(_NavButton__Field);
			Fragments._NavButton__NavButton.initOperations(_NavButton__NavButton);
			Fragments._NavButton__OclAny.initOperations(_NavButton__OclAny);
			Fragments._NavButton__OclElement.initOperations(_NavButton__OclElement);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._ReturnButton__Button.initOperations(_ReturnButton__Button);
			Fragments._ReturnButton__Field.initOperations(_ReturnButton__Field);
			Fragments._ReturnButton__OclAny.initOperations(_ReturnButton__OclAny);
			Fragments._ReturnButton__OclElement.initOperations(_ReturnButton__OclElement);
			Fragments._ReturnButton__ReturnButton.initOperations(_ReturnButton__ReturnButton);

			Fragments._ShowButton__Button.initOperations(_ShowButton__Button);
			Fragments._ShowButton__Field.initOperations(_ShowButton__Field);
			Fragments._ShowButton__OclAny.initOperations(_ShowButton__OclAny);
			Fragments._ShowButton__OclElement.initOperations(_ShowButton__OclElement);
			Fragments._ShowButton__ShowButton.initOperations(_ShowButton__ShowButton);

			Fragments._TextField__Field.initOperations(_TextField__Field);
			Fragments._TextField__OclAny.initOperations(_TextField__OclAny);
			Fragments._TextField__OclElement.initOperations(_TextField__OclElement);
			Fragments._TextField__TextField.initOperations(_TextField__TextField);

			Fragments._Wizard__OclAny.initOperations(_Wizard__OclAny);
			Fragments._Wizard__OclElement.initOperations(_Wizard__OclElement);
			Fragments._Wizard__Wizard.initOperations(_Wizard__Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Button = {
			WizardsTables.Properties._Field__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Button__otherTargetPage,
			WizardsTables.Properties._Button__targetPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CheckBox = {
			WizardsTables.Properties._Field__label,
			WizardsTables.Properties._CheckBox__labelSelected,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CloseButton = {
			WizardsTables.Properties._Field__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Button__otherTargetPage,
			WizardsTables.Properties._Button__targetPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Field = {
			WizardsTables.Properties._Field__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NavButton = {
			WizardsTables.Properties._Field__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Button__otherTargetPage,
			WizardsTables.Properties._Button__targetPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			WizardsTables.Properties._Page__buttons,
			WizardsTables.Properties._Page__checkbox,
			WizardsTables.Properties._Page__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Page__textFields,
			WizardsTables.Properties._Page__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReturnButton = {
			WizardsTables.Properties._Field__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Button__otherTargetPage,
			WizardsTables.Properties._Button__targetPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ShowButton = {
			WizardsTables.Properties._Field__label,
			WizardsTables.Properties._ShowButton__message,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Button__otherTargetPage,
			WizardsTables.Properties._Button__targetPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TextField = {
			WizardsTables.Properties._Field__label,
			WizardsTables.Properties._TextField__maxLength,
			WizardsTables.Properties._TextField__minLength,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Wizard = {
			WizardsTables.Properties._Wizard__initialPage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Wizard__pages,
			WizardsTables.Properties._Wizard__title
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Button__Button.initProperties(_Button);
			Fragments._CheckBox__CheckBox.initProperties(_CheckBox);
			Fragments._CloseButton__CloseButton.initProperties(_CloseButton);
			Fragments._Field__Field.initProperties(_Field);
			Fragments._NavButton__NavButton.initProperties(_NavButton);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._ReturnButton__ReturnButton.initProperties(_ReturnButton);
			Fragments._ShowButton__ShowButton.initProperties(_ShowButton);
			Fragments._TextField__TextField.initProperties(_TextField);
			Fragments._Wizard__Wizard.initProperties(_Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new WizardsTables();
	}

	private WizardsTables() {
		super(WizardsPackage.eNS_URI);
	}
}
