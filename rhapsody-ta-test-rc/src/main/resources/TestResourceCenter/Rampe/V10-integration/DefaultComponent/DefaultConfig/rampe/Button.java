/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Button.java
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
// rampe/Button.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Button 
public class Button implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassButton = new AnimClass("rampe.Button",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Button.in_C in;		//## ignore 
    
    protected Button.out_C out;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_1=1;
    public static final int state_0=2;
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
    public  Button(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassButton.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Button");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Button.in_C getIn() {
        return in;
    }
    
    //## auto_generated 
    public Button.in_C get_in() {
        return in;
    }
    
    //## auto_generated 
    public Button.in_C newIn() {
        in = new Button.in_C();
        return in;
    }
    
    //## auto_generated 
    public void deleteIn() {
        in=null;
    }
    
    //## auto_generated 
    public Button.out_C getOut() {
        return out;
    }
    
    //## auto_generated 
    public Button.out_C get_out() {
        return out;
    }
    
    //## auto_generated 
    public Button.out_C newOut() {
        out = new Button.out_C();
        return out;
    }
    
    //## auto_generated 
    public void deleteOut() {
        out=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        in = newIn();
        out = newOut();
        if(getIn() != null)
           getIn().connectButton(this);
        if(getOut() != null)
           getOut().connectButton(this);
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
                case state_0:
                {
                    state_0_add(animStates);
                }
                break;
                case state_1:
                {
                    state_1_add(animStates);
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
            if(rootState_active == state_0)
                {
                    res = state_0_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_1_add(AnimStates animStates) {
            animStates.add("ROOT.state_1");
        }
        
        //## statechart_method 
        public void state_0_add(AnimStates animStates) {
            animStates.add("ROOT.state_0");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void state_1Enter() {
        }
        
        //## statechart_method 
        public int state_0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evtPush.evtPush_rampe_id))
                {
                    res = state_0TakeevtPush();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void state_0Enter() {
        }
        
        //## statechart_method 
        public void state_1_exit() {
            state_1Exit();
            animInstance().notifyStateExited("ROOT.state_1");
        }
        
        //## statechart_method 
        public void state_1_entDef() {
            state_1_enter();
        }
        
        //## statechart_method 
        public void state_0_exit() {
            state_0Exit();
            animInstance().notifyStateExited("ROOT.state_0");
        }
        
        //## statechart_method 
        public int state_0TakeevtPush() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            state_0_exit();
            //#[ transition 1 
            System.out.println("buton push");
            //#]
            state_1_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_0Exit() {
        }
        
        //## statechart_method 
        public void state_1Exit() {
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
        public void state_0_enter() {
            animInstance().notifyStateEntered("ROOT.state_0");
            rootState_subState = state_0;
            rootState_active = state_0;
            state_0Enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            state_0_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void state_1_enter() {
            animInstance().notifyStateEntered("ROOT.state_1");
            rootState_subState = state_1;
            rootState_active = state_1;
            state_1Enter();
        }
        
        //## statechart_method 
        public int state_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void state_0_entDef() {
            state_0_enter();
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
            return Button.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class in_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  in_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectButton(Button) 
        public void connectButton(Button part) {
            //#[ operation connectButton(Button) 
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
    public class out_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  out_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectButton(Button) 
        public void connectButton(Button part) {
            //#[ operation connectButton(Button) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassButton; 
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
            super(Button.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Button.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Button.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Button.java
*********************************************************************/

