/**
 */
package wizard.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import wizard.Button;
import wizard.Checkbox;
import wizard.Label;
import wizard.Page;
import wizard.TextField;
import wizard.WizardPackage;
import wizard.WizardTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.PageImpl#isInit <em>Init</em>}</li>
 *   <li>{@link wizard.impl.PageImpl#getTextfields <em>Textfields</em>}</li>
 *   <li>{@link wizard.impl.PageImpl#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link wizard.impl.PageImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextfields() <em>Textfields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextfields()
	 * @generated
	 * @ordered
	 */
	protected EList<TextField> textfields;

	/**
	 * The cached value of the '{@link #getCheckbox() <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckbox()
	 * @generated
	 * @ordered
	 */
	protected Checkbox checkbox;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> buttons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.PAGE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextField> getTextfields() {
		if (textfields == null) {
			textfields = new EObjectContainmentEList<TextField>(TextField.class, this, WizardPackage.PAGE__TEXTFIELDS);
		}
		return textfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox getCheckbox() {
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckbox(Checkbox newCheckbox, NotificationChain msgs) {
		Checkbox oldCheckbox = checkbox;
		checkbox = newCheckbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WizardPackage.PAGE__CHECKBOX, oldCheckbox, newCheckbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckbox(Checkbox newCheckbox) {
		if (newCheckbox != checkbox) {
			NotificationChain msgs = null;
			if (checkbox != null)
				msgs = ((InternalEObject)checkbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WizardPackage.PAGE__CHECKBOX, null, msgs);
			if (newCheckbox != null)
				msgs = ((InternalEObject)newCheckbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WizardPackage.PAGE__CHECKBOX, null, msgs);
			msgs = basicSetCheckbox(newCheckbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.PAGE__CHECKBOX, newCheckbox, newCheckbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectContainmentWithInverseEList<Button>(Button.class, this, WizardPackage.PAGE__BUTTONS, WizardPackage.BUTTON__MY_PAGE);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean notOnlyMessageButton(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::notOnlyMessageButton";
		try {
			/**
			 *
			 * inv notOnlyMessageButton:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = buttons->select(b |
			 *           b.oclIsTypeOf(ButtonShow))
			 *         ->size() <
			 *         buttons->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.PAGE___NOT_ONLY_MESSAGE_BUTTON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Button> buttons_0 = this.getButtons();
				final /*@NonInvalid*/ SetValue BOXED_buttons_0 = idResolver.createSetOfAll(WizardTables.SET_CLSSid_Button, buttons_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardTables.SET_CLSSid_Button);
				Iterator<Object> ITERATOR_b = BOXED_buttons_0.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_b.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
					/**
					 * b.oclIsTypeOf(ButtonShow)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_ButtonShow = idResolver.getClass(WizardTables.CLSSid_ButtonShow, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizard_c_c_ButtonShow).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(b);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_buttons_0);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanOperation.INSTANCE.evaluate(executor, size, size_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean oneInitPage(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::oneInitPage";
		try {
			/**
			 *
			 * inv oneInitPage:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Page.allInstances()->one(init)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.PAGE___ONE_INIT_PAGE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_Page = idResolver.getClass(WizardTables.CLSSid_Page, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WizardTables.SET_CLSSid_Page, TYP_wizard_c_c_Page);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Page _1 = (Page)ITERATOR__1.next();
					/**
					 * init
					 */
					final /*@NonInvalid*/ boolean init = _1.isInit();
					//
					if (init) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noRetNavThenClose(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::noRetNavThenClose";
		try {
			/**
			 *
			 * inv noRetNavThenClose:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = buttons->select(b |
			 *           (
			 *             b.oclIsTypeOf(ButtonReturn) or
			 *             b.oclIsTypeOf(ButtonNavigate)
			 *           ))
			 *         ->size() = 0 implies
			 *         buttons->one(b | b.oclIsTypeOf(ButtonClose))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.PAGE___NO_RET_NAV_THEN_CLOSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons_0 = this.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons_0 = idResolver.createSetOfAll(WizardTables.SET_CLSSid_Button, buttons_0);
					/*@Caught*/ Object CAUGHT_eq;
					try {
						/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardTables.SET_CLSSid_Button);
						Iterator<Object> ITERATOR_b = BOXED_buttons_0.iterator();
						/*@Thrown*/ SetValue select;
						while (true) {
							if (!ITERATOR_b.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
							/**
							 *
							 * b.oclIsTypeOf(ButtonReturn) or
							 * b.oclIsTypeOf(ButtonNavigate)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_ButtonNavigate = idResolver.getClass(WizardTables.CLSSid_ButtonNavigate, null);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_ButtonReturn_0 = idResolver.getClass(WizardTables.CLSSid_ButtonReturn, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizard_c_c_ButtonReturn_0).booleanValue();
							final /*@NonInvalid*/ Boolean or;
							if (oclIsTypeOf) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizard_c_c_ButtonNavigate).booleanValue();
								if (oclIsTypeOf_0) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == null) {
								throw new InvalidValueException("Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
							}
							//
							if (or == ValueUtil.TRUE_VALUE) {
								accumulator.add(b);
							}
						}
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
						final /*@Thrown*/ boolean eq = size.equals(WizardTables.INT_0);
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Thrown*/ boolean accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_b_0 = BOXED_buttons_0.iterator();
						/*@NonInvalid*/ boolean one;
						while (true) {
							if (!ITERATOR_b_0.hasNext()) {
								one = accumulator_0;
								break;
							}
							/*@NonInvalid*/ Button b_0 = (Button)ITERATOR_b_0.next();
							/**
							 * b.oclIsTypeOf(ButtonClose)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_ButtonClose = idResolver.getClass(WizardTables.CLSSid_ButtonClose, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b_0, TYP_wizard_c_c_ButtonClose).booleanValue();
							//
							if (oclIsTypeOf_1) {			// Carry on till something found
								if (accumulator_0) {
									one = false;
									break;
								}
								else {
									accumulator_0 = true;
								}
							}
						}
						if (one) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_eq;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noSimilarButtons(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::noSimilarButtons";
		try {
			/**
			 *
			 * inv noSimilarButtons:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = buttons->isUnique(b | b.label.text)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.PAGE___NO_SIMILAR_BUTTONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Button> buttons = this.getButtons();
				final /*@NonInvalid*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardTables.SET_CLSSid_Button, buttons);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardTables.SET_CLSSid_Button);
				Iterator<Object> ITERATOR_b = BOXED_buttons.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_b.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
					/**
					 * b.label.text
					 */
					final /*@NonInvalid*/ Label label = b.getLabel();
					final /*@NonInvalid*/ String text = label.getText();
					//
					if (accumulator.includes(text) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(text);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean returnButtonsInv(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::returnButtonsInv";
		try {
			/**
			 *
			 * inv returnButtonsInv:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not init and
			 *         buttons->select(b | b.oclIsTypeOf(ButtonReturn))
			 *         ->size() <= 1 or
			 *         buttons->select(b | b.oclIsTypeOf(ButtonReturn))
			 *         ->size() < 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.PAGE___RETURN_BUTTONS_INV__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons_0 = this.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons_0 = idResolver.createSetOfAll(WizardTables.SET_CLSSid_Button, buttons_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardTables.SET_CLSSid_Button);
					Iterator<Object> ITERATOR_b_0 = BOXED_buttons_0.iterator();
					/*@NonInvalid*/ SetValue select_0;
					while (true) {
						if (!ITERATOR_b_0.hasNext()) {
							select_0 = accumulator;
							break;
						}
						/*@NonInvalid*/ Button b_0 = (Button)ITERATOR_b_0.next();
						/**
						 * b.oclIsTypeOf(ButtonReturn)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizard_c_c_ButtonReturn_0 = idResolver.getClass(WizardTables.CLSSid_ButtonReturn, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b_0, TYP_wizard_c_c_ButtonReturn_0).booleanValue();
						//
						if (oclIsTypeOf_0) {
							accumulator.add(b_0);
						}
					}
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ boolean init = this.isInit();
						final /*@NonInvalid*/ Boolean not;
						if (!init) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (init) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, WizardTables.INT_1).booleanValue();
							if (!le_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (not == null) {
									and = null;
								}
								else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, size_0, WizardTables.INT_1).booleanValue();
						if (lt) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.PAGE__BUTTONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getButtons()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.PAGE__TEXTFIELDS:
				return ((InternalEList<?>)getTextfields()).basicRemove(otherEnd, msgs);
			case WizardPackage.PAGE__CHECKBOX:
				return basicSetCheckbox(null, msgs);
			case WizardPackage.PAGE__BUTTONS:
				return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.PAGE__INIT:
				return isInit();
			case WizardPackage.PAGE__TEXTFIELDS:
				return getTextfields();
			case WizardPackage.PAGE__CHECKBOX:
				return getCheckbox();
			case WizardPackage.PAGE__BUTTONS:
				return getButtons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WizardPackage.PAGE__INIT:
				setInit((Boolean)newValue);
				return;
			case WizardPackage.PAGE__TEXTFIELDS:
				getTextfields().clear();
				getTextfields().addAll((Collection<? extends TextField>)newValue);
				return;
			case WizardPackage.PAGE__CHECKBOX:
				setCheckbox((Checkbox)newValue);
				return;
			case WizardPackage.PAGE__BUTTONS:
				getButtons().clear();
				getButtons().addAll((Collection<? extends Button>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WizardPackage.PAGE__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case WizardPackage.PAGE__TEXTFIELDS:
				getTextfields().clear();
				return;
			case WizardPackage.PAGE__CHECKBOX:
				setCheckbox((Checkbox)null);
				return;
			case WizardPackage.PAGE__BUTTONS:
				getButtons().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WizardPackage.PAGE__INIT:
				return init != INIT_EDEFAULT;
			case WizardPackage.PAGE__TEXTFIELDS:
				return textfields != null && !textfields.isEmpty();
			case WizardPackage.PAGE__CHECKBOX:
				return checkbox != null;
			case WizardPackage.PAGE__BUTTONS:
				return buttons != null && !buttons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardPackage.PAGE___NOT_ONLY_MESSAGE_BUTTON__DIAGNOSTICCHAIN_MAP:
				return notOnlyMessageButton((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardPackage.PAGE___ONE_INIT_PAGE__DIAGNOSTICCHAIN_MAP:
				return oneInitPage((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardPackage.PAGE___NO_RET_NAV_THEN_CLOSE__DIAGNOSTICCHAIN_MAP:
				return noRetNavThenClose((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardPackage.PAGE___NO_SIMILAR_BUTTONS__DIAGNOSTICCHAIN_MAP:
				return noSimilarButtons((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardPackage.PAGE___RETURN_BUTTONS_INV__DIAGNOSTICCHAIN_MAP:
				return returnButtonsInv((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //PageImpl
