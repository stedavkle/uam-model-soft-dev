/**
 */
package wizards.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import wizards.Button;
import wizards.CheckBox;
import wizards.Page;
import wizards.TextField;
import wizards.WizardsPackage;
import wizards.WizardsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.PageImpl#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getTextFields <em>Text Fields</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getCheckbox() <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckbox()
	 * @generated
	 * @ordered
	 */
	protected CheckBox checkbox;

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
	 * The cached value of the '{@link #getTextFields() <em>Text Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TextField> textFields;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
		return WizardsPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckBox getCheckbox() {
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckbox(CheckBox newCheckbox, NotificationChain msgs) {
		CheckBox oldCheckbox = checkbox;
		checkbox = newCheckbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__CHECKBOX, oldCheckbox, newCheckbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckbox(CheckBox newCheckbox) {
		if (newCheckbox != checkbox) {
			NotificationChain msgs = null;
			if (checkbox != null)
				msgs = ((InternalEObject)checkbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WizardsPackage.PAGE__CHECKBOX, null, msgs);
			if (newCheckbox != null)
				msgs = ((InternalEObject)newCheckbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WizardsPackage.PAGE__CHECKBOX, null, msgs);
			msgs = basicSetCheckbox(newCheckbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__CHECKBOX, newCheckbox, newCheckbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectContainmentEList<Button>(Button.class, this, WizardsPackage.PAGE__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextField> getTextFields() {
		if (textFields == null) {
			textFields = new EObjectContainmentEList<TextField>(TextField.class, this, WizardsPackage.PAGE__TEXT_FIELDS);
		}
		return textFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean notOnlyShowBtns(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::notOnlyShowBtns";
		try {
			/**
			 *
			 * inv notOnlyShowBtns:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = buttons->select(b |
			 *           b.oclIsTypeOf(ShowButton))
			 *         ->size() <
			 *         buttons->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___NOT_ONLY_SHOW_BTNS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons_0 = this.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons_0 = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardsTables.SET_CLSSid_Button);
					Iterator<Object> ITERATOR_b = BOXED_buttons_0.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_b.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
						/**
						 * b.oclIsTypeOf(ShowButton)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_ShowButton = idResolver.getClass(WizardsTables.CLSSid_ShowButton, null);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizards_c_c_ShowButton).booleanValue();
						//
						if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
							accumulator.add(b);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_buttons_0);
					final /*@Thrown*/ boolean result = OclComparableLessThanOperation.INSTANCE.evaluate(executor, size, size_0).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardsTables.INT_0).booleanValue();
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
	@Override
	public boolean notSelfLoop(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::notSelfLoop";
		try {
			/**
			 *
			 * inv notSelfLoop:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = buttons->select(b |
			 *           b.oclIsTypeOf(NavButton))
			 *         ->forAll(b2 | b2.targetPage <> self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___NOT_SELF_LOOP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons = this.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WizardsTables.SET_CLSSid_Button);
					Iterator<Object> ITERATOR_b = BOXED_buttons.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_b.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
						/**
						 * b.oclIsTypeOf(NavButton)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_NavButton_0 = idResolver.getClass(WizardsTables.CLSSid_NavButton, null);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizards_c_c_NavButton_0).booleanValue();
						//
						if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
							accumulator.add(b);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_b2 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_b2.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Button b2 = (Button)ITERATOR_b2.next();
						/**
						 * b2.targetPage <> self
						 */
						/*@Caught*/ Object CAUGHT_ne;
						try {
							if (b2 == null) {
								throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Button::targetPage\'");
							}
							final /*@Thrown*/ Page targetPage = b2.getTargetPage();
							final /*@Thrown*/ boolean ne = !this.equals(targetPage);
							CAUGHT_ne = ne;
						}
						catch (Exception e) {
							CAUGHT_ne = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_ne == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_ne instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_ne;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardsTables.INT_0).booleanValue();
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
	@Override
	public boolean buttonsDifferentLabel(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::buttonsDifferentLabel";
		try {
			/**
			 *
			 * inv buttonsDifferentLabel:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = buttons->forAll(b1, b2 | b1 <> b2 implies b1.label <> b2.label)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___BUTTONS_DIFFERENT_LABEL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons = this.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_buttons);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * b1 <> b2 implies b1.label <> b2.label
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue BOXED_buttons = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object b1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object b2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Button local_0 = (Button)b1;
								final /*@NonInvalid*/ Button local_1 = (Button)b2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Field::label\'");
										}
										final /*@Thrown*/ String label = local_0.getLabel();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Field::label\'");
										}
										final /*@Thrown*/ String label_0 = local_1.getLabel();
										final /*@Thrown*/ boolean ne_0 = !label.equals(label_0);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_buttons, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardsTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardsPackage.PAGE__CHECKBOX:
				return basicSetCheckbox(null, msgs);
			case WizardsPackage.PAGE__BUTTONS:
				return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return ((InternalEList<?>)getTextFields()).basicRemove(otherEnd, msgs);
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
			case WizardsPackage.PAGE__CHECKBOX:
				return getCheckbox();
			case WizardsPackage.PAGE__BUTTONS:
				return getButtons();
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return getTextFields();
			case WizardsPackage.PAGE__TITLE:
				return getTitle();
			case WizardsPackage.PAGE__NAME:
				return getName();
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
			case WizardsPackage.PAGE__CHECKBOX:
				setCheckbox((CheckBox)newValue);
				return;
			case WizardsPackage.PAGE__BUTTONS:
				getButtons().clear();
				getButtons().addAll((Collection<? extends Button>)newValue);
				return;
			case WizardsPackage.PAGE__TEXT_FIELDS:
				getTextFields().clear();
				getTextFields().addAll((Collection<? extends TextField>)newValue);
				return;
			case WizardsPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case WizardsPackage.PAGE__NAME:
				setName((String)newValue);
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
			case WizardsPackage.PAGE__CHECKBOX:
				setCheckbox((CheckBox)null);
				return;
			case WizardsPackage.PAGE__BUTTONS:
				getButtons().clear();
				return;
			case WizardsPackage.PAGE__TEXT_FIELDS:
				getTextFields().clear();
				return;
			case WizardsPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WizardsPackage.PAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case WizardsPackage.PAGE__CHECKBOX:
				return checkbox != null;
			case WizardsPackage.PAGE__BUTTONS:
				return buttons != null && !buttons.isEmpty();
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return textFields != null && !textFields.isEmpty();
			case WizardsPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WizardsPackage.PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case WizardsPackage.PAGE___NOT_ONLY_SHOW_BTNS__DIAGNOSTICCHAIN_MAP:
				return notOnlyShowBtns((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.PAGE___NOT_SELF_LOOP__DIAGNOSTICCHAIN_MAP:
				return notSelfLoop((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.PAGE___BUTTONS_DIFFERENT_LABEL__DIAGNOSTICCHAIN_MAP:
				return buttonsDifferentLabel((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (title: ");
		result.append(title);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PageImpl
