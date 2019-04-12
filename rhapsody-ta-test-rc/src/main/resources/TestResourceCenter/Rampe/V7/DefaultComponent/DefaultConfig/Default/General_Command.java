/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: General_Command
//!	Generated Date	: Mon, 19, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/General_Command.java
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
// Default/General_Command.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class General_Command 
public class General_Command implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGeneral_Command = new AnimClass("Default.General_Command",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected General_Command.PortOpenCommand_C PortOpenCommand;		//## ignore 
    
    protected General_Command.PortCloseCommand_C PortCloseCommand;		//## ignore 
    
    protected General_Command.PortToLock_C PortToLock;		//## ignore 
    
    protected General_Command.PortFromFilter_C PortFromFilter;		//## ignore 
    
    protected int Error_Door_Still_Not_Close;		//## attribute Error_Door_Still_Not_Close 
    
    protected int Error_Door_Still_Not_Open;		//## attribute Error_Door_Still_Not_Open 
    
    protected int Error_Locks_Still_Off;		//## attribute Error_Locks_Still_Off 
    
    protected int Error_Locks_Still_On;		//## attribute Error_Locks_Still_On 
    
    protected int Position_Door = 1;		//## attribute Position_Door 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Waiting=1;
    public static final int Unlock_Open=2;
    public static final int Send_Open=3;
    public static final int Send_Interrupt=4;
    public static final int Send_Close=5;
    public static final int Lock=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int General_Command_Timeout_Unlock_Open_id = 1;		//## ignore 
    
    public static final int General_Command_Timeout_Send_Open_id = 2;		//## ignore 
    
    public static final int General_Command_Timeout_Send_Close_id = 3;		//## ignore 
    
    public static final int General_Command_Timeout_Lock_id = 4;		//## ignore 
    
    
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
    public  General_Command(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassGeneral_Command.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("General_Command");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public General_Command.PortOpenCommand_C getPortOpenCommand() {
        return PortOpenCommand;
    }
    
    //## auto_generated 
    public General_Command.PortOpenCommand_C get_PortOpenCommand() {
        return PortOpenCommand;
    }
    
    //## auto_generated 
    public General_Command.PortOpenCommand_C newPortOpenCommand() {
        PortOpenCommand = new General_Command.PortOpenCommand_C();
        return PortOpenCommand;
    }
    
    //## auto_generated 
    public void deletePortOpenCommand() {
        PortOpenCommand=null;
    }
    
    //## auto_generated 
    public General_Command.PortCloseCommand_C getPortCloseCommand() {
        return PortCloseCommand;
    }
    
    //## auto_generated 
    public General_Command.PortCloseCommand_C get_PortCloseCommand() {
        return PortCloseCommand;
    }
    
    //## auto_generated 
    public General_Command.PortCloseCommand_C newPortCloseCommand() {
        PortCloseCommand = new General_Command.PortCloseCommand_C();
        return PortCloseCommand;
    }
    
    //## auto_generated 
    public void deletePortCloseCommand() {
        PortCloseCommand=null;
    }
    
    //## auto_generated 
    public General_Command.PortToLock_C getPortToLock() {
        return PortToLock;
    }
    
    //## auto_generated 
    public General_Command.PortToLock_C get_PortToLock() {
        return PortToLock;
    }
    
    //## auto_generated 
    public General_Command.PortToLock_C newPortToLock() {
        PortToLock = new General_Command.PortToLock_C();
        return PortToLock;
    }
    
    //## auto_generated 
    public void deletePortToLock() {
        PortToLock=null;
    }
    
    //## auto_generated 
    public General_Command.PortFromFilter_C getPortFromFilter() {
        return PortFromFilter;
    }
    
    //## auto_generated 
    public General_Command.PortFromFilter_C get_PortFromFilter() {
        return PortFromFilter;
    }
    
    //## auto_generated 
    public General_Command.PortFromFilter_C newPortFromFilter() {
        PortFromFilter = new General_Command.PortFromFilter_C();
        return PortFromFilter;
    }
    
    //## auto_generated 
    public void deletePortFromFilter() {
        PortFromFilter=null;
    }
    
    //## operation Close() 
    public void Close() {
        try {
            animInstance().notifyMethodEntered("Close",
               new ArgData[] {
               });
        
        //#[ operation Close() 
        System.out.println("On appuie sur le bouton Close et on veut que la porte se ferme");
        getPortCloseCommand().gen(new Activate_EV());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Close_Lock() 
    public void Close_Lock() {
        try {
            animInstance().notifyMethodEntered("Close_Lock",
               new ArgData[] {
               });
        
        //#[ operation Close_Lock() 
        System.out.println("Demande de fermeture des verroux");
        getPortToLock().gen(new Lock());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Init_Error() 
    public void Init_Error() {
        try {
            animInstance().notifyMethodEntered("Init_Error",
               new ArgData[] {
               });
        
        //#[ operation Init_Error() 
        Error_Door_Still_Not_Open  = 0;
        Error_Door_Still_Not_Close = 0;
        Error_Locks_Still_Off = 0;
        Error_Locks_Still_On  = 0;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Interruption_Close() 
    public void Interruption_Close() {
        try {
            animInstance().notifyMethodEntered("Interruption_Close",
               new ArgData[] {
               });
        
        //#[ operation Interruption_Close() 
        System.out.println("Les deux boutons sont actives, interruption du mouvement de fermeture");
        getPortCloseCommand().gen(new Interrupt());     
        Position_Door = 0;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Interruption_Open() 
    public void Interruption_Open() {
        try {
            animInstance().notifyMethodEntered("Interruption_Open",
               new ArgData[] {
               });
        
        //#[ operation Interruption_Open() 
        System.out.println("Les deux boutons sont actives, interruption du mouvement d'ouverture");
        getPortOpenCommand().gen(new Interrupt());     
        Position_Door = 0;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Open() 
    public void Open() {
        try {
            animInstance().notifyMethodEntered("Open",
               new ArgData[] {
               });
        
        //#[ operation Open() 
        System.out.println("On appuie sur le bouton Open et on veut que la porte s'ouvre");
        getPortOpenCommand().gen(new Activate_EV());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Open_Lock() 
    public void Open_Lock() {
        try {
            animInstance().notifyMethodEntered("Open_Lock",
               new ArgData[] {
               });
        
        //#[ operation Open_Lock() 
        System.out.println("Demande d'ouverture des verroux");
        getPortToLock().gen(new Unlock());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getError_Door_Still_Not_Close() {
        return Error_Door_Still_Not_Close;
    }
    
    //## auto_generated 
    public void setError_Door_Still_Not_Close(int p_Error_Door_Still_Not_Close) {
        try {
        Error_Door_Still_Not_Close = p_Error_Door_Still_Not_Close;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getError_Door_Still_Not_Open() {
        return Error_Door_Still_Not_Open;
    }
    
    //## auto_generated 
    public void setError_Door_Still_Not_Open(int p_Error_Door_Still_Not_Open) {
        try {
        Error_Door_Still_Not_Open = p_Error_Door_Still_Not_Open;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getError_Locks_Still_Off() {
        return Error_Locks_Still_Off;
    }
    
    //## auto_generated 
    public void setError_Locks_Still_Off(int p_Error_Locks_Still_Off) {
        try {
        Error_Locks_Still_Off = p_Error_Locks_Still_Off;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getError_Locks_Still_On() {
        return Error_Locks_Still_On;
    }
    
    //## auto_generated 
    public void setError_Locks_Still_On(int p_Error_Locks_Still_On) {
        try {
        Error_Locks_Still_On = p_Error_Locks_Still_On;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getPosition_Door() {
        return Position_Door;
    }
    
    //## auto_generated 
    public void setPosition_Door(int p_Position_Door) {
        try {
        Position_Door = p_Position_Door;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortOpenCommand = newPortOpenCommand();
        PortCloseCommand = newPortCloseCommand();
        PortToLock = newPortToLock();
        PortFromFilter = newPortFromFilter();
        if(getPortOpenCommand() != null)
           getPortOpenCommand().connectGeneral_Command(this);
        if(getPortCloseCommand() != null)
           getPortCloseCommand().connectGeneral_Command(this);
        if(getPortToLock() != null)
           getPortToLock().connectGeneral_Command(this);
        if(getPortFromFilter() != null)
           getPortFromFilter().connectGeneral_Command(this);
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
                case Send_Open:
                {
                    Send_Open_add(animStates);
                }
                break;
                case Send_Close:
                {
                    Send_Close_add(animStates);
                }
                break;
                case Send_Interrupt:
                {
                    Send_Interrupt_add(animStates);
                }
                break;
                case Unlock_Open:
                {
                    Unlock_Open_add(animStates);
                }
                break;
                case Lock:
                {
                    Lock_add(animStates);
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
                case Send_Open:
                {
                    res = Send_Open_takeEvent(id);
                }
                break;
                case Send_Close:
                {
                    res = Send_Close_takeEvent(id);
                }
                break;
                case Send_Interrupt:
                {
                    res = Send_Interrupt_takeEvent(id);
                }
                break;
                case Unlock_Open:
                {
                    res = Unlock_Open_takeEvent(id);
                }
                break;
                case Lock:
                {
                    res = Lock_takeEvent(id);
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
        public void Unlock_Open_add(AnimStates animStates) {
            animStates.add("ROOT.Unlock_Open");
        }
        
        //## statechart_method 
        public void Send_Open_add(AnimStates animStates) {
            animStates.add("ROOT.Send_Open");
        }
        
        //## statechart_method 
        public void Send_Interrupt_add(AnimStates animStates) {
            animStates.add("ROOT.Send_Interrupt");
        }
        
        //## statechart_method 
        public void Send_Close_add(AnimStates animStates) {
            animStates.add("ROOT.Send_Close");
        }
        
        //## statechart_method 
        public void Lock_add(AnimStates animStates) {
            animStates.add("ROOT.Lock");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Unlock_Open_exit() {
            Unlock_OpenExit();
            animInstance().notifyStateExited("ROOT.Unlock_Open");
        }
        
        //## statechart_method 
        public int LockTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == General_Command_Timeout_Lock_id)
                {
                    animInstance().notifyTransitionStarted("12");
                    Lock_exit();
                    //#[ transition 12 
                    Error_Locks_Still_Off = 1;
                    //#]
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("12");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Send_OpenTakeInterrupt() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Send_Open_exit();
            //#[ transition 5 
            Interruption_Open();
            //#]
            Send_Interrupt_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_Open_exit() {
            Send_OpenExit();
            animInstance().notifyStateExited("ROOT.Send_Open");
        }
        
        //## statechart_method 
        public void Send_Close_exit() {
            Send_CloseExit();
            animInstance().notifyStateExited("ROOT.Send_Close");
        }
        
        //## statechart_method 
        public void Send_Interrupt_exit() {
            Send_InterruptExit();
            animInstance().notifyStateExited("ROOT.Send_Interrupt");
        }
        
        //## statechart_method 
        public int Send_OpenTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == General_Command_Timeout_Send_Open_id)
                {
                    animInstance().notifyTransitionStarted("13");
                    Send_Open_exit();
                    //#[ transition 13 
                    Error_Door_Still_Not_Open = 1;
                    //#]
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("13");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Send_Open_enter() {
            animInstance().notifyStateEntered("ROOT.Send_Open");
            rootState_subState = Send_Open;
            rootState_active = Send_Open;
            Send_OpenEnter();
        }
        
        //## statechart_method 
        public void Waiting_enter() {
            animInstance().notifyStateEntered("ROOT.Waiting");
            rootState_subState = Waiting;
            rootState_active = Waiting;
            WaitingEnter();
        }
        
        //## statechart_method 
        public void LockEnter() {
            //#[ state Lock.(Entry) 
            Close_Lock();
            //#]
            itsRiJThread.schedTimeout(3000, General_Command_Timeout_Lock_id, this, "ROOT.Lock");
        }
        
        //## statechart_method 
        public int Send_CloseTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == General_Command_Timeout_Send_Close_id)
                {
                    animInstance().notifyTransitionStarted("14");
                    Send_Close_exit();
                    //#[ transition 14 
                    Error_Door_Still_Not_Close = 1;
                    //#]
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("14");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Unlock_OpenTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == General_Command_Timeout_Unlock_Open_id)
                {
                    animInstance().notifyTransitionStarted("11");
                    Unlock_Open_exit();
                    //#[ transition 11 
                    Error_Locks_Still_On = 1;
                    //#]
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("11");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Unlock_OpenExit() {
            itsRiJThread.unschedTimeout(General_Command_Timeout_Unlock_Open_id, this);
        }
        
        //## statechart_method 
        public int Send_Close_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Send_CloseTakeRiJTimeout();
                }
            else if(event.isTypeOf(Interrupt.Interrupt_Default_id))
                {
                    res = Send_CloseTakeInterrupt();
                }
            else if(event.isTypeOf(EV_Stopped.EV_Stopped_Default_id))
                {
                    res = Send_CloseTakeEV_Stopped();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public void Lock_exit() {
            LockExit();
            animInstance().notifyStateExited("ROOT.Lock");
        }
        
        //## statechart_method 
        public int Send_CloseTakeInterrupt() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Send_Close_exit();
            //#[ transition 6 
            Interruption_Close();
            //#]
            Send_Interrupt_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_Close_enter() {
            animInstance().notifyStateEntered("ROOT.Send_Close");
            rootState_subState = Send_Close;
            rootState_active = Send_Close;
            Send_CloseEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Send_CloseExit() {
            itsRiJThread.unschedTimeout(General_Command_Timeout_Send_Close_id, this);
        }
        
        //## statechart_method 
        public int Unlock_Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Unlock_OpenTakeRiJTimeout();
                }
            else if(event.isTypeOf(Unlocked.Unlocked_Default_id))
                {
                    res = Unlock_OpenTakeUnlocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Send_Close_entDef() {
            Send_Close_enter();
        }
        
        //## statechart_method 
        public int Send_Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Send_OpenTakeRiJTimeout();
                }
            else if(event.isTypeOf(Interrupt.Interrupt_Default_id))
                {
                    res = Send_OpenTakeInterrupt();
                }
            else if(event.isTypeOf(EV_Stopped.EV_Stopped_Default_id))
                {
                    res = Send_OpenTakeEV_Stopped();
                }
            
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
        public int Send_OpenTakeEV_Stopped() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Send_Open_exit();
            //#[ transition 2 
            Position_Door = -1;
            //#]
            Waiting_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Waiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Close_Button.Close_Button_Default_id))
                {
                    res = WaitingTakeClose_Button();
                }
            else if(event.isTypeOf(Open_Button.Open_Button_Default_id))
                {
                    res = WaitingTakeOpen_Button();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeOpen_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 1 
            if(Position_Door == 1)
                {
                    animInstance().notifyTransitionStarted("1");
                    Waiting_exit();
                    Unlock_Open_entDef();
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 10 
                    if(Position_Door == 0)
                        {
                            animInstance().notifyTransitionStarted("10");
                            Waiting_exit();
                            Send_Open_entDef();
                            animInstance().notifyTransitionEnded("10");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int Lock_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = LockTakeRiJTimeout();
                }
            else if(event.isTypeOf(Locked.Locked_Default_id))
                {
                    res = LockTakeLocked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int LockTakeLocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            Lock_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Lock_entDef() {
            Lock_enter();
        }
        
        //## statechart_method 
        public int Send_CloseTakeEV_Stopped() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Send_Close_exit();
            //#[ transition 4 
            Position_Door = 1;
            //#]
            Lock_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_InterruptExit() {
        }
        
        //## statechart_method 
        public void Send_OpenExit() {
            itsRiJThread.unschedTimeout(General_Command_Timeout_Send_Open_id, this);
        }
        
        //## statechart_method 
        public int Unlock_OpenTakeUnlocked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            Unlock_Open_exit();
            Send_Open_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void Unlock_Open_entDef() {
            Unlock_Open_enter();
        }
        
        //## statechart_method 
        public int WaitingTakeClose_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 3 
            if(Position_Door <= 0)
                {
                    animInstance().notifyTransitionStarted("3");
                    Waiting_exit();
                    Send_Close_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void LockExit() {
            itsRiJThread.unschedTimeout(General_Command_Timeout_Lock_id, this);
        }
        
        //## statechart_method 
        public int Send_InterruptTakeEV_Stopped() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Send_Interrupt_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Unlock_OpenEnter() {
            //#[ state Unlock_Open.(Entry) 
            Open_Lock();
            //#]
            itsRiJThread.schedTimeout(3000, General_Command_Timeout_Unlock_Open_id, this, "ROOT.Unlock_Open");
        }
        
        //## statechart_method 
        public void WaitingExit() {
            //#[ state Waiting.(Exit) 
            Init_Error();
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Send_Interrupt_enter() {
            animInstance().notifyStateEntered("ROOT.Send_Interrupt");
            rootState_subState = Send_Interrupt;
            rootState_active = Send_Interrupt;
            Send_InterruptEnter();
        }
        
        //## statechart_method 
        public void Send_OpenEnter() {
            //#[ state Send_Open.(Entry) 
            Open();
            //#]
            itsRiJThread.schedTimeout(12000, General_Command_Timeout_Send_Open_id, this, "ROOT.Send_Open");
        }
        
        //## statechart_method 
        public void Unlock_Open_enter() {
            animInstance().notifyStateEntered("ROOT.Unlock_Open");
            rootState_subState = Unlock_Open;
            rootState_active = Unlock_Open;
            Unlock_OpenEnter();
        }
        
        //## statechart_method 
        public void Lock_enter() {
            animInstance().notifyStateEntered("ROOT.Lock");
            rootState_subState = Lock;
            rootState_active = Lock;
            LockEnter();
        }
        
        //## statechart_method 
        public void Send_CloseEnter() {
            //#[ state Send_Close.(Entry) 
            Close();
            //#]
            itsRiJThread.schedTimeout(12000, General_Command_Timeout_Send_Close_id, this, "ROOT.Send_Close");
        }
        
        //## statechart_method 
        public int Send_Interrupt_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EV_Stopped.EV_Stopped_Default_id))
                {
                    res = Send_InterruptTakeEV_Stopped();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Send_InterruptEnter() {
            //#[ state Send_Interrupt.(Entry) 
            Position_Door = 0;
            //#]
        }
        
        //## statechart_method 
        public void Send_Interrupt_entDef() {
            Send_Interrupt_enter();
        }
        
        //## statechart_method 
        public void Send_Open_entDef() {
            Send_Open_enter();
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
            return General_Command.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class PortOpenCommand_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortOpenCommand_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectGeneral_Command(General_Command) 
        public void connectGeneral_Command(General_Command part) {
            //#[ operation connectGeneral_Command(General_Command) 
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
    public class PortCloseCommand_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortCloseCommand_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectGeneral_Command(General_Command) 
        public void connectGeneral_Command(General_Command part) {
            //#[ operation connectGeneral_Command(General_Command) 
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
        //## operation connectGeneral_Command(General_Command) 
        public void connectGeneral_Command(General_Command part) {
            //#[ operation connectGeneral_Command(General_Command) 
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
    public class PortFromFilter_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromFilter_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectGeneral_Command(General_Command) 
        public void connectGeneral_Command(General_Command part) {
            //#[ operation connectGeneral_Command(General_Command) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGeneral_Command; 
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
        
        msg.add("Position_Door", Position_Door);
        msg.add("Error_Locks_Still_On", Error_Locks_Still_On);
        msg.add("Error_Locks_Still_Off", Error_Locks_Still_Off);
        msg.add("Error_Door_Still_Not_Open", Error_Door_Still_Not_Open);
        msg.add("Error_Door_Still_Not_Close", Error_Door_Still_Not_Close);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(General_Command.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            General_Command.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            General_Command.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/General_Command.java
*********************************************************************/

