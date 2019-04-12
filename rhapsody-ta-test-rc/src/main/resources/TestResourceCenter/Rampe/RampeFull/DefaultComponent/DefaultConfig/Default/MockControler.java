/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: MockControler
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/MockControler.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/MockControler.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class MockControler 
public class MockControler extends AbstractControler implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_2=1;
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
    public  MockControler(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
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
            if(rootState_active == state_0)
                {
                    res = state_0_takeEvent(id);
                }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void state_2Enter() {
        }
        
        //## statechart_method 
        public int state_0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EvtPressed.EvtPressed_Default_id))
                {
                    res = state_0TakeEvtPressed();
                }
            else if(event.isTypeOf(EvtReleased.EvtReleased_Default_id))
                {
                    res = state_0TakeEvtReleased();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int state_0TakeEvtReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_0_exit();
            state_2_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_0Enter() {
        }
        
        //## statechart_method 
        public void state_2_exit() {
            state_2Exit();
        }
        
        //## statechart_method 
        public void state_0_exit() {
            state_0Exit();
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
        public int state_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void state_2Exit() {
        }
        
        //## statechart_method 
        public void state_2_entDef() {
            state_2_enter();
        }
        
        //## statechart_method 
        public void state_0_enter() {
            rootState_subState = state_0;
            rootState_active = state_0;
            state_0Enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            state_0_entDef();
        }
        
        //## statechart_method 
        public int state_0TakeEvtPressed() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_0_exit();
            state_2_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_2_enter() {
            rootState_subState = state_2;
            rootState_active = state_2;
            state_2Enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void state_0_entDef() {
            state_0_enter();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/MockControler.java
*********************************************************************/

