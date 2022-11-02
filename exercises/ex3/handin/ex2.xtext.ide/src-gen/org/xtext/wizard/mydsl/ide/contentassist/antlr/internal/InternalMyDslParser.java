package org.xtext.wizard.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.wizard.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard:'", "'title'", "'pages'", "'['", "']'", "','", "'Page:'", "'buttons'", "'textfields'", "'checkbox'", "'TextField:'", "'minLength'", "'maxLength'", "'label'", "'input'", "'Checkbox:'", "'-'", "'Label:'", "'text'", "'ButtonNavigate:'", "'nextPage'", "'nextPageAlt'", "'ButtonReturn:'", "'previousPage'", "'ButtonShow:'", "'message'", "'ButtonClose:'", "'wizard'", "'init'", "'selected'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWizard"
    // InternalMyDsl.g:53:1: entryRuleWizard : ruleWizard EOF ;
    public final void entryRuleWizard() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleWizard EOF )
            // InternalMyDsl.g:55:1: ruleWizard EOF
            {
             before(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            ruleWizard();

            state._fsp--;

             after(grammarAccess.getWizardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalMyDsl.g:62:1: ruleWizard : ( ( rule__Wizard__Group__0 ) ) ;
    public final void ruleWizard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Wizard__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Wizard__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Wizard__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Wizard__Group__0 )
            {
             before(grammarAccess.getWizardAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Wizard__Group__0 )
            // InternalMyDsl.g:69:4: rule__Wizard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:78:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleButton EOF )
            // InternalMyDsl.g:80:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:87:1: ruleButton : ( ( rule__Button__Alternatives ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Button__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Button__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Button__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Button__Alternatives )
            {
             before(grammarAccess.getButtonAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Button__Alternatives )
            // InternalMyDsl.g:94:4: rule__Button__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Button__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // InternalMyDsl.g:128:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePage EOF )
            // InternalMyDsl.g:130:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalMyDsl.g:137:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Page__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Page__Group__0 )
            // InternalMyDsl.g:144:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTextField"
    // InternalMyDsl.g:153:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTextField EOF )
            // InternalMyDsl.g:155:1: ruleTextField EOF
            {
             before(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getTextFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalMyDsl.g:162:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TextField__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TextField__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TextField__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__TextField__Group__0 )
            {
             before(grammarAccess.getTextFieldAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__TextField__Group__0 )
            // InternalMyDsl.g:169:4: rule__TextField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:178:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCheckbox EOF )
            // InternalMyDsl.g:180:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:187:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Checkbox__Group__0 )
            // InternalMyDsl.g:194:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEInt EOF )
            // InternalMyDsl.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:228:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLabel EOF )
            // InternalMyDsl.g:230:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:237:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:244:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButtonNavigate"
    // InternalMyDsl.g:253:1: entryRuleButtonNavigate : ruleButtonNavigate EOF ;
    public final void entryRuleButtonNavigate() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleButtonNavigate EOF )
            // InternalMyDsl.g:255:1: ruleButtonNavigate EOF
            {
             before(grammarAccess.getButtonNavigateRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonNavigate();

            state._fsp--;

             after(grammarAccess.getButtonNavigateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonNavigate"


    // $ANTLR start "ruleButtonNavigate"
    // InternalMyDsl.g:262:1: ruleButtonNavigate : ( ( rule__ButtonNavigate__Group__0 ) ) ;
    public final void ruleButtonNavigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ButtonNavigate__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ButtonNavigate__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ButtonNavigate__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ButtonNavigate__Group__0 )
            {
             before(grammarAccess.getButtonNavigateAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ButtonNavigate__Group__0 )
            // InternalMyDsl.g:269:4: rule__ButtonNavigate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonNavigateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonNavigate"


    // $ANTLR start "entryRuleButtonReturn"
    // InternalMyDsl.g:278:1: entryRuleButtonReturn : ruleButtonReturn EOF ;
    public final void entryRuleButtonReturn() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleButtonReturn EOF )
            // InternalMyDsl.g:280:1: ruleButtonReturn EOF
            {
             before(grammarAccess.getButtonReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonReturn();

            state._fsp--;

             after(grammarAccess.getButtonReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonReturn"


    // $ANTLR start "ruleButtonReturn"
    // InternalMyDsl.g:287:1: ruleButtonReturn : ( ( rule__ButtonReturn__Group__0 ) ) ;
    public final void ruleButtonReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ButtonReturn__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ButtonReturn__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ButtonReturn__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ButtonReturn__Group__0 )
            {
             before(grammarAccess.getButtonReturnAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ButtonReturn__Group__0 )
            // InternalMyDsl.g:294:4: rule__ButtonReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonReturn"


    // $ANTLR start "entryRuleButtonShow"
    // InternalMyDsl.g:303:1: entryRuleButtonShow : ruleButtonShow EOF ;
    public final void entryRuleButtonShow() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleButtonShow EOF )
            // InternalMyDsl.g:305:1: ruleButtonShow EOF
            {
             before(grammarAccess.getButtonShowRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonShow();

            state._fsp--;

             after(grammarAccess.getButtonShowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonShow"


    // $ANTLR start "ruleButtonShow"
    // InternalMyDsl.g:312:1: ruleButtonShow : ( ( rule__ButtonShow__Group__0 ) ) ;
    public final void ruleButtonShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ButtonShow__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ButtonShow__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ButtonShow__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ButtonShow__Group__0 )
            {
             before(grammarAccess.getButtonShowAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ButtonShow__Group__0 )
            // InternalMyDsl.g:319:4: rule__ButtonShow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonShow"


    // $ANTLR start "entryRuleButtonClose"
    // InternalMyDsl.g:328:1: entryRuleButtonClose : ruleButtonClose EOF ;
    public final void entryRuleButtonClose() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleButtonClose EOF )
            // InternalMyDsl.g:330:1: ruleButtonClose EOF
            {
             before(grammarAccess.getButtonCloseRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonClose();

            state._fsp--;

             after(grammarAccess.getButtonCloseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonClose"


    // $ANTLR start "ruleButtonClose"
    // InternalMyDsl.g:337:1: ruleButtonClose : ( ( rule__ButtonClose__Group__0 ) ) ;
    public final void ruleButtonClose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ButtonClose__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ButtonClose__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ButtonClose__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ButtonClose__Group__0 )
            {
             before(grammarAccess.getButtonCloseAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ButtonClose__Group__0 )
            // InternalMyDsl.g:344:4: rule__ButtonClose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonCloseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonClose"


    // $ANTLR start "rule__Button__Alternatives"
    // InternalMyDsl.g:352:1: rule__Button__Alternatives : ( ( ruleButtonNavigate ) | ( ruleButtonReturn ) | ( ruleButtonShow ) | ( ruleButtonClose ) );
    public final void rule__Button__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( ruleButtonNavigate ) | ( ruleButtonReturn ) | ( ruleButtonShow ) | ( ruleButtonClose ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:357:2: ( ruleButtonNavigate )
                    {
                    // InternalMyDsl.g:357:2: ( ruleButtonNavigate )
                    // InternalMyDsl.g:358:3: ruleButtonNavigate
                    {
                     before(grammarAccess.getButtonAccess().getButtonNavigateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleButtonNavigate();

                    state._fsp--;

                     after(grammarAccess.getButtonAccess().getButtonNavigateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:363:2: ( ruleButtonReturn )
                    {
                    // InternalMyDsl.g:363:2: ( ruleButtonReturn )
                    // InternalMyDsl.g:364:3: ruleButtonReturn
                    {
                     before(grammarAccess.getButtonAccess().getButtonReturnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleButtonReturn();

                    state._fsp--;

                     after(grammarAccess.getButtonAccess().getButtonReturnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:369:2: ( ruleButtonShow )
                    {
                    // InternalMyDsl.g:369:2: ( ruleButtonShow )
                    // InternalMyDsl.g:370:3: ruleButtonShow
                    {
                     before(grammarAccess.getButtonAccess().getButtonShowParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButtonShow();

                    state._fsp--;

                     after(grammarAccess.getButtonAccess().getButtonShowParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:375:2: ( ruleButtonClose )
                    {
                    // InternalMyDsl.g:375:2: ( ruleButtonClose )
                    // InternalMyDsl.g:376:3: ruleButtonClose
                    {
                     before(grammarAccess.getButtonAccess().getButtonCloseParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleButtonClose();

                    state._fsp--;

                     after(grammarAccess.getButtonAccess().getButtonCloseParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:385:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:390:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:390:2: ( RULE_STRING )
                    // InternalMyDsl.g:391:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:396:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:396:2: ( RULE_ID )
                    // InternalMyDsl.g:397:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Wizard__Group__0"
    // InternalMyDsl.g:406:1: rule__Wizard__Group__0 : rule__Wizard__Group__0__Impl rule__Wizard__Group__1 ;
    public final void rule__Wizard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__Wizard__Group__0__Impl rule__Wizard__Group__1 )
            // InternalMyDsl.g:411:2: rule__Wizard__Group__0__Impl rule__Wizard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Wizard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0"


    // $ANTLR start "rule__Wizard__Group__0__Impl"
    // InternalMyDsl.g:418:1: rule__Wizard__Group__0__Impl : ( 'Wizard:' ) ;
    public final void rule__Wizard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( 'Wizard:' ) )
            // InternalMyDsl.g:423:1: ( 'Wizard:' )
            {
            // InternalMyDsl.g:423:1: ( 'Wizard:' )
            // InternalMyDsl.g:424:2: 'Wizard:'
            {
             before(grammarAccess.getWizardAccess().getWizardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getWizardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0__Impl"


    // $ANTLR start "rule__Wizard__Group__1"
    // InternalMyDsl.g:433:1: rule__Wizard__Group__1 : rule__Wizard__Group__1__Impl rule__Wizard__Group__2 ;
    public final void rule__Wizard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__Wizard__Group__1__Impl rule__Wizard__Group__2 )
            // InternalMyDsl.g:438:2: rule__Wizard__Group__1__Impl rule__Wizard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Wizard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1"


    // $ANTLR start "rule__Wizard__Group__1__Impl"
    // InternalMyDsl.g:445:1: rule__Wizard__Group__1__Impl : ( 'title' ) ;
    public final void rule__Wizard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( 'title' ) )
            // InternalMyDsl.g:450:1: ( 'title' )
            {
            // InternalMyDsl.g:450:1: ( 'title' )
            // InternalMyDsl.g:451:2: 'title'
            {
             before(grammarAccess.getWizardAccess().getTitleKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getTitleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1__Impl"


    // $ANTLR start "rule__Wizard__Group__2"
    // InternalMyDsl.g:460:1: rule__Wizard__Group__2 : rule__Wizard__Group__2__Impl rule__Wizard__Group__3 ;
    public final void rule__Wizard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__Wizard__Group__2__Impl rule__Wizard__Group__3 )
            // InternalMyDsl.g:465:2: rule__Wizard__Group__2__Impl rule__Wizard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Wizard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2"


    // $ANTLR start "rule__Wizard__Group__2__Impl"
    // InternalMyDsl.g:472:1: rule__Wizard__Group__2__Impl : ( ( rule__Wizard__TitleAssignment_2 ) ) ;
    public final void rule__Wizard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( ( rule__Wizard__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:477:1: ( ( rule__Wizard__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:477:1: ( ( rule__Wizard__TitleAssignment_2 ) )
            // InternalMyDsl.g:478:2: ( rule__Wizard__TitleAssignment_2 )
            {
             before(grammarAccess.getWizardAccess().getTitleAssignment_2()); 
            // InternalMyDsl.g:479:2: ( rule__Wizard__TitleAssignment_2 )
            // InternalMyDsl.g:479:3: rule__Wizard__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2__Impl"


    // $ANTLR start "rule__Wizard__Group__3"
    // InternalMyDsl.g:487:1: rule__Wizard__Group__3 : rule__Wizard__Group__3__Impl rule__Wizard__Group__4 ;
    public final void rule__Wizard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__Wizard__Group__3__Impl rule__Wizard__Group__4 )
            // InternalMyDsl.g:492:2: rule__Wizard__Group__3__Impl rule__Wizard__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Wizard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3"


    // $ANTLR start "rule__Wizard__Group__3__Impl"
    // InternalMyDsl.g:499:1: rule__Wizard__Group__3__Impl : ( 'pages' ) ;
    public final void rule__Wizard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( 'pages' ) )
            // InternalMyDsl.g:504:1: ( 'pages' )
            {
            // InternalMyDsl.g:504:1: ( 'pages' )
            // InternalMyDsl.g:505:2: 'pages'
            {
             before(grammarAccess.getWizardAccess().getPagesKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getPagesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3__Impl"


    // $ANTLR start "rule__Wizard__Group__4"
    // InternalMyDsl.g:514:1: rule__Wizard__Group__4 : rule__Wizard__Group__4__Impl rule__Wizard__Group__5 ;
    public final void rule__Wizard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__Wizard__Group__4__Impl rule__Wizard__Group__5 )
            // InternalMyDsl.g:519:2: rule__Wizard__Group__4__Impl rule__Wizard__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Wizard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4"


    // $ANTLR start "rule__Wizard__Group__4__Impl"
    // InternalMyDsl.g:526:1: rule__Wizard__Group__4__Impl : ( '[' ) ;
    public final void rule__Wizard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( '[' ) )
            // InternalMyDsl.g:531:1: ( '[' )
            {
            // InternalMyDsl.g:531:1: ( '[' )
            // InternalMyDsl.g:532:2: '['
            {
             before(grammarAccess.getWizardAccess().getLeftSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4__Impl"


    // $ANTLR start "rule__Wizard__Group__5"
    // InternalMyDsl.g:541:1: rule__Wizard__Group__5 : rule__Wizard__Group__5__Impl rule__Wizard__Group__6 ;
    public final void rule__Wizard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__Wizard__Group__5__Impl rule__Wizard__Group__6 )
            // InternalMyDsl.g:546:2: rule__Wizard__Group__5__Impl rule__Wizard__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Wizard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5"


    // $ANTLR start "rule__Wizard__Group__5__Impl"
    // InternalMyDsl.g:553:1: rule__Wizard__Group__5__Impl : ( ( rule__Wizard__PagesAssignment_5 ) ) ;
    public final void rule__Wizard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( ( rule__Wizard__PagesAssignment_5 ) ) )
            // InternalMyDsl.g:558:1: ( ( rule__Wizard__PagesAssignment_5 ) )
            {
            // InternalMyDsl.g:558:1: ( ( rule__Wizard__PagesAssignment_5 ) )
            // InternalMyDsl.g:559:2: ( rule__Wizard__PagesAssignment_5 )
            {
             before(grammarAccess.getWizardAccess().getPagesAssignment_5()); 
            // InternalMyDsl.g:560:2: ( rule__Wizard__PagesAssignment_5 )
            // InternalMyDsl.g:560:3: rule__Wizard__PagesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__PagesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPagesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5__Impl"


    // $ANTLR start "rule__Wizard__Group__6"
    // InternalMyDsl.g:568:1: rule__Wizard__Group__6 : rule__Wizard__Group__6__Impl rule__Wizard__Group__7 ;
    public final void rule__Wizard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Wizard__Group__6__Impl rule__Wizard__Group__7 )
            // InternalMyDsl.g:573:2: rule__Wizard__Group__6__Impl rule__Wizard__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Wizard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6"


    // $ANTLR start "rule__Wizard__Group__6__Impl"
    // InternalMyDsl.g:580:1: rule__Wizard__Group__6__Impl : ( ( rule__Wizard__Group_6__0 )* ) ;
    public final void rule__Wizard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( ( rule__Wizard__Group_6__0 )* ) )
            // InternalMyDsl.g:585:1: ( ( rule__Wizard__Group_6__0 )* )
            {
            // InternalMyDsl.g:585:1: ( ( rule__Wizard__Group_6__0 )* )
            // InternalMyDsl.g:586:2: ( rule__Wizard__Group_6__0 )*
            {
             before(grammarAccess.getWizardAccess().getGroup_6()); 
            // InternalMyDsl.g:587:2: ( rule__Wizard__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:587:3: rule__Wizard__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Wizard__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWizardAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6__Impl"


    // $ANTLR start "rule__Wizard__Group__7"
    // InternalMyDsl.g:595:1: rule__Wizard__Group__7 : rule__Wizard__Group__7__Impl ;
    public final void rule__Wizard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Wizard__Group__7__Impl )
            // InternalMyDsl.g:600:2: rule__Wizard__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7"


    // $ANTLR start "rule__Wizard__Group__7__Impl"
    // InternalMyDsl.g:606:1: rule__Wizard__Group__7__Impl : ( ']' ) ;
    public final void rule__Wizard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ']' ) )
            // InternalMyDsl.g:611:1: ( ']' )
            {
            // InternalMyDsl.g:611:1: ( ']' )
            // InternalMyDsl.g:612:2: ']'
            {
             before(grammarAccess.getWizardAccess().getRightSquareBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7__Impl"


    // $ANTLR start "rule__Wizard__Group_6__0"
    // InternalMyDsl.g:622:1: rule__Wizard__Group_6__0 : rule__Wizard__Group_6__0__Impl rule__Wizard__Group_6__1 ;
    public final void rule__Wizard__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Wizard__Group_6__0__Impl rule__Wizard__Group_6__1 )
            // InternalMyDsl.g:627:2: rule__Wizard__Group_6__0__Impl rule__Wizard__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Wizard__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_6__0"


    // $ANTLR start "rule__Wizard__Group_6__0__Impl"
    // InternalMyDsl.g:634:1: rule__Wizard__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Wizard__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( ',' ) )
            // InternalMyDsl.g:639:1: ( ',' )
            {
            // InternalMyDsl.g:639:1: ( ',' )
            // InternalMyDsl.g:640:2: ','
            {
             before(grammarAccess.getWizardAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_6__0__Impl"


    // $ANTLR start "rule__Wizard__Group_6__1"
    // InternalMyDsl.g:649:1: rule__Wizard__Group_6__1 : rule__Wizard__Group_6__1__Impl ;
    public final void rule__Wizard__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Wizard__Group_6__1__Impl )
            // InternalMyDsl.g:654:2: rule__Wizard__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_6__1"


    // $ANTLR start "rule__Wizard__Group_6__1__Impl"
    // InternalMyDsl.g:660:1: rule__Wizard__Group_6__1__Impl : ( ( rule__Wizard__PagesAssignment_6_1 ) ) ;
    public final void rule__Wizard__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( ( rule__Wizard__PagesAssignment_6_1 ) ) )
            // InternalMyDsl.g:665:1: ( ( rule__Wizard__PagesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:665:1: ( ( rule__Wizard__PagesAssignment_6_1 ) )
            // InternalMyDsl.g:666:2: ( rule__Wizard__PagesAssignment_6_1 )
            {
             before(grammarAccess.getWizardAccess().getPagesAssignment_6_1()); 
            // InternalMyDsl.g:667:2: ( rule__Wizard__PagesAssignment_6_1 )
            // InternalMyDsl.g:667:3: rule__Wizard__PagesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__PagesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPagesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group_6__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalMyDsl.g:676:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalMyDsl.g:681:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalMyDsl.g:688:1: rule__Page__Group__0__Impl : ( ( rule__Page__InitAssignment_0 ) ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ( rule__Page__InitAssignment_0 ) ) )
            // InternalMyDsl.g:693:1: ( ( rule__Page__InitAssignment_0 ) )
            {
            // InternalMyDsl.g:693:1: ( ( rule__Page__InitAssignment_0 ) )
            // InternalMyDsl.g:694:2: ( rule__Page__InitAssignment_0 )
            {
             before(grammarAccess.getPageAccess().getInitAssignment_0()); 
            // InternalMyDsl.g:695:2: ( rule__Page__InitAssignment_0 )
            // InternalMyDsl.g:695:3: rule__Page__InitAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Page__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalMyDsl.g:703:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalMyDsl.g:708:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalMyDsl.g:715:1: rule__Page__Group__1__Impl : ( 'Page:' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( 'Page:' ) )
            // InternalMyDsl.g:720:1: ( 'Page:' )
            {
            // InternalMyDsl.g:720:1: ( 'Page:' )
            // InternalMyDsl.g:721:2: 'Page:'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalMyDsl.g:730:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalMyDsl.g:735:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalMyDsl.g:742:1: rule__Page__Group__2__Impl : ( ( rule__Page__Group_2__0 )? ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__Page__Group_2__0 )? ) )
            // InternalMyDsl.g:747:1: ( ( rule__Page__Group_2__0 )? )
            {
            // InternalMyDsl.g:747:1: ( ( rule__Page__Group_2__0 )? )
            // InternalMyDsl.g:748:2: ( rule__Page__Group_2__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_2()); 
            // InternalMyDsl.g:749:2: ( rule__Page__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:749:3: rule__Page__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalMyDsl.g:757:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalMyDsl.g:762:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalMyDsl.g:769:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalMyDsl.g:774:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalMyDsl.g:774:1: ( ( rule__Page__Group_3__0 )? )
            // InternalMyDsl.g:775:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalMyDsl.g:776:2: ( rule__Page__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:776:3: rule__Page__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalMyDsl.g:784:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalMyDsl.g:789:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalMyDsl.g:796:1: rule__Page__Group__4__Impl : ( 'buttons' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( 'buttons' ) )
            // InternalMyDsl.g:801:1: ( 'buttons' )
            {
            // InternalMyDsl.g:801:1: ( 'buttons' )
            // InternalMyDsl.g:802:2: 'buttons'
            {
             before(grammarAccess.getPageAccess().getButtonsKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getButtonsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // InternalMyDsl.g:811:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalMyDsl.g:816:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // InternalMyDsl.g:823:1: rule__Page__Group__5__Impl : ( '[' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( '[' ) )
            // InternalMyDsl.g:828:1: ( '[' )
            {
            // InternalMyDsl.g:828:1: ( '[' )
            // InternalMyDsl.g:829:2: '['
            {
             before(grammarAccess.getPageAccess().getLeftSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // InternalMyDsl.g:838:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalMyDsl.g:843:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // InternalMyDsl.g:850:1: rule__Page__Group__6__Impl : ( ( rule__Page__ButtonsAssignment_6 ) ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ( rule__Page__ButtonsAssignment_6 ) ) )
            // InternalMyDsl.g:855:1: ( ( rule__Page__ButtonsAssignment_6 ) )
            {
            // InternalMyDsl.g:855:1: ( ( rule__Page__ButtonsAssignment_6 ) )
            // InternalMyDsl.g:856:2: ( rule__Page__ButtonsAssignment_6 )
            {
             before(grammarAccess.getPageAccess().getButtonsAssignment_6()); 
            // InternalMyDsl.g:857:2: ( rule__Page__ButtonsAssignment_6 )
            // InternalMyDsl.g:857:3: rule__Page__ButtonsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Page__ButtonsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getButtonsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group__7"
    // InternalMyDsl.g:865:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalMyDsl.g:870:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7"


    // $ANTLR start "rule__Page__Group__7__Impl"
    // InternalMyDsl.g:877:1: rule__Page__Group__7__Impl : ( ( rule__Page__Group_7__0 )* ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__Page__Group_7__0 )* ) )
            // InternalMyDsl.g:882:1: ( ( rule__Page__Group_7__0 )* )
            {
            // InternalMyDsl.g:882:1: ( ( rule__Page__Group_7__0 )* )
            // InternalMyDsl.g:883:2: ( rule__Page__Group_7__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_7()); 
            // InternalMyDsl.g:884:2: ( rule__Page__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:884:3: rule__Page__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Page__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7__Impl"


    // $ANTLR start "rule__Page__Group__8"
    // InternalMyDsl.g:892:1: rule__Page__Group__8 : rule__Page__Group__8__Impl ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__Page__Group__8__Impl )
            // InternalMyDsl.g:897:2: rule__Page__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8"


    // $ANTLR start "rule__Page__Group__8__Impl"
    // InternalMyDsl.g:903:1: rule__Page__Group__8__Impl : ( ']' ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ']' ) )
            // InternalMyDsl.g:908:1: ( ']' )
            {
            // InternalMyDsl.g:908:1: ( ']' )
            // InternalMyDsl.g:909:2: ']'
            {
             before(grammarAccess.getPageAccess().getRightSquareBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8__Impl"


    // $ANTLR start "rule__Page__Group_2__0"
    // InternalMyDsl.g:919:1: rule__Page__Group_2__0 : rule__Page__Group_2__0__Impl rule__Page__Group_2__1 ;
    public final void rule__Page__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__Page__Group_2__0__Impl rule__Page__Group_2__1 )
            // InternalMyDsl.g:924:2: rule__Page__Group_2__0__Impl rule__Page__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__0"


    // $ANTLR start "rule__Page__Group_2__0__Impl"
    // InternalMyDsl.g:931:1: rule__Page__Group_2__0__Impl : ( 'textfields' ) ;
    public final void rule__Page__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( 'textfields' ) )
            // InternalMyDsl.g:936:1: ( 'textfields' )
            {
            // InternalMyDsl.g:936:1: ( 'textfields' )
            // InternalMyDsl.g:937:2: 'textfields'
            {
             before(grammarAccess.getPageAccess().getTextfieldsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getTextfieldsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__0__Impl"


    // $ANTLR start "rule__Page__Group_2__1"
    // InternalMyDsl.g:946:1: rule__Page__Group_2__1 : rule__Page__Group_2__1__Impl rule__Page__Group_2__2 ;
    public final void rule__Page__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__Page__Group_2__1__Impl rule__Page__Group_2__2 )
            // InternalMyDsl.g:951:2: rule__Page__Group_2__1__Impl rule__Page__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Page__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__1"


    // $ANTLR start "rule__Page__Group_2__1__Impl"
    // InternalMyDsl.g:958:1: rule__Page__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Page__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( '[' ) )
            // InternalMyDsl.g:963:1: ( '[' )
            {
            // InternalMyDsl.g:963:1: ( '[' )
            // InternalMyDsl.g:964:2: '['
            {
             before(grammarAccess.getPageAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__1__Impl"


    // $ANTLR start "rule__Page__Group_2__2"
    // InternalMyDsl.g:973:1: rule__Page__Group_2__2 : rule__Page__Group_2__2__Impl rule__Page__Group_2__3 ;
    public final void rule__Page__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Page__Group_2__2__Impl rule__Page__Group_2__3 )
            // InternalMyDsl.g:978:2: rule__Page__Group_2__2__Impl rule__Page__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__2"


    // $ANTLR start "rule__Page__Group_2__2__Impl"
    // InternalMyDsl.g:985:1: rule__Page__Group_2__2__Impl : ( ( rule__Page__TextfieldsAssignment_2_2 ) ) ;
    public final void rule__Page__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ( rule__Page__TextfieldsAssignment_2_2 ) ) )
            // InternalMyDsl.g:990:1: ( ( rule__Page__TextfieldsAssignment_2_2 ) )
            {
            // InternalMyDsl.g:990:1: ( ( rule__Page__TextfieldsAssignment_2_2 ) )
            // InternalMyDsl.g:991:2: ( rule__Page__TextfieldsAssignment_2_2 )
            {
             before(grammarAccess.getPageAccess().getTextfieldsAssignment_2_2()); 
            // InternalMyDsl.g:992:2: ( rule__Page__TextfieldsAssignment_2_2 )
            // InternalMyDsl.g:992:3: rule__Page__TextfieldsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__TextfieldsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getTextfieldsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__2__Impl"


    // $ANTLR start "rule__Page__Group_2__3"
    // InternalMyDsl.g:1000:1: rule__Page__Group_2__3 : rule__Page__Group_2__3__Impl rule__Page__Group_2__4 ;
    public final void rule__Page__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Page__Group_2__3__Impl rule__Page__Group_2__4 )
            // InternalMyDsl.g:1005:2: rule__Page__Group_2__3__Impl rule__Page__Group_2__4
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__3"


    // $ANTLR start "rule__Page__Group_2__3__Impl"
    // InternalMyDsl.g:1012:1: rule__Page__Group_2__3__Impl : ( ( rule__Page__Group_2_3__0 )* ) ;
    public final void rule__Page__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( ( rule__Page__Group_2_3__0 )* ) )
            // InternalMyDsl.g:1017:1: ( ( rule__Page__Group_2_3__0 )* )
            {
            // InternalMyDsl.g:1017:1: ( ( rule__Page__Group_2_3__0 )* )
            // InternalMyDsl.g:1018:2: ( rule__Page__Group_2_3__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_2_3()); 
            // InternalMyDsl.g:1019:2: ( rule__Page__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1019:3: rule__Page__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Page__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__3__Impl"


    // $ANTLR start "rule__Page__Group_2__4"
    // InternalMyDsl.g:1027:1: rule__Page__Group_2__4 : rule__Page__Group_2__4__Impl ;
    public final void rule__Page__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Page__Group_2__4__Impl )
            // InternalMyDsl.g:1032:2: rule__Page__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__4"


    // $ANTLR start "rule__Page__Group_2__4__Impl"
    // InternalMyDsl.g:1038:1: rule__Page__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Page__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ']' ) )
            // InternalMyDsl.g:1043:1: ( ']' )
            {
            // InternalMyDsl.g:1043:1: ( ']' )
            // InternalMyDsl.g:1044:2: ']'
            {
             before(grammarAccess.getPageAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2__4__Impl"


    // $ANTLR start "rule__Page__Group_2_3__0"
    // InternalMyDsl.g:1054:1: rule__Page__Group_2_3__0 : rule__Page__Group_2_3__0__Impl rule__Page__Group_2_3__1 ;
    public final void rule__Page__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Page__Group_2_3__0__Impl rule__Page__Group_2_3__1 )
            // InternalMyDsl.g:1059:2: rule__Page__Group_2_3__0__Impl rule__Page__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Page__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2_3__0"


    // $ANTLR start "rule__Page__Group_2_3__0__Impl"
    // InternalMyDsl.g:1066:1: rule__Page__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ',' ) )
            // InternalMyDsl.g:1071:1: ( ',' )
            {
            // InternalMyDsl.g:1071:1: ( ',' )
            // InternalMyDsl.g:1072:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_2_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2_3__0__Impl"


    // $ANTLR start "rule__Page__Group_2_3__1"
    // InternalMyDsl.g:1081:1: rule__Page__Group_2_3__1 : rule__Page__Group_2_3__1__Impl ;
    public final void rule__Page__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Page__Group_2_3__1__Impl )
            // InternalMyDsl.g:1086:2: rule__Page__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2_3__1"


    // $ANTLR start "rule__Page__Group_2_3__1__Impl"
    // InternalMyDsl.g:1092:1: rule__Page__Group_2_3__1__Impl : ( ( rule__Page__TextfieldsAssignment_2_3_1 ) ) ;
    public final void rule__Page__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__Page__TextfieldsAssignment_2_3_1 ) ) )
            // InternalMyDsl.g:1097:1: ( ( rule__Page__TextfieldsAssignment_2_3_1 ) )
            {
            // InternalMyDsl.g:1097:1: ( ( rule__Page__TextfieldsAssignment_2_3_1 ) )
            // InternalMyDsl.g:1098:2: ( rule__Page__TextfieldsAssignment_2_3_1 )
            {
             before(grammarAccess.getPageAccess().getTextfieldsAssignment_2_3_1()); 
            // InternalMyDsl.g:1099:2: ( rule__Page__TextfieldsAssignment_2_3_1 )
            // InternalMyDsl.g:1099:3: rule__Page__TextfieldsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__TextfieldsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getTextfieldsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_2_3__1__Impl"


    // $ANTLR start "rule__Page__Group_3__0"
    // InternalMyDsl.g:1108:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalMyDsl.g:1113:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0"


    // $ANTLR start "rule__Page__Group_3__0__Impl"
    // InternalMyDsl.g:1120:1: rule__Page__Group_3__0__Impl : ( 'checkbox' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:1125:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:1125:1: ( 'checkbox' )
            // InternalMyDsl.g:1126:2: 'checkbox'
            {
             before(grammarAccess.getPageAccess().getCheckboxKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCheckboxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0__Impl"


    // $ANTLR start "rule__Page__Group_3__1"
    // InternalMyDsl.g:1135:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Page__Group_3__1__Impl )
            // InternalMyDsl.g:1140:2: rule__Page__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1"


    // $ANTLR start "rule__Page__Group_3__1__Impl"
    // InternalMyDsl.g:1146:1: rule__Page__Group_3__1__Impl : ( ( rule__Page__CheckboxAssignment_3_1 ) ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Page__CheckboxAssignment_3_1 ) ) )
            // InternalMyDsl.g:1151:1: ( ( rule__Page__CheckboxAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1151:1: ( ( rule__Page__CheckboxAssignment_3_1 ) )
            // InternalMyDsl.g:1152:2: ( rule__Page__CheckboxAssignment_3_1 )
            {
             before(grammarAccess.getPageAccess().getCheckboxAssignment_3_1()); 
            // InternalMyDsl.g:1153:2: ( rule__Page__CheckboxAssignment_3_1 )
            // InternalMyDsl.g:1153:3: rule__Page__CheckboxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__CheckboxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getCheckboxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1__Impl"


    // $ANTLR start "rule__Page__Group_7__0"
    // InternalMyDsl.g:1162:1: rule__Page__Group_7__0 : rule__Page__Group_7__0__Impl rule__Page__Group_7__1 ;
    public final void rule__Page__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Page__Group_7__0__Impl rule__Page__Group_7__1 )
            // InternalMyDsl.g:1167:2: rule__Page__Group_7__0__Impl rule__Page__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0"


    // $ANTLR start "rule__Page__Group_7__0__Impl"
    // InternalMyDsl.g:1174:1: rule__Page__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ',' ) )
            // InternalMyDsl.g:1179:1: ( ',' )
            {
            // InternalMyDsl.g:1179:1: ( ',' )
            // InternalMyDsl.g:1180:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0__Impl"


    // $ANTLR start "rule__Page__Group_7__1"
    // InternalMyDsl.g:1189:1: rule__Page__Group_7__1 : rule__Page__Group_7__1__Impl ;
    public final void rule__Page__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Page__Group_7__1__Impl )
            // InternalMyDsl.g:1194:2: rule__Page__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1"


    // $ANTLR start "rule__Page__Group_7__1__Impl"
    // InternalMyDsl.g:1200:1: rule__Page__Group_7__1__Impl : ( ( rule__Page__ButtonsAssignment_7_1 ) ) ;
    public final void rule__Page__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ( rule__Page__ButtonsAssignment_7_1 ) ) )
            // InternalMyDsl.g:1205:1: ( ( rule__Page__ButtonsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1205:1: ( ( rule__Page__ButtonsAssignment_7_1 ) )
            // InternalMyDsl.g:1206:2: ( rule__Page__ButtonsAssignment_7_1 )
            {
             before(grammarAccess.getPageAccess().getButtonsAssignment_7_1()); 
            // InternalMyDsl.g:1207:2: ( rule__Page__ButtonsAssignment_7_1 )
            // InternalMyDsl.g:1207:3: rule__Page__ButtonsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__ButtonsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getButtonsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // InternalMyDsl.g:1216:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // InternalMyDsl.g:1221:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TextField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // InternalMyDsl.g:1228:1: rule__TextField__Group__0__Impl : ( 'TextField:' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( 'TextField:' ) )
            // InternalMyDsl.g:1233:1: ( 'TextField:' )
            {
            // InternalMyDsl.g:1233:1: ( 'TextField:' )
            // InternalMyDsl.g:1234:2: 'TextField:'
            {
             before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // InternalMyDsl.g:1243:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // InternalMyDsl.g:1248:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TextField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // InternalMyDsl.g:1255:1: rule__TextField__Group__1__Impl : ( 'minLength' ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( 'minLength' ) )
            // InternalMyDsl.g:1260:1: ( 'minLength' )
            {
            // InternalMyDsl.g:1260:1: ( 'minLength' )
            // InternalMyDsl.g:1261:2: 'minLength'
            {
             before(grammarAccess.getTextFieldAccess().getMinLengthKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getMinLengthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__2"
    // InternalMyDsl.g:1270:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // InternalMyDsl.g:1275:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__TextField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2"


    // $ANTLR start "rule__TextField__Group__2__Impl"
    // InternalMyDsl.g:1282:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__MinLengthAssignment_2 ) ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( ( rule__TextField__MinLengthAssignment_2 ) ) )
            // InternalMyDsl.g:1287:1: ( ( rule__TextField__MinLengthAssignment_2 ) )
            {
            // InternalMyDsl.g:1287:1: ( ( rule__TextField__MinLengthAssignment_2 ) )
            // InternalMyDsl.g:1288:2: ( rule__TextField__MinLengthAssignment_2 )
            {
             before(grammarAccess.getTextFieldAccess().getMinLengthAssignment_2()); 
            // InternalMyDsl.g:1289:2: ( rule__TextField__MinLengthAssignment_2 )
            // InternalMyDsl.g:1289:3: rule__TextField__MinLengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextField__MinLengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getMinLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group__3"
    // InternalMyDsl.g:1297:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl rule__TextField__Group__4 ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__TextField__Group__3__Impl rule__TextField__Group__4 )
            // InternalMyDsl.g:1302:2: rule__TextField__Group__3__Impl rule__TextField__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__TextField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3"


    // $ANTLR start "rule__TextField__Group__3__Impl"
    // InternalMyDsl.g:1309:1: rule__TextField__Group__3__Impl : ( 'maxLength' ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( 'maxLength' ) )
            // InternalMyDsl.g:1314:1: ( 'maxLength' )
            {
            // InternalMyDsl.g:1314:1: ( 'maxLength' )
            // InternalMyDsl.g:1315:2: 'maxLength'
            {
             before(grammarAccess.getTextFieldAccess().getMaxLengthKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getMaxLengthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3__Impl"


    // $ANTLR start "rule__TextField__Group__4"
    // InternalMyDsl.g:1324:1: rule__TextField__Group__4 : rule__TextField__Group__4__Impl rule__TextField__Group__5 ;
    public final void rule__TextField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__TextField__Group__4__Impl rule__TextField__Group__5 )
            // InternalMyDsl.g:1329:2: rule__TextField__Group__4__Impl rule__TextField__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__TextField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__4"


    // $ANTLR start "rule__TextField__Group__4__Impl"
    // InternalMyDsl.g:1336:1: rule__TextField__Group__4__Impl : ( ( rule__TextField__MaxLengthAssignment_4 ) ) ;
    public final void rule__TextField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__TextField__MaxLengthAssignment_4 ) ) )
            // InternalMyDsl.g:1341:1: ( ( rule__TextField__MaxLengthAssignment_4 ) )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__TextField__MaxLengthAssignment_4 ) )
            // InternalMyDsl.g:1342:2: ( rule__TextField__MaxLengthAssignment_4 )
            {
             before(grammarAccess.getTextFieldAccess().getMaxLengthAssignment_4()); 
            // InternalMyDsl.g:1343:2: ( rule__TextField__MaxLengthAssignment_4 )
            // InternalMyDsl.g:1343:3: rule__TextField__MaxLengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TextField__MaxLengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getMaxLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__4__Impl"


    // $ANTLR start "rule__TextField__Group__5"
    // InternalMyDsl.g:1351:1: rule__TextField__Group__5 : rule__TextField__Group__5__Impl rule__TextField__Group__6 ;
    public final void rule__TextField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__TextField__Group__5__Impl rule__TextField__Group__6 )
            // InternalMyDsl.g:1356:2: rule__TextField__Group__5__Impl rule__TextField__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__TextField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__5"


    // $ANTLR start "rule__TextField__Group__5__Impl"
    // InternalMyDsl.g:1363:1: rule__TextField__Group__5__Impl : ( ( rule__TextField__Group_5__0 )? ) ;
    public final void rule__TextField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( rule__TextField__Group_5__0 )? ) )
            // InternalMyDsl.g:1368:1: ( ( rule__TextField__Group_5__0 )? )
            {
            // InternalMyDsl.g:1368:1: ( ( rule__TextField__Group_5__0 )? )
            // InternalMyDsl.g:1369:2: ( rule__TextField__Group_5__0 )?
            {
             before(grammarAccess.getTextFieldAccess().getGroup_5()); 
            // InternalMyDsl.g:1370:2: ( rule__TextField__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1370:3: rule__TextField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__5__Impl"


    // $ANTLR start "rule__TextField__Group__6"
    // InternalMyDsl.g:1378:1: rule__TextField__Group__6 : rule__TextField__Group__6__Impl rule__TextField__Group__7 ;
    public final void rule__TextField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__TextField__Group__6__Impl rule__TextField__Group__7 )
            // InternalMyDsl.g:1383:2: rule__TextField__Group__6__Impl rule__TextField__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__TextField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__6"


    // $ANTLR start "rule__TextField__Group__6__Impl"
    // InternalMyDsl.g:1390:1: rule__TextField__Group__6__Impl : ( 'label' ) ;
    public final void rule__TextField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( 'label' ) )
            // InternalMyDsl.g:1395:1: ( 'label' )
            {
            // InternalMyDsl.g:1395:1: ( 'label' )
            // InternalMyDsl.g:1396:2: 'label'
            {
             before(grammarAccess.getTextFieldAccess().getLabelKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getLabelKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__6__Impl"


    // $ANTLR start "rule__TextField__Group__7"
    // InternalMyDsl.g:1405:1: rule__TextField__Group__7 : rule__TextField__Group__7__Impl ;
    public final void rule__TextField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__TextField__Group__7__Impl )
            // InternalMyDsl.g:1410:2: rule__TextField__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__7"


    // $ANTLR start "rule__TextField__Group__7__Impl"
    // InternalMyDsl.g:1416:1: rule__TextField__Group__7__Impl : ( ( rule__TextField__LabelAssignment_7 ) ) ;
    public final void rule__TextField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( ( rule__TextField__LabelAssignment_7 ) ) )
            // InternalMyDsl.g:1421:1: ( ( rule__TextField__LabelAssignment_7 ) )
            {
            // InternalMyDsl.g:1421:1: ( ( rule__TextField__LabelAssignment_7 ) )
            // InternalMyDsl.g:1422:2: ( rule__TextField__LabelAssignment_7 )
            {
             before(grammarAccess.getTextFieldAccess().getLabelAssignment_7()); 
            // InternalMyDsl.g:1423:2: ( rule__TextField__LabelAssignment_7 )
            // InternalMyDsl.g:1423:3: rule__TextField__LabelAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TextField__LabelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getLabelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__7__Impl"


    // $ANTLR start "rule__TextField__Group_5__0"
    // InternalMyDsl.g:1432:1: rule__TextField__Group_5__0 : rule__TextField__Group_5__0__Impl rule__TextField__Group_5__1 ;
    public final void rule__TextField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__TextField__Group_5__0__Impl rule__TextField__Group_5__1 )
            // InternalMyDsl.g:1437:2: rule__TextField__Group_5__0__Impl rule__TextField__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__TextField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_5__0"


    // $ANTLR start "rule__TextField__Group_5__0__Impl"
    // InternalMyDsl.g:1444:1: rule__TextField__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__TextField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( 'input' ) )
            // InternalMyDsl.g:1449:1: ( 'input' )
            {
            // InternalMyDsl.g:1449:1: ( 'input' )
            // InternalMyDsl.g:1450:2: 'input'
            {
             before(grammarAccess.getTextFieldAccess().getInputKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getInputKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_5__0__Impl"


    // $ANTLR start "rule__TextField__Group_5__1"
    // InternalMyDsl.g:1459:1: rule__TextField__Group_5__1 : rule__TextField__Group_5__1__Impl ;
    public final void rule__TextField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__TextField__Group_5__1__Impl )
            // InternalMyDsl.g:1464:2: rule__TextField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_5__1"


    // $ANTLR start "rule__TextField__Group_5__1__Impl"
    // InternalMyDsl.g:1470:1: rule__TextField__Group_5__1__Impl : ( ( rule__TextField__InputAssignment_5_1 ) ) ;
    public final void rule__TextField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( ( ( rule__TextField__InputAssignment_5_1 ) ) )
            // InternalMyDsl.g:1475:1: ( ( rule__TextField__InputAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1475:1: ( ( rule__TextField__InputAssignment_5_1 ) )
            // InternalMyDsl.g:1476:2: ( rule__TextField__InputAssignment_5_1 )
            {
             before(grammarAccess.getTextFieldAccess().getInputAssignment_5_1()); 
            // InternalMyDsl.g:1477:2: ( rule__TextField__InputAssignment_5_1 )
            // InternalMyDsl.g:1477:3: rule__TextField__InputAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TextField__InputAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getInputAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_5__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalMyDsl.g:1486:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:1491:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalMyDsl.g:1498:1: rule__Checkbox__Group__0__Impl : ( ( rule__Checkbox__SelectedAssignment_0 ) ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ( rule__Checkbox__SelectedAssignment_0 ) ) )
            // InternalMyDsl.g:1503:1: ( ( rule__Checkbox__SelectedAssignment_0 ) )
            {
            // InternalMyDsl.g:1503:1: ( ( rule__Checkbox__SelectedAssignment_0 ) )
            // InternalMyDsl.g:1504:2: ( rule__Checkbox__SelectedAssignment_0 )
            {
             before(grammarAccess.getCheckboxAccess().getSelectedAssignment_0()); 
            // InternalMyDsl.g:1505:2: ( rule__Checkbox__SelectedAssignment_0 )
            // InternalMyDsl.g:1505:3: rule__Checkbox__SelectedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__SelectedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getSelectedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalMyDsl.g:1513:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:1518:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalMyDsl.g:1525:1: rule__Checkbox__Group__1__Impl : ( 'Checkbox:' ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( 'Checkbox:' ) )
            // InternalMyDsl.g:1530:1: ( 'Checkbox:' )
            {
            // InternalMyDsl.g:1530:1: ( 'Checkbox:' )
            // InternalMyDsl.g:1531:2: 'Checkbox:'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalMyDsl.g:1540:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:1545:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalMyDsl.g:1552:1: rule__Checkbox__Group__2__Impl : ( 'label' ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( 'label' ) )
            // InternalMyDsl.g:1557:1: ( 'label' )
            {
            // InternalMyDsl.g:1557:1: ( 'label' )
            // InternalMyDsl.g:1558:2: 'label'
            {
             before(grammarAccess.getCheckboxAccess().getLabelKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getLabelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group__3"
    // InternalMyDsl.g:1567:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Checkbox__Group__3__Impl )
            // InternalMyDsl.g:1572:2: rule__Checkbox__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__3"


    // $ANTLR start "rule__Checkbox__Group__3__Impl"
    // InternalMyDsl.g:1578:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__LabelAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( ( ( rule__Checkbox__LabelAssignment_3 ) ) )
            // InternalMyDsl.g:1583:1: ( ( rule__Checkbox__LabelAssignment_3 ) )
            {
            // InternalMyDsl.g:1583:1: ( ( rule__Checkbox__LabelAssignment_3 ) )
            // InternalMyDsl.g:1584:2: ( rule__Checkbox__LabelAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getLabelAssignment_3()); 
            // InternalMyDsl.g:1585:2: ( rule__Checkbox__LabelAssignment_3 )
            // InternalMyDsl.g:1585:3: rule__Checkbox__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1594:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1599:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1606:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1611:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1611:1: ( ( '-' )? )
            // InternalMyDsl.g:1612:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1613:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1613:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1621:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1626:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1632:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1637:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1637:1: ( RULE_INT )
            // InternalMyDsl.g:1638:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalMyDsl.g:1648:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1653:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalMyDsl.g:1660:1: rule__Label__Group__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( 'Label:' ) )
            // InternalMyDsl.g:1665:1: ( 'Label:' )
            {
            // InternalMyDsl.g:1665:1: ( 'Label:' )
            // InternalMyDsl.g:1666:2: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalMyDsl.g:1675:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalMyDsl.g:1680:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalMyDsl.g:1687:1: rule__Label__Group__1__Impl : ( 'text' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( 'text' ) )
            // InternalMyDsl.g:1692:1: ( 'text' )
            {
            // InternalMyDsl.g:1692:1: ( 'text' )
            // InternalMyDsl.g:1693:2: 'text'
            {
             before(grammarAccess.getLabelAccess().getTextKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalMyDsl.g:1702:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Label__Group__2__Impl )
            // InternalMyDsl.g:1707:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalMyDsl.g:1713:1: rule__Label__Group__2__Impl : ( ( rule__Label__TextAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( ( rule__Label__TextAssignment_2 ) ) )
            // InternalMyDsl.g:1718:1: ( ( rule__Label__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:1718:1: ( ( rule__Label__TextAssignment_2 ) )
            // InternalMyDsl.g:1719:2: ( rule__Label__TextAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:1720:2: ( rule__Label__TextAssignment_2 )
            // InternalMyDsl.g:1720:3: rule__Label__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__0"
    // InternalMyDsl.g:1729:1: rule__ButtonNavigate__Group__0 : rule__ButtonNavigate__Group__0__Impl rule__ButtonNavigate__Group__1 ;
    public final void rule__ButtonNavigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__ButtonNavigate__Group__0__Impl rule__ButtonNavigate__Group__1 )
            // InternalMyDsl.g:1734:2: rule__ButtonNavigate__Group__0__Impl rule__ButtonNavigate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ButtonNavigate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__0"


    // $ANTLR start "rule__ButtonNavigate__Group__0__Impl"
    // InternalMyDsl.g:1741:1: rule__ButtonNavigate__Group__0__Impl : ( 'ButtonNavigate:' ) ;
    public final void rule__ButtonNavigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( 'ButtonNavigate:' ) )
            // InternalMyDsl.g:1746:1: ( 'ButtonNavigate:' )
            {
            // InternalMyDsl.g:1746:1: ( 'ButtonNavigate:' )
            // InternalMyDsl.g:1747:2: 'ButtonNavigate:'
            {
             before(grammarAccess.getButtonNavigateAccess().getButtonNavigateKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getButtonNavigateAccess().getButtonNavigateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__0__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__1"
    // InternalMyDsl.g:1756:1: rule__ButtonNavigate__Group__1 : rule__ButtonNavigate__Group__1__Impl rule__ButtonNavigate__Group__2 ;
    public final void rule__ButtonNavigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__ButtonNavigate__Group__1__Impl rule__ButtonNavigate__Group__2 )
            // InternalMyDsl.g:1761:2: rule__ButtonNavigate__Group__1__Impl rule__ButtonNavigate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ButtonNavigate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__1"


    // $ANTLR start "rule__ButtonNavigate__Group__1__Impl"
    // InternalMyDsl.g:1768:1: rule__ButtonNavigate__Group__1__Impl : ( 'nextPage' ) ;
    public final void rule__ButtonNavigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( 'nextPage' ) )
            // InternalMyDsl.g:1773:1: ( 'nextPage' )
            {
            // InternalMyDsl.g:1773:1: ( 'nextPage' )
            // InternalMyDsl.g:1774:2: 'nextPage'
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getButtonNavigateAccess().getNextPageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__1__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__2"
    // InternalMyDsl.g:1783:1: rule__ButtonNavigate__Group__2 : rule__ButtonNavigate__Group__2__Impl rule__ButtonNavigate__Group__3 ;
    public final void rule__ButtonNavigate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__ButtonNavigate__Group__2__Impl rule__ButtonNavigate__Group__3 )
            // InternalMyDsl.g:1788:2: rule__ButtonNavigate__Group__2__Impl rule__ButtonNavigate__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ButtonNavigate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__2"


    // $ANTLR start "rule__ButtonNavigate__Group__2__Impl"
    // InternalMyDsl.g:1795:1: rule__ButtonNavigate__Group__2__Impl : ( ( rule__ButtonNavigate__NextPageAssignment_2 ) ) ;
    public final void rule__ButtonNavigate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( ( rule__ButtonNavigate__NextPageAssignment_2 ) ) )
            // InternalMyDsl.g:1800:1: ( ( rule__ButtonNavigate__NextPageAssignment_2 ) )
            {
            // InternalMyDsl.g:1800:1: ( ( rule__ButtonNavigate__NextPageAssignment_2 ) )
            // InternalMyDsl.g:1801:2: ( rule__ButtonNavigate__NextPageAssignment_2 )
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageAssignment_2()); 
            // InternalMyDsl.g:1802:2: ( rule__ButtonNavigate__NextPageAssignment_2 )
            // InternalMyDsl.g:1802:3: rule__ButtonNavigate__NextPageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__NextPageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonNavigateAccess().getNextPageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__2__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__3"
    // InternalMyDsl.g:1810:1: rule__ButtonNavigate__Group__3 : rule__ButtonNavigate__Group__3__Impl rule__ButtonNavigate__Group__4 ;
    public final void rule__ButtonNavigate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__ButtonNavigate__Group__3__Impl rule__ButtonNavigate__Group__4 )
            // InternalMyDsl.g:1815:2: rule__ButtonNavigate__Group__3__Impl rule__ButtonNavigate__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ButtonNavigate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__3"


    // $ANTLR start "rule__ButtonNavigate__Group__3__Impl"
    // InternalMyDsl.g:1822:1: rule__ButtonNavigate__Group__3__Impl : ( ( rule__ButtonNavigate__Group_3__0 )? ) ;
    public final void rule__ButtonNavigate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__ButtonNavigate__Group_3__0 )? ) )
            // InternalMyDsl.g:1827:1: ( ( rule__ButtonNavigate__Group_3__0 )? )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__ButtonNavigate__Group_3__0 )? )
            // InternalMyDsl.g:1828:2: ( rule__ButtonNavigate__Group_3__0 )?
            {
             before(grammarAccess.getButtonNavigateAccess().getGroup_3()); 
            // InternalMyDsl.g:1829:2: ( rule__ButtonNavigate__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1829:3: rule__ButtonNavigate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonNavigate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonNavigateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__3__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__4"
    // InternalMyDsl.g:1837:1: rule__ButtonNavigate__Group__4 : rule__ButtonNavigate__Group__4__Impl rule__ButtonNavigate__Group__5 ;
    public final void rule__ButtonNavigate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__ButtonNavigate__Group__4__Impl rule__ButtonNavigate__Group__5 )
            // InternalMyDsl.g:1842:2: rule__ButtonNavigate__Group__4__Impl rule__ButtonNavigate__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ButtonNavigate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__4"


    // $ANTLR start "rule__ButtonNavigate__Group__4__Impl"
    // InternalMyDsl.g:1849:1: rule__ButtonNavigate__Group__4__Impl : ( 'label' ) ;
    public final void rule__ButtonNavigate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( 'label' ) )
            // InternalMyDsl.g:1854:1: ( 'label' )
            {
            // InternalMyDsl.g:1854:1: ( 'label' )
            // InternalMyDsl.g:1855:2: 'label'
            {
             before(grammarAccess.getButtonNavigateAccess().getLabelKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonNavigateAccess().getLabelKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__4__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group__5"
    // InternalMyDsl.g:1864:1: rule__ButtonNavigate__Group__5 : rule__ButtonNavigate__Group__5__Impl ;
    public final void rule__ButtonNavigate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__ButtonNavigate__Group__5__Impl )
            // InternalMyDsl.g:1869:2: rule__ButtonNavigate__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__5"


    // $ANTLR start "rule__ButtonNavigate__Group__5__Impl"
    // InternalMyDsl.g:1875:1: rule__ButtonNavigate__Group__5__Impl : ( ( rule__ButtonNavigate__LabelAssignment_5 ) ) ;
    public final void rule__ButtonNavigate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ( rule__ButtonNavigate__LabelAssignment_5 ) ) )
            // InternalMyDsl.g:1880:1: ( ( rule__ButtonNavigate__LabelAssignment_5 ) )
            {
            // InternalMyDsl.g:1880:1: ( ( rule__ButtonNavigate__LabelAssignment_5 ) )
            // InternalMyDsl.g:1881:2: ( rule__ButtonNavigate__LabelAssignment_5 )
            {
             before(grammarAccess.getButtonNavigateAccess().getLabelAssignment_5()); 
            // InternalMyDsl.g:1882:2: ( rule__ButtonNavigate__LabelAssignment_5 )
            // InternalMyDsl.g:1882:3: rule__ButtonNavigate__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getButtonNavigateAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group__5__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group_3__0"
    // InternalMyDsl.g:1891:1: rule__ButtonNavigate__Group_3__0 : rule__ButtonNavigate__Group_3__0__Impl rule__ButtonNavigate__Group_3__1 ;
    public final void rule__ButtonNavigate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__ButtonNavigate__Group_3__0__Impl rule__ButtonNavigate__Group_3__1 )
            // InternalMyDsl.g:1896:2: rule__ButtonNavigate__Group_3__0__Impl rule__ButtonNavigate__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ButtonNavigate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group_3__0"


    // $ANTLR start "rule__ButtonNavigate__Group_3__0__Impl"
    // InternalMyDsl.g:1903:1: rule__ButtonNavigate__Group_3__0__Impl : ( 'nextPageAlt' ) ;
    public final void rule__ButtonNavigate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( 'nextPageAlt' ) )
            // InternalMyDsl.g:1908:1: ( 'nextPageAlt' )
            {
            // InternalMyDsl.g:1908:1: ( 'nextPageAlt' )
            // InternalMyDsl.g:1909:2: 'nextPageAlt'
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageAltKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getButtonNavigateAccess().getNextPageAltKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group_3__0__Impl"


    // $ANTLR start "rule__ButtonNavigate__Group_3__1"
    // InternalMyDsl.g:1918:1: rule__ButtonNavigate__Group_3__1 : rule__ButtonNavigate__Group_3__1__Impl ;
    public final void rule__ButtonNavigate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__ButtonNavigate__Group_3__1__Impl )
            // InternalMyDsl.g:1923:2: rule__ButtonNavigate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group_3__1"


    // $ANTLR start "rule__ButtonNavigate__Group_3__1__Impl"
    // InternalMyDsl.g:1929:1: rule__ButtonNavigate__Group_3__1__Impl : ( ( rule__ButtonNavigate__NextPageAltAssignment_3_1 ) ) ;
    public final void rule__ButtonNavigate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__ButtonNavigate__NextPageAltAssignment_3_1 ) ) )
            // InternalMyDsl.g:1934:1: ( ( rule__ButtonNavigate__NextPageAltAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__ButtonNavigate__NextPageAltAssignment_3_1 ) )
            // InternalMyDsl.g:1935:2: ( rule__ButtonNavigate__NextPageAltAssignment_3_1 )
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageAltAssignment_3_1()); 
            // InternalMyDsl.g:1936:2: ( rule__ButtonNavigate__NextPageAltAssignment_3_1 )
            // InternalMyDsl.g:1936:3: rule__ButtonNavigate__NextPageAltAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ButtonNavigate__NextPageAltAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonNavigateAccess().getNextPageAltAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__Group_3__1__Impl"


    // $ANTLR start "rule__ButtonReturn__Group__0"
    // InternalMyDsl.g:1945:1: rule__ButtonReturn__Group__0 : rule__ButtonReturn__Group__0__Impl rule__ButtonReturn__Group__1 ;
    public final void rule__ButtonReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__ButtonReturn__Group__0__Impl rule__ButtonReturn__Group__1 )
            // InternalMyDsl.g:1950:2: rule__ButtonReturn__Group__0__Impl rule__ButtonReturn__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ButtonReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__0"


    // $ANTLR start "rule__ButtonReturn__Group__0__Impl"
    // InternalMyDsl.g:1957:1: rule__ButtonReturn__Group__0__Impl : ( 'ButtonReturn:' ) ;
    public final void rule__ButtonReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( 'ButtonReturn:' ) )
            // InternalMyDsl.g:1962:1: ( 'ButtonReturn:' )
            {
            // InternalMyDsl.g:1962:1: ( 'ButtonReturn:' )
            // InternalMyDsl.g:1963:2: 'ButtonReturn:'
            {
             before(grammarAccess.getButtonReturnAccess().getButtonReturnKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getButtonReturnAccess().getButtonReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__0__Impl"


    // $ANTLR start "rule__ButtonReturn__Group__1"
    // InternalMyDsl.g:1972:1: rule__ButtonReturn__Group__1 : rule__ButtonReturn__Group__1__Impl rule__ButtonReturn__Group__2 ;
    public final void rule__ButtonReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__ButtonReturn__Group__1__Impl rule__ButtonReturn__Group__2 )
            // InternalMyDsl.g:1977:2: rule__ButtonReturn__Group__1__Impl rule__ButtonReturn__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ButtonReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__1"


    // $ANTLR start "rule__ButtonReturn__Group__1__Impl"
    // InternalMyDsl.g:1984:1: rule__ButtonReturn__Group__1__Impl : ( 'previousPage' ) ;
    public final void rule__ButtonReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( 'previousPage' ) )
            // InternalMyDsl.g:1989:1: ( 'previousPage' )
            {
            // InternalMyDsl.g:1989:1: ( 'previousPage' )
            // InternalMyDsl.g:1990:2: 'previousPage'
            {
             before(grammarAccess.getButtonReturnAccess().getPreviousPageKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getButtonReturnAccess().getPreviousPageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__1__Impl"


    // $ANTLR start "rule__ButtonReturn__Group__2"
    // InternalMyDsl.g:1999:1: rule__ButtonReturn__Group__2 : rule__ButtonReturn__Group__2__Impl rule__ButtonReturn__Group__3 ;
    public final void rule__ButtonReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__ButtonReturn__Group__2__Impl rule__ButtonReturn__Group__3 )
            // InternalMyDsl.g:2004:2: rule__ButtonReturn__Group__2__Impl rule__ButtonReturn__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ButtonReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__2"


    // $ANTLR start "rule__ButtonReturn__Group__2__Impl"
    // InternalMyDsl.g:2011:1: rule__ButtonReturn__Group__2__Impl : ( ( rule__ButtonReturn__PreviousPageAssignment_2 ) ) ;
    public final void rule__ButtonReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( ( rule__ButtonReturn__PreviousPageAssignment_2 ) ) )
            // InternalMyDsl.g:2016:1: ( ( rule__ButtonReturn__PreviousPageAssignment_2 ) )
            {
            // InternalMyDsl.g:2016:1: ( ( rule__ButtonReturn__PreviousPageAssignment_2 ) )
            // InternalMyDsl.g:2017:2: ( rule__ButtonReturn__PreviousPageAssignment_2 )
            {
             before(grammarAccess.getButtonReturnAccess().getPreviousPageAssignment_2()); 
            // InternalMyDsl.g:2018:2: ( rule__ButtonReturn__PreviousPageAssignment_2 )
            // InternalMyDsl.g:2018:3: rule__ButtonReturn__PreviousPageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonReturn__PreviousPageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonReturnAccess().getPreviousPageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__2__Impl"


    // $ANTLR start "rule__ButtonReturn__Group__3"
    // InternalMyDsl.g:2026:1: rule__ButtonReturn__Group__3 : rule__ButtonReturn__Group__3__Impl rule__ButtonReturn__Group__4 ;
    public final void rule__ButtonReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__ButtonReturn__Group__3__Impl rule__ButtonReturn__Group__4 )
            // InternalMyDsl.g:2031:2: rule__ButtonReturn__Group__3__Impl rule__ButtonReturn__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ButtonReturn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__3"


    // $ANTLR start "rule__ButtonReturn__Group__3__Impl"
    // InternalMyDsl.g:2038:1: rule__ButtonReturn__Group__3__Impl : ( 'label' ) ;
    public final void rule__ButtonReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( 'label' ) )
            // InternalMyDsl.g:2043:1: ( 'label' )
            {
            // InternalMyDsl.g:2043:1: ( 'label' )
            // InternalMyDsl.g:2044:2: 'label'
            {
             before(grammarAccess.getButtonReturnAccess().getLabelKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonReturnAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__3__Impl"


    // $ANTLR start "rule__ButtonReturn__Group__4"
    // InternalMyDsl.g:2053:1: rule__ButtonReturn__Group__4 : rule__ButtonReturn__Group__4__Impl ;
    public final void rule__ButtonReturn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__ButtonReturn__Group__4__Impl )
            // InternalMyDsl.g:2058:2: rule__ButtonReturn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonReturn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__4"


    // $ANTLR start "rule__ButtonReturn__Group__4__Impl"
    // InternalMyDsl.g:2064:1: rule__ButtonReturn__Group__4__Impl : ( ( rule__ButtonReturn__LabelAssignment_4 ) ) ;
    public final void rule__ButtonReturn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ( rule__ButtonReturn__LabelAssignment_4 ) ) )
            // InternalMyDsl.g:2069:1: ( ( rule__ButtonReturn__LabelAssignment_4 ) )
            {
            // InternalMyDsl.g:2069:1: ( ( rule__ButtonReturn__LabelAssignment_4 ) )
            // InternalMyDsl.g:2070:2: ( rule__ButtonReturn__LabelAssignment_4 )
            {
             before(grammarAccess.getButtonReturnAccess().getLabelAssignment_4()); 
            // InternalMyDsl.g:2071:2: ( rule__ButtonReturn__LabelAssignment_4 )
            // InternalMyDsl.g:2071:3: rule__ButtonReturn__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ButtonReturn__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonReturnAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__Group__4__Impl"


    // $ANTLR start "rule__ButtonShow__Group__0"
    // InternalMyDsl.g:2080:1: rule__ButtonShow__Group__0 : rule__ButtonShow__Group__0__Impl rule__ButtonShow__Group__1 ;
    public final void rule__ButtonShow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__ButtonShow__Group__0__Impl rule__ButtonShow__Group__1 )
            // InternalMyDsl.g:2085:2: rule__ButtonShow__Group__0__Impl rule__ButtonShow__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ButtonShow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__0"


    // $ANTLR start "rule__ButtonShow__Group__0__Impl"
    // InternalMyDsl.g:2092:1: rule__ButtonShow__Group__0__Impl : ( 'ButtonShow:' ) ;
    public final void rule__ButtonShow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( 'ButtonShow:' ) )
            // InternalMyDsl.g:2097:1: ( 'ButtonShow:' )
            {
            // InternalMyDsl.g:2097:1: ( 'ButtonShow:' )
            // InternalMyDsl.g:2098:2: 'ButtonShow:'
            {
             before(grammarAccess.getButtonShowAccess().getButtonShowKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getButtonShowAccess().getButtonShowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__0__Impl"


    // $ANTLR start "rule__ButtonShow__Group__1"
    // InternalMyDsl.g:2107:1: rule__ButtonShow__Group__1 : rule__ButtonShow__Group__1__Impl rule__ButtonShow__Group__2 ;
    public final void rule__ButtonShow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__ButtonShow__Group__1__Impl rule__ButtonShow__Group__2 )
            // InternalMyDsl.g:2112:2: rule__ButtonShow__Group__1__Impl rule__ButtonShow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ButtonShow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__1"


    // $ANTLR start "rule__ButtonShow__Group__1__Impl"
    // InternalMyDsl.g:2119:1: rule__ButtonShow__Group__1__Impl : ( 'message' ) ;
    public final void rule__ButtonShow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( 'message' ) )
            // InternalMyDsl.g:2124:1: ( 'message' )
            {
            // InternalMyDsl.g:2124:1: ( 'message' )
            // InternalMyDsl.g:2125:2: 'message'
            {
             before(grammarAccess.getButtonShowAccess().getMessageKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getButtonShowAccess().getMessageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__1__Impl"


    // $ANTLR start "rule__ButtonShow__Group__2"
    // InternalMyDsl.g:2134:1: rule__ButtonShow__Group__2 : rule__ButtonShow__Group__2__Impl rule__ButtonShow__Group__3 ;
    public final void rule__ButtonShow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__ButtonShow__Group__2__Impl rule__ButtonShow__Group__3 )
            // InternalMyDsl.g:2139:2: rule__ButtonShow__Group__2__Impl rule__ButtonShow__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ButtonShow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__2"


    // $ANTLR start "rule__ButtonShow__Group__2__Impl"
    // InternalMyDsl.g:2146:1: rule__ButtonShow__Group__2__Impl : ( ( rule__ButtonShow__MessageAssignment_2 ) ) ;
    public final void rule__ButtonShow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ( rule__ButtonShow__MessageAssignment_2 ) ) )
            // InternalMyDsl.g:2151:1: ( ( rule__ButtonShow__MessageAssignment_2 ) )
            {
            // InternalMyDsl.g:2151:1: ( ( rule__ButtonShow__MessageAssignment_2 ) )
            // InternalMyDsl.g:2152:2: ( rule__ButtonShow__MessageAssignment_2 )
            {
             before(grammarAccess.getButtonShowAccess().getMessageAssignment_2()); 
            // InternalMyDsl.g:2153:2: ( rule__ButtonShow__MessageAssignment_2 )
            // InternalMyDsl.g:2153:3: rule__ButtonShow__MessageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonShow__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonShowAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__2__Impl"


    // $ANTLR start "rule__ButtonShow__Group__3"
    // InternalMyDsl.g:2161:1: rule__ButtonShow__Group__3 : rule__ButtonShow__Group__3__Impl rule__ButtonShow__Group__4 ;
    public final void rule__ButtonShow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__ButtonShow__Group__3__Impl rule__ButtonShow__Group__4 )
            // InternalMyDsl.g:2166:2: rule__ButtonShow__Group__3__Impl rule__ButtonShow__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ButtonShow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__3"


    // $ANTLR start "rule__ButtonShow__Group__3__Impl"
    // InternalMyDsl.g:2173:1: rule__ButtonShow__Group__3__Impl : ( 'label' ) ;
    public final void rule__ButtonShow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( 'label' ) )
            // InternalMyDsl.g:2178:1: ( 'label' )
            {
            // InternalMyDsl.g:2178:1: ( 'label' )
            // InternalMyDsl.g:2179:2: 'label'
            {
             before(grammarAccess.getButtonShowAccess().getLabelKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonShowAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__3__Impl"


    // $ANTLR start "rule__ButtonShow__Group__4"
    // InternalMyDsl.g:2188:1: rule__ButtonShow__Group__4 : rule__ButtonShow__Group__4__Impl ;
    public final void rule__ButtonShow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__ButtonShow__Group__4__Impl )
            // InternalMyDsl.g:2193:2: rule__ButtonShow__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonShow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__4"


    // $ANTLR start "rule__ButtonShow__Group__4__Impl"
    // InternalMyDsl.g:2199:1: rule__ButtonShow__Group__4__Impl : ( ( rule__ButtonShow__LabelAssignment_4 ) ) ;
    public final void rule__ButtonShow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( ( rule__ButtonShow__LabelAssignment_4 ) ) )
            // InternalMyDsl.g:2204:1: ( ( rule__ButtonShow__LabelAssignment_4 ) )
            {
            // InternalMyDsl.g:2204:1: ( ( rule__ButtonShow__LabelAssignment_4 ) )
            // InternalMyDsl.g:2205:2: ( rule__ButtonShow__LabelAssignment_4 )
            {
             before(grammarAccess.getButtonShowAccess().getLabelAssignment_4()); 
            // InternalMyDsl.g:2206:2: ( rule__ButtonShow__LabelAssignment_4 )
            // InternalMyDsl.g:2206:3: rule__ButtonShow__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ButtonShow__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonShowAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__Group__4__Impl"


    // $ANTLR start "rule__ButtonClose__Group__0"
    // InternalMyDsl.g:2215:1: rule__ButtonClose__Group__0 : rule__ButtonClose__Group__0__Impl rule__ButtonClose__Group__1 ;
    public final void rule__ButtonClose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__ButtonClose__Group__0__Impl rule__ButtonClose__Group__1 )
            // InternalMyDsl.g:2220:2: rule__ButtonClose__Group__0__Impl rule__ButtonClose__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ButtonClose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__0"


    // $ANTLR start "rule__ButtonClose__Group__0__Impl"
    // InternalMyDsl.g:2227:1: rule__ButtonClose__Group__0__Impl : ( 'ButtonClose:' ) ;
    public final void rule__ButtonClose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( 'ButtonClose:' ) )
            // InternalMyDsl.g:2232:1: ( 'ButtonClose:' )
            {
            // InternalMyDsl.g:2232:1: ( 'ButtonClose:' )
            // InternalMyDsl.g:2233:2: 'ButtonClose:'
            {
             before(grammarAccess.getButtonCloseAccess().getButtonCloseKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getButtonCloseAccess().getButtonCloseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__0__Impl"


    // $ANTLR start "rule__ButtonClose__Group__1"
    // InternalMyDsl.g:2242:1: rule__ButtonClose__Group__1 : rule__ButtonClose__Group__1__Impl rule__ButtonClose__Group__2 ;
    public final void rule__ButtonClose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__ButtonClose__Group__1__Impl rule__ButtonClose__Group__2 )
            // InternalMyDsl.g:2247:2: rule__ButtonClose__Group__1__Impl rule__ButtonClose__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ButtonClose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__1"


    // $ANTLR start "rule__ButtonClose__Group__1__Impl"
    // InternalMyDsl.g:2254:1: rule__ButtonClose__Group__1__Impl : ( 'wizard' ) ;
    public final void rule__ButtonClose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( 'wizard' ) )
            // InternalMyDsl.g:2259:1: ( 'wizard' )
            {
            // InternalMyDsl.g:2259:1: ( 'wizard' )
            // InternalMyDsl.g:2260:2: 'wizard'
            {
             before(grammarAccess.getButtonCloseAccess().getWizardKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getButtonCloseAccess().getWizardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__1__Impl"


    // $ANTLR start "rule__ButtonClose__Group__2"
    // InternalMyDsl.g:2269:1: rule__ButtonClose__Group__2 : rule__ButtonClose__Group__2__Impl rule__ButtonClose__Group__3 ;
    public final void rule__ButtonClose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__ButtonClose__Group__2__Impl rule__ButtonClose__Group__3 )
            // InternalMyDsl.g:2274:2: rule__ButtonClose__Group__2__Impl rule__ButtonClose__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ButtonClose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__2"


    // $ANTLR start "rule__ButtonClose__Group__2__Impl"
    // InternalMyDsl.g:2281:1: rule__ButtonClose__Group__2__Impl : ( ( rule__ButtonClose__WizardAssignment_2 ) ) ;
    public final void rule__ButtonClose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ( rule__ButtonClose__WizardAssignment_2 ) ) )
            // InternalMyDsl.g:2286:1: ( ( rule__ButtonClose__WizardAssignment_2 ) )
            {
            // InternalMyDsl.g:2286:1: ( ( rule__ButtonClose__WizardAssignment_2 ) )
            // InternalMyDsl.g:2287:2: ( rule__ButtonClose__WizardAssignment_2 )
            {
             before(grammarAccess.getButtonCloseAccess().getWizardAssignment_2()); 
            // InternalMyDsl.g:2288:2: ( rule__ButtonClose__WizardAssignment_2 )
            // InternalMyDsl.g:2288:3: rule__ButtonClose__WizardAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonClose__WizardAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonCloseAccess().getWizardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__2__Impl"


    // $ANTLR start "rule__ButtonClose__Group__3"
    // InternalMyDsl.g:2296:1: rule__ButtonClose__Group__3 : rule__ButtonClose__Group__3__Impl rule__ButtonClose__Group__4 ;
    public final void rule__ButtonClose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__ButtonClose__Group__3__Impl rule__ButtonClose__Group__4 )
            // InternalMyDsl.g:2301:2: rule__ButtonClose__Group__3__Impl rule__ButtonClose__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ButtonClose__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__3"


    // $ANTLR start "rule__ButtonClose__Group__3__Impl"
    // InternalMyDsl.g:2308:1: rule__ButtonClose__Group__3__Impl : ( 'label' ) ;
    public final void rule__ButtonClose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( 'label' ) )
            // InternalMyDsl.g:2313:1: ( 'label' )
            {
            // InternalMyDsl.g:2313:1: ( 'label' )
            // InternalMyDsl.g:2314:2: 'label'
            {
             before(grammarAccess.getButtonCloseAccess().getLabelKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonCloseAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__3__Impl"


    // $ANTLR start "rule__ButtonClose__Group__4"
    // InternalMyDsl.g:2323:1: rule__ButtonClose__Group__4 : rule__ButtonClose__Group__4__Impl ;
    public final void rule__ButtonClose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__ButtonClose__Group__4__Impl )
            // InternalMyDsl.g:2328:2: rule__ButtonClose__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonClose__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__4"


    // $ANTLR start "rule__ButtonClose__Group__4__Impl"
    // InternalMyDsl.g:2334:1: rule__ButtonClose__Group__4__Impl : ( ( rule__ButtonClose__LabelAssignment_4 ) ) ;
    public final void rule__ButtonClose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( ( rule__ButtonClose__LabelAssignment_4 ) ) )
            // InternalMyDsl.g:2339:1: ( ( rule__ButtonClose__LabelAssignment_4 ) )
            {
            // InternalMyDsl.g:2339:1: ( ( rule__ButtonClose__LabelAssignment_4 ) )
            // InternalMyDsl.g:2340:2: ( rule__ButtonClose__LabelAssignment_4 )
            {
             before(grammarAccess.getButtonCloseAccess().getLabelAssignment_4()); 
            // InternalMyDsl.g:2341:2: ( rule__ButtonClose__LabelAssignment_4 )
            // InternalMyDsl.g:2341:3: rule__ButtonClose__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ButtonClose__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonCloseAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__Group__4__Impl"


    // $ANTLR start "rule__Wizard__TitleAssignment_2"
    // InternalMyDsl.g:2350:1: rule__Wizard__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__Wizard__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2355:2: ( ruleEString )
            {
            // InternalMyDsl.g:2355:2: ( ruleEString )
            // InternalMyDsl.g:2356:3: ruleEString
            {
             before(grammarAccess.getWizardAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getTitleEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__TitleAssignment_2"


    // $ANTLR start "rule__Wizard__PagesAssignment_5"
    // InternalMyDsl.g:2365:1: rule__Wizard__PagesAssignment_5 : ( rulePage ) ;
    public final void rule__Wizard__PagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2369:1: ( ( rulePage ) )
            // InternalMyDsl.g:2370:2: ( rulePage )
            {
            // InternalMyDsl.g:2370:2: ( rulePage )
            // InternalMyDsl.g:2371:3: rulePage
            {
             before(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PagesAssignment_5"


    // $ANTLR start "rule__Wizard__PagesAssignment_6_1"
    // InternalMyDsl.g:2380:1: rule__Wizard__PagesAssignment_6_1 : ( rulePage ) ;
    public final void rule__Wizard__PagesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( rulePage ) )
            // InternalMyDsl.g:2385:2: ( rulePage )
            {
            // InternalMyDsl.g:2385:2: ( rulePage )
            // InternalMyDsl.g:2386:3: rulePage
            {
             before(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PagesAssignment_6_1"


    // $ANTLR start "rule__Page__InitAssignment_0"
    // InternalMyDsl.g:2395:1: rule__Page__InitAssignment_0 : ( ( 'init' ) ) ;
    public final void rule__Page__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( ( ( 'init' ) ) )
            // InternalMyDsl.g:2400:2: ( ( 'init' ) )
            {
            // InternalMyDsl.g:2400:2: ( ( 'init' ) )
            // InternalMyDsl.g:2401:3: ( 'init' )
            {
             before(grammarAccess.getPageAccess().getInitInitKeyword_0_0()); 
            // InternalMyDsl.g:2402:3: ( 'init' )
            // InternalMyDsl.g:2403:4: 'init'
            {
             before(grammarAccess.getPageAccess().getInitInitKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getInitInitKeyword_0_0()); 

            }

             after(grammarAccess.getPageAccess().getInitInitKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__InitAssignment_0"


    // $ANTLR start "rule__Page__TextfieldsAssignment_2_2"
    // InternalMyDsl.g:2414:1: rule__Page__TextfieldsAssignment_2_2 : ( ruleTextField ) ;
    public final void rule__Page__TextfieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ruleTextField ) )
            // InternalMyDsl.g:2419:2: ( ruleTextField )
            {
            // InternalMyDsl.g:2419:2: ( ruleTextField )
            // InternalMyDsl.g:2420:3: ruleTextField
            {
             before(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TextfieldsAssignment_2_2"


    // $ANTLR start "rule__Page__TextfieldsAssignment_2_3_1"
    // InternalMyDsl.g:2429:1: rule__Page__TextfieldsAssignment_2_3_1 : ( ruleTextField ) ;
    public final void rule__Page__TextfieldsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( ruleTextField ) )
            // InternalMyDsl.g:2434:2: ( ruleTextField )
            {
            // InternalMyDsl.g:2434:2: ( ruleTextField )
            // InternalMyDsl.g:2435:3: ruleTextField
            {
             before(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getPageAccess().getTextfieldsTextFieldParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TextfieldsAssignment_2_3_1"


    // $ANTLR start "rule__Page__CheckboxAssignment_3_1"
    // InternalMyDsl.g:2444:1: rule__Page__CheckboxAssignment_3_1 : ( ruleCheckbox ) ;
    public final void rule__Page__CheckboxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( ( ruleCheckbox ) )
            // InternalMyDsl.g:2449:2: ( ruleCheckbox )
            {
            // InternalMyDsl.g:2449:2: ( ruleCheckbox )
            // InternalMyDsl.g:2450:3: ruleCheckbox
            {
             before(grammarAccess.getPageAccess().getCheckboxCheckboxParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getPageAccess().getCheckboxCheckboxParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__CheckboxAssignment_3_1"


    // $ANTLR start "rule__Page__ButtonsAssignment_6"
    // InternalMyDsl.g:2459:1: rule__Page__ButtonsAssignment_6 : ( ruleButton ) ;
    public final void rule__Page__ButtonsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( ruleButton ) )
            // InternalMyDsl.g:2464:2: ( ruleButton )
            {
            // InternalMyDsl.g:2464:2: ( ruleButton )
            // InternalMyDsl.g:2465:3: ruleButton
            {
             before(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ButtonsAssignment_6"


    // $ANTLR start "rule__Page__ButtonsAssignment_7_1"
    // InternalMyDsl.g:2474:1: rule__Page__ButtonsAssignment_7_1 : ( ruleButton ) ;
    public final void rule__Page__ButtonsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( ruleButton ) )
            // InternalMyDsl.g:2479:2: ( ruleButton )
            {
            // InternalMyDsl.g:2479:2: ( ruleButton )
            // InternalMyDsl.g:2480:3: ruleButton
            {
             before(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getPageAccess().getButtonsButtonParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ButtonsAssignment_7_1"


    // $ANTLR start "rule__TextField__MinLengthAssignment_2"
    // InternalMyDsl.g:2489:1: rule__TextField__MinLengthAssignment_2 : ( ruleEInt ) ;
    public final void rule__TextField__MinLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2494:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2494:2: ( ruleEInt )
            // InternalMyDsl.g:2495:3: ruleEInt
            {
             before(grammarAccess.getTextFieldAccess().getMinLengthEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getMinLengthEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__MinLengthAssignment_2"


    // $ANTLR start "rule__TextField__MaxLengthAssignment_4"
    // InternalMyDsl.g:2504:1: rule__TextField__MaxLengthAssignment_4 : ( ruleEInt ) ;
    public final void rule__TextField__MaxLengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2509:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2509:2: ( ruleEInt )
            // InternalMyDsl.g:2510:3: ruleEInt
            {
             before(grammarAccess.getTextFieldAccess().getMaxLengthEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getMaxLengthEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__MaxLengthAssignment_4"


    // $ANTLR start "rule__TextField__InputAssignment_5_1"
    // InternalMyDsl.g:2519:1: rule__TextField__InputAssignment_5_1 : ( ruleEString ) ;
    public final void rule__TextField__InputAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2524:2: ( ruleEString )
            {
            // InternalMyDsl.g:2524:2: ( ruleEString )
            // InternalMyDsl.g:2525:3: ruleEString
            {
             before(grammarAccess.getTextFieldAccess().getInputEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getInputEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__InputAssignment_5_1"


    // $ANTLR start "rule__TextField__LabelAssignment_7"
    // InternalMyDsl.g:2534:1: rule__TextField__LabelAssignment_7 : ( ruleLabel ) ;
    public final void rule__TextField__LabelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2539:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2539:2: ( ruleLabel )
            // InternalMyDsl.g:2540:3: ruleLabel
            {
             before(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__LabelAssignment_7"


    // $ANTLR start "rule__Checkbox__SelectedAssignment_0"
    // InternalMyDsl.g:2549:1: rule__Checkbox__SelectedAssignment_0 : ( ( 'selected' ) ) ;
    public final void rule__Checkbox__SelectedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ( 'selected' ) ) )
            // InternalMyDsl.g:2554:2: ( ( 'selected' ) )
            {
            // InternalMyDsl.g:2554:2: ( ( 'selected' ) )
            // InternalMyDsl.g:2555:3: ( 'selected' )
            {
             before(grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0()); 
            // InternalMyDsl.g:2556:3: ( 'selected' )
            // InternalMyDsl.g:2557:4: 'selected'
            {
             before(grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0()); 

            }

             after(grammarAccess.getCheckboxAccess().getSelectedSelectedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__SelectedAssignment_0"


    // $ANTLR start "rule__Checkbox__LabelAssignment_3"
    // InternalMyDsl.g:2568:1: rule__Checkbox__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__Checkbox__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2573:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2573:2: ( ruleLabel )
            // InternalMyDsl.g:2574:3: ruleLabel
            {
             before(grammarAccess.getCheckboxAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__LabelAssignment_3"


    // $ANTLR start "rule__Label__TextAssignment_2"
    // InternalMyDsl.g:2583:1: rule__Label__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__Label__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2588:2: ( ruleEString )
            {
            // InternalMyDsl.g:2588:2: ( ruleEString )
            // InternalMyDsl.g:2589:3: ruleEString
            {
             before(grammarAccess.getLabelAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__TextAssignment_2"


    // $ANTLR start "rule__ButtonNavigate__NextPageAssignment_2"
    // InternalMyDsl.g:2598:1: rule__ButtonNavigate__NextPageAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ButtonNavigate__NextPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2603:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2603:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2604:3: ( ruleEString )
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPagePageCrossReference_2_0()); 
            // InternalMyDsl.g:2605:3: ( ruleEString )
            // InternalMyDsl.g:2606:4: ruleEString
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPagePageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonNavigateAccess().getNextPagePageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getButtonNavigateAccess().getNextPagePageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__NextPageAssignment_2"


    // $ANTLR start "rule__ButtonNavigate__NextPageAltAssignment_3_1"
    // InternalMyDsl.g:2617:1: rule__ButtonNavigate__NextPageAltAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ButtonNavigate__NextPageAltAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2622:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2622:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2623:3: ( ruleEString )
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageAltPageCrossReference_3_1_0()); 
            // InternalMyDsl.g:2624:3: ( ruleEString )
            // InternalMyDsl.g:2625:4: ruleEString
            {
             before(grammarAccess.getButtonNavigateAccess().getNextPageAltPageEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonNavigateAccess().getNextPageAltPageEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getButtonNavigateAccess().getNextPageAltPageCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__NextPageAltAssignment_3_1"


    // $ANTLR start "rule__ButtonNavigate__LabelAssignment_5"
    // InternalMyDsl.g:2636:1: rule__ButtonNavigate__LabelAssignment_5 : ( ruleLabel ) ;
    public final void rule__ButtonNavigate__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2641:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2641:2: ( ruleLabel )
            // InternalMyDsl.g:2642:3: ruleLabel
            {
             before(grammarAccess.getButtonNavigateAccess().getLabelLabelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getButtonNavigateAccess().getLabelLabelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonNavigate__LabelAssignment_5"


    // $ANTLR start "rule__ButtonReturn__PreviousPageAssignment_2"
    // InternalMyDsl.g:2651:1: rule__ButtonReturn__PreviousPageAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ButtonReturn__PreviousPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2656:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2656:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2657:3: ( ruleEString )
            {
             before(grammarAccess.getButtonReturnAccess().getPreviousPagePageCrossReference_2_0()); 
            // InternalMyDsl.g:2658:3: ( ruleEString )
            // InternalMyDsl.g:2659:4: ruleEString
            {
             before(grammarAccess.getButtonReturnAccess().getPreviousPagePageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonReturnAccess().getPreviousPagePageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getButtonReturnAccess().getPreviousPagePageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__PreviousPageAssignment_2"


    // $ANTLR start "rule__ButtonReturn__LabelAssignment_4"
    // InternalMyDsl.g:2670:1: rule__ButtonReturn__LabelAssignment_4 : ( ruleLabel ) ;
    public final void rule__ButtonReturn__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2675:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2675:2: ( ruleLabel )
            // InternalMyDsl.g:2676:3: ruleLabel
            {
             before(grammarAccess.getButtonReturnAccess().getLabelLabelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getButtonReturnAccess().getLabelLabelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonReturn__LabelAssignment_4"


    // $ANTLR start "rule__ButtonShow__MessageAssignment_2"
    // InternalMyDsl.g:2685:1: rule__ButtonShow__MessageAssignment_2 : ( ruleEString ) ;
    public final void rule__ButtonShow__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2690:2: ( ruleEString )
            {
            // InternalMyDsl.g:2690:2: ( ruleEString )
            // InternalMyDsl.g:2691:3: ruleEString
            {
             before(grammarAccess.getButtonShowAccess().getMessageEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonShowAccess().getMessageEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__MessageAssignment_2"


    // $ANTLR start "rule__ButtonShow__LabelAssignment_4"
    // InternalMyDsl.g:2700:1: rule__ButtonShow__LabelAssignment_4 : ( ruleLabel ) ;
    public final void rule__ButtonShow__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2705:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2705:2: ( ruleLabel )
            // InternalMyDsl.g:2706:3: ruleLabel
            {
             before(grammarAccess.getButtonShowAccess().getLabelLabelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getButtonShowAccess().getLabelLabelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonShow__LabelAssignment_4"


    // $ANTLR start "rule__ButtonClose__WizardAssignment_2"
    // InternalMyDsl.g:2715:1: rule__ButtonClose__WizardAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ButtonClose__WizardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2719:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2720:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2720:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2721:3: ( ruleEString )
            {
             before(grammarAccess.getButtonCloseAccess().getWizardWizardCrossReference_2_0()); 
            // InternalMyDsl.g:2722:3: ( ruleEString )
            // InternalMyDsl.g:2723:4: ruleEString
            {
             before(grammarAccess.getButtonCloseAccess().getWizardWizardEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonCloseAccess().getWizardWizardEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getButtonCloseAccess().getWizardWizardCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__WizardAssignment_2"


    // $ANTLR start "rule__ButtonClose__LabelAssignment_4"
    // InternalMyDsl.g:2734:1: rule__ButtonClose__LabelAssignment_4 : ( ruleLabel ) ;
    public final void rule__ButtonClose__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:2739:2: ( ruleLabel )
            {
            // InternalMyDsl.g:2739:2: ( ruleLabel )
            // InternalMyDsl.g:2740:3: ruleLabel
            {
             before(grammarAccess.getButtonCloseAccess().getLabelLabelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getButtonCloseAccess().getLabelLabelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonClose__LabelAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002A40000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});

}