/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Button.java
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
// Default/Button.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Button 
public class Button implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassButton = new AnimClass("Default.Button",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Button.PortOut_C PortOut;		//## ignore 
    
    protected Button.PortFromInhibition_C PortFromInhibition;		//## ignore 
    
    protected boolean Is_Inhibited = false;		//## attribute Is_Inhibited 
    
    protected boolean Is_Open;		//## attribute Is_Open 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Unpressed=1;
    public static final int Pressed=2;
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
    
    /**
     * @param Is_Open
     * @param Is_Inhib
    */
    //## operation Button(boolean,boolean) 
    public  Button(boolean Is_Open, boolean Is_Inhib, RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassButton.getUserClass(),
               new ArgData[] {
                   new ArgData(boolean.class, "Is_Open", AnimInstance.animToString(Is_Open)),
                   new ArgData(boolean.class, "Is_Inhib", AnimInstance.animToString(Is_Inhib))
               });
        
        m_thread = new RiJThread("Button");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        //#[ operation Button(boolean,boolean) 
        this.Is_Open = Is_Open;     
        this.Is_Inhibited = Is_Inhib;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
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
    public Button.PortOut_C getPortOut() {
        return PortOut;
    }
    
    //## auto_generated 
    public Button.PortOut_C get_PortOut() {
        return PortOut;
    }
    
    //## auto_generated 
    public Button.PortOut_C newPortOut() {
        PortOut = new Button.PortOut_C();
        return PortOut;
    }
    
    //## auto_generated 
    public void deletePortOut() {
        PortOut=null;
    }
    
    //## auto_generated 
    public Button.PortFromInhibition_C getPortFromInhibition() {
        return PortFromInhibition;
    }
    
    //## auto_generated 
    public Button.PortFromInhibition_C get_PortFromInhibition() {
        return PortFromInhibition;
    }
    
    //## auto_generated 
    public Button.PortFromInhibition_C newPortFromInhibition() {
        PortFromInhibition = new Button.PortFromInhibition_C();
        return PortFromInhibition;
    }
    
    //## auto_generated 
    public void deletePortFromInhibition() {
        PortFromInhibition=null;
    }
    
    //## operation Inhibition_Change() 
    public void Inhibition_Change() {
        try {
            animInstance().notifyMethodEntered("Inhibition_Change",
               new ArgData[] {
               });
        
        //#[ operation Inhibition_Change() 
        if(Is_Inhibited == true){
        	System.out.println("Le Bouton est operationel");
        	Is_Inhibited = false;
        }
        else {
        	System.out.println("Le Bouton est inhibe");
        	Is_Inhibited = true;
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Release() 
    public void Release() {
        try {
            animInstance().notifyMethodEntered("Release",
               new ArgData[] {
               });
        
        //#[ operation Release() 
        getPortOut().gen(new Release_Button());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation Send() 
    public void Send() {
        try {
            animInstance().notifyMethodEntered("Send",
               new ArgData[] {
               });
        
        //#[ operation Send() 
        System.out.println("Bouton : " + this.Is_Open);
        if(Is_Open == true)
        	getPortOut().gen(new Open_Button());
        else
        	getPortOut().gen(new Close_Button());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public boolean getIs_Inhibited() {
        return Is_Inhibited;
    }
    
    //## auto_generated 
    public void setIs_Inhibited(boolean p_Is_Inhibited) {
        Is_Inhibited = p_Is_Inhibited;
    }
    
    //## auto_generated 
    public boolean getIs_Open() {
        return Is_Open;
    }
    
    //## auto_generated 
    public void setIs_Open(boolean p_Is_Open) {
        Is_Open = p_Is_Open;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        PortOut = newPortOut();
        PortFromInhibition = newPortFromInhibition();
        if(getPortOut() != null)
           getPortOut().connectButton(this);
        if(getPortFromInhibition() != null)
           getPortFromInhibition().connectButton(this);
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
                case Unpressed:
                {
                    Unpressed_add(animStates);
                }
                break;
                case Pressed:
                {
                    Pressed_add(animStates);
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
                case Unpressed:
                {
                    res = Unpressed_takeEvent(id);
                }
                break;
                case Pressed:
                {
                    res = Pressed_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Unpressed_add(AnimStates animStates) {
            animStates.add("ROOT.Unpressed");
        }
        
        //## statechart_method 
        public void Pressed_add(AnimStates animStates) {
            animStates.add("ROOT.Pressed");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int UnpressedTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Unpressed_exit();
            //#[ transition 4 
            Inhibition_Change();
            //#]
            Unpressed_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void UnpressedEnter() {
        }
        
        //## statechart_method 
        public void Pressed_enter() {
            animInstance().notifyStateEntered("ROOT.Pressed");
            rootState_subState = Pressed;
            rootState_active = Pressed;
            PressedEnter();
        }
        
        //## statechart_method 
        public void PressedExit() {
        }
        
        //## statechart_method 
        public void Unpressed_exit() {
            UnpressedExit();
            animInstance().notifyStateExited("ROOT.Unpressed");
        }
        
        //## statechart_method 
        public int PressedTakeInhib() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Pressed_exit();
            //#[ transition 3 
            Inhibition_Change();
            //#]
            Pressed_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void PressedEnter() {
            //#[ state Pressed.(Entry) 
            Send();
            //#]
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Unpressed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = UnpressedTakeInhib();
                }
            else if(event.isTypeOf(Press.Press_Default_id))
                {
                    res = UnpressedTakePress();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int UnpressedTakePress() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 1 
            if(Is_Inhibited == false)
                {
                    animInstance().notifyTransitionStarted("1");
                    Unpressed_exit();
                    Pressed_entDef();
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void UnpressedExit() {
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
        public int Pressed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Inhib.Inhib_Default_id))
                {
                    res = PressedTakeInhib();
                }
            else if(event.isTypeOf(Unpress.Unpress_Default_id))
                {
                    res = PressedTakeUnpress();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Pressed_exit() {
            PressedExit();
            animInstance().notifyStateExited("ROOT.Pressed");
        }
        
        //## statechart_method 
        public void Pressed_entDef() {
            Pressed_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Unpressed_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Unpressed_enter() {
            animInstance().notifyStateEntered("ROOT.Unpressed");
            rootState_subState = Unpressed;
            rootState_active = Unpressed;
            UnpressedEnter();
        }
        
        //## statechart_method 
        public int PressedTakeUnpress() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Pressed_exit();
            //#[ transition 2 
            Release();
            //#]
            Unpressed_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Unpressed_entDef() {
            Unpressed_enter();
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
    public class PortOut_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortOut_C() {
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
    public class PortFromInhibition_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  PortFromInhibition_C() {
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
        
        msg.add("Is_Open", Is_Open);
        msg.add("Is_Inhibited", Is_Inhibited);
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
	File Path	: DefaultComponent/DefaultConfig/Default/Button.java
*********************************************************************/

