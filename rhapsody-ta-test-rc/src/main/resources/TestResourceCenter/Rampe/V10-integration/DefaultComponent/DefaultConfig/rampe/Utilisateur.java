/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Utilisateur
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Utilisateur.java
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
// rampe/Utilisateur.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Utilisateur 
public class Utilisateur implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassUtilisateur = new AnimClass("rampe.Utilisateur",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Utilisateur.toOpenButton_C toOpenButton;		//## ignore 
    
    protected Utilisateur.toCloseButton_C toCloseButton;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_0=1;
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
    public  Utilisateur(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassUtilisateur.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Utilisateur");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Utilisateur.toOpenButton_C getToOpenButton() {
        return toOpenButton;
    }
    
    //## auto_generated 
    public Utilisateur.toOpenButton_C get_toOpenButton() {
        return toOpenButton;
    }
    
    //## auto_generated 
    public Utilisateur.toOpenButton_C newToOpenButton() {
        toOpenButton = new Utilisateur.toOpenButton_C();
        return toOpenButton;
    }
    
    //## auto_generated 
    public void deleteToOpenButton() {
        toOpenButton=null;
    }
    
    //## auto_generated 
    public Utilisateur.toCloseButton_C getToCloseButton() {
        return toCloseButton;
    }
    
    //## auto_generated 
    public Utilisateur.toCloseButton_C get_toCloseButton() {
        return toCloseButton;
    }
    
    //## auto_generated 
    public Utilisateur.toCloseButton_C newToCloseButton() {
        toCloseButton = new Utilisateur.toCloseButton_C();
        return toCloseButton;
    }
    
    //## auto_generated 
    public void deleteToCloseButton() {
        toCloseButton=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        toOpenButton = newToOpenButton();
        toCloseButton = newToCloseButton();
        if(getToOpenButton() != null)
           getToOpenButton().connectUtilisateur(this);
        if(getToCloseButton() != null)
           getToCloseButton().connectUtilisateur(this);
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
            if(rootState_subState == state_0)
                {
                    state_0_add(animStates);
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
        public void state_0_add(AnimStates animStates) {
            animStates.add("ROOT.state_0");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int state_0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(e2.e2_rampe_id))
                {
                    res = state_0Takee2();
                }
            else if(event.isTypeOf(e1.e1_rampe_id))
                {
                    res = state_0Takee1();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void state_0Enter() {
        }
        
        //## statechart_method 
        public void state_0_exit() {
            state_0Exit();
            animInstance().notifyStateExited("ROOT.state_0");
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
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int state_0Takee1() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            state_0_exit();
            //#[ transition 1 
            getToOpenButton().gen(new evtPush());
            //#]
            state_0_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_0Takee2() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            state_0_exit();
            //#[ transition 2 
            getToCloseButton().gen(new evtPush());
            //#]
            state_0_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return Utilisateur.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class toOpenButton_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  toOpenButton_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUtilisateur(Utilisateur) 
        public void connectUtilisateur(Utilisateur part) {
            //#[ operation connectUtilisateur(Utilisateur) 
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
    public class toCloseButton_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  toCloseButton_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUtilisateur(Utilisateur) 
        public void connectUtilisateur(Utilisateur part) {
            //#[ operation connectUtilisateur(Utilisateur) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassUtilisateur; 
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
            super(Utilisateur.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Utilisateur.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Utilisateur.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Utilisateur.java
*********************************************************************/

