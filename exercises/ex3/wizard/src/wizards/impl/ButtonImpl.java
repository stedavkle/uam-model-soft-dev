/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import wizards.Button;
import wizards.Page;
import wizards.WizardsPackage;
import wizards.WizardsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.ButtonImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link wizards.impl.ButtonImpl#getOtherTargetPage <em>Other Target Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ButtonImpl extends FieldImpl implements Button {
	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page targetPage;

	/**
	 * The cached value of the '{@link #getOtherTargetPage() <em>Other Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page otherTargetPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (Page)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.BUTTON__TARGET_PAGE, oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPage(Page newTargetPage) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.BUTTON__TARGET_PAGE, oldTargetPage, targetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getOtherTargetPage() {
		if (otherTargetPage != null && otherTargetPage.eIsProxy()) {
			InternalEObject oldOtherTargetPage = (InternalEObject)otherTargetPage;
			otherTargetPage = (Page)eResolveProxy(oldOtherTargetPage);
			if (otherTargetPage != oldOtherTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.BUTTON__OTHER_TARGET_PAGE, oldOtherTargetPage, otherTargetPage));
			}
		}
		return otherTargetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetOtherTargetPage() {
		return otherTargetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTargetPage(Page newOtherTargetPage) {
		Page oldOtherTargetPage = otherTargetPage;
		otherTargetPage = newOtherTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.BUTTON__OTHER_TARGET_PAGE, oldOtherTargetPage, otherTargetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean labelMaxSize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Button::labelMaxSize";
		try {
			/**
			 *
			 * inv labelMaxSize:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = label.size() <= 10
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String label = this.getLabel();
				final /*@NonInvalid*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(label);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, WizardsTables.INT_10).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardsTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardsPackage.BUTTON__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
			case WizardsPackage.BUTTON__OTHER_TARGET_PAGE:
				if (resolve) return getOtherTargetPage();
				return basicGetOtherTargetPage();
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
			case WizardsPackage.BUTTON__TARGET_PAGE:
				setTargetPage((Page)newValue);
				return;
			case WizardsPackage.BUTTON__OTHER_TARGET_PAGE:
				setOtherTargetPage((Page)newValue);
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
			case WizardsPackage.BUTTON__TARGET_PAGE:
				setTargetPage((Page)null);
				return;
			case WizardsPackage.BUTTON__OTHER_TARGET_PAGE:
				setOtherTargetPage((Page)null);
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
			case WizardsPackage.BUTTON__TARGET_PAGE:
				return targetPage != null;
			case WizardsPackage.BUTTON__OTHER_TARGET_PAGE:
				return otherTargetPage != null;
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
			case WizardsPackage.BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP:
				return labelMaxSize((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ButtonImpl
