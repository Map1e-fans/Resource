package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Resources'", "'{'", "'vehicles'", "','", "'}'", "'-'", "'Frigate'", "'amount'", "'drone'", "'('", "')'", "'helicopter'", "'ammunitions'", "'Destroyer'", "'AircraftCarrier'", "'carrieraircraft'", "'Reconnaissance'", "'Strike'", "'Transport'", "'Fighter'", "'Recon'", "'Helicopter'", "'Missile'", "'Shell'", "'Torpedo'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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
        	return "Resources";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleResources"
    // InternalMyDsl.g:64:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleResources= ruleResources EOF )
            // InternalMyDsl.g:65:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalMyDsl.g:71:1: ruleResources returns [EObject current=null] : ( () otherlv_1= 'Resources' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_vehicles_6_0 = null;

        EObject lv_vehicles_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Resources' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Resources' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Resources' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Resources' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourcesAccess().getResourcesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResourcesAccess().getResourcesKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourcesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourcesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: (otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'vehicles' otherlv_5= '{' ( (lv_vehicles_6_0= ruleVehicle ) ) (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourcesAccess().getVehiclesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:122:4: ( (lv_vehicles_6_0= ruleVehicle ) )
                    // InternalMyDsl.g:123:5: (lv_vehicles_6_0= ruleVehicle )
                    {
                    // InternalMyDsl.g:123:5: (lv_vehicles_6_0= ruleVehicle )
                    // InternalMyDsl.g:124:6: lv_vehicles_6_0= ruleVehicle
                    {

                    						newCompositeNode(grammarAccess.getResourcesAccess().getVehiclesVehicleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_vehicles_6_0=ruleVehicle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourcesRule());
                    						}
                    						add(
                    							current,
                    							"vehicles",
                    							lv_vehicles_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Vehicle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:141:4: (otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:142:5: otherlv_7= ',' ( (lv_vehicles_8_0= ruleVehicle ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getResourcesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:146:5: ( (lv_vehicles_8_0= ruleVehicle ) )
                    	    // InternalMyDsl.g:147:6: (lv_vehicles_8_0= ruleVehicle )
                    	    {
                    	    // InternalMyDsl.g:147:6: (lv_vehicles_8_0= ruleVehicle )
                    	    // InternalMyDsl.g:148:7: lv_vehicles_8_0= ruleVehicle
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourcesAccess().getVehiclesVehicleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_vehicles_8_0=ruleVehicle();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourcesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vehicles",
                    	    								lv_vehicles_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Vehicle");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleVehicle"
    // InternalMyDsl.g:179:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalMyDsl.g:179:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalMyDsl.g:180:2: iv_ruleVehicle= ruleVehicle EOF
            {
             newCompositeNode(grammarAccess.getVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVehicle=ruleVehicle();

            state._fsp--;

             current =iv_ruleVehicle; 
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
    // $ANTLR end "entryRuleVehicle"


    // $ANTLR start "ruleVehicle"
    // InternalMyDsl.g:186:1: ruleVehicle returns [EObject current=null] : (this_Frigate_0= ruleFrigate | this_Destroyer_1= ruleDestroyer | this_AircraftCarrier_2= ruleAircraftCarrier | this_Reconnaissance_3= ruleReconnaissance | this_Strike_4= ruleStrike | this_Transport_5= ruleTransport | this_Fighter_6= ruleFighter | this_Recon_7= ruleRecon | this_Helicopter_8= ruleHelicopter ) ;
    public final EObject ruleVehicle() throws RecognitionException {
        EObject current = null;

        EObject this_Frigate_0 = null;

        EObject this_Destroyer_1 = null;

        EObject this_AircraftCarrier_2 = null;

        EObject this_Reconnaissance_3 = null;

        EObject this_Strike_4 = null;

        EObject this_Transport_5 = null;

        EObject this_Fighter_6 = null;

        EObject this_Recon_7 = null;

        EObject this_Helicopter_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:192:2: ( (this_Frigate_0= ruleFrigate | this_Destroyer_1= ruleDestroyer | this_AircraftCarrier_2= ruleAircraftCarrier | this_Reconnaissance_3= ruleReconnaissance | this_Strike_4= ruleStrike | this_Transport_5= ruleTransport | this_Fighter_6= ruleFighter | this_Recon_7= ruleRecon | this_Helicopter_8= ruleHelicopter ) )
            // InternalMyDsl.g:193:2: (this_Frigate_0= ruleFrigate | this_Destroyer_1= ruleDestroyer | this_AircraftCarrier_2= ruleAircraftCarrier | this_Reconnaissance_3= ruleReconnaissance | this_Strike_4= ruleStrike | this_Transport_5= ruleTransport | this_Fighter_6= ruleFighter | this_Recon_7= ruleRecon | this_Helicopter_8= ruleHelicopter )
            {
            // InternalMyDsl.g:193:2: (this_Frigate_0= ruleFrigate | this_Destroyer_1= ruleDestroyer | this_AircraftCarrier_2= ruleAircraftCarrier | this_Reconnaissance_3= ruleReconnaissance | this_Strike_4= ruleStrike | this_Transport_5= ruleTransport | this_Fighter_6= ruleFighter | this_Recon_7= ruleRecon | this_Helicopter_8= ruleHelicopter )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 31:
                {
                alt3=8;
                }
                break;
            case 32:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:194:3: this_Frigate_0= ruleFrigate
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getFrigateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Frigate_0=ruleFrigate();

                    state._fsp--;


                    			current = this_Frigate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:203:3: this_Destroyer_1= ruleDestroyer
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getDestroyerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Destroyer_1=ruleDestroyer();

                    state._fsp--;


                    			current = this_Destroyer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:212:3: this_AircraftCarrier_2= ruleAircraftCarrier
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getAircraftCarrierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AircraftCarrier_2=ruleAircraftCarrier();

                    state._fsp--;


                    			current = this_AircraftCarrier_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:221:3: this_Reconnaissance_3= ruleReconnaissance
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getReconnaissanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reconnaissance_3=ruleReconnaissance();

                    state._fsp--;


                    			current = this_Reconnaissance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:230:3: this_Strike_4= ruleStrike
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getStrikeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strike_4=ruleStrike();

                    state._fsp--;


                    			current = this_Strike_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:239:3: this_Transport_5= ruleTransport
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getTransportParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transport_5=ruleTransport();

                    state._fsp--;


                    			current = this_Transport_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:248:3: this_Fighter_6= ruleFighter
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getFighterParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fighter_6=ruleFighter();

                    state._fsp--;


                    			current = this_Fighter_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:257:3: this_Recon_7= ruleRecon
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getReconParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Recon_7=ruleRecon();

                    state._fsp--;


                    			current = this_Recon_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:266:3: this_Helicopter_8= ruleHelicopter
                    {

                    			newCompositeNode(grammarAccess.getVehicleAccess().getHelicopterParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Helicopter_8=ruleHelicopter();

                    state._fsp--;


                    			current = this_Helicopter_8;
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
    // $ANTLR end "ruleVehicle"


    // $ANTLR start "entryRuleAmmunition"
    // InternalMyDsl.g:278:1: entryRuleAmmunition returns [EObject current=null] : iv_ruleAmmunition= ruleAmmunition EOF ;
    public final EObject entryRuleAmmunition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmmunition = null;


        try {
            // InternalMyDsl.g:278:51: (iv_ruleAmmunition= ruleAmmunition EOF )
            // InternalMyDsl.g:279:2: iv_ruleAmmunition= ruleAmmunition EOF
            {
             newCompositeNode(grammarAccess.getAmmunitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmmunition=ruleAmmunition();

            state._fsp--;

             current =iv_ruleAmmunition; 
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
    // $ANTLR end "entryRuleAmmunition"


    // $ANTLR start "ruleAmmunition"
    // InternalMyDsl.g:285:1: ruleAmmunition returns [EObject current=null] : (this_Missile_0= ruleMissile | this_Shell_1= ruleShell | this_Torpedo_2= ruleTorpedo ) ;
    public final EObject ruleAmmunition() throws RecognitionException {
        EObject current = null;

        EObject this_Missile_0 = null;

        EObject this_Shell_1 = null;

        EObject this_Torpedo_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( (this_Missile_0= ruleMissile | this_Shell_1= ruleShell | this_Torpedo_2= ruleTorpedo ) )
            // InternalMyDsl.g:292:2: (this_Missile_0= ruleMissile | this_Shell_1= ruleShell | this_Torpedo_2= ruleTorpedo )
            {
            // InternalMyDsl.g:292:2: (this_Missile_0= ruleMissile | this_Shell_1= ruleShell | this_Torpedo_2= ruleTorpedo )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:293:3: this_Missile_0= ruleMissile
                    {

                    			newCompositeNode(grammarAccess.getAmmunitionAccess().getMissileParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Missile_0=ruleMissile();

                    state._fsp--;


                    			current = this_Missile_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:302:3: this_Shell_1= ruleShell
                    {

                    			newCompositeNode(grammarAccess.getAmmunitionAccess().getShellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shell_1=ruleShell();

                    state._fsp--;


                    			current = this_Shell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:311:3: this_Torpedo_2= ruleTorpedo
                    {

                    			newCompositeNode(grammarAccess.getAmmunitionAccess().getTorpedoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Torpedo_2=ruleTorpedo();

                    state._fsp--;


                    			current = this_Torpedo_2;
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
    // $ANTLR end "ruleAmmunition"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:323:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:323:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:324:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:330:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:336:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:337:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:337:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:338:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:346:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:357:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:357:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:358:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:364:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:371:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:371:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:372:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:372:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:373:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

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


    // $ANTLR start "entryRuleFrigate"
    // InternalMyDsl.g:390:1: entryRuleFrigate returns [EObject current=null] : iv_ruleFrigate= ruleFrigate EOF ;
    public final EObject entryRuleFrigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrigate = null;


        try {
            // InternalMyDsl.g:390:48: (iv_ruleFrigate= ruleFrigate EOF )
            // InternalMyDsl.g:391:2: iv_ruleFrigate= ruleFrigate EOF
            {
             newCompositeNode(grammarAccess.getFrigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrigate=ruleFrigate();

            state._fsp--;

             current =iv_ruleFrigate; 
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
    // $ANTLR end "entryRuleFrigate"


    // $ANTLR start "ruleFrigate"
    // InternalMyDsl.g:397:1: ruleFrigate returns [EObject current=null] : ( () otherlv_1= 'Frigate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleFrigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_20_0 = null;

        EObject lv_ammunitions_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( ( () otherlv_1= 'Frigate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:404:2: ( () otherlv_1= 'Frigate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:404:2: ( () otherlv_1= 'Frigate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:405:3: () otherlv_1= 'Frigate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:405:3: ()
            // InternalMyDsl.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFrigateAccess().getFrigateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFrigateAccess().getFrigateKeyword_1());
            		
            // InternalMyDsl.g:416:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:417:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:417:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:418:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFrigateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrigateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFrigateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:439:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:440:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFrigateAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:444:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:445:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:445:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:446:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFrigateAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrigateRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:464:3: (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:465:4: otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFrigateAccess().getDroneKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFrigateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:473:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:474:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:474:5: ( ruleEString )
                    // InternalMyDsl.g:475:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFrigateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFrigateAccess().getDroneDroneCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:489:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:490:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFrigateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:494:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:495:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:495:6: ( ruleEString )
                    	    // InternalMyDsl.g:496:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFrigateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFrigateAccess().getDroneDroneCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getFrigateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:516:3: (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:517:4: otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getFrigateAccess().getHelicopterKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getFrigateAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:525:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:526:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:526:5: ( ruleEString )
                    // InternalMyDsl.g:527:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFrigateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFrigateAccess().getHelicopterHelicopterCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:541:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:542:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getFrigateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:546:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:547:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:547:6: ( ruleEString )
                    	    // InternalMyDsl.g:548:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFrigateRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFrigateAccess().getHelicopterHelicopterCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getFrigateAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:568:3: (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:569:4: otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getFrigateAccess().getAmmunitionsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getFrigateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:577:4: ( (lv_ammunitions_20_0= ruleAmmunition ) )
                    // InternalMyDsl.g:578:5: (lv_ammunitions_20_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:578:5: (lv_ammunitions_20_0= ruleAmmunition )
                    // InternalMyDsl.g:579:6: lv_ammunitions_20_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getFrigateAccess().getAmmunitionsAmmunitionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_20_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrigateRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_20_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:596:4: (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:597:5: otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getFrigateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:601:5: ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:602:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:602:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    // InternalMyDsl.g:603:7: lv_ammunitions_22_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getFrigateAccess().getAmmunitionsAmmunitionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_22_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFrigateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_23, grammarAccess.getFrigateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFrigateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFrigate"


    // $ANTLR start "entryRuleDestroyer"
    // InternalMyDsl.g:634:1: entryRuleDestroyer returns [EObject current=null] : iv_ruleDestroyer= ruleDestroyer EOF ;
    public final EObject entryRuleDestroyer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyer = null;


        try {
            // InternalMyDsl.g:634:50: (iv_ruleDestroyer= ruleDestroyer EOF )
            // InternalMyDsl.g:635:2: iv_ruleDestroyer= ruleDestroyer EOF
            {
             newCompositeNode(grammarAccess.getDestroyerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestroyer=ruleDestroyer();

            state._fsp--;

             current =iv_ruleDestroyer; 
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
    // $ANTLR end "entryRuleDestroyer"


    // $ANTLR start "ruleDestroyer"
    // InternalMyDsl.g:641:1: ruleDestroyer returns [EObject current=null] : ( () otherlv_1= 'Destroyer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleDestroyer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_20_0 = null;

        EObject lv_ammunitions_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:647:2: ( ( () otherlv_1= 'Destroyer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:648:2: ( () otherlv_1= 'Destroyer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:648:2: ( () otherlv_1= 'Destroyer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:649:3: () otherlv_1= 'Destroyer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:649:3: ()
            // InternalMyDsl.g:650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDestroyerAccess().getDestroyerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDestroyerAccess().getDestroyerKeyword_1());
            		
            // InternalMyDsl.g:660:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:661:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:661:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:662:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDestroyerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDestroyerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDestroyerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:683:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:684:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDestroyerAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:688:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:689:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:689:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:690:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDestroyerAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDestroyerRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:708:3: (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:709:4: otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getDestroyerAccess().getDroneKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDestroyerAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:717:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:718:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:718:5: ( ruleEString )
                    // InternalMyDsl.g:719:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDestroyerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDestroyerAccess().getDroneDroneCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:733:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:734:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDestroyerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:738:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:739:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:739:6: ( ruleEString )
                    	    // InternalMyDsl.g:740:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDestroyerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDestroyerAccess().getDroneDroneCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getDestroyerAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:760:3: (otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:761:4: otherlv_12= 'helicopter' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDestroyerAccess().getHelicopterKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getDestroyerAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:769:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:770:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:770:5: ( ruleEString )
                    // InternalMyDsl.g:771:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDestroyerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDestroyerAccess().getHelicopterHelicopterCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:785:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:786:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDestroyerAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:790:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:791:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:791:6: ( ruleEString )
                    	    // InternalMyDsl.g:792:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDestroyerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDestroyerAccess().getHelicopterHelicopterCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getDestroyerAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:812:3: (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:813:4: otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getDestroyerAccess().getAmmunitionsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getDestroyerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:821:4: ( (lv_ammunitions_20_0= ruleAmmunition ) )
                    // InternalMyDsl.g:822:5: (lv_ammunitions_20_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:822:5: (lv_ammunitions_20_0= ruleAmmunition )
                    // InternalMyDsl.g:823:6: lv_ammunitions_20_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getDestroyerAccess().getAmmunitionsAmmunitionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_20_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDestroyerRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_20_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:840:4: (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:841:5: otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getDestroyerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:845:5: ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:846:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:846:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    // InternalMyDsl.g:847:7: lv_ammunitions_22_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getDestroyerAccess().getAmmunitionsAmmunitionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_22_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDestroyerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_23, grammarAccess.getDestroyerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDestroyerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDestroyer"


    // $ANTLR start "entryRuleAircraftCarrier"
    // InternalMyDsl.g:878:1: entryRuleAircraftCarrier returns [EObject current=null] : iv_ruleAircraftCarrier= ruleAircraftCarrier EOF ;
    public final EObject entryRuleAircraftCarrier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAircraftCarrier = null;


        try {
            // InternalMyDsl.g:878:56: (iv_ruleAircraftCarrier= ruleAircraftCarrier EOF )
            // InternalMyDsl.g:879:2: iv_ruleAircraftCarrier= ruleAircraftCarrier EOF
            {
             newCompositeNode(grammarAccess.getAircraftCarrierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAircraftCarrier=ruleAircraftCarrier();

            state._fsp--;

             current =iv_ruleAircraftCarrier; 
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
    // $ANTLR end "entryRuleAircraftCarrier"


    // $ANTLR start "ruleAircraftCarrier"
    // InternalMyDsl.g:885:1: ruleAircraftCarrier returns [EObject current=null] : ( () otherlv_1= 'AircraftCarrier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleAircraftCarrier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_20_0 = null;

        EObject lv_ammunitions_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:891:2: ( ( () otherlv_1= 'AircraftCarrier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:892:2: ( () otherlv_1= 'AircraftCarrier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:892:2: ( () otherlv_1= 'AircraftCarrier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:893:3: () otherlv_1= 'AircraftCarrier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:893:3: ()
            // InternalMyDsl.g:894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAircraftCarrierAccess().getAircraftCarrierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAircraftCarrierAccess().getAircraftCarrierKeyword_1());
            		
            // InternalMyDsl.g:904:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:905:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:905:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:906:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAircraftCarrierAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAircraftCarrierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAircraftCarrierAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:927:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:928:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getAircraftCarrierAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:932:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:933:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:933:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:934:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAircraftCarrierAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAircraftCarrierRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:952:3: (otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:953:4: otherlv_6= 'drone' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAircraftCarrierAccess().getDroneKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAircraftCarrierAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:961:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:962:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:962:5: ( ruleEString )
                    // InternalMyDsl.g:963:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAircraftCarrierRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAircraftCarrierAccess().getDroneDroneCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:977:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMyDsl.g:978:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAircraftCarrierAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:982:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:983:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:983:6: ( ruleEString )
                    	    // InternalMyDsl.g:984:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAircraftCarrierRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAircraftCarrierAccess().getDroneDroneCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getAircraftCarrierAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1004:3: (otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1005:4: otherlv_12= 'carrieraircraft' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getAircraftCarrierAccess().getCarrieraircraftKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAircraftCarrierAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:1013:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1014:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1014:5: ( ruleEString )
                    // InternalMyDsl.g:1015:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAircraftCarrierRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAircraftCarrierAccess().getCarrieraircraftCarrierAircraftCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1029:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1030:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAircraftCarrierAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:1034:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1035:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1035:6: ( ruleEString )
                    	    // InternalMyDsl.g:1036:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAircraftCarrierRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAircraftCarrierAccess().getCarrieraircraftCarrierAircraftCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getAircraftCarrierAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1056:3: (otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1057:4: otherlv_18= 'ammunitions' otherlv_19= '{' ( (lv_ammunitions_20_0= ruleAmmunition ) ) (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getAircraftCarrierAccess().getAmmunitionsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getAircraftCarrierAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:1065:4: ( (lv_ammunitions_20_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1066:5: (lv_ammunitions_20_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1066:5: (lv_ammunitions_20_0= ruleAmmunition )
                    // InternalMyDsl.g:1067:6: lv_ammunitions_20_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getAircraftCarrierAccess().getAmmunitionsAmmunitionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_20_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAircraftCarrierRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_20_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1084:4: (otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:1085:5: otherlv_21= ',' ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getAircraftCarrierAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:1089:5: ( (lv_ammunitions_22_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1090:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1090:6: (lv_ammunitions_22_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1091:7: lv_ammunitions_22_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getAircraftCarrierAccess().getAmmunitionsAmmunitionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_22_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAircraftCarrierRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_23, grammarAccess.getAircraftCarrierAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getAircraftCarrierAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAircraftCarrier"


    // $ANTLR start "entryRuleReconnaissance"
    // InternalMyDsl.g:1122:1: entryRuleReconnaissance returns [EObject current=null] : iv_ruleReconnaissance= ruleReconnaissance EOF ;
    public final EObject entryRuleReconnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReconnaissance = null;


        try {
            // InternalMyDsl.g:1122:55: (iv_ruleReconnaissance= ruleReconnaissance EOF )
            // InternalMyDsl.g:1123:2: iv_ruleReconnaissance= ruleReconnaissance EOF
            {
             newCompositeNode(grammarAccess.getReconnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReconnaissance=ruleReconnaissance();

            state._fsp--;

             current =iv_ruleReconnaissance; 
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
    // $ANTLR end "entryRuleReconnaissance"


    // $ANTLR start "ruleReconnaissance"
    // InternalMyDsl.g:1129:1: ruleReconnaissance returns [EObject current=null] : ( () otherlv_1= 'Reconnaissance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleReconnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1135:2: ( ( () otherlv_1= 'Reconnaissance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1136:2: ( () otherlv_1= 'Reconnaissance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1136:2: ( () otherlv_1= 'Reconnaissance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1137:3: () otherlv_1= 'Reconnaissance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1137:3: ()
            // InternalMyDsl.g:1138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReconnaissanceAccess().getReconnaissanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReconnaissanceAccess().getReconnaissanceKeyword_1());
            		
            // InternalMyDsl.g:1148:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1149:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1149:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1150:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReconnaissanceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReconnaissanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReconnaissanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1171:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1172:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getReconnaissanceAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1176:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1177:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1177:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1178:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReconnaissanceAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReconnaissanceRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1196:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1197:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getReconnaissanceAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getReconnaissanceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1205:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1206:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1206:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1207:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getReconnaissanceAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReconnaissanceRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1224:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1225:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getReconnaissanceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1229:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1230:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1230:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1231:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getReconnaissanceAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReconnaissanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getReconnaissanceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getReconnaissanceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleReconnaissance"


    // $ANTLR start "entryRuleStrike"
    // InternalMyDsl.g:1262:1: entryRuleStrike returns [EObject current=null] : iv_ruleStrike= ruleStrike EOF ;
    public final EObject entryRuleStrike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrike = null;


        try {
            // InternalMyDsl.g:1262:47: (iv_ruleStrike= ruleStrike EOF )
            // InternalMyDsl.g:1263:2: iv_ruleStrike= ruleStrike EOF
            {
             newCompositeNode(grammarAccess.getStrikeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrike=ruleStrike();

            state._fsp--;

             current =iv_ruleStrike; 
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
    // $ANTLR end "entryRuleStrike"


    // $ANTLR start "ruleStrike"
    // InternalMyDsl.g:1269:1: ruleStrike returns [EObject current=null] : ( () otherlv_1= 'Strike' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleStrike() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1275:2: ( ( () otherlv_1= 'Strike' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1276:2: ( () otherlv_1= 'Strike' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1276:2: ( () otherlv_1= 'Strike' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1277:3: () otherlv_1= 'Strike' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1277:3: ()
            // InternalMyDsl.g:1278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrikeAccess().getStrikeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStrikeAccess().getStrikeKeyword_1());
            		
            // InternalMyDsl.g:1288:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1289:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1289:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1290:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStrikeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrikeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getStrikeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1311:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1312:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getStrikeAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1316:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1317:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1317:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1318:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStrikeAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStrikeRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1336:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1337:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getStrikeAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getStrikeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1345:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1346:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1346:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1347:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getStrikeAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStrikeRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1364:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:1365:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStrikeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1369:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1370:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1370:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1371:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStrikeAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStrikeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getStrikeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStrikeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStrike"


    // $ANTLR start "entryRuleTransport"
    // InternalMyDsl.g:1402:1: entryRuleTransport returns [EObject current=null] : iv_ruleTransport= ruleTransport EOF ;
    public final EObject entryRuleTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransport = null;


        try {
            // InternalMyDsl.g:1402:50: (iv_ruleTransport= ruleTransport EOF )
            // InternalMyDsl.g:1403:2: iv_ruleTransport= ruleTransport EOF
            {
             newCompositeNode(grammarAccess.getTransportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransport=ruleTransport();

            state._fsp--;

             current =iv_ruleTransport; 
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
    // $ANTLR end "entryRuleTransport"


    // $ANTLR start "ruleTransport"
    // InternalMyDsl.g:1409:1: ruleTransport returns [EObject current=null] : ( () otherlv_1= 'Transport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleTransport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1415:2: ( ( () otherlv_1= 'Transport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1416:2: ( () otherlv_1= 'Transport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1416:2: ( () otherlv_1= 'Transport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1417:3: () otherlv_1= 'Transport' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1417:3: ()
            // InternalMyDsl.g:1418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransportAccess().getTransportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransportAccess().getTransportKeyword_1());
            		
            // InternalMyDsl.g:1428:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1429:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1429:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1430:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransportAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1451:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1452:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransportAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1456:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1457:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1457:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1458:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTransportAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransportRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1476:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1477:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransportAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1485:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1486:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1486:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1487:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getTransportAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransportRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1504:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDsl.g:1505:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTransportAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1509:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1510:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1510:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1511:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransportAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransportRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTransport"


    // $ANTLR start "entryRuleFighter"
    // InternalMyDsl.g:1542:1: entryRuleFighter returns [EObject current=null] : iv_ruleFighter= ruleFighter EOF ;
    public final EObject entryRuleFighter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFighter = null;


        try {
            // InternalMyDsl.g:1542:48: (iv_ruleFighter= ruleFighter EOF )
            // InternalMyDsl.g:1543:2: iv_ruleFighter= ruleFighter EOF
            {
             newCompositeNode(grammarAccess.getFighterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFighter=ruleFighter();

            state._fsp--;

             current =iv_ruleFighter; 
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
    // $ANTLR end "entryRuleFighter"


    // $ANTLR start "ruleFighter"
    // InternalMyDsl.g:1549:1: ruleFighter returns [EObject current=null] : ( () otherlv_1= 'Fighter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleFighter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1555:2: ( ( () otherlv_1= 'Fighter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1556:2: ( () otherlv_1= 'Fighter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1556:2: ( () otherlv_1= 'Fighter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1557:3: () otherlv_1= 'Fighter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1557:3: ()
            // InternalMyDsl.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFighterAccess().getFighterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFighterAccess().getFighterKeyword_1());
            		
            // InternalMyDsl.g:1568:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1569:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1569:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1570:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFighterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFighterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getFighterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1591:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1592:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFighterAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1596:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1597:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1597:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1598:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFighterAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFighterRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1616:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1617:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getFighterAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getFighterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1625:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1626:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1626:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1627:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getFighterAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFighterRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1644:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:1645:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFighterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1649:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1650:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1650:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1651:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getFighterAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFighterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getFighterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFighterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFighter"


    // $ANTLR start "entryRuleRecon"
    // InternalMyDsl.g:1682:1: entryRuleRecon returns [EObject current=null] : iv_ruleRecon= ruleRecon EOF ;
    public final EObject entryRuleRecon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecon = null;


        try {
            // InternalMyDsl.g:1682:46: (iv_ruleRecon= ruleRecon EOF )
            // InternalMyDsl.g:1683:2: iv_ruleRecon= ruleRecon EOF
            {
             newCompositeNode(grammarAccess.getReconRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecon=ruleRecon();

            state._fsp--;

             current =iv_ruleRecon; 
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
    // $ANTLR end "entryRuleRecon"


    // $ANTLR start "ruleRecon"
    // InternalMyDsl.g:1689:1: ruleRecon returns [EObject current=null] : ( () otherlv_1= 'Recon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleRecon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1695:2: ( ( () otherlv_1= 'Recon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1696:2: ( () otherlv_1= 'Recon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1696:2: ( () otherlv_1= 'Recon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1697:3: () otherlv_1= 'Recon' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1697:3: ()
            // InternalMyDsl.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReconAccess().getReconAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReconAccess().getReconKeyword_1());
            		
            // InternalMyDsl.g:1708:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1709:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1709:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1710:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReconAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReconRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReconAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1731:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1732:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getReconAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1736:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1737:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1737:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1738:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReconAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReconRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1756:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1757:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getReconAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getReconAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1765:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1766:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1766:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1767:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getReconAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReconRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1784:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMyDsl.g:1785:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getReconAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1789:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1790:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1790:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1791:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getReconAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReconRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getReconAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getReconAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRecon"


    // $ANTLR start "entryRuleHelicopter"
    // InternalMyDsl.g:1822:1: entryRuleHelicopter returns [EObject current=null] : iv_ruleHelicopter= ruleHelicopter EOF ;
    public final EObject entryRuleHelicopter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelicopter = null;


        try {
            // InternalMyDsl.g:1822:51: (iv_ruleHelicopter= ruleHelicopter EOF )
            // InternalMyDsl.g:1823:2: iv_ruleHelicopter= ruleHelicopter EOF
            {
             newCompositeNode(grammarAccess.getHelicopterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelicopter=ruleHelicopter();

            state._fsp--;

             current =iv_ruleHelicopter; 
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
    // $ANTLR end "entryRuleHelicopter"


    // $ANTLR start "ruleHelicopter"
    // InternalMyDsl.g:1829:1: ruleHelicopter returns [EObject current=null] : ( () otherlv_1= 'Helicopter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleHelicopter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        EObject lv_ammunitions_8_0 = null;

        EObject lv_ammunitions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1835:2: ( ( () otherlv_1= 'Helicopter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1836:2: ( () otherlv_1= 'Helicopter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1836:2: ( () otherlv_1= 'Helicopter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:1837:3: () otherlv_1= 'Helicopter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1837:3: ()
            // InternalMyDsl.g:1838:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelicopterAccess().getHelicopterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHelicopterAccess().getHelicopterKeyword_1());
            		
            // InternalMyDsl.g:1848:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1849:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1849:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1850:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHelicopterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHelicopterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getHelicopterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1871:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1872:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getHelicopterAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:1876:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:1877:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1877:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:1878:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getHelicopterAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelicopterRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1896:3: (otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1897:4: otherlv_6= 'ammunitions' otherlv_7= '{' ( (lv_ammunitions_8_0= ruleAmmunition ) ) (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getHelicopterAccess().getAmmunitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getHelicopterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1905:4: ( (lv_ammunitions_8_0= ruleAmmunition ) )
                    // InternalMyDsl.g:1906:5: (lv_ammunitions_8_0= ruleAmmunition )
                    {
                    // InternalMyDsl.g:1906:5: (lv_ammunitions_8_0= ruleAmmunition )
                    // InternalMyDsl.g:1907:6: lv_ammunitions_8_0= ruleAmmunition
                    {

                    						newCompositeNode(grammarAccess.getHelicopterAccess().getAmmunitionsAmmunitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ammunitions_8_0=ruleAmmunition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelicopterRule());
                    						}
                    						add(
                    							current,
                    							"ammunitions",
                    							lv_ammunitions_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Ammunition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1924:4: (otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDsl.g:1925:5: otherlv_9= ',' ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getHelicopterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1929:5: ( (lv_ammunitions_10_0= ruleAmmunition ) )
                    	    // InternalMyDsl.g:1930:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    {
                    	    // InternalMyDsl.g:1930:6: (lv_ammunitions_10_0= ruleAmmunition )
                    	    // InternalMyDsl.g:1931:7: lv_ammunitions_10_0= ruleAmmunition
                    	    {

                    	    							newCompositeNode(grammarAccess.getHelicopterAccess().getAmmunitionsAmmunitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ammunitions_10_0=ruleAmmunition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHelicopterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ammunitions",
                    	    								lv_ammunitions_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Ammunition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getHelicopterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getHelicopterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleHelicopter"


    // $ANTLR start "entryRuleMissile"
    // InternalMyDsl.g:1962:1: entryRuleMissile returns [EObject current=null] : iv_ruleMissile= ruleMissile EOF ;
    public final EObject entryRuleMissile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissile = null;


        try {
            // InternalMyDsl.g:1962:48: (iv_ruleMissile= ruleMissile EOF )
            // InternalMyDsl.g:1963:2: iv_ruleMissile= ruleMissile EOF
            {
             newCompositeNode(grammarAccess.getMissileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissile=ruleMissile();

            state._fsp--;

             current =iv_ruleMissile; 
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
    // $ANTLR end "entryRuleMissile"


    // $ANTLR start "ruleMissile"
    // InternalMyDsl.g:1969:1: ruleMissile returns [EObject current=null] : ( () otherlv_1= 'Missile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMissile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1975:2: ( ( () otherlv_1= 'Missile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1976:2: ( () otherlv_1= 'Missile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1976:2: ( () otherlv_1= 'Missile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1977:3: () otherlv_1= 'Missile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1977:3: ()
            // InternalMyDsl.g:1978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissileAccess().getMissileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMissileAccess().getMissileKeyword_1());
            		
            // InternalMyDsl.g:1988:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1989:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1989:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1990:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMissileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMissileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2011:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2012:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getMissileAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:2016:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:2017:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2017:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:2018:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMissileAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissileRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMissileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMissile"


    // $ANTLR start "entryRuleShell"
    // InternalMyDsl.g:2044:1: entryRuleShell returns [EObject current=null] : iv_ruleShell= ruleShell EOF ;
    public final EObject entryRuleShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShell = null;


        try {
            // InternalMyDsl.g:2044:46: (iv_ruleShell= ruleShell EOF )
            // InternalMyDsl.g:2045:2: iv_ruleShell= ruleShell EOF
            {
             newCompositeNode(grammarAccess.getShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShell=ruleShell();

            state._fsp--;

             current =iv_ruleShell; 
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
    // $ANTLR end "entryRuleShell"


    // $ANTLR start "ruleShell"
    // InternalMyDsl.g:2051:1: ruleShell returns [EObject current=null] : ( () otherlv_1= 'Shell' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2057:2: ( ( () otherlv_1= 'Shell' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:2058:2: ( () otherlv_1= 'Shell' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:2058:2: ( () otherlv_1= 'Shell' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:2059:3: () otherlv_1= 'Shell' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:2059:3: ()
            // InternalMyDsl.g:2060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShellAccess().getShellAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getShellAccess().getShellKeyword_1());
            		
            // InternalMyDsl.g:2070:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2071:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2071:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2072:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShellAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShellRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getShellAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2093:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2094:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getShellAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:2098:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:2099:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2099:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:2100:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getShellAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShellRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getShellAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleShell"


    // $ANTLR start "entryRuleTorpedo"
    // InternalMyDsl.g:2126:1: entryRuleTorpedo returns [EObject current=null] : iv_ruleTorpedo= ruleTorpedo EOF ;
    public final EObject entryRuleTorpedo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTorpedo = null;


        try {
            // InternalMyDsl.g:2126:48: (iv_ruleTorpedo= ruleTorpedo EOF )
            // InternalMyDsl.g:2127:2: iv_ruleTorpedo= ruleTorpedo EOF
            {
             newCompositeNode(grammarAccess.getTorpedoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTorpedo=ruleTorpedo();

            state._fsp--;

             current =iv_ruleTorpedo; 
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
    // $ANTLR end "entryRuleTorpedo"


    // $ANTLR start "ruleTorpedo"
    // InternalMyDsl.g:2133:1: ruleTorpedo returns [EObject current=null] : ( () otherlv_1= 'Torpedo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTorpedo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2139:2: ( ( () otherlv_1= 'Torpedo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:2140:2: ( () otherlv_1= 'Torpedo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:2140:2: ( () otherlv_1= 'Torpedo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:2141:3: () otherlv_1= 'Torpedo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:2141:3: ()
            // InternalMyDsl.g:2142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTorpedoAccess().getTorpedoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTorpedoAccess().getTorpedoKeyword_1());
            		
            // InternalMyDsl.g:2152:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2153:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2153:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2154:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTorpedoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTorpedoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTorpedoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2175:3: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==18) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2176:4: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTorpedoAccess().getAmountKeyword_4_0());
                    			
                    // InternalMyDsl.g:2180:4: ( (lv_amount_5_0= ruleEInt ) )
                    // InternalMyDsl.g:2181:5: (lv_amount_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2181:5: (lv_amount_5_0= ruleEInt )
                    // InternalMyDsl.g:2182:6: lv_amount_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTorpedoAccess().getAmountEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTorpedoRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTorpedoAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTorpedo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001FB020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000CC8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C88000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000048C8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004888000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000848000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000048000L});

}