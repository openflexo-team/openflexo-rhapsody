/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: guerinsy
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pong
//!	Generated Date	: Mon, 25, Mar 2019 
	File Path	: DefaultComponent/DefaultConfig/Default/Pong.java
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
// Default/Pong.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Pong 
public class Pong implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPong = new AnimClass("Default.Pong",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Ping unPing;		//## link unPing 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int depart=1;
    public static final int arrivee=2;
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
    public  Pong(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPong.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Pong");
        reactive = new Reactive(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMessagePing() 
    public void sendMessagePing() {
        try {
            animInstance().notifyMethodEntered("sendMessagePing",
               new ArgData[] {
               });
        
        //#[ operation sendMessagePing() 
        System.out.println("Passage par le Pong");
        unPing.gen(new sendFromPong());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMessageToPing() 
    public void sendMessageToPing() {
        try {
            animInstance().notifyMethodEntered("sendMessageToPing",
               new ArgData[] {
               });
        
        //#[ operation sendMessageToPing() 
        System.out.println("Passage par le Pong dans la transition arrivee vers depart");
        unPing.gen(new receivePing());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Ping getUnPing() {
        return unPing;
    }
    
    //## auto_generated 
    public void __setUnPing(Ping p_Ping) {
        unPing = p_Ping;
        if(p_Ping != null)
            {
                animInstance().notifyRelationAdded("unPing", p_Ping);
            }
        else
            {
                animInstance().notifyRelationCleared("unPing");
            }
    }
    
    //## auto_generated 
    public void _setUnPing(Ping p_Ping) {
        if(unPing != null)
            {
                unPing.__setUnPong(null);
            }
        __setUnPing(p_Ping);
    }
    
    //## auto_generated 
    public void setUnPing(Ping p_Ping) {
        if(p_Ping != null)
            {
                p_Ping._setUnPong(this);
            }
        _setUnPing(p_Ping);
    }
    
    //## auto_generated 
    public void _clearUnPing() {
        animInstance().notifyRelationCleared("unPing");
        unPing = null;
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
                case depart:
                {
                    depart_add(animStates);
                }
                break;
                case arrivee:
                {
                    arrivee_add(animStates);
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
                case depart:
                {
                    res = depart_takeEvent(id);
                }
                break;
                case arrivee:
                {
                    res = arrivee_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void depart_add(AnimStates animStates) {
            animStates.add("ROOT.depart");
        }
        
        //## statechart_method 
        public void arrivee_add(AnimStates animStates) {
            animStates.add("ROOT.arrivee");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void arriveeEnter() {
        }
        
        //## statechart_method 
        public void departEnter() {
        }
        
        //## statechart_method 
        public void depart_entDef() {
            depart_enter();
        }
        
        //## statechart_method 
        public void arrivee_enter() {
            animInstance().notifyStateEntered("ROOT.arrivee");
            rootState_subState = arrivee;
            rootState_active = arrivee;
            arriveeEnter();
        }
        
        //## statechart_method 
        public void arrivee_exit() {
            arriveeExit();
            animInstance().notifyStateExited("ROOT.arrivee");
        }
        
        //## statechart_method 
        public void depart_exit() {
            departExit();
            animInstance().notifyStateExited("ROOT.depart");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int arriveeTakesendFromPing() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            arrivee_exit();
            //#[ transition 2 
            sendMessageToPing();
            //#]
            depart_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void arrivee_entDef() {
            arrivee_enter();
        }
        
        //## statechart_method 
        public void departExit() {
        }
        
        //## statechart_method 
        public int arrivee_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendFromPing.sendFromPing_Default_id))
                {
                    res = arriveeTakesendFromPing();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void depart_enter() {
            animInstance().notifyStateEntered("ROOT.depart");
            rootState_subState = depart;
            rootState_active = depart;
            departEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            depart_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int departTakereceivePing() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            depart_exit();
            //#[ transition 1 
            sendMessagePing();
            //#]
            arrivee_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void arriveeExit() {
        }
        
        //## statechart_method 
        public int depart_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receivePing.receivePing_Default_id))
                {
                    res = departTakereceivePing();
                }
            
            return res;
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
            return Pong.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPong; 
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
        
        msg.add("unPing", false, true, unPing);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Pong.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Pong.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Pong.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Pong.java
*********************************************************************/

