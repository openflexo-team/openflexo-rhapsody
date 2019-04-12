/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: PilotPannel
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/PilotPannel.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/PilotPannel.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PilotPannel 
public class PilotPannel extends Pannel {
    
    public Reactive reactive;		//## ignore 
    
    protected PilotPannel.inhibitionPort_C inhibitionPort;		//## ignore 
    
    protected PushButton itsCloseButton;		//## classInstance itsCloseButton 
    
    protected PushButton itsInhibitionButton;		//## classInstance itsInhibitionButton 
    
    protected PushButton itsOpenButton;		//## classInstance itsOpenButton 
    
    
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
    public  PilotPannel(RiJThread p_thread) {
        super(p_thread);
        reactive = new Reactive(p_thread);
    }
    
    //## auto_generated 
    public PilotPannel.inhibitionPort_C getInhibitionPort() {
        return inhibitionPort;
    }
    
    //## auto_generated 
    public PilotPannel.inhibitionPort_C get_inhibitionPort() {
        return inhibitionPort;
    }
    
    //## auto_generated 
    public PilotPannel.inhibitionPort_C newInhibitionPort() {
        inhibitionPort = new PilotPannel.inhibitionPort_C();
        return inhibitionPort;
    }
    
    //## auto_generated 
    public void deleteInhibitionPort() {
        inhibitionPort=null;
    }
    
    //## auto_generated 
    public PushButton getItsCloseButton() {
        return itsCloseButton;
    }
    
    //## auto_generated 
    public PushButton newItsCloseButton(RiJThread p_thread) {
        itsCloseButton = new PushButton(p_thread);
        return itsCloseButton;
    }
    
    //## auto_generated 
    public void deleteItsCloseButton() {
        itsCloseButton=null;
    }
    
    //## auto_generated 
    public PushButton getItsInhibitionButton() {
        return itsInhibitionButton;
    }
    
    //## auto_generated 
    public PushButton newItsInhibitionButton(RiJThread p_thread) {
        itsInhibitionButton = new PushButton(p_thread);
        return itsInhibitionButton;
    }
    
    //## auto_generated 
    public void deleteItsInhibitionButton() {
        itsInhibitionButton=null;
    }
    
    //## auto_generated 
    public PushButton getItsOpenButton() {
        return itsOpenButton;
    }
    
    //## auto_generated 
    public PushButton newItsOpenButton(RiJThread p_thread) {
        itsOpenButton = new PushButton(p_thread);
        return itsOpenButton;
    }
    
    //## auto_generated 
    public void deleteItsOpenButton() {
        itsOpenButton=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        super.initRelations();
        inhibitionPort = newInhibitionPort();
        itsCloseButton = newItsCloseButton(p_thread);
        itsInhibitionButton = newItsInhibitionButton(p_thread);
        itsOpenButton = newItsOpenButton(p_thread);
        {
            
            getOpenPort().setItsDefaultProvidedInterface(itsOpenButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsOpenButton.getPort().setItsDefaultRequiredInterface(getOpenPort().getItsDefaultRequiredInterface());
            
        }
        {
            
            getClosePort().setItsDefaultProvidedInterface(itsCloseButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsCloseButton.getPort().setItsDefaultRequiredInterface(getClosePort().getItsDefaultRequiredInterface());
            
        }
        {
            
            getInhibitionPort().setItsDefaultProvidedInterface(itsInhibitionButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsInhibitionButton.getPort().setItsDefaultRequiredInterface(getInhibitionPort().getItsDefaultRequiredInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= reactive.startBehavior();
        done &= itsCloseButton.startBehavior();
        done &= itsInhibitionButton.startBehavior();
        done &= itsOpenButton.startBehavior();
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
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class inhibitionPort_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  inhibitionPort_C() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/PilotPannel.java
*********************************************************************/

