/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pannel
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Pannel.java
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
// rampe/Pannel.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Pannel 
public class Pannel implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPannel = new AnimClass("rampe.Pannel",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Pannel.outOpen_C[] outOpen = new Pannel.outOpen_C[2];		//## ignore 
    
    protected Pannel.inOpen_C inOpen;		//## ignore 
    
    protected Pannel.inClose_C inClose;		//## ignore 
    
    protected Pannel.outClose_C outClose;		//## ignore 
    
    protected Button closeBtn;		//## classInstance closeBtn 
    
    protected Button openBtn;		//## classInstance openBtn 
    
    
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
    public  Pannel(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPannel.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Pannel");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getOutOpen() {
        int iter = 0;;
        return iter;
    }
    
    //## auto_generated 
    public Pannel.outOpen_C getOutOpenAt(int i) {
        return outOpen[i];
    }
    
    //## auto_generated 
    public Pannel.outOpen_C get_outOpen(int i) {
        return outOpen[i];
    }
    
    //## auto_generated 
    public Pannel.outOpen_C newOutOpen(int i) {
        Pannel.outOpen_C newoutOpen_C = new Pannel.outOpen_C();
        outOpen[i] = newoutOpen_C;
        return newoutOpen_C;
    }
    
    //## auto_generated 
    public void deleteOutOpen(Pannel.outOpen_C p_outOpen_C) {
        for (int pos = 0; pos < 2; pos++) {
        	if(outOpen[pos] == p_outOpen_C) {
        		outOpen[pos] = null;
        		break;
        	}
        }
        p_outOpen_C=null;
    }
    
    //## auto_generated 
    public Pannel.inOpen_C getInOpen() {
        return inOpen;
    }
    
    //## auto_generated 
    public Pannel.inOpen_C get_inOpen() {
        return inOpen;
    }
    
    //## auto_generated 
    public Pannel.inOpen_C newInOpen() {
        inOpen = new Pannel.inOpen_C();
        return inOpen;
    }
    
    //## auto_generated 
    public void deleteInOpen() {
        inOpen=null;
    }
    
    //## auto_generated 
    public Pannel.inClose_C getInClose() {
        return inClose;
    }
    
    //## auto_generated 
    public Pannel.inClose_C get_inClose() {
        return inClose;
    }
    
    //## auto_generated 
    public Pannel.inClose_C newInClose() {
        inClose = new Pannel.inClose_C();
        return inClose;
    }
    
    //## auto_generated 
    public void deleteInClose() {
        inClose=null;
    }
    
    //## auto_generated 
    public Pannel.outClose_C getOutClose() {
        return outClose;
    }
    
    //## auto_generated 
    public Pannel.outClose_C get_outClose() {
        return outClose;
    }
    
    //## auto_generated 
    public Pannel.outClose_C newOutClose() {
        outClose = new Pannel.outClose_C();
        return outClose;
    }
    
    //## auto_generated 
    public void deleteOutClose() {
        outClose=null;
    }
    
    //## auto_generated 
    public Button getCloseBtn() {
        return closeBtn;
    }
    
    //## auto_generated 
    public Button newCloseBtn(RiJThread p_thread) {
        closeBtn = new Button(p_thread);
        animInstance().notifyRelationAdded("closeBtn", closeBtn);
        return closeBtn;
    }
    
    //## auto_generated 
    public void deleteCloseBtn() {
        animInstance().notifyRelationRemoved("closeBtn", closeBtn);
        closeBtn=null;
    }
    
    //## auto_generated 
    public Button getOpenBtn() {
        return openBtn;
    }
    
    //## auto_generated 
    public Button newOpenBtn(RiJThread p_thread) {
        openBtn = new Button(p_thread);
        animInstance().notifyRelationAdded("openBtn", openBtn);
        return openBtn;
    }
    
    //## auto_generated 
    public void deleteOpenBtn() {
        animInstance().notifyRelationRemoved("openBtn", openBtn);
        openBtn=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        {
            for (int i = 0; i < 2; i++) 
                newOutOpen(i);
            
        }
        inOpen = newInOpen();
        inClose = newInClose();
        outClose = newOutClose();
        closeBtn = newCloseBtn(p_thread);
        openBtn = newOpenBtn(p_thread);
        {
            for (int i = 0; i < 2; i++) {
                getOutOpenAt(i).connectPannel(this);
            }
        }
        if(getInOpen() != null)
           getInOpen().connectPannel(this);
        if(getInClose() != null)
           getInClose().connectPannel(this);
        if(getOutClose() != null)
           getOutClose().connectPannel(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= closeBtn.startBehavior();
        done &= openBtn.startBehavior();
        done &= reactive.startBehavior();
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
            return Pannel.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class outOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  outOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPannel(Pannel) 
        public void connectPannel(Pannel part) {
            //#[ operation connectPannel(Pannel) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class inOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  inOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPannel(Pannel) 
        public void connectPannel(Pannel part) {
            //#[ operation connectPannel(Pannel) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class inClose_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  inClose_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPannel(Pannel) 
        public void connectPannel(Pannel part) {
            //#[ operation connectPannel(Pannel) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class outClose_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  outClose_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPannel(Pannel) 
        public void connectPannel(Pannel part) {
            //#[ operation connectPannel(Pannel) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPannel; 
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
        
        msg.add("openBtn", true, true, openBtn);
        msg.add("closeBtn", true, true, closeBtn);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Pannel.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Pannel.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Pannel.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Pannel.java
*********************************************************************/

