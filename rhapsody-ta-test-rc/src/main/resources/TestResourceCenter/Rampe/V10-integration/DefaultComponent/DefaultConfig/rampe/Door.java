/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Door
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Door.java
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
// rampe/Door.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Door 
public class Door implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDoor = new AnimClass("rampe.Door",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Door.open_C open;		//## ignore 
    
    protected Door.close_C close;		//## ignore 
    
    protected Door.lock_C lock;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int OpenToClose=1;
    public static final int Open=2;
    public static final int Middle=3;
    public static final int CloseToOpen=4;
    public static final int ClosedUnlocked=5;
    public static final int ClosedLocked=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Door_Timeout_OpenToClose_id = 1;		//## ignore 
    
    public static final int Door_Timeout_CloseToOpen_id = 2;		//## ignore 
    
    
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
    public  Door(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDoor.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Door");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Door.open_C getOpen() {
        return open;
    }
    
    //## auto_generated 
    public Door.open_C get_open() {
        return open;
    }
    
    //## auto_generated 
    public Door.open_C newOpen() {
        open = new Door.open_C();
        return open;
    }
    
    //## auto_generated 
    public void deleteOpen() {
        open=null;
    }
    
    //## auto_generated 
    public Door.close_C getClose() {
        return close;
    }
    
    //## auto_generated 
    public Door.close_C get_close() {
        return close;
    }
    
    //## auto_generated 
    public Door.close_C newClose() {
        close = new Door.close_C();
        return close;
    }
    
    //## auto_generated 
    public void deleteClose() {
        close=null;
    }
    
    //## auto_generated 
    public Door.lock_C getLock() {
        return lock;
    }
    
    //## auto_generated 
    public Door.lock_C get_lock() {
        return lock;
    }
    
    //## auto_generated 
    public Door.lock_C newLock() {
        lock = new Door.lock_C();
        return lock;
    }
    
    //## auto_generated 
    public void deleteLock() {
        lock=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        open = newOpen();
        close = newClose();
        lock = newLock();
        if(getOpen() != null)
           getOpen().connectDoor(this);
        if(getClose() != null)
           getClose().connectDoor(this);
        if(getLock() != null)
           getLock().connectDoor(this);
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
                case ClosedLocked:
                {
                    ClosedLocked_add(animStates);
                }
                break;
                case ClosedUnlocked:
                {
                    ClosedUnlocked_add(animStates);
                }
                break;
                case OpenToClose:
                {
                    OpenToClose_add(animStates);
                }
                break;
                case CloseToOpen:
                {
                    CloseToOpen_add(animStates);
                }
                break;
                case Open:
                {
                    Open_add(animStates);
                }
                break;
                case Middle:
                {
                    Middle_add(animStates);
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
                case ClosedLocked:
                {
                    res = ClosedLocked_takeEvent(id);
                }
                break;
                case ClosedUnlocked:
                {
                    res = ClosedUnlocked_takeEvent(id);
                }
                break;
                case OpenToClose:
                {
                    res = OpenToClose_takeEvent(id);
                }
                break;
                case CloseToOpen:
                {
                    res = CloseToOpen_takeEvent(id);
                }
                break;
                case Open:
                {
                    res = Open_takeEvent(id);
                }
                break;
                case Middle:
                {
                    res = Middle_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void OpenToClose_add(AnimStates animStates) {
            animStates.add("ROOT.OpenToClose");
        }
        
        //## statechart_method 
        public void Open_add(AnimStates animStates) {
            animStates.add("ROOT.Open");
        }
        
        //## statechart_method 
        public void Middle_add(AnimStates animStates) {
            animStates.add("ROOT.Middle");
        }
        
        //## statechart_method 
        public void CloseToOpen_add(AnimStates animStates) {
            animStates.add("ROOT.CloseToOpen");
        }
        
        //## statechart_method 
        public void ClosedUnlocked_add(AnimStates animStates) {
            animStates.add("ROOT.ClosedUnlocked");
        }
        
        //## statechart_method 
        public void ClosedLocked_add(AnimStates animStates) {
            animStates.add("ROOT.ClosedLocked");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Open_exit() {
            OpenExit();
            animInstance().notifyStateExited("ROOT.Open");
        }
        
        //## statechart_method 
        public void OpenExit() {
        }
        
        //## statechart_method 
        public void CloseToOpen_exit() {
            CloseToOpenExit();
            animInstance().notifyStateExited("ROOT.CloseToOpen");
        }
        
        //## statechart_method 
        public void Middle_exit() {
            MiddleExit();
            animInstance().notifyStateExited("ROOT.Middle");
        }
        
        //## statechart_method 
        public void OpenToClose_exit() {
            OpenToCloseExit();
            animInstance().notifyStateExited("ROOT.OpenToClose");
        }
        
        //## statechart_method 
        public void ClosedUnlocked_exit() {
            ClosedUnlockedExit();
            animInstance().notifyStateExited("ROOT.ClosedUnlocked");
        }
        
        //## statechart_method 
        public int CloseToOpen_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPressureOff.evtPressureOff_rampe_id))
                {
                    res = CloseToOpenTakeevtPressureOff();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = CloseToOpenTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Middle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPressureOn.evtPressureOn_rampe_id))
                {
                    res = MiddleTakeevtPressureOn();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Middle_entDef() {
            Middle_enter();
        }
        
        //## statechart_method 
        public int CloseToOpenTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Door_Timeout_CloseToOpen_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    CloseToOpen_exit();
                    Open_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void ClosedLocked_entDef() {
            ClosedLocked_enter();
        }
        
        //## statechart_method 
        public int ClosedUnlockedTakeevtLocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            ClosedUnlocked_exit();
            //#[ transition 2 
            getLock().gen(new evtLocked());
            //#]
            ClosedLocked_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void MiddleExit() {
        }
        
        //## statechart_method 
        public int OpenToClose_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPressureOff.evtPressureOff_rampe_id))
                {
                    res = OpenToCloseTakeevtPressureOff();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = OpenToCloseTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ClosedLockedExit() {
        }
        
        //## statechart_method 
        public void OpenToClose_enter() {
            animInstance().notifyStateEntered("ROOT.OpenToClose");
            rootState_subState = OpenToClose;
            rootState_active = OpenToClose;
            OpenToCloseEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int ClosedUnlocked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPressureOn.evtPressureOn_rampe_id))
                {
                    res = ClosedUnlockedTakeevtPressureOn();
                }
            else if(event.isTypeOf(evtLocked.evtLocked_rampe_id))
                {
                    res = ClosedUnlockedTakeevtLocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ClosedLocked_enter() {
            animInstance().notifyStateEntered("ROOT.ClosedLocked");
            rootState_subState = ClosedLocked;
            rootState_active = ClosedLocked;
            ClosedLockedEnter();
        }
        
        //## statechart_method 
        public void ClosedLockedEnter() {
        }
        
        //## statechart_method 
        public int OpenTakeevtPressureOn() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 5 
            if(isPort(getClose()))
                {
                    animInstance().notifyTransitionStarted("5");
                    Open_exit();
                    OpenToClose_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Open_enter() {
            animInstance().notifyStateEntered("ROOT.Open");
            rootState_subState = Open;
            rootState_active = Open;
            OpenEnter();
        }
        
        //## statechart_method 
        public void OpenToCloseExit() {
            itsRiJThread.unschedTimeout(Door_Timeout_OpenToClose_id, this);
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
        public int ClosedLocked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtUnlocked.evtUnlocked_rampe_id))
                {
                    res = ClosedLockedTakeevtUnlocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int OpenToCloseTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Door_Timeout_OpenToClose_id)
                {
                    animInstance().notifyTransitionStarted("6");
                    OpenToClose_exit();
                    //#[ transition 6 
                    getClose().gen(new evtStopEV());
                    //#]
                    ClosedUnlocked_entDef();
                    animInstance().notifyTransitionEnded("6");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void ClosedLocked_exit() {
            ClosedLockedExit();
            animInstance().notifyStateExited("ROOT.ClosedLocked");
        }
        
        //## statechart_method 
        public int CloseToOpenTakeevtPressureOff() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            CloseToOpen_exit();
            Middle_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Open_entDef() {
            Open_enter();
        }
        
        //## statechart_method 
        public int OpenToCloseTakeevtPressureOff() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            OpenToClose_exit();
            Middle_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            ClosedLocked_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPressureOn.evtPressureOn_rampe_id))
                {
                    res = OpenTakeevtPressureOn();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CloseToOpenExit() {
            itsRiJThread.unschedTimeout(Door_Timeout_CloseToOpen_id, this);
        }
        
        //## statechart_method 
        public void CloseToOpen_entDef() {
            CloseToOpen_enter();
        }
        
        //## statechart_method 
        public int MiddleTakeevtPressureOn() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 7 
            if(isPort(getClose()))
                {
                    animInstance().notifyTransitionStarted("7");
                    Middle_exit();
                    OpenToClose_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 8 
                    if(isPort(getOpen()))
                        {
                            animInstance().notifyTransitionStarted("8");
                            Middle_exit();
                            CloseToOpen_entDef();
                            animInstance().notifyTransitionEnded("8");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int ClosedUnlockedTakeevtPressureOn() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 3 
            if(isPort(getOpen()))
                {
                    animInstance().notifyTransitionStarted("3");
                    ClosedUnlocked_exit();
                    CloseToOpen_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void OpenEnter() {
            //#[ state Open.(Entry) 
            getOpen().gen(new evtStopEV());
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int ClosedLockedTakeevtUnlocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            ClosedLocked_exit();
            //#[ transition 1 
            getLock().gen(new evtUnlocked());
            //#]
            ClosedUnlocked_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ClosedUnlockedExit() {
        }
        
        //## statechart_method 
        public void ClosedUnlocked_enter() {
            animInstance().notifyStateEntered("ROOT.ClosedUnlocked");
            rootState_subState = ClosedUnlocked;
            rootState_active = ClosedUnlocked;
            ClosedUnlockedEnter();
        }
        
        //## statechart_method 
        public void CloseToOpenEnter() {
            itsRiJThread.schedTimeout(2200, Door_Timeout_CloseToOpen_id, this, "ROOT.CloseToOpen");
        }
        
        //## statechart_method 
        public void Middle_enter() {
            animInstance().notifyStateEntered("ROOT.Middle");
            rootState_subState = Middle;
            rootState_active = Middle;
            MiddleEnter();
        }
        
        //## statechart_method 
        public void MiddleEnter() {
        }
        
        //## statechart_method 
        public void OpenToCloseEnter() {
            itsRiJThread.schedTimeout(3600, Door_Timeout_OpenToClose_id, this, "ROOT.OpenToClose");
        }
        
        //## statechart_method 
        public void OpenToClose_entDef() {
            OpenToClose_enter();
        }
        
        //## statechart_method 
        public void ClosedUnlockedEnter() {
        }
        
        //## statechart_method 
        public void ClosedUnlocked_entDef() {
            ClosedUnlocked_enter();
        }
        
        //## statechart_method 
        public void CloseToOpen_enter() {
            animInstance().notifyStateEntered("ROOT.CloseToOpen");
            rootState_subState = CloseToOpen;
            rootState_active = CloseToOpen;
            CloseToOpenEnter();
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
            return Door.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class open_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  open_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectDoor(Door) 
        public void connectDoor(Door part) {
            //#[ operation connectDoor(Door) 
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
    public class close_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  close_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectDoor(Door) 
        public void connectDoor(Door part) {
            //#[ operation connectDoor(Door) 
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
    public class lock_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  lock_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectDoor(Door) 
        public void connectDoor(Door part) {
            //#[ operation connectDoor(Door) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDoor; 
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
            super(Door.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Door.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Door.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Door.java
*********************************************************************/

