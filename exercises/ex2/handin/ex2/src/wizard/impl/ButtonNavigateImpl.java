/**
 */
package wizard.impl;

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

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import wizard.ButtonNavigate;
import wizard.Page;
import wizard.WizardPackage;
import wizard.WizardTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Navigate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.ButtonNavigateImpl#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link wizard.impl.ButtonNavigateImpl#getNextPageAlt <em>Next Page Alt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonNavigateImpl extends ButtonImpl implements ButtonNavigate {
	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected Page nextPage;

	/**
	 * The cached value of the '{@link #getNextPageAlt() <em>Next Page Alt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageAlt()
	 * @generated
	 * @ordered
	 */
	protected Page nextPageAlt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonNavigateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.BUTTON_NAVIGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (Page)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(Page newNextPage) {
		Page oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE, oldNextPage, nextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPageAlt() {
		if (nextPageAlt != null && nextPageAlt.eIsProxy()) {
			InternalEObject oldNextPageAlt = (InternalEObject)nextPageAlt;
			nextPageAlt = (Page)eResolveProxy(oldNextPageAlt);
			if (nextPageAlt != oldNextPageAlt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT, oldNextPageAlt, nextPageAlt));
			}
		}
		return nextPageAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPageAlt() {
		return nextPageAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPageAlt(Page newNextPageAlt) {
		Page oldNextPageAlt = nextPageAlt;
		nextPageAlt = newNextPageAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT, oldNextPageAlt, nextPageAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean myPageDifferNextPage(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ButtonNavigate::myPageDifferNextPage";
		try {
			/**
			 *
			 * inv myPageDifferNextPage:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.myPage <> self.nextPage and self.myPage <> self.nextPageAlt
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardPackage.Literals.BUTTON_NAVIGATE___MY_PAGE_DIFFER_NEXT_PAGE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Page myPage_0 = this.getMyPage();
				final /*@NonInvalid*/ Page nextPage = this.getNextPage();
				final /*@NonInvalid*/ boolean ne = !myPage_0.equals(nextPage);
				final /*@NonInvalid*/ Boolean result;
				if (!ne) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Page nextPageAlt = this.getNextPageAlt();
					final /*@NonInvalid*/ boolean ne_0 = !myPage_0.equals(nextPageAlt);
					if (!ne_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT:
				if (resolve) return getNextPageAlt();
				return basicGetNextPageAlt();
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
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE:
				setNextPage((Page)newValue);
				return;
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT:
				setNextPageAlt((Page)newValue);
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
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE:
				setNextPage((Page)null);
				return;
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT:
				setNextPageAlt((Page)null);
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
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE:
				return nextPage != null;
			case WizardPackage.BUTTON_NAVIGATE__NEXT_PAGE_ALT:
				return nextPageAlt != null;
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
			case WizardPackage.BUTTON_NAVIGATE___MY_PAGE_DIFFER_NEXT_PAGE__DIAGNOSTICCHAIN_MAP:
				return myPageDifferNextPage((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ButtonNavigateImpl
