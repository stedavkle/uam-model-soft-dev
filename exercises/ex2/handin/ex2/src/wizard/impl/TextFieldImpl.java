/**
 */
package wizard.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import org.eclipse.ocl.pivot.values.InvalidValueException;
import wizard.Label;
import wizard.TextField;
import wizard.WizardPackage;
import wizard.WizardTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.TextFieldImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link wizard.impl.TextFieldImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link wizard.impl.TextFieldImpl#getInput <em>Input</em>}</li>
 *   <li>{@link wizard.impl.TextFieldImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFieldImpl extends MinimalEObjectImpl.Container implements TextField {
	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.TEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.TEXT_FIELD__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.TEXT_FIELD__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.TEXT_FIELD__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WizardPackage.TEXT_FIELD__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WizardPackage.TEXT_FIELD__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WizardPackage.TEXT_FIELD__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.TEXT_FIELD__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean minMaxLength(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TextField::minMaxLength";
		try {
			/**
			 *
			 * inv minMaxLength:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = input.size() >= minLength and
			 *         input.size() <= maxLength or minLength = 0 and maxLength = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.TEXT_FIELD___MIN_MAX_LENGTH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ int maxLength_0 = this.getMaxLength();
					final /*@NonInvalid*/ int minLength_0 = this.getMinLength();
					final /*@NonInvalid*/ IntegerValue BOXED_maxLength_0 = ValueUtil.integerValueOf(maxLength_0);
					final /*@NonInvalid*/ IntegerValue BOXED_minLength_0 = ValueUtil.integerValueOf(minLength_0);
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_ge;
						try {
							final /*@NonInvalid*/ String input = this.getInput();
							if (input == null) {
								throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(input);
							final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_minLength_0).booleanValue();
							CAUGHT_ge = ge;
						}
						catch (Exception e) {
							CAUGHT_ge = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_le_0;
							try {
								final /*@NonInvalid*/ String input_0 = this.getInput();
								if (input_0 == null) {
									throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(input_0);
								final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, BOXED_maxLength_0).booleanValue();
								CAUGHT_le_0 = le_0;
							}
							catch (Exception e) {
								CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_ge instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_ge;
								}
								if (CAUGHT_le_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_le_0;
								}
								and = ValueUtil.TRUE_VALUE;
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
						final /*@NonInvalid*/ boolean eq = BOXED_minLength_0.equals(WizardTables.INT_0);
						final /*@NonInvalid*/ Boolean and_0;
						if (!eq) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_maxLength_0.equals(WizardTables.INT_0);
							if (!eq_0) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								and_0 = ValueUtil.TRUE_VALUE;
							}
						}
						if (and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if ((CAUGHT_and == null) || (and_0 == null)) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.TEXT_FIELD__LABEL:
				return basicSetLabel(null, msgs);
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
			case WizardPackage.TEXT_FIELD__MIN_LENGTH:
				return getMinLength();
			case WizardPackage.TEXT_FIELD__MAX_LENGTH:
				return getMaxLength();
			case WizardPackage.TEXT_FIELD__INPUT:
				return getInput();
			case WizardPackage.TEXT_FIELD__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WizardPackage.TEXT_FIELD__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case WizardPackage.TEXT_FIELD__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case WizardPackage.TEXT_FIELD__INPUT:
				setInput((String)newValue);
				return;
			case WizardPackage.TEXT_FIELD__LABEL:
				setLabel((Label)newValue);
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
			case WizardPackage.TEXT_FIELD__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case WizardPackage.TEXT_FIELD__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case WizardPackage.TEXT_FIELD__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case WizardPackage.TEXT_FIELD__LABEL:
				setLabel((Label)null);
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
			case WizardPackage.TEXT_FIELD__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case WizardPackage.TEXT_FIELD__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case WizardPackage.TEXT_FIELD__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case WizardPackage.TEXT_FIELD__LABEL:
				return label != null;
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
			case WizardPackage.TEXT_FIELD___MIN_MAX_LENGTH__DIAGNOSTICCHAIN_MAP:
				return minMaxLength((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", input: ");
		result.append(input);
		result.append(')');
		return result.toString();
	}

} //TextFieldImpl
