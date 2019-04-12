/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Locks
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Locks.java
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
// Default/Locks.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Locks 
public class Locks implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassLocks = new AnimClass("Default.Locks",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Locks.PortToDoor_C PortToDoor;		//## ignore 
    
    protected Locks.PortToCommand_C PortToCommand;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Opening=1;
    public static final int Opened=2;
    public static final int Locks_On=3;
    public static final int Locks_Off=4;
    public static final int Closing=5;
    public static final int Closed=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Locks_Timeout_Opening_id = 1;		//## ignore 
    
    public static final int Locks_Timeout_Closing_id = 2;		//## ignore 
    
    
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
    
    //## auto_generated 
    public  Locks(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassLocks.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Locks");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Locks.PortToDoor_C getPortToDoor() {
        return PortToDoor;
    }
    
    //## auto_generated 
    public Locks.PortToDoor_C get_PortToDoor() {
        return PortToDoor;
    }
    
    //## auto_generated 
    public Locks.PortToDoor_C newPortToDoor() {
        PortToDoor = new Locks.PortToDoor_C();
        return PortToDoor;
    }
    
    //## auto_generated 
    public void deletePortToDoor() {
        PortToDoor=null;
    }
    
    //## auto_generated 
    public Locks.PortToCommand_C getPortToCommand() {
        return PortToCommand;
    }
    
    //## auto_generated 
    public Locks.PortToCommand_C get_PortToCommand() {
        return PortToCommand;
    }
    
    //## auto_generated 
    public Locks.PortToCommand_C newPortToCommand() {
        PortToCommand = new Locks.PortToCommand_C();
        return PortToCommand;
    }
    
    //## auto_generated 
    public void deletePortToCommand() {
        PortToCommand=null;
    }
    
    //## operation Confirm_Lock() 
    public void Confirm_Lock() {
        try {
            animInstance().notifyMethodEntered("Confirm_Lock",
               new ArgData[] {
               });
        
        //#[ operation Confirm_Lock() 
        getPortToCommand().gen(new Locked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Confirm_Unlock() 
    public void Confirm_Unlock() {
        try {
            animInstance().notifyMethodEntered("Confirm_Unlock",
               new ArgData[] {
               });
        
        //#[ operation Confirm_Unlock() 
        getPortToCommand().gen(new Unlocked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Lock() 
    public void Lock() {
        try {
            animInstance().notifyMethodEntered("Lock",
               new ArgData[] {
               });
        
        //#[ operation Lock() 
        System.out.println("Les Verroux s'activent");
        getPortToDoor().gen(new Locked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Unlock() 
    public void Unlock() {
        try {
            animInstance().notifyMethodEntered("Unlock",
               new ArgData[] {
               });
        
        //#[ operation Unlock() 
        System.out.println("Les Verroux se desactivent");
        getPortToDoor().gen(new Unlocked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortToDoor = newPortToDoor();
        PortToCommand = newPortToCommand();
        if(getPortToDoor() != null)
           getPortToDoor().connectLocks(this);
        if(getPortToCommand() != null)
           getPortToCommand().connectLocks(this);
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
                case Locks_On:
                {
                    Locks_On_add(animStates);
                }
                break;
                case Opened:
                {
                    Opened_add(animStates);
                }
                break;
                case Locks_Off:
                {
                    Locks_Off_add(animStates);
                }
                break;
                case Closed:
                {
                    Closed_add(animStates);
                }
                break;
                case Closing:
                {
                    Closing_add(animStates);
                }
                break;
                case Opening:
                {
                    Opening_add(animStates);
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
                case Locks_On:
                {
                    res = Locks_On_takeEvent(id);
                }
                break;
                case Opened:
                {
                    res = Opened_takeEvent(id);
                }
                break;
                case Locks_Off:
                {
                    res = Locks_Off_takeEvent(id);
                }
                break;
                case Closed:
                {
                    res = Closed_takeEvent(id);
                }
                break;
                case Closing:
                {
                    res = Closing_takeEvent(id);
                }
                break;
                case Opening:
                {
                    res = Opening_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Opening_add(AnimStates animStates) {
            animStates.add("ROOT.Opening");
        }
        
        //## statechart_method 
        public void Opened_add(AnimStates animStates) {
            animStates.add("ROOT.Opened");
        }
        
        //## statechart_method 
        public void Locks_On_add(AnimStates animStates) {
            animStates.add("ROOT.Locks_On");
        }
        
        //## statechart_method 
        public void Locks_Off_add(AnimStates animStates) {
            animStates.add("ROOT.Locks_Off");
        }
        
        //## statechart_method 
        public void Closing_add(AnimStates animStates) {
            animStates.add("ROOT.Closing");
        }
        
        //## statechart_method 
        public void Closed_add(AnimStates animStates) {
            animStates.add("ROOT.Closed");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void ClosingExit() {
            itsRiJThread.unschedTimeout(Locks_Timeout_Closing_id, this);
        }
        
        //## statechart_method 
        public void Locks_Off_exit() {
            Locks_OffExit();
            animInstance().notifyStateExited("ROOT.Locks_Off");
        }
        
        //## statechart_method 
        public int Locks_OnTakeUnlock() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Locks_On_exit();
            Opening_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int ClosedTakeLocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Closed_exit();
            //#[ transition 4 
            Confirm_Lock();
            //#]
            Locks_On_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Closed_exit() {
            ClosedExit();
            animInstance().notifyStateExited("ROOT.Closed");
        }
        
        //## statechart_method 
        public int Closed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Locked.Locked_Default_id))
                {
                    res = ClosedTakeLocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Closing_entDef() {
            Closing_enter();
        }
        
        //## statechart_method 
        public void ClosingEnter() {
            itsRiJThread.schedTimeout(1000, Locks_Timeout_Closing_id, this, "ROOT.Closing");
        }
        
        //## statechart_method 
        public int Locks_Off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Lock.Lock_Default_id))
                {
                    res = Locks_OffTakeLock();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Locks_OnExit() {
        }
        
        //## statechart_method 
        public void Locks_On_entDef() {
            Locks_On_enter();
        }
        
        //## statechart_method 
        public void Opening_enter() {
            animInstance().notifyStateEntered("ROOT.Opening");
            rootState_subState = Opening;
            rootState_active = Opening;
            OpeningEnter();
        }
        
        //## statechart_method 
        public int ClosingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Locks_Timeout_Closing_id)
                {
                    animInstance().notifyTransitionStarted("6");
                    Closing_exit();
                    Closed_entDef();
                    animInstance().notifyTransitionEnded("6");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Closing_enter() {
            animInstance().notifyStateEntered("ROOT.Closing");
            rootState_subState = Closing;
            rootState_active = Closing;
            ClosingEnter();
        }
        
        //## statechart_method 
        public void Closing_exit() {
            ClosingExit();
            animInstance().notifyStateExited("ROOT.Closing");
        }
        
        //## statechart_method 
        public void Locks_Off_enter() {
            animInstance().notifyStateEntered("ROOT.Locks_Off");
            rootState_subState = Locks_Off;
            rootState_active = Locks_Off;
            Locks_OffEnter();
        }
        
        //## statechart_method 
        public void OpeningEnter() {
            itsRiJThread.schedTimeout(1000, Locks_Timeout_Opening_id, this, "ROOT.Opening");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Locks_On_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Unlock.Unlock_Default_id))
                {
                    res = Locks_OnTakeUnlock();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void OpenedEnter() {
            //#[ state Opened.(Entry) 
            Unlock();
            //#]
        }
        
        //## statechart_method 
        public void Opened_entDef() {
            Opened_enter();
        }
        
        //## statechart_method 
        public int Opening_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = OpeningTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int OpeningTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Locks_Timeout_Opening_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    Opening_exit();
                    Opened_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Locks_OffTakeLock() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Locks_Off_exit();
            Closing_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Locks_On_enter() {
            animInstance().notifyStateEntered("ROOT.Locks_On");
            rootState_subState = Locks_On;
            rootState_active = Locks_On;
            Locks_OnEnter();
        }
        
        //## statechart_method 
        public void OpeningExit() {
            itsRiJThread.unschedTimeout(Locks_Timeout_Opening_id, this);
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
        public void Closed_entDef() {
            Closed_enter();
        }
        
        //## statechart_method 
        public int Closing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ClosingTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Locks_OffExit() {
        }
        
        //## statechart_method 
        public void Opening_exit() {
            OpeningExit();
            animInstance().notifyStateExited("ROOT.Opening");
        }
        
        //## statechart_method 
        public void Locks_OnEnter() {
        }
        
        //## statechart_method 
        public void Opened_exit() {
            OpenedExit();
            animInstance().notifyStateExited("ROOT.Opened");
        }
        
        //## statechart_method 
        public void OpenedExit() {
        }
        
        //## statechart_method 
        public void ClosedExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Locks_On_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Closed_enter() {
            animInstance().notifyStateEntered("ROOT.Closed");
            rootState_subState = Closed;
            rootState_active = Closed;
            ClosedEnter();
        }
        
        //## statechart_method 
        public int Opened_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Unlocked.Unlocked_Default_id))
                {
                    res = OpenedTakeUnlocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Locks_Off_entDef() {
            Locks_Off_enter();
        }
        
        //## statechart_method 
        public void Locks_On_exit() {
            Locks_OnExit();
            animInstance().notifyStateExited("ROOT.Locks_On");
        }
        
        //## statechart_method 
        public int OpenedTakeUnlocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Opened_exit();
            Locks_Off_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Locks_OffEnter() {
            //#[ state Locks_Off.(Entry) 
            Confirm_Unlock();
            //#]
        }
        
        //## statechart_method 
        public void Opening_entDef() {
            Opening_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void ClosedEnter() {
            //#[ state Closed.(Entry) 
            Lock();
            //#]
        }
        
        //## statechart_method 
        public void Opened_enter() {
            animInstance().notifyStateEntered("ROOT.Opened");
            rootState_subState = Opened;
            rootState_active = Opened;
            OpenedEnter();
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
            return Locks.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class PortToDoor_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortToDoor_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLocks(Locks) 
        public void connectLocks(Locks part) {
            //#[ operation connectLocks(Locks) 
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
    public class PortToCommand_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortToCommand_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLocks(Locks) 
        public void connectLocks(Locks part) {
            //#[ operation connectLocks(Locks) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassLocks; 
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
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Locks.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Locks.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Locks.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Locks.java
*********************************************************************/

