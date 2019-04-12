/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ElectroVanne
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/ElectroVanne.java
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
// rampe/ElectroVanne.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class ElectroVanne 
public class ElectroVanne implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassElectroVanne = new AnimClass("rampe.ElectroVanne",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected ElectroVanne.pressure_C pressure;		//## ignore 
    
    protected ElectroVanne.command_C command;		//## ignore 
    
    protected boolean isActivated = false;		//## attribute isActivated 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int OpenToClosed=1;
    public static final int Open=2;
    public static final int locked=3;
    public static final int ClosedToOpen=4;
    public static final int Closed=5;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int ElectroVanne_Timeout_OpenToClosed_id = 1;		//## ignore 
    
    public static final int ElectroVanne_Timeout_ClosedToOpen_id = 2;		//## ignore 
    
    
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
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  ElectroVanne(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassElectroVanne.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public ElectroVanne.pressure_C getPressure() {
        return pressure;
    }
    
    //## auto_generated 
    public ElectroVanne.pressure_C get_pressure() {
        return pressure;
    }
    
    //## auto_generated 
    public ElectroVanne.pressure_C newPressure() {
        pressure = new ElectroVanne.pressure_C();
        return pressure;
    }
    
    //## auto_generated 
    public void deletePressure() {
        pressure=null;
    }
    
    //## auto_generated 
    public ElectroVanne.command_C getCommand() {
        return command;
    }
    
    //## auto_generated 
    public ElectroVanne.command_C get_command() {
        return command;
    }
    
    //## auto_generated 
    public ElectroVanne.command_C newCommand() {
        command = new ElectroVanne.command_C();
        return command;
    }
    
    //## auto_generated 
    public void deleteCommand() {
        command=null;
    }
    
    //## auto_generated 
    public boolean getIsActivated() {
        return isActivated;
    }
    
    //## auto_generated 
    public void setIsActivated(boolean p_isActivated) {
        isActivated = p_isActivated;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        pressure = newPressure();
        command = newCommand();
        if(getPressure() != null)
           getPressure().connectElectroVanne(this);
        if(getCommand() != null)
           getCommand().connectElectroVanne(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
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
                case Closed:
                {
                    Closed_add(animStates);
                }
                break;
                case Open:
                {
                    Open_add(animStates);
                }
                break;
                case ClosedToOpen:
                {
                    ClosedToOpen_add(animStates);
                }
                break;
                case OpenToClosed:
                {
                    OpenToClosed_add(animStates);
                }
                break;
                case locked:
                {
                    locked_add(animStates);
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
                case Closed:
                {
                    res = Closed_takeEvent(id);
                }
                break;
                case Open:
                {
                    res = Open_takeEvent(id);
                }
                break;
                case ClosedToOpen:
                {
                    res = ClosedToOpen_takeEvent(id);
                }
                break;
                case OpenToClosed:
                {
                    res = OpenToClosed_takeEvent(id);
                }
                break;
                case locked:
                {
                    res = locked_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void OpenToClosed_add(AnimStates animStates) {
            animStates.add("ROOT.OpenToClosed");
        }
        
        //## statechart_method 
        public void Open_add(AnimStates animStates) {
            animStates.add("ROOT.Open");
        }
        
        //## statechart_method 
        public void locked_add(AnimStates animStates) {
            animStates.add("ROOT.locked");
        }
        
        //## statechart_method 
        public void ClosedToOpen_add(AnimStates animStates) {
            animStates.add("ROOT.ClosedToOpen");
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
        public void lockedEnter() {
        }
        
        //## statechart_method 
        public void Open_exit() {
            popNullConfig();
            OpenExit();
            animInstance().notifyStateExited("ROOT.Open");
        }
        
        //## statechart_method 
        public void OpenExit() {
        }
        
        //## statechart_method 
        public void Closed_exit() {
            ClosedExit();
            animInstance().notifyStateExited("ROOT.Closed");
        }
        
        //## statechart_method 
        public int Closed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtActivateEV.evtActivateEV_rampe_id))
                {
                    res = ClosedTakeevtActivateEV();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ClosedToOpenEnter() {
            itsRiJThread.schedTimeout(1000, ElectroVanne_Timeout_ClosedToOpen_id, this, "ROOT.ClosedToOpen");
        }
        
        //## statechart_method 
        public int ClosedToOpenTakeevtDesactivateEV() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            ClosedToOpen_exit();
            locked_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void locked_exit() {
            lockedExit();
            animInstance().notifyStateExited("ROOT.locked");
        }
        
        //## statechart_method 
        public int OpenTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Open_exit();
            OpenToClosed_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int OpenToClosedTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == ElectroVanne_Timeout_OpenToClosed_id)
                {
                    animInstance().notifyTransitionStarted("3");
                    OpenToClosed_exit();
                    Closed_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void OpenToClosedEnter() {
            itsRiJThread.schedTimeout(3600, ElectroVanne_Timeout_OpenToClosed_id, this, "ROOT.OpenToClosed");
        }
        
        //## statechart_method 
        public int ClosedToOpenTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == ElectroVanne_Timeout_ClosedToOpen_id)
                {
                    animInstance().notifyTransitionStarted("1");
                    ClosedToOpen_exit();
                    Open_entDef();
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int OpenToClosedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            OpenToClosed_exit();
            locked_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void OpenToClosedExit() {
            itsRiJThread.unschedTimeout(ElectroVanne_Timeout_OpenToClosed_id, this);
        }
        
        //## statechart_method 
        public int ClosedTakeevtActivateEV() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            Closed_exit();
            ClosedToOpen_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ClosedToOpen_exit() {
            ClosedToOpenExit();
            animInstance().notifyStateExited("ROOT.ClosedToOpen");
        }
        
        //## statechart_method 
        public void ClosedToOpen_enter() {
            animInstance().notifyStateEntered("ROOT.ClosedToOpen");
            rootState_subState = ClosedToOpen;
            rootState_active = ClosedToOpen;
            ClosedToOpenEnter();
        }
        
        //## statechart_method 
        public void OpenToClosed_entDef() {
            OpenToClosed_enter();
        }
        
        //## statechart_method 
        public void ClosedToOpenExit() {
            itsRiJThread.unschedTimeout(ElectroVanne_Timeout_ClosedToOpen_id, this);
        }
        
        //## statechart_method 
        public void OpenToClosed_exit() {
            popNullConfig();
            OpenToClosedExit();
            animInstance().notifyStateExited("ROOT.OpenToClosed");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void ClosedToOpen_entDef() {
            ClosedToOpen_enter();
        }
        
        //## statechart_method 
        public void lockedExit() {
        }
        
        //## statechart_method 
        public void locked_enter() {
            animInstance().notifyStateEntered("ROOT.locked");
            rootState_subState = locked;
            rootState_active = locked;
            lockedEnter();
        }
        
        //## statechart_method 
        public void Open_enter() {
            animInstance().notifyStateEntered("ROOT.Open");
            pushNullConfig();
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
        public void Closed_entDef() {
            Closed_enter();
        }
        
        //## statechart_method 
        public int OpenToClosed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = OpenToClosedTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = OpenToClosedTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ClosedExit() {
        }
        
        //## statechart_method 
        public void locked_entDef() {
            locked_enter();
        }
        
        //## statechart_method 
        public void Open_entDef() {
            Open_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("6");
            Closed_entDef();
            animInstance().notifyTransitionEnded("6");
        }
        
        //## statechart_method 
        public void Closed_enter() {
            animInstance().notifyStateEntered("ROOT.Closed");
            rootState_subState = Closed;
            rootState_active = Closed;
            ClosedEnter();
        }
        
        //## statechart_method 
        public int Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = OpenTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void OpenEnter() {
            //#[ state Open.(Entry) 
            getPressure().gen(new evtPressureOn());
            //#]
        }
        
        //## statechart_method 
        public void OpenToClosed_enter() {
            animInstance().notifyStateEntered("ROOT.OpenToClosed");
            pushNullConfig();
            rootState_subState = OpenToClosed;
            rootState_active = OpenToClosed;
            OpenToClosedEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void ClosedEnter() {
            //#[ state Closed.(Entry) 
            getPressure().gen(new evtPressureOff());
            //#]
        }
        
        //## statechart_method 
        public int locked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int ClosedToOpen_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ClosedToOpenTakeRiJTimeout();
                }
            else if(event.isTypeOf(evtDesactivateEV.evtDesactivateEV_rampe_id))
                {
                    res = ClosedToOpenTakeevtDesactivateEV();
                }
            
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
            return ElectroVanne.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class pressure_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  pressure_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectElectroVanne(ElectroVanne) 
        public void connectElectroVanne(ElectroVanne part) {
            //#[ operation connectElectroVanne(ElectroVanne) 
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
    public class command_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  command_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectElectroVanne(ElectroVanne) 
        public void connectElectroVanne(ElectroVanne part) {
            //#[ operation connectElectroVanne(ElectroVanne) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassElectroVanne; 
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
        
        msg.add("isActivated", isActivated);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(ElectroVanne.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            ElectroVanne.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            ElectroVanne.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/ElectroVanne.java
*********************************************************************/

