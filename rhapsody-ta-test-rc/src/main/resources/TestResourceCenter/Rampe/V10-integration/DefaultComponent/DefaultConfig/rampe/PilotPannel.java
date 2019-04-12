/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: PilotPannel
//!	Generated Date	: Wed, 13, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/PilotPannel.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/PilotPannel.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class PilotPannel 
public class PilotPannel implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPilotPannel = new AnimClass("rampe.PilotPannel",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected PilotPannel.inInhib_C inInhib;		//## ignore 
    
    protected PilotPannel.outInhib_C outInhib;		//## ignore 
    
    protected Button closeBtn;		//## classInstance closeBtn 
    
    protected Button inhibitionBtn;		//## classInstance inhibitionBtn 
    
    protected Button openBtn;		//## classInstance openBtn 
    
    
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
    public void cancelEvent(RiJEvent event) {
        m_thread.cancelEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    //## statechart_method 
    public void run() {
        m_thread.run();
    }
    
    //## statechart_method 
    public void start() {
        m_thread.start(this);
    }
    
    // Constructors
    
    //## auto_generated 
    public  PilotPannel(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPilotPannel.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("PilotPannel");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public PilotPannel.inInhib_C getInInhib() {
        return inInhib;
    }
    
    //## auto_generated 
    public PilotPannel.inInhib_C get_inInhib() {
        return inInhib;
    }
    
    //## auto_generated 
    public PilotPannel.inInhib_C newInInhib() {
        inInhib = new PilotPannel.inInhib_C();
        return inInhib;
    }
    
    //## auto_generated 
    public void deleteInInhib() {
        inInhib=null;
    }
    
    //## auto_generated 
    public PilotPannel.outInhib_C getOutInhib() {
        return outInhib;
    }
    
    //## auto_generated 
    public PilotPannel.outInhib_C get_outInhib() {
        return outInhib;
    }
    
    //## auto_generated 
    public PilotPannel.outInhib_C newOutInhib() {
        outInhib = new PilotPannel.outInhib_C();
        return outInhib;
    }
    
    //## auto_generated 
    public void deleteOutInhib() {
        outInhib=null;
    }
    
    //## auto_generated 
    public Button getCloseBtn() {
        return closeBtn;
    }
    
    //## auto_generated 
    public Button newCloseBtn(RiJThread p_thread) {
        closeBtn = new Button(p_thread);
        animInstance().notifyRelationAdded("closeBtn", closeBtn);
        return closeBtn;
    }
    
    //## auto_generated 
    public void deleteCloseBtn() {
        animInstance().notifyRelationRemoved("closeBtn", closeBtn);
        closeBtn=null;
    }
    
    //## auto_generated 
    public Button getInhibitionBtn() {
        return inhibitionBtn;
    }
    
    //## auto_generated 
    public Button newInhibitionBtn(RiJThread p_thread) {
        inhibitionBtn = new Button(p_thread);
        animInstance().notifyRelationAdded("inhibitionBtn", inhibitionBtn);
        return inhibitionBtn;
    }
    
    //## auto_generated 
    public void deleteInhibitionBtn() {
        animInstance().notifyRelationRemoved("inhibitionBtn", inhibitionBtn);
        inhibitionBtn=null;
    }
    
    //## auto_generated 
    public Button getOpenBtn() {
        return openBtn;
    }
    
    //## auto_generated 
    public Button newOpenBtn(RiJThread p_thread) {
        openBtn = new Button(p_thread);
        animInstance().notifyRelationAdded("openBtn", openBtn);
        return openBtn;
    }
    
    //## auto_generated 
    public void deleteOpenBtn() {
        animInstance().notifyRelationRemoved("openBtn", openBtn);
        openBtn=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        inInhib = newInInhib();
        outInhib = newOutInhib();
        closeBtn = newCloseBtn(p_thread);
        inhibitionBtn = newInhibitionBtn(p_thread);
        openBtn = newOpenBtn(p_thread);
        {
            
            getInInhib().setItsDefaultProvidedInterface(inhibitionBtn.getIn().getItsDefaultProvidedInterface());
            
        }{
            
            inhibitionBtn.getIn().setItsDefaultRequiredInterface(getInInhib().getItsDefaultRequiredInterface());
            
        }
        {
            
            getOutInhib().setItsDefaultProvidedInterface(inhibitionBtn.getOut().getItsDefaultProvidedInterface());
            
        }{
            
            inhibitionBtn.getOut().setItsDefaultRequiredInterface(getOutInhib().getItsDefaultRequiredInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= closeBtn.startBehavior();
        done &= inhibitionBtn.startBehavior();
        done &= openBtn.startBehavior();
        done &= reactive.startBehavior();
        if(done)
            {
                start();
            }
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return PilotPannel.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class inInhib_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  inInhib_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class outInhib_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  outInhib_C() {
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPilotPannel; 
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
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("inhibitionBtn", true, true, inhibitionBtn);
        msg.add("openBtn", true, true, openBtn);
        msg.add("closeBtn", true, true, closeBtn);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(PilotPannel.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            PilotPannel.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            PilotPannel.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/PilotPannel.java
*********************************************************************/

