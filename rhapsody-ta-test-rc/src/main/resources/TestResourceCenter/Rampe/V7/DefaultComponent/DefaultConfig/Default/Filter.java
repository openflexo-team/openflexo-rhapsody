/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Filter
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Filter.java
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
// Default/Filter.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Filter 
public class Filter implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFilter = new AnimClass("Default.Filter",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Filter.PortToCommand_C PortToCommand;		//## ignore 
    
    protected Filter.PortFromOpenInside_C PortFromOpenInside;		//## ignore 
    
    protected Filter.PortFromCloseInside_C PortFromCloseInside;		//## ignore 
    
    protected Filter.PortFromOpenOutside_C PortFromOpenOutside;		//## ignore 
    
    protected Filter.PortFromCloseOutside_C PortFromCloseOutside;		//## ignore 
    
    protected Filter.PortFromOpenPilot_C PortFromOpenPilot;		//## ignore 
    
    protected Filter.PortFromClosePilot_C PortFromClosePilot;		//## ignore 
    
    protected Filter.PortFromInhib_C PortFromInhib;		//## ignore 
    
    protected boolean Inhib_In_Queue = false;		//## attribute Inhib_In_Queue 
    
    protected int N_Pressed = 0;		//## attribute N_Pressed 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Waiting=1;
    public static final int Send_Open=2;
    public static final int Send_Close=3;
    public static final int Locked=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
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
    public  Filter(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassFilter.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Filter");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Filter.PortToCommand_C getPortToCommand() {
        return PortToCommand;
    }
    
    //## auto_generated 
    public Filter.PortToCommand_C get_PortToCommand() {
        return PortToCommand;
    }
    
    //## auto_generated 
    public Filter.PortToCommand_C newPortToCommand() {
        PortToCommand = new Filter.PortToCommand_C();
        return PortToCommand;
    }
    
    //## auto_generated 
    public void deletePortToCommand() {
        PortToCommand=null;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenInside_C getPortFromOpenInside() {
        return PortFromOpenInside;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenInside_C get_PortFromOpenInside() {
        return PortFromOpenInside;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenInside_C newPortFromOpenInside() {
        PortFromOpenInside = new Filter.PortFromOpenInside_C();
        return PortFromOpenInside;
    }
    
    //## auto_generated 
    public void deletePortFromOpenInside() {
        PortFromOpenInside=null;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseInside_C getPortFromCloseInside() {
        return PortFromCloseInside;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseInside_C get_PortFromCloseInside() {
        return PortFromCloseInside;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseInside_C newPortFromCloseInside() {
        PortFromCloseInside = new Filter.PortFromCloseInside_C();
        return PortFromCloseInside;
    }
    
    //## auto_generated 
    public void deletePortFromCloseInside() {
        PortFromCloseInside=null;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenOutside_C getPortFromOpenOutside() {
        return PortFromOpenOutside;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenOutside_C get_PortFromOpenOutside() {
        return PortFromOpenOutside;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenOutside_C newPortFromOpenOutside() {
        PortFromOpenOutside = new Filter.PortFromOpenOutside_C();
        return PortFromOpenOutside;
    }
    
    //## auto_generated 
    public void deletePortFromOpenOutside() {
        PortFromOpenOutside=null;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseOutside_C getPortFromCloseOutside() {
        return PortFromCloseOutside;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseOutside_C get_PortFromCloseOutside() {
        return PortFromCloseOutside;
    }
    
    //## auto_generated 
    public Filter.PortFromCloseOutside_C newPortFromCloseOutside() {
        PortFromCloseOutside = new Filter.PortFromCloseOutside_C();
        return PortFromCloseOutside;
    }
    
    //## auto_generated 
    public void deletePortFromCloseOutside() {
        PortFromCloseOutside=null;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenPilot_C getPortFromOpenPilot() {
        return PortFromOpenPilot;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenPilot_C get_PortFromOpenPilot() {
        return PortFromOpenPilot;
    }
    
    //## auto_generated 
    public Filter.PortFromOpenPilot_C newPortFromOpenPilot() {
        PortFromOpenPilot = new Filter.PortFromOpenPilot_C();
        return PortFromOpenPilot;
    }
    
    //## auto_generated 
    public void deletePortFromOpenPilot() {
        PortFromOpenPilot=null;
    }
    
    //## auto_generated 
    public Filter.PortFromClosePilot_C getPortFromClosePilot() {
        return PortFromClosePilot;
    }
    
    //## auto_generated 
    public Filter.PortFromClosePilot_C get_PortFromClosePilot() {
        return PortFromClosePilot;
    }
    
    //## auto_generated 
    public Filter.PortFromClosePilot_C newPortFromClosePilot() {
        PortFromClosePilot = new Filter.PortFromClosePilot_C();
        return PortFromClosePilot;
    }
    
    //## auto_generated 
    public void deletePortFromClosePilot() {
        PortFromClosePilot=null;
    }
    
    //## auto_generated 
    public Filter.PortFromInhib_C getPortFromInhib() {
        return PortFromInhib;
    }
    
    //## auto_generated 
    public Filter.PortFromInhib_C get_PortFromInhib() {
        return PortFromInhib;
    }
    
    //## auto_generated 
    public Filter.PortFromInhib_C newPortFromInhib() {
        PortFromInhib = new Filter.PortFromInhib_C();
        return PortFromInhib;
    }
    
    //## auto_generated 
    public void deletePortFromInhib() {
        PortFromInhib=null;
    }
    
    //## operation Close() 
    public void Close() {
        try {
            animInstance().notifyMethodEntered("Close",
               new ArgData[] {
               });
        
        //#[ operation Close() 
        getPortToCommand().gen(new Close_Button());   
        N_Pressed = 1;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Interrupt() 
    public void Interrupt() {
        try {
            animInstance().notifyMethodEntered("Interrupt",
               new ArgData[] {
               });
        
        //#[ operation Interrupt() 
        getPortToCommand().gen(new Interrupt());
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
        getPortToCommand().gen(new Open_Button());   
        N_Pressed = 1;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Wait() 
    public void Wait() {
        try {
            animInstance().notifyMethodEntered("Wait",
               new ArgData[] {
               });
        
        //#[ operation Wait() 
        if(Inhib_In_Queue == true){
        	getPortFromOpenOutside().gen(new Inhib());
        	getPortFromCloseOutside().gen(new Inhib());
        	Inhib_In_Queue = false;
        }             
        N_Pressed = 0;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public boolean getInhib_In_Queue() {
        return Inhib_In_Queue;
    }
    
    //## auto_generated 
    public void setInhib_In_Queue(boolean p_Inhib_In_Queue) {
        Inhib_In_Queue = p_Inhib_In_Queue;
    }
    
    //## auto_generated 
    public int getN_Pressed() {
        return N_Pressed;
    }
    
    //## auto_generated 
    public void setN_Pressed(int p_N_Pressed) {
        try {
        N_Pressed = p_N_Pressed;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortToCommand = newPortToCommand();
        PortFromOpenInside = newPortFromOpenInside();
        PortFromCloseInside = newPortFromCloseInside();
        PortFromOpenOutside = newPortFromOpenOutside();
        PortFromCloseOutside = newPortFromCloseOutside();
        PortFromOpenPilot = newPortFromOpenPilot();
        PortFromClosePilot = newPortFromClosePilot();
        PortFromInhib = newPortFromInhib();
        if(getPortToCommand() != null)
           getPortToCommand().connectFilter(this);
        if(getPortFromOpenInside() != null)
           getPortFromOpenInside().connectFilter(this);
        if(getPortFromCloseInside() != null)
           getPortFromCloseInside().connectFilter(this);
        if(getPortFromOpenOutside() != null)
           getPortFromOpenOutside().connectFilter(this);
        if(getPortFromCloseOutside() != null)
           getPortFromCloseOutside().connectFilter(this);
        if(getPortFromOpenPilot() != null)
           getPortFromOpenPilot().connectFilter(this);
        if(getPortFromClosePilot() != null)
           getPortFromClosePilot().connectFilter(this);
        if(getPortFromInhib() != null)
           getPortFromInhib().connectFilter(this);
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
                case Locked:
                {
                    Locked_add(animStates);
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
                case Locked:
                {
                    res = Locked_takeEvent(id);
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
        public void Send_Open_add(AnimStates animStates) {
            animStates.add("ROOT.Send_Open");
        }
        
        //## statechart_method 
        public void Send_Close_add(AnimStates animStates) {
            animStates.add("ROOT.Send_Close");
        }
        
        //## statechart_method 
        public void Locked_add(AnimStates animStates) {
            animStates.add("ROOT.Locked");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int LockedTakeRelease_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 9 
            if(N_Pressed == 1)
                {
                    animInstance().notifyTransitionStarted("9");
                    Locked_exit();
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("9");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("12");
                    Locked_exit();
                    //#[ transition 12 
                    N_Pressed -= 1;
                    //#]
                    Locked_entDef();
                    animInstance().notifyTransitionEnded("12");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void LockedExit() {
        }
        
        //## statechart_method 
        public int Send_OpenTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            Send_Open_exit();
            //#[ transition 15 
            Inhib_In_Queue = true;
            //#]
            Send_Open_entDef();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_Open_exit() {
            Send_OpenExit();
            animInstance().notifyStateExited("ROOT.Send_Open");
        }
        
        //## statechart_method 
        public int Send_CloseTakeRelease_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Send_Close_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_Close_exit() {
            Send_CloseExit();
            animInstance().notifyStateExited("ROOT.Send_Close");
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
        public int LockedTakeOpen_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            Locked_exit();
            //#[ transition 10 
            N_Pressed += 1;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Send_CloseTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            Send_Close_exit();
            //#[ transition 14 
            Inhib_In_Queue = true;
            //#]
            Send_Close_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int LockedTakeClose_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            Locked_exit();
            //#[ transition 11 
            N_Pressed += 1;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            Waiting_exit();
            //#[ transition 16 
            Inhib_In_Queue = true;
            //#]
            Waiting_entDef();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Send_Close_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Close_Button.Close_Button_Default_id))
                {
                    res = Send_CloseTakeClose_Button();
                }
            else if(event.isTypeOf(Release_Button.Release_Button_Default_id))
                {
                    res = Send_CloseTakeRelease_Button();
                }
            else if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = Send_CloseTakeInhib();
                }
            else if(event.isTypeOf(Open_Button.Open_Button_Default_id))
                {
                    res = Send_CloseTakeOpen_Button();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
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
        public void Locked_enter() {
            animInstance().notifyStateEntered("ROOT.Locked");
            rootState_subState = Locked;
            rootState_active = Locked;
            LockedEnter();
        }
        
        //## statechart_method 
        public void LockedEnter() {
        }
        
        //## statechart_method 
        public int Send_CloseTakeClose_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Send_Close_exit();
            //#[ transition 8 
            N_Pressed = 2;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_CloseExit() {
            //#[ state Send_Close.(Exit) 
            Interrupt();
            //#]
        }
        
        //## statechart_method 
        public int Locked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Close_Button.Close_Button_Default_id))
                {
                    res = LockedTakeClose_Button();
                }
            else if(event.isTypeOf(Release_Button.Release_Button_Default_id))
                {
                    res = LockedTakeRelease_Button();
                }
            else if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = LockedTakeInhib();
                }
            else if(event.isTypeOf(Open_Button.Open_Button_Default_id))
                {
                    res = LockedTakeOpen_Button();
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
            if(event.isTypeOf(Close_Button.Close_Button_Default_id))
                {
                    res = Send_OpenTakeClose_Button();
                }
            else if(event.isTypeOf(Release_Button.Release_Button_Default_id))
                {
                    res = Send_OpenTakeRelease_Button();
                }
            else if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = Send_OpenTakeInhib();
                }
            else if(event.isTypeOf(Open_Button.Open_Button_Default_id))
                {
                    res = Send_OpenTakeOpen_Button();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void WaitingEnter() {
            //#[ state Waiting.(Entry) 
            Wait();
            //#]
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
            if(event.isTypeOf(Close_Button.Close_Button_Default_id))
                {
                    res = WaitingTakeClose_Button();
                }
            else if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = WaitingTakeInhib();
                }
            else if(event.isTypeOf(Open_Button.Open_Button_Default_id))
                {
                    res = WaitingTakeOpen_Button();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Locked_exit() {
            LockedExit();
            animInstance().notifyStateExited("ROOT.Locked");
        }
        
        //## statechart_method 
        public int Send_CloseTakeOpen_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Send_Close_exit();
            //#[ transition 5 
            N_Pressed = 2;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeOpen_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            Waiting_exit();
            Send_Open_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Send_OpenTakeClose_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            Send_Open_exit();
            //#[ transition 7 
            N_Pressed = 2;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_OpenExit() {
            //#[ state Send_Open.(Exit) 
            Interrupt();
            //#]
        }
        
        //## statechart_method 
        public void Waiting_exit() {
            WaitingExit();
            animInstance().notifyStateExited("ROOT.Waiting");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("6");
            Waiting_entDef();
            animInstance().notifyTransitionEnded("6");
        }
        
        //## statechart_method 
        public int Send_OpenTakeOpen_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Send_Open_exit();
            //#[ transition 4 
            N_Pressed = 2;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeClose_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Waiting_exit();
            Send_Close_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void WaitingExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int LockedTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            Locked_exit();
            //#[ transition 13 
            Inhib_In_Queue = true;
            //#]
            Locked_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Send_OpenEnter() {
            //#[ state Send_Open.(Entry) 
            Open();
            //#]
        }
        
        //## statechart_method 
        public void Locked_entDef() {
            Locked_enter();
        }
        
        //## statechart_method 
        public void Send_CloseEnter() {
            //#[ state Send_Close.(Entry) 
            Close();
            //#]
        }
        
        //## statechart_method 
        public int Send_OpenTakeRelease_Button() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Send_Open_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return Filter.this.animInstance(); 
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
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromOpenInside_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromOpenInside_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromCloseInside_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromCloseInside_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromOpenOutside_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromOpenOutside_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromCloseOutside_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromCloseOutside_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromOpenPilot_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromOpenPilot_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromClosePilot_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromClosePilot_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
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
    public class PortFromInhib_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromInhib_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFilter(Filter) 
        public void connectFilter(Filter part) {
            //#[ operation connectFilter(Filter) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFilter; 
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
        
        msg.add("N_Pressed", N_Pressed);
        msg.add("Inhib_In_Queue", Inhib_In_Queue);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Filter.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Filter.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Filter.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Filter.java
*********************************************************************/

