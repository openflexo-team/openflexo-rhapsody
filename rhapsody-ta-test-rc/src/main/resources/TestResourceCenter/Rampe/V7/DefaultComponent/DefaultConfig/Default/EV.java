/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EV
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/EV.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EV.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class EV 
public class EV implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassEV = new AnimClass("Default.EV",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected EV.PortEVToDoor_C PortEVToDoor;		//## ignore 
    
    protected EV.PortEVToCommand_C PortEVToCommand;		//## ignore 
    
    protected boolean Is_Open;		//## attribute Is_Open 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Waiting=1;
    public static final int Activating=2;
    public static final int Activated=3;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int EV_Timeout_Activating_id = 1;		//## ignore 
    
    
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
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isPort(Object port) {
        return reactive.isPort(port);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
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
    
    /**
     * @param Is_Open
    */
    //## operation EV(boolean) 
    public  EV(boolean Is_Open, RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassEV.getUserClass(),
               new ArgData[] {
                   new ArgData(boolean.class, "Is_Open", AnimInstance.animToString(Is_Open))
               });
        
        m_thread = new RiJThread("EV");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        //#[ operation EV(boolean) 
        this.Is_Open = Is_Open;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    //## auto_generated 
    public  EV(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassEV.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("EV");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public EV.PortEVToDoor_C getPortEVToDoor() {
        return PortEVToDoor;
    }
    
    //## auto_generated 
    public EV.PortEVToDoor_C get_PortEVToDoor() {
        return PortEVToDoor;
    }
    
    //## auto_generated 
    public EV.PortEVToDoor_C newPortEVToDoor() {
        PortEVToDoor = new EV.PortEVToDoor_C();
        return PortEVToDoor;
    }
    
    //## auto_generated 
    public void deletePortEVToDoor() {
        PortEVToDoor=null;
    }
    
    //## auto_generated 
    public EV.PortEVToCommand_C getPortEVToCommand() {
        return PortEVToCommand;
    }
    
    //## auto_generated 
    public EV.PortEVToCommand_C get_PortEVToCommand() {
        return PortEVToCommand;
    }
    
    //## auto_generated 
    public EV.PortEVToCommand_C newPortEVToCommand() {
        PortEVToCommand = new EV.PortEVToCommand_C();
        return PortEVToCommand;
    }
    
    //## auto_generated 
    public void deletePortEVToCommand() {
        PortEVToCommand=null;
    }
    
    //## operation Activate() 
    public void Activate() {
        try {
            animInstance().notifyMethodEntered("Activate",
               new ArgData[] {
               });
        
        //#[ operation Activate() 
        System.out.println("EV s'active");
        if(Is_Open == true)
        	getPortEVToDoor().gen(new EV_Open_Activated());
        else
        	getPortEVToDoor().gen(new EV_Close_Activated());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Interruption() 
    public void Interruption() {
        try {
            animInstance().notifyMethodEntered("Interruption",
               new ArgData[] {
               });
        
        //#[ operation Interruption() 
        System.out.println("Arret premature de l'electro valve");
        getPortEVToDoor().gen(new Interrupt());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Stop() 
    public void Stop() {
        try {
            animInstance().notifyMethodEntered("Stop",
               new ArgData[] {
               });
        
        //#[ operation Stop() 
        System.out.println("EV s'arrete");
        getPortEVToCommand().gen(new EV_Stopped());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public boolean getIs_Open() {
        return Is_Open;
    }
    
    //## auto_generated 
    public void setIs_Open(boolean p_Is_Open) {
        Is_Open = p_Is_Open;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortEVToDoor = newPortEVToDoor();
        PortEVToCommand = newPortEVToCommand();
        if(getPortEVToDoor() != null)
           getPortEVToDoor().connectEV(this);
        if(getPortEVToCommand() != null)
           getPortEVToCommand().connectEV(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
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
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Waiting:
                {
                    Waiting_add(animStates);
                }
                break;
                case Activated:
                {
                    Activated_add(animStates);
                }
                break;
                case Activating:
                {
                    Activating_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Waiting:
                {
                    res = Waiting_takeEvent(id);
                }
                break;
                case Activated:
                {
                    res = Activated_takeEvent(id);
                }
                break;
                case Activating:
                {
                    res = Activating_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Waiting_add(AnimStates animStates) {
            animStates.add("ROOT.Waiting");
        }
        
        //## statechart_method 
        public void Activating_add(AnimStates animStates) {
            animStates.add("ROOT.Activating");
        }
        
        //## statechart_method 
        public void Activated_add(AnimStates animStates) {
            animStates.add("ROOT.Activated");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Waiting_enter() {
            animInstance().notifyStateEntered("ROOT.Waiting");
            rootState_subState = Waiting;
            rootState_active = Waiting;
            WaitingEnter();
        }
        
        //## statechart_method 
        public void Activated_enter() {
            animInstance().notifyStateEntered("ROOT.Activated");
            rootState_subState = Activated;
            rootState_active = Activated;
            ActivatedEnter();
        }
        
        //## statechart_method 
        public int WaitingTakeActivate_EV() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Waiting_exit();
            Activating_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public int Activating_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ActivatingTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int ActivatedTakeStop_EV() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Activated_exit();
            //#[ transition 2 
            Stop();
            //#]
            Waiting_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void WaitingEnter() {
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int Waiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Activate_EV.Activate_EV_Default_id))
                {
                    res = WaitingTakeActivate_EV();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ActivatedEnter() {
            //#[ state Activated.(Entry) 
            Activate();
            //#]
        }
        
        //## statechart_method 
        public void ActivatingExit() {
            itsRiJThread.unschedTimeout(EV_Timeout_Activating_id, this);
        }
        
        //## statechart_method 
        public void ActivatingEnter() {
            itsRiJThread.schedTimeout(1000, EV_Timeout_Activating_id, this, "ROOT.Activating");
        }
        
        //## statechart_method 
        public void Activating_entDef() {
            Activating_enter();
        }
        
        //## statechart_method 
        public void Waiting_exit() {
            WaitingExit();
            animInstance().notifyStateExited("ROOT.Waiting");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Waiting_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Activated_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Stop_EV.Stop_EV_Default_id))
                {
                    res = ActivatedTakeStop_EV();
                }
            else if(event.isTypeOf(Interrupt.Interrupt_Default_id))
                {
                    res = ActivatedTakeInterrupt();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Activated_exit() {
            ActivatedExit();
            animInstance().notifyStateExited("ROOT.Activated");
        }
        
        //## statechart_method 
        public int ActivatingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == EV_Timeout_Activating_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    Activating_exit();
                    Activated_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Activating_enter() {
            animInstance().notifyStateEntered("ROOT.Activating");
            rootState_subState = Activating;
            rootState_active = Activating;
            ActivatingEnter();
        }
        
        //## statechart_method 
        public void Activating_exit() {
            ActivatingExit();
            animInstance().notifyStateExited("ROOT.Activating");
        }
        
        //## statechart_method 
        public void WaitingExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int ActivatedTakeInterrupt() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Activated_exit();
            //#[ transition 3 
            Interruption();
            Stop();
            //#]
            Waiting_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ActivatedExit() {
        }
        
        //## statechart_method 
        public void Activated_entDef() {
            Activated_enter();
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
            return EV.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class PortEVToDoor_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortEVToDoor_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectEV(EV) 
        public void connectEV(EV part) {
            //#[ operation connectEV(EV) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class PortEVToCommand_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortEVToCommand_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectEV(EV) 
        public void connectEV(EV part) {
            //#[ operation connectEV(EV) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassEV; 
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
        
        msg.add("Is_Open", Is_Open);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(EV.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            EV.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            EV.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EV.java
*********************************************************************/

