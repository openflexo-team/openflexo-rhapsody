/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Rampe
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Rampe.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Rampe.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Rampe 
public class Rampe implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected Pannel itsExternalPannel;		//## classInstance itsExternalPannel 
    
    protected Pannel itsInternalPannel;		//## classInstance itsInternalPannel 
    
    protected MockControler itsMockControler;		//## classInstance itsMockControler 
    
    protected PilotPannel itsPilotPannel;		//## classInstance itsPilotPannel 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Rampe(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
    }
    
    //## auto_generated 
    public Pannel getItsExternalPannel() {
        return itsExternalPannel;
    }
    
    //## auto_generated 
    public Pannel newItsExternalPannel(RiJThread p_thread) {
        itsExternalPannel = new Pannel(p_thread);
        return itsExternalPannel;
    }
    
    //## auto_generated 
    public void deleteItsExternalPannel() {
        itsExternalPannel=null;
    }
    
    //## auto_generated 
    public Pannel getItsInternalPannel() {
        return itsInternalPannel;
    }
    
    //## auto_generated 
    public Pannel newItsInternalPannel(RiJThread p_thread) {
        itsInternalPannel = new Pannel(p_thread);
        return itsInternalPannel;
    }
    
    //## auto_generated 
    public void deleteItsInternalPannel() {
        itsInternalPannel=null;
    }
    
    //## auto_generated 
    public MockControler getItsMockControler() {
        return itsMockControler;
    }
    
    //## auto_generated 
    public MockControler newItsMockControler(RiJThread p_thread) {
        itsMockControler = new MockControler(p_thread);
        return itsMockControler;
    }
    
    //## auto_generated 
    public void deleteItsMockControler() {
        itsMockControler=null;
    }
    
    //## auto_generated 
    public PilotPannel getItsPilotPannel() {
        return itsPilotPannel;
    }
    
    //## auto_generated 
    public PilotPannel newItsPilotPannel(RiJThread p_thread) {
        itsPilotPannel = new PilotPannel(p_thread);
        return itsPilotPannel;
    }
    
    //## auto_generated 
    public void deleteItsPilotPannel() {
        itsPilotPannel=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsExternalPannel = newItsExternalPannel(p_thread);
        itsInternalPannel = newItsInternalPannel(p_thread);
        itsMockControler = newItsMockControler(p_thread);
        itsPilotPannel = newItsPilotPannel(p_thread);
        {
            
            itsMockControler.getExternalOpen().setItsDefaultRequiredInterface(itsExternalPannel.getOpenPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsExternalPannel.getOpenPort().setItsDefaultRequiredInterface(itsMockControler.getExternalOpen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getExternalClose().setItsDefaultRequiredInterface(itsExternalPannel.getClosePort().getItsDefaultProvidedInterface());
            
        }{
            
            itsExternalPannel.getClosePort().setItsDefaultRequiredInterface(itsMockControler.getExternalClose().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getInternalOpen().setItsDefaultRequiredInterface(itsInternalPannel.getOpenPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsInternalPannel.getOpenPort().setItsDefaultRequiredInterface(itsMockControler.getInternalOpen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getInternalClose().setItsDefaultRequiredInterface(itsInternalPannel.getClosePort().getItsDefaultProvidedInterface());
            
        }{
            
            itsInternalPannel.getClosePort().setItsDefaultRequiredInterface(itsMockControler.getInternalClose().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getPilotOpen().setItsDefaultRequiredInterface(itsPilotPannel.getOpenPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsPilotPannel.getOpenPort().setItsDefaultRequiredInterface(itsMockControler.getPilotOpen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getPilotClose().setItsDefaultRequiredInterface(itsPilotPannel.getClosePort().getItsDefaultProvidedInterface());
            
        }{
            
            itsPilotPannel.getClosePort().setItsDefaultRequiredInterface(itsMockControler.getPilotClose().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsMockControler.getInhibition().setItsDefaultRequiredInterface(itsPilotPannel.getInhibitionPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsPilotPannel.getInhibitionPort().setItsDefaultRequiredInterface(itsMockControler.getInhibition().getItsDefaultProvidedInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsExternalPannel.startBehavior();
        done &= itsInternalPannel.startBehavior();
        done &= itsMockControler.startBehavior();
        done &= itsPilotPannel.startBehavior();
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Rampe.java
*********************************************************************/

