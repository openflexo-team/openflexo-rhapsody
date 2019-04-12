/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Data
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Data.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/Data.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Data 
public class Data implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassData = new AnimClass("rampe.Data",false);
    //#]
    
    protected boolean cde_abaissement;		//## attribute cde_abaissement 
    
    protected boolean cde_deverrouillage;		//## attribute cde_deverrouillage 
    
    protected boolean cde_relevement;		//## attribute cde_relevement 
    
    protected boolean cde_verrouillage;		//## attribute cde_verrouillage 
    
    protected boolean cr_rampe_fermee;		//## attribute cr_rampe_fermee 
    
    protected boolean cr_rampe_ouverte;		//## attribute cr_rampe_ouverte 
    
    protected boolean cr_verrou_deverrouille;		//## attribute cr_verrou_deverrouille 
    
    protected boolean cr_verrou_verrouille;		//## attribute cr_verrou_verrouille 
    
    protected boolean dde_abaissement_external;		//## attribute dde_abaissement_external 
    
    protected boolean dde_abaissement_internal;		//## attribute dde_abaissement_internal 
    
    protected boolean dde_abaissement_pilote;		//## attribute dde_abaissement_pilote 
    
    protected boolean dde_inhibit_external;		//## attribute dde_inhibit_external 
    
    protected boolean dde_relevement_external;		//## attribute dde_relevement_external 
    
    protected boolean dde_relevement_internal;		//## attribute dde_relevement_internal 
    
    protected boolean dde_relevement_pilote;		//## attribute dde_relevement_pilote 
    
    protected boolean sig_alerte_conflit;		//## attribute sig_alerte_conflit 
    
    protected boolean sig_alerte_tempo;		//## attribute sig_alerte_tempo 
    
    
    // Constructors
    
    //## auto_generated 
    public  Data() {
        try {
            animInstance().notifyConstructorEntered(animClassData.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public boolean getCde_abaissement() {
        return cde_abaissement;
    }
    
    //## auto_generated 
    public void setCde_abaissement(boolean p_cde_abaissement) {
        cde_abaissement = p_cde_abaissement;
    }
    
    //## auto_generated 
    public boolean getCde_deverrouillage() {
        return cde_deverrouillage;
    }
    
    //## auto_generated 
    public void setCde_deverrouillage(boolean p_cde_deverrouillage) {
        cde_deverrouillage = p_cde_deverrouillage;
    }
    
    //## auto_generated 
    public boolean getCde_relevement() {
        return cde_relevement;
    }
    
    //## auto_generated 
    public void setCde_relevement(boolean p_cde_relevement) {
        cde_relevement = p_cde_relevement;
    }
    
    //## auto_generated 
    public boolean getCde_verrouillage() {
        return cde_verrouillage;
    }
    
    //## auto_generated 
    public void setCde_verrouillage(boolean p_cde_verrouillage) {
        cde_verrouillage = p_cde_verrouillage;
    }
    
    //## auto_generated 
    public boolean getCr_rampe_fermee() {
        return cr_rampe_fermee;
    }
    
    //## auto_generated 
    public void setCr_rampe_fermee(boolean p_cr_rampe_fermee) {
        cr_rampe_fermee = p_cr_rampe_fermee;
    }
    
    //## auto_generated 
    public boolean getCr_rampe_ouverte() {
        return cr_rampe_ouverte;
    }
    
    //## auto_generated 
    public void setCr_rampe_ouverte(boolean p_cr_rampe_ouverte) {
        cr_rampe_ouverte = p_cr_rampe_ouverte;
    }
    
    //## auto_generated 
    public boolean getCr_verrou_deverrouille() {
        return cr_verrou_deverrouille;
    }
    
    //## auto_generated 
    public void setCr_verrou_deverrouille(boolean p_cr_verrou_deverrouille) {
        cr_verrou_deverrouille = p_cr_verrou_deverrouille;
    }
    
    //## auto_generated 
    public boolean getCr_verrou_verrouille() {
        return cr_verrou_verrouille;
    }
    
    //## auto_generated 
    public void setCr_verrou_verrouille(boolean p_cr_verrou_verrouille) {
        cr_verrou_verrouille = p_cr_verrou_verrouille;
    }
    
    //## auto_generated 
    public boolean getDde_abaissement_external() {
        return dde_abaissement_external;
    }
    
    //## auto_generated 
    public void setDde_abaissement_external(boolean p_dde_abaissement_external) {
        dde_abaissement_external = p_dde_abaissement_external;
    }
    
    //## auto_generated 
    public boolean getDde_abaissement_internal() {
        return dde_abaissement_internal;
    }
    
    //## auto_generated 
    public void setDde_abaissement_internal(boolean p_dde_abaissement_internal) {
        dde_abaissement_internal = p_dde_abaissement_internal;
    }
    
    //## auto_generated 
    public boolean getDde_abaissement_pilote() {
        return dde_abaissement_pilote;
    }
    
    //## auto_generated 
    public void setDde_abaissement_pilote(boolean p_dde_abaissement_pilote) {
        dde_abaissement_pilote = p_dde_abaissement_pilote;
    }
    
    //## auto_generated 
    public boolean getDde_inhibit_external() {
        return dde_inhibit_external;
    }
    
    //## auto_generated 
    public void setDde_inhibit_external(boolean p_dde_inhibit_external) {
        dde_inhibit_external = p_dde_inhibit_external;
    }
    
    //## auto_generated 
    public boolean getDde_relevement_external() {
        return dde_relevement_external;
    }
    
    //## auto_generated 
    public void setDde_relevement_external(boolean p_dde_relevement_external) {
        dde_relevement_external = p_dde_relevement_external;
    }
    
    //## auto_generated 
    public boolean getDde_relevement_internal() {
        return dde_relevement_internal;
    }
    
    //## auto_generated 
    public void setDde_relevement_internal(boolean p_dde_relevement_internal) {
        dde_relevement_internal = p_dde_relevement_internal;
    }
    
    //## auto_generated 
    public boolean getDde_relevement_pilote() {
        return dde_relevement_pilote;
    }
    
    //## auto_generated 
    public void setDde_relevement_pilote(boolean p_dde_relevement_pilote) {
        dde_relevement_pilote = p_dde_relevement_pilote;
    }
    
    //## auto_generated 
    public boolean getSig_alerte_conflit() {
        return sig_alerte_conflit;
    }
    
    //## auto_generated 
    public void setSig_alerte_conflit(boolean p_sig_alerte_conflit) {
        sig_alerte_conflit = p_sig_alerte_conflit;
    }
    
    //## auto_generated 
    public boolean getSig_alerte_tempo() {
        return sig_alerte_tempo;
    }
    
    //## auto_generated 
    public void setSig_alerte_tempo(boolean p_sig_alerte_tempo) {
        sig_alerte_tempo = p_sig_alerte_tempo;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassData; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("dde_relevement_pilote", dde_relevement_pilote);
        msg.add("dde_relevement_internal", dde_relevement_internal);
        msg.add("dde_relevement_external", dde_relevement_external);
        msg.add("dde_abaissement_pilote", dde_abaissement_pilote);
        msg.add("dde_abaissement_internal", dde_abaissement_internal);
        msg.add("dde_abaissement_external", dde_abaissement_external);
        msg.add("cr_verrou_verrouille", cr_verrou_verrouille);
        msg.add("cr_verrou_deverrouille", cr_verrou_deverrouille);
        msg.add("cr_rampe_fermee", cr_rampe_fermee);
        msg.add("cr_rampe_ouverte", cr_rampe_ouverte);
        msg.add("sig_alerte_tempo", sig_alerte_tempo);
        msg.add("sig_alerte_conflit", sig_alerte_conflit);
        msg.add("cde_abaissement", cde_abaissement);
        msg.add("cde_relevement", cde_relevement);
        msg.add("cde_verrouillage", cde_verrouillage);
        msg.add("cde_deverrouillage", cde_deverrouillage);
        msg.add("dde_inhibit_external", dde_inhibit_external);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Data.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Data.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Data.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Data.java
*********************************************************************/

