/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ex2/ex2.ecore
 * using:
 *   /ex2/ex2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package wizard;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import wizard.WizardPackage;
// import wizard.WizardTables;

/**
 * WizardTables provides the dispatch tables for the wizard for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class WizardTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(WizardPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid__s_ex2_s_ex2_ecore = IdManager.getNsURIPackageId("/ex2/ex2.ecore", null, WizardPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Button = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("Button", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ButtonClose = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("ButtonClose", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ButtonNavigate = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("ButtonNavigate", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ButtonReturn = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("ButtonReturn", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ButtonShow = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("ButtonShow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Checkbox = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("Checkbox", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = WizardTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Label = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("Label", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TextField = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("TextField", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Wizard = WizardTables.PACKid__s_ex2_s_ex2_ecore.getClassId("Wizard", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = WizardTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ButtonClose = TypeId.BAG.getSpecializedId(WizardTables.CLSSid_ButtonClose);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ButtonNavigate = TypeId.BAG.getSpecializedId(WizardTables.CLSSid_ButtonNavigate);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ButtonReturn = TypeId.BAG.getSpecializedId(WizardTables.CLSSid_ButtonReturn);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Button = TypeId.SET.getSpecializedId(WizardTables.CLSSid_Button);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(WizardTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_TextField = TypeId.SET.getSpecializedId(WizardTables.CLSSid_TextField);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			WizardTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Button = new EcoreExecutorType(WizardPackage.Literals.BUTTON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ButtonClose = new EcoreExecutorType(WizardPackage.Literals.BUTTON_CLOSE, PACKAGE, 0);
		public static final EcoreExecutorType _ButtonNavigate = new EcoreExecutorType(WizardPackage.Literals.BUTTON_NAVIGATE, PACKAGE, 0);
		public static final EcoreExecutorType _ButtonReturn = new EcoreExecutorType(WizardPackage.Literals.BUTTON_RETURN, PACKAGE, 0);
		public static final EcoreExecutorType _ButtonShow = new EcoreExecutorType(WizardPackage.Literals.BUTTON_SHOW, PACKAGE, 0);
		public static final EcoreExecutorType _Checkbox = new EcoreExecutorType(WizardPackage.Literals.CHECKBOX, PACKAGE, 0);
		public static final EcoreExecutorType _Label = new EcoreExecutorType(WizardPackage.Literals.LABEL, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(WizardPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _TextField = new EcoreExecutorType(WizardPackage.Literals.TEXT_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _Wizard = new EcoreExecutorType(WizardPackage.Literals.WIZARD, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Button,
			_ButtonClose,
			_ButtonNavigate,
			_ButtonReturn,
			_ButtonShow,
			_Checkbox,
			_Label,
			_Page,
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
		 * Force initialization of the fields of WizardTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Button__Button = new ExecutorFragment(Types._Button, WizardTables.Types._Button);
		private static final ExecutorFragment _Button__OclAny = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Button__OclElement = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ButtonClose__Button = new ExecutorFragment(Types._ButtonClose, WizardTables.Types._Button);
		private static final ExecutorFragment _ButtonClose__ButtonClose = new ExecutorFragment(Types._ButtonClose, WizardTables.Types._ButtonClose);
		private static final ExecutorFragment _ButtonClose__OclAny = new ExecutorFragment(Types._ButtonClose, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ButtonClose__OclElement = new ExecutorFragment(Types._ButtonClose, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ButtonNavigate__Button = new ExecutorFragment(Types._ButtonNavigate, WizardTables.Types._Button);
		private static final ExecutorFragment _ButtonNavigate__ButtonNavigate = new ExecutorFragment(Types._ButtonNavigate, WizardTables.Types._ButtonNavigate);
		private static final ExecutorFragment _ButtonNavigate__OclAny = new ExecutorFragment(Types._ButtonNavigate, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ButtonNavigate__OclElement = new ExecutorFragment(Types._ButtonNavigate, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ButtonReturn__Button = new ExecutorFragment(Types._ButtonReturn, WizardTables.Types._Button);
		private static final ExecutorFragment _ButtonReturn__ButtonReturn = new ExecutorFragment(Types._ButtonReturn, WizardTables.Types._ButtonReturn);
		private static final ExecutorFragment _ButtonReturn__OclAny = new ExecutorFragment(Types._ButtonReturn, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ButtonReturn__OclElement = new ExecutorFragment(Types._ButtonReturn, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ButtonShow__Button = new ExecutorFragment(Types._ButtonShow, WizardTables.Types._Button);
		private static final ExecutorFragment _ButtonShow__ButtonShow = new ExecutorFragment(Types._ButtonShow, WizardTables.Types._ButtonShow);
		private static final ExecutorFragment _ButtonShow__OclAny = new ExecutorFragment(Types._ButtonShow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ButtonShow__OclElement = new ExecutorFragment(Types._ButtonShow, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Checkbox__Checkbox = new ExecutorFragment(Types._Checkbox, WizardTables.Types._Checkbox);
		private static final ExecutorFragment _Checkbox__OclAny = new ExecutorFragment(Types._Checkbox, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Checkbox__OclElement = new ExecutorFragment(Types._Checkbox, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Label__Label = new ExecutorFragment(Types._Label, WizardTables.Types._Label);
		private static final ExecutorFragment _Label__OclAny = new ExecutorFragment(Types._Label, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Label__OclElement = new ExecutorFragment(Types._Label, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, WizardTables.Types._Page);

		private static final ExecutorFragment _TextField__OclAny = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TextField__OclElement = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TextField__TextField = new ExecutorFragment(Types._TextField, WizardTables.Types._TextField);

		private static final ExecutorFragment _Wizard__OclAny = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Wizard__OclElement = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Wizard__Wizard = new ExecutorFragment(Types._Wizard, WizardTables.Types._Wizard);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of WizardTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Button__label = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON__LABEL, Types._Button, 0);
		public static final ExecutorProperty _Button__myPage = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON__MY_PAGE, Types._Button, 1);

		public static final ExecutorProperty _ButtonClose__wizard = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON_CLOSE__WIZARD, Types._ButtonClose, 0);

		public static final ExecutorProperty _ButtonNavigate__nextPage = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON_NAVIGATE__NEXT_PAGE, Types._ButtonNavigate, 0);
		public static final ExecutorProperty _ButtonNavigate__nextPageAlt = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON_NAVIGATE__NEXT_PAGE_ALT, Types._ButtonNavigate, 1);

		public static final ExecutorProperty _ButtonReturn__previousPage = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON_RETURN__PREVIOUS_PAGE, Types._ButtonReturn, 0);

		public static final ExecutorProperty _ButtonShow__message = new EcoreExecutorProperty(WizardPackage.Literals.BUTTON_SHOW__MESSAGE, Types._ButtonShow, 0);

		public static final ExecutorProperty _Checkbox__label = new EcoreExecutorProperty(WizardPackage.Literals.CHECKBOX__LABEL, Types._Checkbox, 0);
		public static final ExecutorProperty _Checkbox__selected = new EcoreExecutorProperty(WizardPackage.Literals.CHECKBOX__SELECTED, Types._Checkbox, 1);
		public static final ExecutorProperty _Checkbox__Page__checkbox = new ExecutorPropertyWithImplementation("Page", Types._Checkbox, 2, new EcoreLibraryOppositeProperty(WizardPackage.Literals.PAGE__CHECKBOX));

		public static final ExecutorProperty _Label__text = new EcoreExecutorProperty(WizardPackage.Literals.LABEL__TEXT, Types._Label, 0);
		public static final ExecutorProperty _Label__Button__label = new ExecutorPropertyWithImplementation("Button", Types._Label, 1, new EcoreLibraryOppositeProperty(WizardPackage.Literals.BUTTON__LABEL));
		public static final ExecutorProperty _Label__Checkbox__label = new ExecutorPropertyWithImplementation("Checkbox", Types._Label, 2, new EcoreLibraryOppositeProperty(WizardPackage.Literals.CHECKBOX__LABEL));
		public static final ExecutorProperty _Label__TextField__label = new ExecutorPropertyWithImplementation("TextField", Types._Label, 3, new EcoreLibraryOppositeProperty(WizardPackage.Literals.TEXT_FIELD__LABEL));

		public static final ExecutorProperty _Page__buttons = new EcoreExecutorProperty(WizardPackage.Literals.PAGE__BUTTONS, Types._Page, 0);
		public static final ExecutorProperty _Page__checkbox = new EcoreExecutorProperty(WizardPackage.Literals.PAGE__CHECKBOX, Types._Page, 1);
		public static final ExecutorProperty _Page__init = new EcoreExecutorProperty(WizardPackage.Literals.PAGE__INIT, Types._Page, 2);
		public static final ExecutorProperty _Page__textfields = new EcoreExecutorProperty(WizardPackage.Literals.PAGE__TEXTFIELDS, Types._Page, 3);
		public static final ExecutorProperty _Page__ButtonNavigate__nextPage = new ExecutorPropertyWithImplementation("ButtonNavigate", Types._Page, 4, new EcoreLibraryOppositeProperty(WizardPackage.Literals.BUTTON_NAVIGATE__NEXT_PAGE));
		public static final ExecutorProperty _Page__ButtonNavigate__nextPageAlt = new ExecutorPropertyWithImplementation("ButtonNavigate", Types._Page, 5, new EcoreLibraryOppositeProperty(WizardPackage.Literals.BUTTON_NAVIGATE__NEXT_PAGE_ALT));
		public static final ExecutorProperty _Page__ButtonReturn__previousPage = new ExecutorPropertyWithImplementation("ButtonReturn", Types._Page, 6, new EcoreLibraryOppositeProperty(WizardPackage.Literals.BUTTON_RETURN__PREVIOUS_PAGE));
		public static final ExecutorProperty _Page__Wizard__pages = new ExecutorPropertyWithImplementation("Wizard", Types._Page, 7, new EcoreLibraryOppositeProperty(WizardPackage.Literals.WIZARD__PAGES));

		public static final ExecutorProperty _TextField__input = new EcoreExecutorProperty(WizardPackage.Literals.TEXT_FIELD__INPUT, Types._TextField, 0);
		public static final ExecutorProperty _TextField__label = new EcoreExecutorProperty(WizardPackage.Literals.TEXT_FIELD__LABEL, Types._TextField, 1);
		public static final ExecutorProperty _TextField__maxLength = new EcoreExecutorProperty(WizardPackage.Literals.TEXT_FIELD__MAX_LENGTH, Types._TextField, 2);
		public static final ExecutorProperty _TextField__minLength = new EcoreExecutorProperty(WizardPackage.Literals.TEXT_FIELD__MIN_LENGTH, Types._TextField, 3);
		public static final ExecutorProperty _TextField__Page__textfields = new ExecutorPropertyWithImplementation("Page", Types._TextField, 4, new EcoreLibraryOppositeProperty(WizardPackage.Literals.PAGE__TEXTFIELDS));

		public static final ExecutorProperty _Wizard__pages = new EcoreExecutorProperty(WizardPackage.Literals.WIZARD__PAGES, Types._Wizard, 0);
		public static final ExecutorProperty _Wizard__title = new EcoreExecutorProperty(WizardPackage.Literals.WIZARD__TITLE, Types._Wizard, 1);
		public static final ExecutorProperty _Wizard__ButtonClose__wizard = new ExecutorPropertyWithImplementation("ButtonClose", Types._Wizard, 2, new EcoreLibraryOppositeProperty(WizardPackage.Literals.BUTTON_CLOSE__WIZARD));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::Properties and all preceding sub-packages.
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
				Fragments._Button__Button /* 2 */
			};
		private static final int /*@NonNull*/ [] __Button = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ButtonClose =
			{
				Fragments._ButtonClose__OclAny /* 0 */,
				Fragments._ButtonClose__OclElement /* 1 */,
				Fragments._ButtonClose__Button /* 2 */,
				Fragments._ButtonClose__ButtonClose /* 3 */
			};
		private static final int /*@NonNull*/ [] __ButtonClose = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ButtonNavigate =
			{
				Fragments._ButtonNavigate__OclAny /* 0 */,
				Fragments._ButtonNavigate__OclElement /* 1 */,
				Fragments._ButtonNavigate__Button /* 2 */,
				Fragments._ButtonNavigate__ButtonNavigate /* 3 */
			};
		private static final int /*@NonNull*/ [] __ButtonNavigate = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ButtonReturn =
			{
				Fragments._ButtonReturn__OclAny /* 0 */,
				Fragments._ButtonReturn__OclElement /* 1 */,
				Fragments._ButtonReturn__Button /* 2 */,
				Fragments._ButtonReturn__ButtonReturn /* 3 */
			};
		private static final int /*@NonNull*/ [] __ButtonReturn = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ButtonShow =
			{
				Fragments._ButtonShow__OclAny /* 0 */,
				Fragments._ButtonShow__OclElement /* 1 */,
				Fragments._ButtonShow__Button /* 2 */,
				Fragments._ButtonShow__ButtonShow /* 3 */
			};
		private static final int /*@NonNull*/ [] __ButtonShow = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Checkbox =
			{
				Fragments._Checkbox__OclAny /* 0 */,
				Fragments._Checkbox__OclElement /* 1 */,
				Fragments._Checkbox__Checkbox /* 2 */
			};
		private static final int /*@NonNull*/ [] __Checkbox = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Label =
			{
				Fragments._Label__OclAny /* 0 */,
				Fragments._Label__OclElement /* 1 */,
				Fragments._Label__Label /* 2 */
			};
		private static final int /*@NonNull*/ [] __Label = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TextField =
			{
				Fragments._TextField__OclAny /* 0 */,
				Fragments._TextField__OclElement /* 1 */,
				Fragments._TextField__TextField /* 2 */
			};
		private static final int /*@NonNull*/ [] __TextField = { 1,1,1 };

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
			Types._ButtonClose.initFragments(_ButtonClose, __ButtonClose);
			Types._ButtonNavigate.initFragments(_ButtonNavigate, __ButtonNavigate);
			Types._ButtonReturn.initFragments(_ButtonReturn, __ButtonReturn);
			Types._ButtonShow.initFragments(_ButtonShow, __ButtonShow);
			Types._Checkbox.initFragments(_Checkbox, __Checkbox);
			Types._Label.initFragments(_Label, __Label);
			Types._Page.initFragments(_Page, __Page);
			Types._TextField.initFragments(_TextField, __TextField);
			Types._Wizard.initFragments(_Wizard, __Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _ButtonClose__ButtonClose = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonClose__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonClose__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonClose__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ButtonNavigate__ButtonNavigate = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonNavigate__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonNavigate__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonNavigate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ButtonReturn__ButtonReturn = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonReturn__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonReturn__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonReturn__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ButtonShow__ButtonShow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonShow__Button = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonShow__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ButtonShow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Checkbox__Checkbox = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Checkbox__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Checkbox__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Label__Label = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Label__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Label__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _TextField__TextField = {};
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
			Fragments._Button__OclAny.initOperations(_Button__OclAny);
			Fragments._Button__OclElement.initOperations(_Button__OclElement);

			Fragments._ButtonClose__Button.initOperations(_ButtonClose__Button);
			Fragments._ButtonClose__ButtonClose.initOperations(_ButtonClose__ButtonClose);
			Fragments._ButtonClose__OclAny.initOperations(_ButtonClose__OclAny);
			Fragments._ButtonClose__OclElement.initOperations(_ButtonClose__OclElement);

			Fragments._ButtonNavigate__Button.initOperations(_ButtonNavigate__Button);
			Fragments._ButtonNavigate__ButtonNavigate.initOperations(_ButtonNavigate__ButtonNavigate);
			Fragments._ButtonNavigate__OclAny.initOperations(_ButtonNavigate__OclAny);
			Fragments._ButtonNavigate__OclElement.initOperations(_ButtonNavigate__OclElement);

			Fragments._ButtonReturn__Button.initOperations(_ButtonReturn__Button);
			Fragments._ButtonReturn__ButtonReturn.initOperations(_ButtonReturn__ButtonReturn);
			Fragments._ButtonReturn__OclAny.initOperations(_ButtonReturn__OclAny);
			Fragments._ButtonReturn__OclElement.initOperations(_ButtonReturn__OclElement);

			Fragments._ButtonShow__Button.initOperations(_ButtonShow__Button);
			Fragments._ButtonShow__ButtonShow.initOperations(_ButtonShow__ButtonShow);
			Fragments._ButtonShow__OclAny.initOperations(_ButtonShow__OclAny);
			Fragments._ButtonShow__OclElement.initOperations(_ButtonShow__OclElement);

			Fragments._Checkbox__Checkbox.initOperations(_Checkbox__Checkbox);
			Fragments._Checkbox__OclAny.initOperations(_Checkbox__OclAny);
			Fragments._Checkbox__OclElement.initOperations(_Checkbox__OclElement);

			Fragments._Label__Label.initOperations(_Label__Label);
			Fragments._Label__OclAny.initOperations(_Label__OclAny);
			Fragments._Label__OclElement.initOperations(_Label__OclElement);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._TextField__OclAny.initOperations(_TextField__OclAny);
			Fragments._TextField__OclElement.initOperations(_TextField__OclElement);
			Fragments._TextField__TextField.initOperations(_TextField__TextField);

			Fragments._Wizard__OclAny.initOperations(_Wizard__OclAny);
			Fragments._Wizard__OclElement.initOperations(_Wizard__OclElement);
			Fragments._Wizard__Wizard.initOperations(_Wizard__Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::FragmentOperations and all preceding sub-packages.
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
			WizardTables.Properties._Button__label,
			WizardTables.Properties._Button__myPage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ButtonClose = {
			WizardTables.Properties._Button__label,
			WizardTables.Properties._Button__myPage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._ButtonClose__wizard
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ButtonNavigate = {
			WizardTables.Properties._Button__label,
			WizardTables.Properties._Button__myPage,
			WizardTables.Properties._ButtonNavigate__nextPage,
			WizardTables.Properties._ButtonNavigate__nextPageAlt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ButtonReturn = {
			WizardTables.Properties._Button__label,
			WizardTables.Properties._Button__myPage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._ButtonReturn__previousPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ButtonShow = {
			WizardTables.Properties._Button__label,
			WizardTables.Properties._ButtonShow__message,
			WizardTables.Properties._Button__myPage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Checkbox = {
			WizardTables.Properties._Checkbox__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._Checkbox__selected
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Label = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._Label__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			WizardTables.Properties._Page__buttons,
			WizardTables.Properties._Page__checkbox,
			WizardTables.Properties._Page__init,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._Page__textfields
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TextField = {
			WizardTables.Properties._TextField__input,
			WizardTables.Properties._TextField__label,
			WizardTables.Properties._TextField__maxLength,
			WizardTables.Properties._TextField__minLength,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Wizard = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardTables.Properties._Wizard__pages,
			WizardTables.Properties._Wizard__title
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Button__Button.initProperties(_Button);
			Fragments._ButtonClose__ButtonClose.initProperties(_ButtonClose);
			Fragments._ButtonNavigate__ButtonNavigate.initProperties(_ButtonNavigate);
			Fragments._ButtonReturn__ButtonReturn.initProperties(_ButtonReturn);
			Fragments._ButtonShow__ButtonShow.initProperties(_ButtonShow);
			Fragments._Checkbox__Checkbox.initProperties(_Checkbox);
			Fragments._Label__Label.initProperties(_Label);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._TextField__TextField.initProperties(_TextField);
			Fragments._Wizard__Wizard.initProperties(_Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of WizardTables::EnumerationLiterals and all preceding sub-packages.
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
		new WizardTables();
	}

	private WizardTables() {
		super(WizardPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		WizardPackage.Literals.PAGE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
