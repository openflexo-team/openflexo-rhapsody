/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: guerinsy
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Ping
//!	Generated Date	: Mon, 25, Mar 2019 
	File Path	: DefaultComponent/DefaultConfig/Default/Ping.java
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
// Default/Ping.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Ping 
public class Ping implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPing = new AnimClass("Default.Ping",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Pong unPong;		//## link unPong 
    
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
    public  Ping(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPing.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Ping");
        reactive = new Reactive(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMessagePong() 
    public void sendMessagePong() {
        try {
            animInstance().notifyMethodEntered("sendMessagePong",
               new ArgData[] {
               });
        
        //#[ operation sendMessagePong() 
        System.out.println("passage par le ping transition depart vers arrivee");   
        System.out.println("unPong="+unPong);
        unPong.gen(new receivePing());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMessageToPong() 
    public void sendMessageToPong() {
        try {
            animInstance().notifyMethodEntered("sendMessageToPong",
               new ArgData[] {
               });
        
        //#[ operation sendMessageToPong() 
        System.out.println("passage par le ping transition arrivee vers depart"); 
        System.out.println("unPong="+unPong);
        unPong.gen(new sendFromPing());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Pong getUnPong() {
        return unPong;
    }
    
    //## auto_generated 
    public void __setUnPong(Pong p_Pong) {
        unPong = p_Pong;
        if(p_Pong != null)
            {
                animInstance().notifyRelationAdded("unPong", p_Pong);
            }
        else
            {
                animInstance().notifyRelationCleared("unPong");
            }
    }
    
    //## auto_generated 
    public void _setUnPong(Pong p_Pong) {
        if(unPong != null)
            {
                unPong.__setUnPing(null);
            }
        __setUnPong(p_Pong);
    }
    
    //## auto_generated 
    public void setUnPong(Pong p_Pong) {
        if(p_Pong != null)
            {
                p_Pong._setUnPing(this);
            }
        _setUnPong(p_Pong);
    }
    
    //## auto_generated 
    public void _clearUnPong() {
        animInstance().notifyRelationCleared("unPong");
        unPong = null;
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
            if(event.isTypeOf(sendFromPong.sendFromPong_Default_id))
                {
                    res = arriveeTakesendFromPong();
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
            sendMessagePong();
            //#]
            arrivee_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int arriveeTakesendFromPong() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            arrivee_exit();
            //#[ transition 2 
            sendMessageToPong();
            //#]
            depart_entDef();
            animInstance().notifyTransitionEnded("2");
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
            return Ping.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPing; 
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
        
        msg.add("unPong", false, true, unPong);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Ping.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Ping.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Ping.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Ping.java
*********************************************************************/

