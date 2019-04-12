/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Door
//!	Generated Date	: Mon, 19, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Door.java
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
// Default/Door.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Door 
public class Door implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDoor = new AnimClass("Default.Door",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Door.PortOpenDoor_C PortOpenDoor;		//## ignore 
    
    protected Door.PortCloseDoor_C PortCloseDoor;		//## ignore 
    
    protected Door.PortToLock_C PortToLock;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Open=1;
    public static final int Middle=2;
    public static final int From_Open_To_Close=3;
    public static final int From_Close_To_Open=4;
    public static final int Close_Unlocked=5;
    public static final int Close_Locked=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Door_Timeout_From_Open_To_Close_id = 1;		//## ignore 
    
    public static final int Door_Timeout_From_Close_To_Open_id = 2;		//## ignore 
    
    
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
    public Door.PortOpenDoor_C getPortOpenDoor() {
        return PortOpenDoor;
    }
    
    //## auto_generated 
    public Door.PortOpenDoor_C get_PortOpenDoor() {
        return PortOpenDoor;
    }
    
    //## auto_generated 
    public Door.PortOpenDoor_C newPortOpenDoor() {
        PortOpenDoor = new Door.PortOpenDoor_C();
        return PortOpenDoor;
    }
    
    //## auto_generated 
    public void deletePortOpenDoor() {
        PortOpenDoor=null;
    }
    
    //## auto_generated 
    public Door.PortCloseDoor_C getPortCloseDoor() {
        return PortCloseDoor;
    }
    
    //## auto_generated 
    public Door.PortCloseDoor_C get_PortCloseDoor() {
        return PortCloseDoor;
    }
    
    //## auto_generated 
    public Door.PortCloseDoor_C newPortCloseDoor() {
        PortCloseDoor = new Door.PortCloseDoor_C();
        return PortCloseDoor;
    }
    
    //## auto_generated 
    public void deletePortCloseDoor() {
        PortCloseDoor=null;
    }
    
    //## auto_generated 
    public Door.PortToLock_C getPortToLock() {
        return PortToLock;
    }
    
    //## auto_generated 
    public Door.PortToLock_C get_PortToLock() {
        return PortToLock;
    }
    
    //## auto_generated 
    public Door.PortToLock_C newPortToLock() {
        PortToLock = new Door.PortToLock_C();
        return PortToLock;
    }
    
    //## auto_generated 
    public void deletePortToLock() {
        PortToLock=null;
    }
    
    //## operation Closed() 
    public void Closed() {
        try {
            animInstance().notifyMethodEntered("Closed",
               new ArgData[] {
               });
        
        //#[ operation Closed() 
        System.out.println("La Porte se ferme");
        getPortCloseDoor().gen(new Stop_EV());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Lock_Off() 
    public void Lock_Off() {
        try {
            animInstance().notifyMethodEntered("Lock_Off",
               new ArgData[] {
               });
        
        //#[ operation Lock_Off() 
        System.out.println("Les Verroux sont desactives");
        getPortToLock().gen(new Unlocked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Lock_On() 
    public void Lock_On() {
        try {
            animInstance().notifyMethodEntered("Lock_On",
               new ArgData[] {
               });
        
        //#[ operation Lock_On() 
        System.out.println("Les Verroux sont actives");
        getPortToLock().gen(new Locked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Opened() 
    public void Opened() {
        try {
            animInstance().notifyMethodEntered("Opened",
               new ArgData[] {
               });
        
        //#[ operation Opened() 
        System.out.println("La Porte s'ouvre");
        getPortOpenDoor().gen(new Stop_EV());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Pause() 
    public void Pause() {
        try {
            animInstance().notifyMethodEntered("Pause",
               new ArgData[] {
               });
        
        //#[ operation Pause() 
        System.out.println("Porte a l'arret en transition");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortOpenDoor = newPortOpenDoor();
        PortCloseDoor = newPortCloseDoor();
        PortToLock = newPortToLock();
        if(getPortOpenDoor() != null)
           getPortOpenDoor().connectDoor(this);
        if(getPortCloseDoor() != null)
           getPortCloseDoor().connectDoor(this);
        if(getPortToLock() != null)
           getPortToLock().connectDoor(this);
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
                case Close_Unlocked:
                {
                    Close_Unlocked_add(animStates);
                }
                break;
                case Open:
                {
                    Open_add(animStates);
                }
                break;
                case From_Close_To_Open:
                {
                    From_Close_To_Open_add(animStates);
                }
                break;
                case From_Open_To_Close:
                {
                    From_Open_To_Close_add(animStates);
                }
                break;
                case Middle:
                {
                    Middle_add(animStates);
                }
                break;
                case Close_Locked:
                {
                    Close_Locked_add(animStates);
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
                case Close_Unlocked:
                {
                    res = Close_Unlocked_takeEvent(id);
                }
                break;
                case Open:
                {
                    res = Open_takeEvent(id);
                }
                break;
                case From_Close_To_Open:
                {
                    res = From_Close_To_Open_takeEvent(id);
                }
                break;
                case From_Open_To_Close:
                {
                    res = From_Open_To_Close_takeEvent(id);
                }
                break;
                case Middle:
                {
                    res = Middle_takeEvent(id);
                }
                break;
                case Close_Locked:
                {
                    res = Close_Locked_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
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
        public void From_Open_To_Close_add(AnimStates animStates) {
            animStates.add("ROOT.From_Open_To_Close");
        }
        
        //## statechart_method 
        public void From_Close_To_Open_add(AnimStates animStates) {
            animStates.add("ROOT.From_Close_To_Open");
        }
        
        //## statechart_method 
        public void Close_Unlocked_add(AnimStates animStates) {
            animStates.add("ROOT.Close_Unlocked");
        }
        
        //## statechart_method 
        public void Close_Locked_add(AnimStates animStates) {
            animStates.add("ROOT.Close_Locked");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int Close_LockedTakeUnlocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            Close_Locked_exit();
            //#[ transition 10 
            Lock_Off();
            //#]
            Close_Unlocked_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Close_LockedExit() {
        }
        
        //## statechart_method 
        public void Close_Locked_entDef() {
            Close_Locked_enter();
        }
        
        //## statechart_method 
        public int From_Open_To_CloseTakeInterrupt() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            From_Open_To_Close_exit();
            Middle_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void Close_LockedEnter() {
        }
        
        //## statechart_method 
        public void Middle_exit() {
            MiddleExit();
            animInstance().notifyStateExited("ROOT.Middle");
        }
        
        //## statechart_method 
        public int Middle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EV_Open_Activated.EV_Open_Activated_Default_id))
                {
                    res = MiddleTakeEV_Open_Activated();
                }
            else if(event.isTypeOf(EV_Close_Activated.EV_Close_Activated_Default_id))
                {
                    res = MiddleTakeEV_Close_Activated();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Middle_entDef() {
            Middle_enter();
        }
        
        //## statechart_method 
        public int Close_Locked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Unlocked.Unlocked_Default_id))
                {
                    res = Close_LockedTakeUnlocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void From_Close_To_OpenEnter() {
            itsRiJThread.schedTimeout(5000, Door_Timeout_From_Close_To_Open_id, this, "ROOT.From_Close_To_Open");
        }
        
        //## statechart_method 
        public void Close_Locked_exit() {
            Close_LockedExit();
            animInstance().notifyStateExited("ROOT.Close_Locked");
        }
        
        //## statechart_method 
        public void Close_UnlockedExit() {
        }
        
        //## statechart_method 
        public int From_Close_To_OpenTakeInterrupt() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            From_Close_To_Open_exit();
            Middle_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int MiddleTakeEV_Open_Activated() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            Middle_exit();
            From_Close_To_Open_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void MiddleExit() {
        }
        
        //## statechart_method 
        public void From_Close_To_Open_exit() {
            From_Close_To_OpenExit();
            animInstance().notifyStateExited("ROOT.From_Close_To_Open");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Close_Unlocked_enter() {
            animInstance().notifyStateEntered("ROOT.Close_Unlocked");
            rootState_subState = Close_Unlocked;
            rootState_active = Close_Unlocked;
            Close_UnlockedEnter();
        }
        
        //## statechart_method 
        public int From_Close_To_Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = From_Close_To_OpenTakeRiJTimeout();
                }
            else if(event.isTypeOf(Interrupt.Interrupt_Default_id))
                {
                    res = From_Close_To_OpenTakeInterrupt();
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
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int From_Close_To_OpenTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Door_Timeout_From_Close_To_Open_id)
                {
                    animInstance().notifyTransitionStarted("3");
                    From_Close_To_Open_exit();
                    Open_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int MiddleTakeEV_Close_Activated() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Middle_exit();
            From_Open_To_Close_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Close_Unlocked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Locked.Locked_Default_id))
                {
                    res = Close_UnlockedTakeLocked();
                }
            else if(event.isTypeOf(EV_Open_Activated.EV_Open_Activated_Default_id))
                {
                    res = Close_UnlockedTakeEV_Open_Activated();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Close_UnlockedTakeLocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            Close_Unlocked_exit();
            //#[ transition 9 
            Lock_On();
            //#]
            Close_Locked_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int From_Open_To_CloseTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Door_Timeout_From_Open_To_Close_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    From_Open_To_Close_exit();
                    //#[ transition 4 
                    Closed();
                    //#]
                    Close_Unlocked_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void From_Open_To_Close_entDef() {
            From_Open_To_Close_enter();
        }
        
        //## statechart_method 
        public void Open_entDef() {
            Open_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Close_Locked_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Close_UnlockedEnter() {
        }
        
        //## statechart_method 
        public void From_Close_To_Open_entDef() {
            From_Close_To_Open_enter();
        }
        
        //## statechart_method 
        public int From_Open_To_Close_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = From_Open_To_CloseTakeRiJTimeout();
                }
            else if(event.isTypeOf(Interrupt.Interrupt_Default_id))
                {
                    res = From_Open_To_CloseTakeInterrupt();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void From_Open_To_Close_enter() {
            animInstance().notifyStateEntered("ROOT.From_Open_To_Close");
            rootState_subState = From_Open_To_Close;
            rootState_active = From_Open_To_Close;
            From_Open_To_CloseEnter();
        }
        
        //## statechart_method 
        public int Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EV_Close_Activated.EV_Close_Activated_Default_id))
                {
                    res = OpenTakeEV_Close_Activated();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void From_Open_To_CloseEnter() {
            itsRiJThread.schedTimeout(5000, Door_Timeout_From_Open_To_Close_id, this, "ROOT.From_Open_To_Close");
        }
        
        //## statechart_method 
        public void Close_Locked_enter() {
            animInstance().notifyStateEntered("ROOT.Close_Locked");
            rootState_subState = Close_Locked;
            rootState_active = Close_Locked;
            Close_LockedEnter();
        }
        
        //## statechart_method 
        public void Close_Unlocked_entDef() {
            Close_Unlocked_enter();
        }
        
        //## statechart_method 
        public void From_Close_To_Open_enter() {
            animInstance().notifyStateEntered("ROOT.From_Close_To_Open");
            rootState_subState = From_Close_To_Open;
            rootState_active = From_Close_To_Open;
            From_Close_To_OpenEnter();
        }
        
        //## statechart_method 
        public void OpenEnter() {
            //#[ state Open.(Entry) 
            Opened();
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Close_Unlocked_exit() {
            Close_UnlockedExit();
            animInstance().notifyStateExited("ROOT.Close_Unlocked");
        }
        
        //## statechart_method 
        public void From_Open_To_CloseExit() {
            itsRiJThread.unschedTimeout(Door_Timeout_From_Open_To_Close_id, this);
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
            //#[ state Middle.(Entry) 
            Pause();
            //#]
        }
        
        //## statechart_method 
        public int Close_UnlockedTakeEV_Open_Activated() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Close_Unlocked_exit();
            From_Close_To_Open_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void From_Close_To_OpenExit() {
            itsRiJThread.unschedTimeout(Door_Timeout_From_Close_To_Open_id, this);
        }
        
        //## statechart_method 
        public void From_Open_To_Close_exit() {
            From_Open_To_CloseExit();
            animInstance().notifyStateExited("ROOT.From_Open_To_Close");
        }
        
        //## statechart_method 
        public int OpenTakeEV_Close_Activated() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Open_exit();
            From_Open_To_Close_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
    public class PortOpenDoor_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortOpenDoor_C() {
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
    public class PortCloseDoor_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortCloseDoor_C() {
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
    public class PortToLock_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortToLock_C() {
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
	File Path	: DefaultComponent/DefaultConfig/Default/Door.java
*********************************************************************/

