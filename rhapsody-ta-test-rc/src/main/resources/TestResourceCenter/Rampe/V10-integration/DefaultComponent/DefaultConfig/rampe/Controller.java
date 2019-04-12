/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Controller
//!	Generated Date	: Wed, 20, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Controller.java
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
// rampe/Controller.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Controller 
public class Controller implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassController = new AnimClass("rampe.Controller",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Controller.lock_C lock;		//## ignore 
    
    protected Controller.open_C open;		//## ignore 
    
    protected Controller.close_C close;		//## ignore 
    
    protected Controller.buttons_C buttons;		//## ignore 
    
    protected static final int CLOSE = 2;		//## attribute CLOSE 
    
    protected static final int OPEN = 1;		//## attribute OPEN 
    
    protected static final int STANDBY = 3;		//## attribute STANDBY 
    
    protected int buttonResult = 0;		//## attribute buttonResult 
    
    protected boolean isExternalInhibited = false;		//## attribute isExternalInhibited 
    
    protected boolean isInhibitionDeferred;		//## attribute isInhibitionDeferred 
    
    protected Data itsData;		//## link itsData 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_7=1;
    public static final int state_9=2;
    public static final int Inhibition=3;
    public static final int state_8=4;
    public static final int Waiting=5;
    public static final int Unlocking=6;
    public static final int Opening=7;
    public static final int Locking=8;
    public static final int Closing=9;
    public static final int Error=10;
    public static final int Conflicted=11;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_9_subState;		//## ignore 
    
    protected int state_9_active;		//## ignore 
    
    protected int state_8_subState;		//## ignore 
    
    protected int state_8_active;		//## ignore 
    
    public static final int Controller_Timeout_Unlocking_id = 1;		//## ignore 
    
    public static final int Controller_Timeout_Opening_id = 2;		//## ignore 
    
    public static final int Controller_Timeout_Locking_id = 3;		//## ignore 
    
    public static final int Controller_Timeout_Closing_id = 4;		//## ignore 
    
    
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
    public  Controller(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassController.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Controller");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Controller.lock_C getLock() {
        return lock;
    }
    
    //## auto_generated 
    public Controller.lock_C get_lock() {
        return lock;
    }
    
    //## auto_generated 
    public Controller.lock_C newLock() {
        lock = new Controller.lock_C();
        return lock;
    }
    
    //## auto_generated 
    public void deleteLock() {
        lock=null;
    }
    
    //## auto_generated 
    public Controller.open_C getOpen() {
        return open;
    }
    
    //## auto_generated 
    public Controller.open_C get_open() {
        return open;
    }
    
    //## auto_generated 
    public Controller.open_C newOpen() {
        open = new Controller.open_C();
        return open;
    }
    
    //## auto_generated 
    public void deleteOpen() {
        open=null;
    }
    
    //## auto_generated 
    public Controller.close_C getClose() {
        return close;
    }
    
    //## auto_generated 
    public Controller.close_C get_close() {
        return close;
    }
    
    //## auto_generated 
    public Controller.close_C newClose() {
        close = new Controller.close_C();
        return close;
    }
    
    //## auto_generated 
    public void deleteClose() {
        close=null;
    }
    
    //## auto_generated 
    public Controller.buttons_C getButtons() {
        return buttons;
    }
    
    //## auto_generated 
    public Controller.buttons_C get_buttons() {
        return buttons;
    }
    
    //## auto_generated 
    public Controller.buttons_C newButtons() {
        buttons = new Controller.buttons_C();
        return buttons;
    }
    
    //## auto_generated 
    public void deleteButtons() {
        buttons=null;
    }
    
    //## operation buttonFilter() 
    public int buttonFilter() {
        try {
            animInstance().notifyMethodEntered("buttonFilter",
               new ArgData[] {
               });
        
        //#[ operation buttonFilter() 
        if (itsData.dde_relevement_pilote 
        	|| itsData.dde_relevement_internal 
        	|| (itsData.dde_relevement_external && !this.isExternalInhibited))
        	return this.CLOSE;  
        if (itsData.dde_abaissement_pilote 
        	|| itsData.dde_abaissement_internal 
        	|| (itsData.dde_abaissement_external && !this.isExternalInhibited))
        	return this.OPEN;
        return this.STANDBY;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation countPressedButtons() 
    public int countPressedButtons() {
        try {
            animInstance().notifyMethodEntered("countPressedButtons",
               new ArgData[] {
               });
        
        //#[ operation countPressedButtons() 
        int count = 0;
        if (itsData.dde_relevement_pilote) count++;
        if (itsData.dde_relevement_internal) count++;
        if (itsData.dde_relevement_external && !this.isExternalInhibited) count++; 
        
        if (itsData.dde_abaissement_pilote) count++;
        if (itsData.dde_abaissement_internal) count++;
        if (itsData.dde_abaissement_external && !this.isExternalInhibited) count++; 
        
        return count;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param minBound
     * @param maxBound
    */
    //## operation xwait(int,int) 
    public void xwait(int minBound, int maxBound) {
        try {
            animInstance().notifyMethodEntered("xwait",
               new ArgData[] {
                   new ArgData(int.class, "minBound", AnimInstance.animToString(minBound)),
                   new ArgData(int.class, "maxBound", AnimInstance.animToString(maxBound))
               });
        
        //#[ operation xwait(int,int) 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    private static final int getCLOSE() {
        return CLOSE;
    }
    
    //## auto_generated 
    private static final int getOPEN() {
        return OPEN;
    }
    
    //## auto_generated 
    private static final int getSTANDBY() {
        return STANDBY;
    }
    
    //## auto_generated 
    public int getButtonResult() {
        return buttonResult;
    }
    
    //## auto_generated 
    public void setButtonResult(int p_buttonResult) {
        buttonResult = p_buttonResult;
    }
    
    //## auto_generated 
    private boolean getIsExternalInhibited() {
        return isExternalInhibited;
    }
    
    //## auto_generated 
    private void setIsExternalInhibited(boolean p_isExternalInhibited) {
        isExternalInhibited = p_isExternalInhibited;
    }
    
    //## auto_generated 
    private boolean getIsInhibitionDeferred() {
        return isInhibitionDeferred;
    }
    
    //## auto_generated 
    private void setIsInhibitionDeferred(boolean p_isInhibitionDeferred) {
        isInhibitionDeferred = p_isInhibitionDeferred;
    }
    
    //## auto_generated 
    public Data getItsData() {
        return itsData;
    }
    
    //## auto_generated 
    public void setItsData(Data p_Data) {
        itsData = p_Data;
        if(p_Data != null)
            {
                animInstance().notifyRelationAdded("itsData", p_Data);
            }
        else
            {
                animInstance().notifyRelationCleared("itsData");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        lock = newLock();
        open = newOpen();
        close = newClose();
        buttons = newButtons();
        if(getLock() != null)
           getLock().connectController(this);
        if(getOpen() != null)
           getOpen().connectController(this);
        if(getClose() != null)
           getClose().connectController(this);
        if(getButtons() != null)
           getButtons().connectController(this);
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
            if(state_8 == state)
                {
                    return isIn(state_7);
                }
            if(state_8_subState == state)
                {
                    return true;
                }
            if(state_9 == state)
                {
                    return isIn(state_7);
                }
            if(state_9_subState == state)
                {
                    return true;
                }
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
                case Conflicted:
                {
                    Conflicted_add(animStates);
                }
                break;
                case Error:
                {
                    Error_add(animStates);
                }
                break;
                case state_7:
                {
                    state_7_add(animStates);
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
                case Conflicted:
                {
                    res = Conflicted_takeEvent(id);
                }
                break;
                case Error:
                {
                    res = Error_takeEvent(id);
                }
                break;
                case state_7:
                {
                    res = state_7_dispatchEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_7_add(AnimStates animStates) {
            animStates.add("ROOT.state_7");
            state_8_add(animStates);
            state_9_add(animStates);
        }
        
        //## statechart_method 
        public int state_7_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_8_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(state_7))
                        {
                            return res;
                        }
                }
            if(state_9_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(state_7))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_9_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_9");
            if(state_9_subState == Inhibition)
                {
                    Inhibition_add(animStates);
                }
        }
        
        //## statechart_method 
        public int state_9_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_9_active == Inhibition)
                {
                    res = Inhibition_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Inhibition_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_9.Inhibition");
        }
        
        //## statechart_method 
        public void state_8_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8");
            switch (state_8_subState) {
                case Closing:
                {
                    Closing_add(animStates);
                }
                break;
                case Locking:
                {
                    Locking_add(animStates);
                }
                break;
                case Unlocking:
                {
                    Unlocking_add(animStates);
                }
                break;
                case Waiting:
                {
                    Waiting_add(animStates);
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
        public int state_8_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_8_active) {
                case Closing:
                {
                    res = Closing_takeEvent(id);
                }
                break;
                case Locking:
                {
                    res = Locking_takeEvent(id);
                }
                break;
                case Unlocking:
                {
                    res = Unlocking_takeEvent(id);
                }
                break;
                case Waiting:
                {
                    res = Waiting_takeEvent(id);
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
        public void Waiting_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8.Waiting");
        }
        
        //## statechart_method 
        public void Unlocking_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8.Unlocking");
        }
        
        //## statechart_method 
        public void Opening_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8.Opening");
        }
        
        //## statechart_method 
        public void Locking_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8.Locking");
        }
        
        //## statechart_method 
        public void Closing_add(AnimStates animStates) {
            animStates.add("ROOT.state_7.state_8.Closing");
        }
        
        //## statechart_method 
        public void Error_add(AnimStates animStates) {
            animStates.add("ROOT.Error");
        }
        
        //## statechart_method 
        public void Conflicted_add(AnimStates animStates) {
            animStates.add("ROOT.Conflicted");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_9_subState = RiJNonState;
            state_9_active = RiJNonState;
            state_8_subState = RiJNonState;
            state_8_active = RiJNonState;
        }
        
        //## statechart_method 
        public int Conflicted_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ConflictedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Error_exit() {
            ErrorExit();
            animInstance().notifyStateExited("ROOT.Error");
        }
        
        //## statechart_method 
        public void ClosingExit() {
            itsRiJThread.unschedTimeout(Controller_Timeout_Closing_id, this);
            //#[ state state_7.state_8.Closing.(Exit) 
            itsData.cde_relevement = false;
            //#]
        }
        
        //## statechart_method 
        public int OpeningTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 2 
            if(itsData.cr_rampe_ouverte)
                {
                    animInstance().notifyTransitionStarted("2");
                    Opening_exit();
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 20 
                    if(countPressedButtons() == 0)
                        {
                            animInstance().notifyTransitionStarted("20");
                            Opening_exit();
                            Waiting_entDef();
                            animInstance().notifyTransitionEnded("20");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void state_8_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8");
            state_8Enter();
        }
        
        //## statechart_method 
        public int ConflictedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 15 
            if(countPressedButtons() <= 1)
                {
                    animInstance().notifyTransitionStarted("15");
                    Conflicted_exit();
                    state_7_entDef();
                    animInstance().notifyTransitionEnded("15");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Locking_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = LockingTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = LockingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_8_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int LockingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Controller_Timeout_Locking_id)
                {
                    animInstance().notifyTransitionStarted("12");
                    state_7_exit();
                    //#[ transition 12 
                    xwait(30,30);
                    //#]
                    Error_entDef();
                    animInstance().notifyTransitionEnded("12");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Locking_exit() {
            popNullConfig();
            LockingExit();
            animInstance().notifyStateExited("ROOT.state_7.state_8.Locking");
        }
        
        //## statechart_method 
        public void Unlocking_entDef() {
            Unlocking_enter();
        }
        
        //## statechart_method 
        public void state_9_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_9");
            state_9Enter();
        }
        
        //## statechart_method 
        public void ConflictedEnter() {
            //#[ state Conflicted.(Entry) 
            itsData.sig_alerte_conflit = true;
            //#]
        }
        
        //## statechart_method 
        public void Conflicted_entDef() {
            Conflicted_enter();
        }
        
        //## statechart_method 
        public void Closing_entDef() {
            Closing_enter();
        }
        
        //## statechart_method 
        public void Waiting_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8.Waiting");
            pushNullConfig();
            state_8_subState = Waiting;
            state_8_active = Waiting;
            WaitingEnter();
        }
        
        //## statechart_method 
        public void state_9_entDef() {
            state_9_enter();
            state_9EntDef();
        }
        
        //## statechart_method 
        public void ClosingEnter() {
            //#[ state state_7.state_8.Closing.(Entry) 
            itsData.cde_relevement = true;
            //#]
            itsRiJThread.schedTimeout(1200, Controller_Timeout_Closing_id, this, "ROOT.state_7.state_8.Closing");
        }
        
        //## statechart_method 
        public void state_8EntDef() {
            animInstance().notifyTransitionStarted("14");
            Waiting_entDef();
            animInstance().notifyTransitionEnded("14");
        }
        
        //## statechart_method 
        public void InhibitionExit() {
        }
        
        //## statechart_method 
        public int state_9_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void ConflictedExit() {
            //#[ state Conflicted.(Exit) 
            itsData.sig_alerte_conflit = false;
            //#]
        }
        
        //## statechart_method 
        public void ErrorExit() {
            //#[ state Error.(Exit) 
            itsData.sig_alerte_tempo = false;
            //#]
        }
        
        //## statechart_method 
        public void Opening_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8.Opening");
            pushNullConfig();
            state_8_subState = Opening;
            state_8_active = Opening;
            OpeningEnter();
        }
        
        //## statechart_method 
        public void Unlocking_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8.Unlocking");
            pushNullConfig();
            state_8_subState = Unlocking;
            state_8_active = Unlocking;
            UnlockingEnter();
        }
        
        //## statechart_method 
        public void state_9EntDef() {
            animInstance().notifyTransitionStarted("17");
            Inhibition_entDef();
            animInstance().notifyTransitionEnded("17");
        }
        
        //## statechart_method 
        public void Conflicted_exit() {
            popNullConfig();
            ConflictedExit();
            animInstance().notifyStateExited("ROOT.Conflicted");
        }
        
        //## statechart_method 
        public int ClosingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Controller_Timeout_Closing_id)
                {
                    animInstance().notifyTransitionStarted("11");
                    state_7_exit();
                    //#[ transition 11 
                    //wait(120,120);
                    //#]
                    Error_entDef();
                    animInstance().notifyTransitionEnded("11");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Closing_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8.Closing");
            pushNullConfig();
            state_8_subState = Closing;
            state_8_active = Closing;
            ClosingEnter();
        }
        
        //## statechart_method 
        public int UnlockingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Controller_Timeout_Unlocking_id)
                {
                    animInstance().notifyTransitionStarted("10");
                    state_7_exit();
                    //#[ transition 10 
                    //wait(30,30);
                    //#]
                    Error_entDef();
                    animInstance().notifyTransitionEnded("10");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 5 
            if(buttonResult == CLOSE && itsData.cr_rampe_fermee && itsData.cr_verrou_verrouille)
                {
                    animInstance().notifyTransitionStarted("16");
                    animInstance().notifyTransitionStarted("5");
                    Waiting_exit();
                    //#[ transition 16 
                    buttonResult = buttonFilter();
                    //#]
                    Locking_entDef();
                    animInstance().notifyTransitionEnded("5");
                    animInstance().notifyTransitionEnded("16");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 6 
                    if(buttonResult == CLOSE && !itsData.cr_rampe_fermee)
                        {
                            animInstance().notifyTransitionStarted("16");
                            animInstance().notifyTransitionStarted("6");
                            Waiting_exit();
                            //#[ transition 16 
                            buttonResult = buttonFilter();
                            //#]
                            Closing_entDef();
                            animInstance().notifyTransitionEnded("6");
                            animInstance().notifyTransitionEnded("16");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 1 
                            if(buttonResult == OPEN && !itsData.cr_verrou_deverrouille)
                                {
                                    animInstance().notifyTransitionStarted("16");
                                    animInstance().notifyTransitionStarted("1");
                                    Waiting_exit();
                                    //#[ transition 16 
                                    buttonResult = buttonFilter();
                                    //#]
                                    Unlocking_entDef();
                                    animInstance().notifyTransitionEnded("1");
                                    animInstance().notifyTransitionEnded("16");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 0 
                                    if(buttonResult == OPEN && itsData.cr_verrou_deverrouille && !itsData.cr_rampe_ouverte)
                                        {
                                            animInstance().notifyTransitionStarted("16");
                                            animInstance().notifyTransitionStarted("0");
                                            Waiting_exit();
                                            //#[ transition 16 
                                            buttonResult = buttonFilter();
                                            //#]
                                            Opening_entDef();
                                            animInstance().notifyTransitionEnded("0");
                                            animInstance().notifyTransitionEnded("16");
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            animInstance().notifyTransitionStarted("16");
                                            animInstance().notifyTransitionStarted("19");
                                            Waiting_exit();
                                            //#[ transition 16 
                                            buttonResult = buttonFilter();
                                            //#]
                                            Waiting_entDef();
                                            animInstance().notifyTransitionEnded("19");
                                            animInstance().notifyTransitionEnded("16");
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public int Inhibition_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = InhibitionTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_9_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Closing_exit() {
            popNullConfig();
            ClosingExit();
            animInstance().notifyStateExited("ROOT.state_7.state_8.Closing");
        }
        
        //## statechart_method 
        public void OpeningEnter() {
            //#[ state state_7.state_8.Opening.(Entry) 
            itsData.cde_abaissement = true;
            //#]
            itsRiJThread.schedTimeout(1200, Controller_Timeout_Opening_id, this, "ROOT.state_7.state_8.Opening");
        }
        
        //## statechart_method 
        public int InhibitionTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 18 
            if(itsData.dde_inhibit_external)
                {
                    animInstance().notifyTransitionStarted("18");
                    Inhibition_exit();
                    //#[ transition 18 
                    isExternalInhibited = !isExternalInhibited;
                    itsData.dde_inhibit_external = false;
                    //#]
                    Inhibition_entDef();
                    animInstance().notifyTransitionEnded("18");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Error_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Opening_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = OpeningTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = OpeningTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_8_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int OpeningTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Controller_Timeout_Opening_id)
                {
                    animInstance().notifyTransitionStarted("3");
                    state_7_exit();
                    //#[ transition 3 
                    //wait(120,120);
                    //#]
                    Error_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int UnlockingTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 4 
            if(itsData.cr_verrou_deverrouille)
                {
                    animInstance().notifyTransitionStarted("4");
                    Unlocking_exit();
                    Opening_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 21 
                    if(countPressedButtons() == 0)
                        {
                            animInstance().notifyTransitionStarted("21");
                            Unlocking_exit();
                            Waiting_entDef();
                            animInstance().notifyTransitionEnded("21");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_8_entDef();
            state_9_entDef();
        }
        
        //## statechart_method 
        public void OpeningExit() {
            itsRiJThread.unschedTimeout(Controller_Timeout_Opening_id, this);
            //#[ state state_7.state_8.Opening.(Exit) 
            itsData.cde_abaissement = false;
            //#]
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
        public int Closing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ClosingTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ClosingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_8_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void LockingExit() {
            itsRiJThread.unschedTimeout(Controller_Timeout_Locking_id, this);
            //#[ state state_7.state_8.Locking.(Exit) 
            itsData.cde_verrouillage = false;
            //#]
        }
        
        //## statechart_method 
        public void Opening_exit() {
            popNullConfig();
            OpeningExit();
            animInstance().notifyStateExited("ROOT.state_7.state_8.Opening");
        }
        
        //## statechart_method 
        public int Waiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = WaitingTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_8_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int state_8_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void InhibitionEnter() {
        }
        
        //## statechart_method 
        public void state_9Enter() {
        }
        
        //## statechart_method 
        public void UnlockingEnter() {
            //#[ state state_7.state_8.Unlocking.(Entry) 
            itsData.cde_deverrouillage = true;
            //#]
            itsRiJThread.schedTimeout(300, Controller_Timeout_Unlocking_id, this, "ROOT.state_7.state_8.Unlocking");
        }
        
        //## statechart_method 
        public void state_8Enter() {
        }
        
        //## statechart_method 
        public void Inhibition_entDef() {
            Inhibition_enter();
        }
        
        //## statechart_method 
        public void Error_enter() {
            animInstance().notifyStateEntered("ROOT.Error");
            rootState_subState = Error;
            rootState_active = Error;
            ErrorEnter();
        }
        
        //## statechart_method 
        public int ClosingTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 7 
            if(itsData.cr_rampe_fermee)
                {
                    animInstance().notifyTransitionStarted("7");
                    Closing_exit();
                    Locking_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 22 
                    if(countPressedButtons() == 0)
                        {
                            animInstance().notifyTransitionStarted("22");
                            Closing_exit();
                            Waiting_entDef();
                            animInstance().notifyTransitionEnded("22");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void Waiting_exit() {
            popNullConfig();
            WaitingExit();
            animInstance().notifyStateExited("ROOT.state_7.state_8.Waiting");
        }
        
        //## statechart_method 
        public void state_7Enter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("13");
            state_7_entDef();
            animInstance().notifyTransitionEnded("13");
        }
        
        //## statechart_method 
        public void Locking_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_8.Locking");
            pushNullConfig();
            state_8_subState = Locking;
            state_8_active = Locking;
            LockingEnter();
        }
        
        //## statechart_method 
        public void UnlockingExit() {
            itsRiJThread.unschedTimeout(Controller_Timeout_Unlocking_id, this);
            //#[ state state_7.state_8.Unlocking.(Exit) 
            itsData.cde_deverrouillage = false;
            //#]
        }
        
        //## statechart_method 
        public void Inhibition_exit() {
            popNullConfig();
            InhibitionExit();
            animInstance().notifyStateExited("ROOT.state_7.state_9.Inhibition");
        }
        
        //## statechart_method 
        public void state_9_exit() {
            if(state_9_subState == Inhibition)
                {
                    Inhibition_exit();
                }
            state_9_subState = RiJNonState;
            state_9Exit();
            animInstance().notifyStateExited("ROOT.state_7.state_9");
        }
        
        //## statechart_method 
        public void Error_entDef() {
            Error_enter();
        }
        
        //## statechart_method 
        public void Locking_entDef() {
            Locking_enter();
        }
        
        //## statechart_method 
        public void Unlocking_exit() {
            popNullConfig();
            UnlockingExit();
            animInstance().notifyStateExited("ROOT.state_7.state_8.Unlocking");
        }
        
        //## statechart_method 
        public void state_8_exit() {
            switch (state_8_subState) {
                case Closing:
                {
                    Closing_exit();
                }
                break;
                case Locking:
                {
                    Locking_exit();
                }
                break;
                case Unlocking:
                {
                    Unlocking_exit();
                }
                break;
                case Waiting:
                {
                    Waiting_exit();
                }
                break;
                case Opening:
                {
                    Opening_exit();
                }
                break;
                default:
                    break;
            }
            state_8_subState = RiJNonState;
            state_8Exit();
            animInstance().notifyStateExited("ROOT.state_7.state_8");
        }
        
        //## statechart_method 
        public void state_8_entDef() {
            state_8_enter();
            state_8EntDef();
        }
        
        //## statechart_method 
        public void ErrorEnter() {
            //#[ state Error.(Entry) 
            itsData.sig_alerte_tempo = true;
            //#]
        }
        
        //## statechart_method 
        public void Opening_entDef() {
            Opening_enter();
        }
        
        //## statechart_method 
        public void WaitingExit() {
        }
        
        //## statechart_method 
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_7TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            popNullConfig();
            state_8_exit();
            state_9_exit();
            state_7Exit();
            animInstance().notifyStateExited("ROOT.state_7");
        }
        
        //## statechart_method 
        public void state_7Exit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Conflicted_enter() {
            animInstance().notifyStateEntered("ROOT.Conflicted");
            pushNullConfig();
            rootState_subState = Conflicted;
            rootState_active = Conflicted;
            ConflictedEnter();
        }
        
        //## statechart_method 
        public void LockingEnter() {
            //#[ state state_7.state_8.Locking.(Entry) 
            itsData.cde_verrouillage = true;
            //#]
            itsRiJThread.schedTimeout(300, Controller_Timeout_Locking_id, this, "ROOT.state_7.state_8.Locking");
        }
        
        //## statechart_method 
        public void state_8Exit() {
        }
        
        //## statechart_method 
        public void Inhibition_enter() {
            animInstance().notifyStateEntered("ROOT.state_7.state_9.Inhibition");
            pushNullConfig();
            state_9_subState = Inhibition;
            state_9_active = Inhibition;
            InhibitionEnter();
        }
        
        //## statechart_method 
        public int state_7TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 9 
            if(countPressedButtons() > 1)
                {
                    animInstance().notifyTransitionStarted("9");
                    state_7_exit();
                    Conflicted_entDef();
                    animInstance().notifyTransitionEnded("9");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int LockingTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 8 
            if(itsData.cr_verrou_verrouille)
                {
                    animInstance().notifyTransitionStarted("8");
                    Locking_exit();
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("8");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 23 
                    if(countPressedButtons() == 0)
                        {
                            animInstance().notifyTransitionStarted("23");
                            Locking_exit();
                            Waiting_entDef();
                            animInstance().notifyTransitionEnded("23");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int Unlocking_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = UnlockingTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = UnlockingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_8_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_9Exit() {
        }
        
        //## statechart_method 
        public void state_7_enter() {
            animInstance().notifyStateEntered("ROOT.state_7");
            pushNullConfig();
            rootState_subState = state_7;
            rootState_active = state_7;
            state_7Enter();
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
            return Controller.this.animInstance(); 
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
        //## operation connectController(Controller) 
        public void connectController(Controller part) {
            //#[ operation connectController(Controller) 
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
    public class open_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  open_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectController(Controller) 
        public void connectController(Controller part) {
            //#[ operation connectController(Controller) 
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
        //## operation connectController(Controller) 
        public void connectController(Controller part) {
            //#[ operation connectController(Controller) 
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
    public class buttons_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  buttons_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectController(Controller) 
        public void connectController(Controller part) {
            //#[ operation connectController(Controller) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassController; 
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
        
        msg.add("OPEN", OPEN);
        msg.add("CLOSE", CLOSE);
        msg.add("STANDBY", STANDBY);
        msg.add("isExternalInhibited", isExternalInhibited);
        msg.add("buttonResult", buttonResult);
        msg.add("isInhibitionDeferred", isInhibitionDeferred);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsData", false, true, itsData);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Controller.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Controller.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Controller.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Controller.java
*********************************************************************/

