/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: PushButton
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/PushButton.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/PushButton.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PushButton 
public class PushButton implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected PushButton.port_C port;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int released=1;
    public static final int pushed=2;
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
    public  PushButton(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
    }
    
    //## auto_generated 
    public PushButton.port_C getPort() {
        return port;
    }
    
    //## auto_generated 
    public PushButton.port_C get_port() {
        return port;
    }
    
    //## auto_generated 
    public PushButton.port_C newPort() {
        port = new PushButton.port_C();
        return port;
    }
    
    //## auto_generated 
    public void deletePort() {
        port=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        port = newPort();
        if(getPort() != null)
           getPort().connectPushButton(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
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
                case released:
                {
                    res = released_takeEvent(id);
                }
                break;
                case pushed:
                {
                    res = pushed_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void pushedExit() {
        }
        
        //## statechart_method 
        public int released_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = releasedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void releasedEnter() {
        }
        
        //## statechart_method 
        public int pushedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            pushed_exit();
            released_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void pushedEnter() {
        }
        
        //## statechart_method 
        public int releasedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            released_exit();
            pushed_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void released_exit() {
            popNullConfig();
            releasedExit();
        }
        
        //## statechart_method 
        public void pushed_exit() {
            popNullConfig();
            pushedExit();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int pushed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = pushedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void released_enter() {
            pushNullConfig();
            rootState_subState = released;
            rootState_active = released;
            releasedEnter();
        }
        
        //## statechart_method 
        public void released_entDef() {
            released_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void releasedExit() {
        }
        
        //## statechart_method 
        public void pushed_entDef() {
            pushed_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            released_entDef();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void pushed_enter() {
            pushNullConfig();
            rootState_subState = pushed;
            rootState_active = pushed;
            pushedEnter();
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class port_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  port_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPushButton(PushButton) 
        public void connectPushButton(PushButton part) {
            //#[ operation connectPushButton(PushButton) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/PushButton.java
*********************************************************************/

