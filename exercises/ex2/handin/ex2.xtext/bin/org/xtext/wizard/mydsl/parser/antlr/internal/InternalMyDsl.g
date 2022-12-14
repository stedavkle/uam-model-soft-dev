/*
 * generated by Xtext 2.28.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.wizard.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.wizard.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.wizard.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Wizard";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleWizard
entryRuleWizard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWizardRule()); }
	iv_ruleWizard=ruleWizard
	{ $current=$iv_ruleWizard.current; }
	EOF;

// Rule Wizard
ruleWizard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Wizard:'
		{
			newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
		}
		otherlv_1='title'
		{
			newLeafNode(otherlv_1, grammarAccess.getWizardAccess().getTitleKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWizardAccess().getTitleEStringParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWizardRule());
					}
					set(
						$current,
						"title",
						lv_title_2_0,
						"org.xtext.wizard.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='pages'
		{
			newLeafNode(otherlv_3, grammarAccess.getWizardAccess().getPagesKeyword_3());
		}
		otherlv_4='['
		{
			newLeafNode(otherlv_4, grammarAccess.getWizardAccess().getLeftSquareBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_5_0());
				}
				lv_pages_5_0=rulePage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWizardRule());
					}
					add(
						$current,
						"pages",
						lv_pages_5_0,
						"org.xtext.wizard.mydsl.MyDsl.Page");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getWizardAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_6_1_0());
					}
					lv_pages_7_0=rulePage
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWizardRule());
						}
						add(
							$current,
							"pages",
							lv_pages_7_0,
							"org.xtext.wizard.mydsl.MyDsl.Page");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=']'
		{
			newLeafNode(otherlv_8, grammarAccess.getWizardAccess().getRightSquareBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getButtonAccess().getButtonNavigateParserRuleCall_0());
		}
		this_ButtonNavigate_0=ruleButtonNavigate
		{
			$current = $this_ButtonNavigate_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getButtonAccess().getButtonReturnParserRuleCall_1());
		}
		this_ButtonReturn_1=ruleButtonReturn
		{
			$current = $this_ButtonReturn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getButtonAccess().getButtonShowParserRuleCall_2());
		}
		this_ButtonShow_2=ruleButtonShow
		{
			$current = $this_ButtonShow_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getButtonAccess().getButtonCloseParserRuleCall_3());
		}
		this_ButtonClose_3=ruleButtonClose
		{
			$current = $this_ButtonClose_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePage
entryRulePage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	iv_rulePage=rulePage
	{ $current=$iv_rulePage.current; }
	EOF;

// Rule Page
rulePage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_init_0_0='init'
				{
					newLeafNode(lv_init_0_0, grammarAccess.getPageAccess().getInitInitKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageRule());
					}
					setWithLastConsumed($current, "init", lv_init_0_0 != null, "init");
				}
			)
		)
		otherlv_1='Page:'
		{
			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
		}
		(
			otherlv_2='textfields'
			{
				newLeafNode(otherlv_2, grammarAccess.getPageAccess().getTextfieldsKeyword_2_0());
			}
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftSquareBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_2_0());
					}
					lv_textfields_4_0=ruleTextField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPageRule());
						}
						add(
							$current,
							"textfields",
							lv_textfields_4_0,
							"org.xtext.wizard.mydsl.MyDsl.TextField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getPageAccess().getCommaKeyword_2_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_3_1_0());
						}
						lv_textfields_6_0=ruleTextField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPageRule());
							}
							add(
								$current,
								"textfields",
								lv_textfields_6_0,
								"org.xtext.wizard.mydsl.MyDsl.TextField");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightSquareBracketKeyword_2_4());
			}
		)?
		(
			otherlv_8='checkbox'
			{
				newLeafNode(otherlv_8, grammarAccess.getPageAccess().getCheckboxKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPageAccess().getCheckboxCheckboxParserRuleCall_3_1_0());
					}
					lv_checkbox_9_0=ruleCheckbox
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPageRule());
						}
						set(
							$current,
							"checkbox",
							lv_checkbox_9_0,
							"org.xtext.wizard.mydsl.MyDsl.Checkbox");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='buttons'
		{
			newLeafNode(otherlv_10, grammarAccess.getPageAccess().getButtonsKeyword_4());
		}
		otherlv_11='['
		{
			newLeafNode(otherlv_11, grammarAccess.getPageAccess().getLeftSquareBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_6_0());
				}
				lv_buttons_12_0=ruleButton
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageRule());
					}
					add(
						$current,
						"buttons",
						lv_buttons_12_0,
						"org.xtext.wizard.mydsl.MyDsl.Button");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_13=','
			{
				newLeafNode(otherlv_13, grammarAccess.getPageAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_7_1_0());
					}
					lv_buttons_14_0=ruleButton
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPageRule());
						}
						add(
							$current,
							"buttons",
							lv_buttons_14_0,
							"org.xtext.wizard.mydsl.MyDsl.Button");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_15=']'
		{
			newLeafNode(otherlv_15, grammarAccess.getPageAccess().getRightSquareBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleTextField
entryRuleTextField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextFieldRule()); }
	iv_ruleTextField=ruleTextField
	{ $current=$iv_ruleTextField.current; }
	EOF;

// Rule TextField
ruleTextField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TextField:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
		}
		otherlv_1='minLength'
		{
			newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getMinLengthKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextFieldAccess().getMinLengthEIntParserRuleCall_2_0());
				}
				lv_minLength_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextFieldRule());
					}
					set(
						$current,
						"minLength",
						lv_minLength_2_0,
						"org.xtext.wizard.mydsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='maxLength'
		{
			newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getMaxLengthKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextFieldAccess().getMaxLengthEIntParserRuleCall_4_0());
				}
				lv_maxLength_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextFieldRule());
					}
					set(
						$current,
						"maxLength",
						lv_maxLength_4_0,
						"org.xtext.wizard.mydsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='input'
			{
				newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getInputKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTextFieldAccess().getInputEStringParserRuleCall_5_1_0());
					}
					lv_input_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTextFieldRule());
						}
						set(
							$current,
							"input",
							lv_input_6_0,
							"org.xtext.wizard.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='label'
		{
			newLeafNode(otherlv_7, grammarAccess.getTextFieldAccess().getLabelKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_7_0());
				}
				lv_label_8_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextFieldRule());
					}
					set(
						$current,
						"label",
						lv_label_8_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCheckbox
entryRuleCheckbox returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckboxRule()); }
	iv_ruleCheckbox=ruleCheckbox
	{ $current=$iv_ruleCheckbox.current; }
	EOF;

// Rule Checkbox
ruleCheckbox returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_selected_0_0='selected'
				{
					newLeafNode(lv_selected_0_0, grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCheckboxRule());
					}
					setWithLastConsumed($current, "selected", lv_selected_0_0 != null, "selected");
				}
			)
		)
		otherlv_1='Checkbox:'
		{
			newLeafNode(otherlv_1, grammarAccess.getCheckboxAccess().getCheckboxKeyword_1());
		}
		otherlv_2='label'
		{
			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getLabelKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCheckboxAccess().getLabelLabelParserRuleCall_3_0());
				}
				lv_label_3_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCheckboxRule());
					}
					set(
						$current,
						"label",
						lv_label_3_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Label:'
		{
			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
		}
		otherlv_1='text'
		{
			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getTextKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLabelAccess().getTextEStringParserRuleCall_2_0());
				}
				lv_text_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLabelRule());
					}
					set(
						$current,
						"text",
						lv_text_2_0,
						"org.xtext.wizard.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleButtonNavigate
entryRuleButtonNavigate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonNavigateRule()); }
	iv_ruleButtonNavigate=ruleButtonNavigate
	{ $current=$iv_ruleButtonNavigate.current; }
	EOF;

// Rule ButtonNavigate
ruleButtonNavigate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ButtonNavigate:'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonNavigateAccess().getButtonNavigateKeyword_0());
		}
		otherlv_1='nextPage'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonNavigateAccess().getNextPageKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonNavigateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getButtonNavigateAccess().getNextPagePageCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='nextPageAlt'
			{
				newLeafNode(otherlv_3, grammarAccess.getButtonNavigateAccess().getNextPageAltKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getButtonNavigateRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getButtonNavigateAccess().getNextPageAltPageCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='label'
		{
			newLeafNode(otherlv_5, grammarAccess.getButtonNavigateAccess().getLabelKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonNavigateAccess().getLabelLabelParserRuleCall_5_0());
				}
				lv_label_6_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonNavigateRule());
					}
					set(
						$current,
						"label",
						lv_label_6_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleButtonReturn
entryRuleButtonReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonReturnRule()); }
	iv_ruleButtonReturn=ruleButtonReturn
	{ $current=$iv_ruleButtonReturn.current; }
	EOF;

// Rule ButtonReturn
ruleButtonReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ButtonReturn:'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonReturnAccess().getButtonReturnKeyword_0());
		}
		otherlv_1='previousPage'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonReturnAccess().getPreviousPageKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonReturnRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getButtonReturnAccess().getPreviousPagePageCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='label'
		{
			newLeafNode(otherlv_3, grammarAccess.getButtonReturnAccess().getLabelKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonReturnAccess().getLabelLabelParserRuleCall_4_0());
				}
				lv_label_4_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonReturnRule());
					}
					set(
						$current,
						"label",
						lv_label_4_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleButtonShow
entryRuleButtonShow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonShowRule()); }
	iv_ruleButtonShow=ruleButtonShow
	{ $current=$iv_ruleButtonShow.current; }
	EOF;

// Rule ButtonShow
ruleButtonShow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ButtonShow:'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonShowAccess().getButtonShowKeyword_0());
		}
		otherlv_1='message'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonShowAccess().getMessageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonShowAccess().getMessageEStringParserRuleCall_2_0());
				}
				lv_message_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonShowRule());
					}
					set(
						$current,
						"message",
						lv_message_2_0,
						"org.xtext.wizard.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='label'
		{
			newLeafNode(otherlv_3, grammarAccess.getButtonShowAccess().getLabelKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonShowAccess().getLabelLabelParserRuleCall_4_0());
				}
				lv_label_4_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonShowRule());
					}
					set(
						$current,
						"label",
						lv_label_4_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleButtonClose
entryRuleButtonClose returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonCloseRule()); }
	iv_ruleButtonClose=ruleButtonClose
	{ $current=$iv_ruleButtonClose.current; }
	EOF;

// Rule ButtonClose
ruleButtonClose returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ButtonClose:'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonCloseAccess().getButtonCloseKeyword_0());
		}
		otherlv_1='wizard'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonCloseAccess().getWizardKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonCloseRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getButtonCloseAccess().getWizardWizardCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='label'
		{
			newLeafNode(otherlv_3, grammarAccess.getButtonCloseAccess().getLabelKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonCloseAccess().getLabelLabelParserRuleCall_4_0());
				}
				lv_label_4_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonCloseRule());
					}
					set(
						$current,
						"label",
						lv_label_4_0,
						"org.xtext.wizard.mydsl.MyDsl.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
