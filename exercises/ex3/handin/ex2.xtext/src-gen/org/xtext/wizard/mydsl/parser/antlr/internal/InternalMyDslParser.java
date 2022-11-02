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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard:'", "'title'", "'pages'", "'['", "','", "']'", "'init'", "'Page:'", "'textfields'", "'checkbox'", "'buttons'", "'TextField:'", "'minLength'", "'maxLength'", "'input'", "'label'", "'selected'", "'Checkbox:'", "'-'", "'Label:'", "'text'", "'ButtonNavigate:'", "'nextPage'", "'nextPageAlt'", "'ButtonReturn:'", "'previousPage'", "'ButtonShow:'", "'message'", "'ButtonClose:'", "'wizard'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleWizard"
    // InternalMyDsl.g:64:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleWizard= ruleWizard EOF )
            // InternalMyDsl.g:65:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalMyDsl.g:71:1: ruleWizard returns [EObject current=null] : (otherlv_0= 'Wizard:' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages' otherlv_4= '[' ( (lv_pages_5_0= rulePage ) ) (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_pages_5_0 = null;

        EObject lv_pages_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Wizard:' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages' otherlv_4= '[' ( (lv_pages_5_0= rulePage ) ) (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )* otherlv_8= ']' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Wizard:' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages' otherlv_4= '[' ( (lv_pages_5_0= rulePage ) ) (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )* otherlv_8= ']' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Wizard:' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages' otherlv_4= '[' ( (lv_pages_5_0= rulePage ) ) (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )* otherlv_8= ']' )
            // InternalMyDsl.g:79:3: otherlv_0= 'Wizard:' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= 'pages' otherlv_4= '[' ( (lv_pages_5_0= rulePage ) ) (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWizardAccess().getTitleKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_title_2_0= ruleEString ) )
            // InternalMyDsl.g:88:4: (lv_title_2_0= ruleEString )
            {
            // InternalMyDsl.g:88:4: (lv_title_2_0= ruleEString )
            // InternalMyDsl.g:89:5: lv_title_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getTitleEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_title_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.xtext.wizard.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWizardAccess().getPagesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWizardAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMyDsl.g:114:3: ( (lv_pages_5_0= rulePage ) )
            // InternalMyDsl.g:115:4: (lv_pages_5_0= rulePage )
            {
            // InternalMyDsl.g:115:4: (lv_pages_5_0= rulePage )
            // InternalMyDsl.g:116:5: lv_pages_5_0= rulePage
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_pages_5_0=rulePage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					add(
            						current,
            						"pages",
            						lv_pages_5_0,
            						"org.xtext.wizard.mydsl.MyDsl.Page");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:133:3: (otherlv_6= ',' ( (lv_pages_7_0= rulePage ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:134:4: otherlv_6= ',' ( (lv_pages_7_0= rulePage ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getWizardAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:138:4: ( (lv_pages_7_0= rulePage ) )
            	    // InternalMyDsl.g:139:5: (lv_pages_7_0= rulePage )
            	    {
            	    // InternalMyDsl.g:139:5: (lv_pages_7_0= rulePage )
            	    // InternalMyDsl.g:140:6: lv_pages_7_0= rulePage
            	    {

            	    						newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_pages_7_0=rulePage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWizardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pages",
            	    							lv_pages_7_0,
            	    							"org.xtext.wizard.mydsl.MyDsl.Page");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWizardAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:166:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:166:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:167:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:173:1: ruleButton returns [EObject current=null] : (this_ButtonNavigate_0= ruleButtonNavigate | this_ButtonReturn_1= ruleButtonReturn | this_ButtonShow_2= ruleButtonShow | this_ButtonClose_3= ruleButtonClose ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonNavigate_0 = null;

        EObject this_ButtonReturn_1 = null;

        EObject this_ButtonShow_2 = null;

        EObject this_ButtonClose_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:179:2: ( (this_ButtonNavigate_0= ruleButtonNavigate | this_ButtonReturn_1= ruleButtonReturn | this_ButtonShow_2= ruleButtonShow | this_ButtonClose_3= ruleButtonClose ) )
            // InternalMyDsl.g:180:2: (this_ButtonNavigate_0= ruleButtonNavigate | this_ButtonReturn_1= ruleButtonReturn | this_ButtonShow_2= ruleButtonShow | this_ButtonClose_3= ruleButtonClose )
            {
            // InternalMyDsl.g:180:2: (this_ButtonNavigate_0= ruleButtonNavigate | this_ButtonReturn_1= ruleButtonReturn | this_ButtonShow_2= ruleButtonShow | this_ButtonClose_3= ruleButtonClose )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:181:3: this_ButtonNavigate_0= ruleButtonNavigate
                    {

                    			newCompositeNode(grammarAccess.getButtonAccess().getButtonNavigateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ButtonNavigate_0=ruleButtonNavigate();

                    state._fsp--;


                    			current = this_ButtonNavigate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:190:3: this_ButtonReturn_1= ruleButtonReturn
                    {

                    			newCompositeNode(grammarAccess.getButtonAccess().getButtonReturnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ButtonReturn_1=ruleButtonReturn();

                    state._fsp--;


                    			current = this_ButtonReturn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:199:3: this_ButtonShow_2= ruleButtonShow
                    {

                    			newCompositeNode(grammarAccess.getButtonAccess().getButtonShowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ButtonShow_2=ruleButtonShow();

                    state._fsp--;


                    			current = this_ButtonShow_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:208:3: this_ButtonClose_3= ruleButtonClose
                    {

                    			newCompositeNode(grammarAccess.getButtonAccess().getButtonCloseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ButtonClose_3=ruleButtonClose();

                    state._fsp--;


                    			current = this_ButtonClose_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:220:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:220:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:221:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:227:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:233:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:234:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:234:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:235:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:243:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // InternalMyDsl.g:254:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalMyDsl.g:254:45: (iv_rulePage= rulePage EOF )
            // InternalMyDsl.g:255:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalMyDsl.g:261:1: rulePage returns [EObject current=null] : ( ( (lv_init_0_0= 'init' ) ) otherlv_1= 'Page:' (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )? (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )? otherlv_10= 'buttons' otherlv_11= '[' ( (lv_buttons_12_0= ruleButton ) ) (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )* otherlv_15= ']' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_init_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_textfields_4_0 = null;

        EObject lv_textfields_6_0 = null;

        EObject lv_checkbox_9_0 = null;

        EObject lv_buttons_12_0 = null;

        EObject lv_buttons_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:267:2: ( ( ( (lv_init_0_0= 'init' ) ) otherlv_1= 'Page:' (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )? (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )? otherlv_10= 'buttons' otherlv_11= '[' ( (lv_buttons_12_0= ruleButton ) ) (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )* otherlv_15= ']' ) )
            // InternalMyDsl.g:268:2: ( ( (lv_init_0_0= 'init' ) ) otherlv_1= 'Page:' (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )? (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )? otherlv_10= 'buttons' otherlv_11= '[' ( (lv_buttons_12_0= ruleButton ) ) (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )* otherlv_15= ']' )
            {
            // InternalMyDsl.g:268:2: ( ( (lv_init_0_0= 'init' ) ) otherlv_1= 'Page:' (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )? (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )? otherlv_10= 'buttons' otherlv_11= '[' ( (lv_buttons_12_0= ruleButton ) ) (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )* otherlv_15= ']' )
            // InternalMyDsl.g:269:3: ( (lv_init_0_0= 'init' ) ) otherlv_1= 'Page:' (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )? (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )? otherlv_10= 'buttons' otherlv_11= '[' ( (lv_buttons_12_0= ruleButton ) ) (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )* otherlv_15= ']'
            {
            // InternalMyDsl.g:269:3: ( (lv_init_0_0= 'init' ) )
            // InternalMyDsl.g:270:4: (lv_init_0_0= 'init' )
            {
            // InternalMyDsl.g:270:4: (lv_init_0_0= 'init' )
            // InternalMyDsl.g:271:5: lv_init_0_0= 'init'
            {
            lv_init_0_0=(Token)match(input,17,FOLLOW_9); 

            					newLeafNode(lv_init_0_0, grammarAccess.getPageAccess().getInitInitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(current, "init", lv_init_0_0 != null, "init");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
            		
            // InternalMyDsl.g:287:3: (otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:288:4: otherlv_2= 'textfields' otherlv_3= '[' ( (lv_textfields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )* otherlv_7= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPageAccess().getTextfieldsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalMyDsl.g:296:4: ( (lv_textfields_4_0= ruleTextField ) )
                    // InternalMyDsl.g:297:5: (lv_textfields_4_0= ruleTextField )
                    {
                    // InternalMyDsl.g:297:5: (lv_textfields_4_0= ruleTextField )
                    // InternalMyDsl.g:298:6: lv_textfields_4_0= ruleTextField
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_textfields_4_0=ruleTextField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"textfields",
                    							lv_textfields_4_0,
                    							"org.xtext.wizard.mydsl.MyDsl.TextField");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:315:4: (otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:316:5: otherlv_5= ',' ( (lv_textfields_6_0= ruleTextField ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPageAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDsl.g:320:5: ( (lv_textfields_6_0= ruleTextField ) )
                    	    // InternalMyDsl.g:321:6: (lv_textfields_6_0= ruleTextField )
                    	    {
                    	    // InternalMyDsl.g:321:6: (lv_textfields_6_0= ruleTextField )
                    	    // InternalMyDsl.g:322:7: lv_textfields_6_0= ruleTextField
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_textfields_6_0=ruleTextField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"textfields",
                    	    								lv_textfields_6_0,
                    	    								"org.xtext.wizard.mydsl.MyDsl.TextField");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:345:3: (otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:346:4: otherlv_8= 'checkbox' ( (lv_checkbox_9_0= ruleCheckbox ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getPageAccess().getCheckboxKeyword_3_0());
                    			
                    // InternalMyDsl.g:350:4: ( (lv_checkbox_9_0= ruleCheckbox ) )
                    // InternalMyDsl.g:351:5: (lv_checkbox_9_0= ruleCheckbox )
                    {
                    // InternalMyDsl.g:351:5: (lv_checkbox_9_0= ruleCheckbox )
                    // InternalMyDsl.g:352:6: lv_checkbox_9_0= ruleCheckbox
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getCheckboxCheckboxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_checkbox_9_0=ruleCheckbox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"checkbox",
                    							lv_checkbox_9_0,
                    							"org.xtext.wizard.mydsl.MyDsl.Checkbox");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getPageAccess().getButtonsKeyword_4());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getPageAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMyDsl.g:378:3: ( (lv_buttons_12_0= ruleButton ) )
            // InternalMyDsl.g:379:4: (lv_buttons_12_0= ruleButton )
            {
            // InternalMyDsl.g:379:4: (lv_buttons_12_0= ruleButton )
            // InternalMyDsl.g:380:5: lv_buttons_12_0= ruleButton
            {

            					newCompositeNode(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_buttons_12_0=ruleButton();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					add(
            						current,
            						"buttons",
            						lv_buttons_12_0,
            						"org.xtext.wizard.mydsl.MyDsl.Button");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:397:3: (otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:398:4: otherlv_13= ',' ( (lv_buttons_14_0= ruleButton ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_13, grammarAccess.getPageAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:402:4: ( (lv_buttons_14_0= ruleButton ) )
            	    // InternalMyDsl.g:403:5: (lv_buttons_14_0= ruleButton )
            	    {
            	    // InternalMyDsl.g:403:5: (lv_buttons_14_0= ruleButton )
            	    // InternalMyDsl.g:404:6: lv_buttons_14_0= ruleButton
            	    {

            	    						newCompositeNode(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_buttons_14_0=ruleButton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"buttons",
            	    							lv_buttons_14_0,
            	    							"org.xtext.wizard.mydsl.MyDsl.Button");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPageAccess().getRightSquareBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTextField"
    // InternalMyDsl.g:430:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalMyDsl.g:430:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalMyDsl.g:431:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalMyDsl.g:437:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'TextField:' otherlv_1= 'minLength' ( (lv_minLength_2_0= ruleEInt ) ) otherlv_3= 'maxLength' ( (lv_maxLength_4_0= ruleEInt ) ) (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )? otherlv_7= 'label' ( (lv_label_8_0= ruleLabel ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_minLength_2_0 = null;

        AntlrDatatypeRuleToken lv_maxLength_4_0 = null;

        AntlrDatatypeRuleToken lv_input_6_0 = null;

        EObject lv_label_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:443:2: ( (otherlv_0= 'TextField:' otherlv_1= 'minLength' ( (lv_minLength_2_0= ruleEInt ) ) otherlv_3= 'maxLength' ( (lv_maxLength_4_0= ruleEInt ) ) (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )? otherlv_7= 'label' ( (lv_label_8_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:444:2: (otherlv_0= 'TextField:' otherlv_1= 'minLength' ( (lv_minLength_2_0= ruleEInt ) ) otherlv_3= 'maxLength' ( (lv_maxLength_4_0= ruleEInt ) ) (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )? otherlv_7= 'label' ( (lv_label_8_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:444:2: (otherlv_0= 'TextField:' otherlv_1= 'minLength' ( (lv_minLength_2_0= ruleEInt ) ) otherlv_3= 'maxLength' ( (lv_maxLength_4_0= ruleEInt ) ) (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )? otherlv_7= 'label' ( (lv_label_8_0= ruleLabel ) ) )
            // InternalMyDsl.g:445:3: otherlv_0= 'TextField:' otherlv_1= 'minLength' ( (lv_minLength_2_0= ruleEInt ) ) otherlv_3= 'maxLength' ( (lv_maxLength_4_0= ruleEInt ) ) (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )? otherlv_7= 'label' ( (lv_label_8_0= ruleLabel ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getMinLengthKeyword_1());
            		
            // InternalMyDsl.g:453:3: ( (lv_minLength_2_0= ruleEInt ) )
            // InternalMyDsl.g:454:4: (lv_minLength_2_0= ruleEInt )
            {
            // InternalMyDsl.g:454:4: (lv_minLength_2_0= ruleEInt )
            // InternalMyDsl.g:455:5: lv_minLength_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getMinLengthEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_minLength_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"minLength",
            						lv_minLength_2_0,
            						"org.xtext.wizard.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getMaxLengthKeyword_3());
            		
            // InternalMyDsl.g:476:3: ( (lv_maxLength_4_0= ruleEInt ) )
            // InternalMyDsl.g:477:4: (lv_maxLength_4_0= ruleEInt )
            {
            // InternalMyDsl.g:477:4: (lv_maxLength_4_0= ruleEInt )
            // InternalMyDsl.g:478:5: lv_maxLength_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getMaxLengthEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_maxLength_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"maxLength",
            						lv_maxLength_4_0,
            						"org.xtext.wizard.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:495:3: (otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:496:4: otherlv_5= 'input' ( (lv_input_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getInputKeyword_5_0());
                    			
                    // InternalMyDsl.g:500:4: ( (lv_input_6_0= ruleEString ) )
                    // InternalMyDsl.g:501:5: (lv_input_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:501:5: (lv_input_6_0= ruleEString )
                    // InternalMyDsl.g:502:6: lv_input_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextFieldAccess().getInputEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_input_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    						}
                    						set(
                    							current,
                    							"input",
                    							lv_input_6_0,
                    							"org.xtext.wizard.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getTextFieldAccess().getLabelKeyword_6());
            		
            // InternalMyDsl.g:524:3: ( (lv_label_8_0= ruleLabel ) )
            // InternalMyDsl.g:525:4: (lv_label_8_0= ruleLabel )
            {
            // InternalMyDsl.g:525:4: (lv_label_8_0= ruleLabel )
            // InternalMyDsl.g:526:5: lv_label_8_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_8_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_8_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:547:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalMyDsl.g:547:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalMyDsl.g:548:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:554:1: ruleCheckbox returns [EObject current=null] : ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'Checkbox:' otherlv_2= 'label' ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token lv_selected_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'Checkbox:' otherlv_2= 'label' ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:561:2: ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'Checkbox:' otherlv_2= 'label' ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:561:2: ( ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'Checkbox:' otherlv_2= 'label' ( (lv_label_3_0= ruleLabel ) ) )
            // InternalMyDsl.g:562:3: ( (lv_selected_0_0= 'selected' ) ) otherlv_1= 'Checkbox:' otherlv_2= 'label' ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalMyDsl.g:562:3: ( (lv_selected_0_0= 'selected' ) )
            // InternalMyDsl.g:563:4: (lv_selected_0_0= 'selected' )
            {
            // InternalMyDsl.g:563:4: (lv_selected_0_0= 'selected' )
            // InternalMyDsl.g:564:5: lv_selected_0_0= 'selected'
            {
            lv_selected_0_0=(Token)match(input,27,FOLLOW_22); 

            					newLeafNode(lv_selected_0_0, grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(current, "selected", lv_selected_0_0 != null, "selected");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckboxAccess().getCheckboxKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getLabelKeyword_2());
            		
            // InternalMyDsl.g:584:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalMyDsl.g:585:4: (lv_label_3_0= ruleLabel )
            {
            // InternalMyDsl.g:585:4: (lv_label_3_0= ruleLabel )
            // InternalMyDsl.g:586:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:607:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:607:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:608:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:614:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:620:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:622:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:622:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:623:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:640:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:640:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:641:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:647:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label:' otherlv_1= 'text' ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:653:2: ( (otherlv_0= 'Label:' otherlv_1= 'text' ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:654:2: (otherlv_0= 'Label:' otherlv_1= 'text' ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:654:2: (otherlv_0= 'Label:' otherlv_1= 'text' ( (lv_text_2_0= ruleEString ) ) )
            // InternalMyDsl.g:655:3: otherlv_0= 'Label:' otherlv_1= 'text' ( (lv_text_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getTextKeyword_1());
            		
            // InternalMyDsl.g:663:3: ( (lv_text_2_0= ruleEString ) )
            // InternalMyDsl.g:664:4: (lv_text_2_0= ruleEString )
            {
            // InternalMyDsl.g:664:4: (lv_text_2_0= ruleEString )
            // InternalMyDsl.g:665:5: lv_text_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getTextEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.wizard.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButtonNavigate"
    // InternalMyDsl.g:686:1: entryRuleButtonNavigate returns [EObject current=null] : iv_ruleButtonNavigate= ruleButtonNavigate EOF ;
    public final EObject entryRuleButtonNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonNavigate = null;


        try {
            // InternalMyDsl.g:686:55: (iv_ruleButtonNavigate= ruleButtonNavigate EOF )
            // InternalMyDsl.g:687:2: iv_ruleButtonNavigate= ruleButtonNavigate EOF
            {
             newCompositeNode(grammarAccess.getButtonNavigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonNavigate=ruleButtonNavigate();

            state._fsp--;

             current =iv_ruleButtonNavigate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonNavigate"


    // $ANTLR start "ruleButtonNavigate"
    // InternalMyDsl.g:693:1: ruleButtonNavigate returns [EObject current=null] : (otherlv_0= 'ButtonNavigate:' otherlv_1= 'nextPage' ( ( ruleEString ) ) (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )? otherlv_5= 'label' ( (lv_label_6_0= ruleLabel ) ) ) ;
    public final EObject ruleButtonNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_label_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:699:2: ( (otherlv_0= 'ButtonNavigate:' otherlv_1= 'nextPage' ( ( ruleEString ) ) (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )? otherlv_5= 'label' ( (lv_label_6_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:700:2: (otherlv_0= 'ButtonNavigate:' otherlv_1= 'nextPage' ( ( ruleEString ) ) (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )? otherlv_5= 'label' ( (lv_label_6_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:700:2: (otherlv_0= 'ButtonNavigate:' otherlv_1= 'nextPage' ( ( ruleEString ) ) (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )? otherlv_5= 'label' ( (lv_label_6_0= ruleLabel ) ) )
            // InternalMyDsl.g:701:3: otherlv_0= 'ButtonNavigate:' otherlv_1= 'nextPage' ( ( ruleEString ) ) (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )? otherlv_5= 'label' ( (lv_label_6_0= ruleLabel ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonNavigateAccess().getButtonNavigateKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonNavigateAccess().getNextPageKeyword_1());
            		
            // InternalMyDsl.g:709:3: ( ( ruleEString ) )
            // InternalMyDsl.g:710:4: ( ruleEString )
            {
            // InternalMyDsl.g:710:4: ( ruleEString )
            // InternalMyDsl.g:711:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonNavigateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getButtonNavigateAccess().getNextPagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:725:3: (otherlv_3= 'nextPageAlt' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:726:4: otherlv_3= 'nextPageAlt' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getButtonNavigateAccess().getNextPageAltKeyword_3_0());
                    			
                    // InternalMyDsl.g:730:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:731:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:731:5: ( ruleEString )
                    // InternalMyDsl.g:732:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonNavigateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getButtonNavigateAccess().getNextPageAltPageCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getButtonNavigateAccess().getLabelKeyword_4());
            		
            // InternalMyDsl.g:751:3: ( (lv_label_6_0= ruleLabel ) )
            // InternalMyDsl.g:752:4: (lv_label_6_0= ruleLabel )
            {
            // InternalMyDsl.g:752:4: (lv_label_6_0= ruleLabel )
            // InternalMyDsl.g:753:5: lv_label_6_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getButtonNavigateAccess().getLabelLabelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_6_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonNavigateRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_6_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonNavigate"


    // $ANTLR start "entryRuleButtonReturn"
    // InternalMyDsl.g:774:1: entryRuleButtonReturn returns [EObject current=null] : iv_ruleButtonReturn= ruleButtonReturn EOF ;
    public final EObject entryRuleButtonReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonReturn = null;


        try {
            // InternalMyDsl.g:774:53: (iv_ruleButtonReturn= ruleButtonReturn EOF )
            // InternalMyDsl.g:775:2: iv_ruleButtonReturn= ruleButtonReturn EOF
            {
             newCompositeNode(grammarAccess.getButtonReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonReturn=ruleButtonReturn();

            state._fsp--;

             current =iv_ruleButtonReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonReturn"


    // $ANTLR start "ruleButtonReturn"
    // InternalMyDsl.g:781:1: ruleButtonReturn returns [EObject current=null] : (otherlv_0= 'ButtonReturn:' otherlv_1= 'previousPage' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) ;
    public final EObject ruleButtonReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_label_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:787:2: ( (otherlv_0= 'ButtonReturn:' otherlv_1= 'previousPage' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:788:2: (otherlv_0= 'ButtonReturn:' otherlv_1= 'previousPage' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:788:2: (otherlv_0= 'ButtonReturn:' otherlv_1= 'previousPage' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            // InternalMyDsl.g:789:3: otherlv_0= 'ButtonReturn:' otherlv_1= 'previousPage' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonReturnAccess().getButtonReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonReturnAccess().getPreviousPageKeyword_1());
            		
            // InternalMyDsl.g:797:3: ( ( ruleEString ) )
            // InternalMyDsl.g:798:4: ( ruleEString )
            {
            // InternalMyDsl.g:798:4: ( ruleEString )
            // InternalMyDsl.g:799:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonReturnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getButtonReturnAccess().getPreviousPagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonReturnAccess().getLabelKeyword_3());
            		
            // InternalMyDsl.g:817:3: ( (lv_label_4_0= ruleLabel ) )
            // InternalMyDsl.g:818:4: (lv_label_4_0= ruleLabel )
            {
            // InternalMyDsl.g:818:4: (lv_label_4_0= ruleLabel )
            // InternalMyDsl.g:819:5: lv_label_4_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getButtonReturnAccess().getLabelLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_4_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonReturnRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_4_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonReturn"


    // $ANTLR start "entryRuleButtonShow"
    // InternalMyDsl.g:840:1: entryRuleButtonShow returns [EObject current=null] : iv_ruleButtonShow= ruleButtonShow EOF ;
    public final EObject entryRuleButtonShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonShow = null;


        try {
            // InternalMyDsl.g:840:51: (iv_ruleButtonShow= ruleButtonShow EOF )
            // InternalMyDsl.g:841:2: iv_ruleButtonShow= ruleButtonShow EOF
            {
             newCompositeNode(grammarAccess.getButtonShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonShow=ruleButtonShow();

            state._fsp--;

             current =iv_ruleButtonShow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonShow"


    // $ANTLR start "ruleButtonShow"
    // InternalMyDsl.g:847:1: ruleButtonShow returns [EObject current=null] : (otherlv_0= 'ButtonShow:' otherlv_1= 'message' ( (lv_message_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) ;
    public final EObject ruleButtonShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_message_2_0 = null;

        EObject lv_label_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:853:2: ( (otherlv_0= 'ButtonShow:' otherlv_1= 'message' ( (lv_message_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:854:2: (otherlv_0= 'ButtonShow:' otherlv_1= 'message' ( (lv_message_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:854:2: (otherlv_0= 'ButtonShow:' otherlv_1= 'message' ( (lv_message_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            // InternalMyDsl.g:855:3: otherlv_0= 'ButtonShow:' otherlv_1= 'message' ( (lv_message_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonShowAccess().getButtonShowKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonShowAccess().getMessageKeyword_1());
            		
            // InternalMyDsl.g:863:3: ( (lv_message_2_0= ruleEString ) )
            // InternalMyDsl.g:864:4: (lv_message_2_0= ruleEString )
            {
            // InternalMyDsl.g:864:4: (lv_message_2_0= ruleEString )
            // InternalMyDsl.g:865:5: lv_message_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getButtonShowAccess().getMessageEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_message_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonShowRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_2_0,
            						"org.xtext.wizard.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonShowAccess().getLabelKeyword_3());
            		
            // InternalMyDsl.g:886:3: ( (lv_label_4_0= ruleLabel ) )
            // InternalMyDsl.g:887:4: (lv_label_4_0= ruleLabel )
            {
            // InternalMyDsl.g:887:4: (lv_label_4_0= ruleLabel )
            // InternalMyDsl.g:888:5: lv_label_4_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getButtonShowAccess().getLabelLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_4_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonShowRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_4_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonShow"


    // $ANTLR start "entryRuleButtonClose"
    // InternalMyDsl.g:909:1: entryRuleButtonClose returns [EObject current=null] : iv_ruleButtonClose= ruleButtonClose EOF ;
    public final EObject entryRuleButtonClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonClose = null;


        try {
            // InternalMyDsl.g:909:52: (iv_ruleButtonClose= ruleButtonClose EOF )
            // InternalMyDsl.g:910:2: iv_ruleButtonClose= ruleButtonClose EOF
            {
             newCompositeNode(grammarAccess.getButtonCloseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonClose=ruleButtonClose();

            state._fsp--;

             current =iv_ruleButtonClose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonClose"


    // $ANTLR start "ruleButtonClose"
    // InternalMyDsl.g:916:1: ruleButtonClose returns [EObject current=null] : (otherlv_0= 'ButtonClose:' otherlv_1= 'wizard' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) ;
    public final EObject ruleButtonClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_label_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:922:2: ( (otherlv_0= 'ButtonClose:' otherlv_1= 'wizard' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) ) )
            // InternalMyDsl.g:923:2: (otherlv_0= 'ButtonClose:' otherlv_1= 'wizard' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            {
            // InternalMyDsl.g:923:2: (otherlv_0= 'ButtonClose:' otherlv_1= 'wizard' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) ) )
            // InternalMyDsl.g:924:3: otherlv_0= 'ButtonClose:' otherlv_1= 'wizard' ( ( ruleEString ) ) otherlv_3= 'label' ( (lv_label_4_0= ruleLabel ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonCloseAccess().getButtonCloseKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonCloseAccess().getWizardKeyword_1());
            		
            // InternalMyDsl.g:932:3: ( ( ruleEString ) )
            // InternalMyDsl.g:933:4: ( ruleEString )
            {
            // InternalMyDsl.g:933:4: ( ruleEString )
            // InternalMyDsl.g:934:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonCloseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getButtonCloseAccess().getWizardWizardCrossReference_2_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonCloseAccess().getLabelKeyword_3());
            		
            // InternalMyDsl.g:952:3: ( (lv_label_4_0= ruleLabel ) )
            // InternalMyDsl.g:953:4: (lv_label_4_0= ruleLabel )
            {
            // InternalMyDsl.g:953:4: (lv_label_4_0= ruleLabel )
            // InternalMyDsl.g:954:5: lv_label_4_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getButtonCloseAccess().getLabelLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_4_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonCloseRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_4_0,
            						"org.xtext.wizard.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonClose"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000A900000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});

}