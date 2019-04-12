/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button_Inhibition
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Button_Inhibition.java
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
// Default/Button_Inhibition.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Button_Inhibition 
public class Button_Inhibition implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassButton_Inhibition = new AnimClass("Default.Button_Inhibition",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Button_Inhibition.PortToOpen_C PortToOpen;		//## ignore 
    
    protected Button_Inhibition.PortToFilter_C PortToFilter;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Waiting=1;
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
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Button_Inhibition(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassButton_Inhibition.getUserClass(),
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
    public Button_Inhibition.PortToOpen_C getPortToOpen() {
        return PortToOpen;
    }
    
    //## auto_generated 
    public Button_Inhibition.PortToOpen_C get_PortToOpen() {
        return PortToOpen;
    }
    
    //## auto_generated 
    public Button_Inhibition.PortToOpen_C newPortToOpen() {
        PortToOpen = new Button_Inhibition.PortToOpen_C();
        return PortToOpen;
    }
    
    //## auto_generated 
    public void deletePortToOpen() {
        PortToOpen=null;
    }
    
    //## auto_generated 
    public Button_Inhibition.PortToFilter_C getPortToFilter() {
        return PortToFilter;
    }
    
    //## auto_generated 
    public Button_Inhibition.PortToFilter_C get_PortToFilter() {
        return PortToFilter;
    }
    
    //## auto_generated 
    public Button_Inhibition.PortToFilter_C newPortToFilter() {
        PortToFilter = new Button_Inhibition.PortToFilter_C();
        return PortToFilter;
    }
    
    //## auto_generated 
    public void deletePortToFilter() {
        PortToFilter=null;
    }
    
    //## operation Send() 
    public void Send() {
        try {
            animInstance().notifyMethodEntered("Send",
               new ArgData[] {
               });
        
        //#[ operation Send() 
        getPortToFilter().gen(new Inhib());
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortToOpen = newPortToOpen();
        PortToFilter = newPortToFilter();
        if(getPortToOpen() != null)
           getPortToOpen().connectButton_Inhibition(this);
        if(getPortToFilter() != null)
           getPortToFilter().connectButton_Inhibition(this);
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
            if(rootState_subState == Waiting)
                {
                    Waiting_add(animStates);
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
            if(rootState_active == Waiting)
                {
                    res = Waiting_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Waiting_add(AnimStates animStates) {
            animStates.add("ROOT.Waiting");
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
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
            if(event.isTypeOf(Press.Press_Default_id))
                {
                    res = WaitingTakePress();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakePress() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Waiting_exit();
            //#[ transition 1 
            Send();
            //#]
            Waiting_entDef();
            animInstance().notifyTransitionEnded("1");
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
        public void WaitingExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return Button_Inhibition.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class PortToOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortToOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectButton_Inhibition(Button_Inhibition) 
        public void connectButton_Inhibition(Button_Inhibition part) {
            //#[ operation connectButton_Inhibition(Button_Inhibition) 
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
    public class PortToFilter_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortToFilter_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectButton_Inhibition(Button_Inhibition) 
        public void connectButton_Inhibition(Button_Inhibition part) {
            //#[ operation connectButton_Inhibition(Button_Inhibition) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassButton_Inhibition; 
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
            super(Button_Inhibition.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Button_Inhibition.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Button_Inhibition.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Button_Inhibition.java
*********************************************************************/

