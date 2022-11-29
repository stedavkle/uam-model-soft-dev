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

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import wizards.Button;
import wizards.Page;
import wizards.Wizard;
import wizards.WizardsPackage;
import wizards.WizardsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.WizardImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link wizards.impl.WizardImpl#getInitialPage <em>Initial Page</em>}</li>
 *   <li>{@link wizards.impl.WizardImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WizardImpl extends MinimalEObjectImpl.Container implements Wizard {
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
	 * The cached value of the '{@link #getInitialPage() <em>Initial Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPage()
	 * @generated
	 * @ordered
	 */
	protected Page initialPage;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.WIZARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.WIZARD__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getInitialPage() {
		if (initialPage != null && initialPage.eIsProxy()) {
			InternalEObject oldInitialPage = (InternalEObject)initialPage;
			initialPage = (Page)eResolveProxy(oldInitialPage);
			if (initialPage != oldInitialPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.WIZARD__INITIAL_PAGE, oldInitialPage, initialPage));
			}
		}
		return initialPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetInitialPage() {
		return initialPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialPage(Page newInitialPage) {
		Page oldInitialPage = initialPage;
		initialPage = newInitialPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.WIZARD__INITIAL_PAGE, oldInitialPage, initialPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WizardsPackage.WIZARD__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean pagesReturnButtons(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Wizard::pagesReturnButtons";
		try {
			/**
			 *
			 * inv pagesReturnButtons:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = pages->forAll(p | p <> self.initialPage implies
			 *           p.buttons->one(b | b.oclIsTypeOf(ReturnButton)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.WIZARD___PAGES_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Page> pages = this.getPages();
					final /*@NonInvalid*/ SetValue BOXED_pages = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Page, pages);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_pages.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
						/**
						 * p <> self.initialPage implies
						 * p.buttons->one(b | b.oclIsTypeOf(ReturnButton))
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ Page initialPage = this.getInitialPage();
							final /*@NonInvalid*/ boolean ne = !initialPage.equals(p);
							final /*@Thrown*/ Boolean implies;
							if (!ne) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_one;
								try {
									if (p == null) {
										throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Page::buttons\'");
									}
									final /*@Thrown*/ List<Button> buttons = p.getButtons();
									final /*@Thrown*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
									/*@Thrown*/ boolean accumulator_0 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_b = BOXED_buttons.iterator();
									/*@Thrown*/ boolean one;
									while (true) {
										if (!ITERATOR_b.hasNext()) {
											one = accumulator_0;
											break;
										}
										/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
										/**
										 * b.oclIsTypeOf(ReturnButton)
										 */
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_ReturnButton_0 = idResolver.getClass(WizardsTables.CLSSid_ReturnButton, null);
										final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizards_c_c_ReturnButton_0).booleanValue();
										//
										if (oclIsTypeOf != ValueUtil.FALSE_VALUE) {			// Carry on till something found
											if (accumulator_0) {
												one = false;
												break;
											}
											else {
												accumulator_0 = true;
											}
										}
									}
									CAUGHT_one = one;
								}
								catch (Exception e) {
									CAUGHT_one = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_one == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_one instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_one;
									}
									implies = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	public boolean initialPageReturnButtons(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Wizard::initialPageReturnButtons";
		try {
			/**
			 *
			 * inv initialPageReturnButtons:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.initialPage.buttons->forAll(b |
			 *           not b.oclIsTypeOf(ReturnButton))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.WIZARD___INITIAL_PAGE_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Page initialPage = this.getInitialPage();
					final /*@NonInvalid*/ List<Button> buttons = initialPage.getButtons();
					final /*@NonInvalid*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_b = BOXED_buttons.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_b.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
						/**
						 * not b.oclIsTypeOf(ReturnButton)
						 */
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_oclIsTypeOf;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_ReturnButton = idResolver.getClass(WizardsTables.CLSSid_ReturnButton, null);
								final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizards_c_c_ReturnButton).booleanValue();
								CAUGHT_oclIsTypeOf = oclIsTypeOf;
							}
							catch (Exception e) {
								CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_oclIsTypeOf;
							}
							final /*@Thrown*/ Boolean not;
							if (CAUGHT_oclIsTypeOf == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_oclIsTypeOf == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							CAUGHT_not = not;
						}
						catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_not == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_not == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_not == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_not instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_not;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	public boolean atLeastCloseBtn(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Wizard::atLeastCloseBtn";
		try {
			/**
			 *
			 * inv atLeastCloseBtn:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = pages->forAll(p |
			 *           p.buttons->select(b | b.oclIsTypeOf(NavButton))
			 *           ->size() = 0 and
			 *           p.buttons->select(b | b.oclIsTypeOf(ReturnButton))
			 *           ->size() = 0 implies
			 *           p.buttons->select(b | b.oclIsTypeOf(CloseButton))
			 *           ->size() > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.WIZARD___AT_LEAST_CLOSE_BTN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Page> pages = this.getPages();
					final /*@NonInvalid*/ SetValue BOXED_pages = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Page, pages);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_pages.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
						/**
						 *
						 * p.buttons->select(b | b.oclIsTypeOf(NavButton))
						 * ->size() = 0 and
						 * p.buttons->select(b | b.oclIsTypeOf(ReturnButton))
						 * ->size() = 0 implies
						 * p.buttons->select(b | b.oclIsTypeOf(CloseButton))
						 * ->size() > 0
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (p == null) {
										throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Page::buttons\'");
									}
									final /*@Thrown*/ List<Button> buttons = p.getButtons();
									final /*@Thrown*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
									/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(WizardsTables.SET_CLSSid_Button);
									Iterator<Object> ITERATOR_b = BOXED_buttons.iterator();
									/*@Thrown*/ SetValue select;
									while (true) {
										if (!ITERATOR_b.hasNext()) {
											select = accumulator_0;
											break;
										}
										/*@NonInvalid*/ Button b = (Button)ITERATOR_b.next();
										/**
										 * b.oclIsTypeOf(NavButton)
										 */
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_NavButton = idResolver.getClass(WizardsTables.CLSSid_NavButton, null);
										final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b, TYP_wizards_c_c_NavButton).booleanValue();
										//
										if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
											accumulator_0.add(b);
										}
									}
									final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
									final /*@Thrown*/ boolean eq = size.equals(WizardsTables.INT_0);
									CAUGHT_eq = eq;
								}
								catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_eq_0;
									try {
										if (p == null) {
											throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Page::buttons\'");
										}
										final /*@Thrown*/ List<Button> buttons_0 = p.getButtons();
										final /*@Thrown*/ SetValue BOXED_buttons_0 = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons_0);
										/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSetAccumulatorValue(WizardsTables.SET_CLSSid_Button);
										Iterator<Object> ITERATOR_b_0 = BOXED_buttons_0.iterator();
										/*@Thrown*/ SetValue select_0;
										while (true) {
											if (!ITERATOR_b_0.hasNext()) {
												select_0 = accumulator_1;
												break;
											}
											/*@NonInvalid*/ Button b_0 = (Button)ITERATOR_b_0.next();
											/**
											 * b.oclIsTypeOf(ReturnButton)
											 */
											final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_ReturnButton_0 = idResolver.getClass(WizardsTables.CLSSid_ReturnButton, null);
											final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b_0, TYP_wizards_c_c_ReturnButton_0).booleanValue();
											//
											if (oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
												accumulator_1.add(b_0);
											}
										}
										final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
										final /*@Thrown*/ boolean eq_0 = size_0.equals(WizardsTables.INT_0);
										CAUGHT_eq_0 = eq_0;
									}
									catch (Exception e) {
										CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_eq;
										}
										if (CAUGHT_eq_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_eq_0;
										}
										and = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and = and;
							}
							catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean implies;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_gt;
								try {
									if (p == null) {
										throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::Page::buttons\'");
									}
									final /*@Thrown*/ List<Button> buttons_1 = p.getButtons();
									final /*@Thrown*/ SetValue BOXED_buttons_1 = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons_1);
									/*@Thrown*/ Accumulator accumulator_2 = ValueUtil.createSetAccumulatorValue(WizardsTables.SET_CLSSid_Button);
									Iterator<Object> ITERATOR_b_1 = BOXED_buttons_1.iterator();
									/*@Thrown*/ SetValue select_1;
									while (true) {
										if (!ITERATOR_b_1.hasNext()) {
											select_1 = accumulator_2;
											break;
										}
										/*@NonInvalid*/ Button b_1 = (Button)ITERATOR_b_1.next();
										/**
										 * b.oclIsTypeOf(CloseButton)
										 */
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_CloseButton = idResolver.getClass(WizardsTables.CLSSid_CloseButton, null);
										final /*@Thrown*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, b_1, TYP_wizards_c_c_CloseButton).booleanValue();
										//
										if (oclIsTypeOf_1 == ValueUtil.TRUE_VALUE) {
											accumulator_2.add(b_1);
										}
									}
									final /*@Thrown*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(select_1);
									final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_1, WizardsTables.INT_0).booleanValue();
									CAUGHT_gt = gt;
								}
								catch (Exception e) {
									CAUGHT_gt = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and;
									}
									if (CAUGHT_gt instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_gt;
									}
									if (CAUGHT_and == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardsPackage.WIZARD__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case WizardsPackage.WIZARD__TITLE:
				return getTitle();
			case WizardsPackage.WIZARD__INITIAL_PAGE:
				if (resolve) return getInitialPage();
				return basicGetInitialPage();
			case WizardsPackage.WIZARD__PAGES:
				return getPages();
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
			case WizardsPackage.WIZARD__TITLE:
				setTitle((String)newValue);
				return;
			case WizardsPackage.WIZARD__INITIAL_PAGE:
				setInitialPage((Page)newValue);
				return;
			case WizardsPackage.WIZARD__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
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
			case WizardsPackage.WIZARD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WizardsPackage.WIZARD__INITIAL_PAGE:
				setInitialPage((Page)null);
				return;
			case WizardsPackage.WIZARD__PAGES:
				getPages().clear();
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
			case WizardsPackage.WIZARD__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WizardsPackage.WIZARD__INITIAL_PAGE:
				return initialPage != null;
			case WizardsPackage.WIZARD__PAGES:
				return pages != null && !pages.isEmpty();
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
			case WizardsPackage.WIZARD___PAGES_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP:
				return pagesReturnButtons((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.WIZARD___INITIAL_PAGE_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP:
				return initialPageReturnButtons((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.WIZARD___AT_LEAST_CLOSE_BTN__DIAGNOSTICCHAIN_MAP:
				return atLeastCloseBtn((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //WizardImpl
