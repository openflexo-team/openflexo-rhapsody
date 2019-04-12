/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// Default/Default_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## ignore 
public class Default_pkgClass {
    
    public static Button Close_Inside;		//## classInstance Close_Inside 
    
    public static Button Close_Outside;		//## classInstance Close_Outside 
    
    public static Button Close_Pilot;		//## classInstance Close_Pilot 
    
    public static General_Command Command_1;		//## classInstance Command_1 
    
    public static Door Door_1;		//## classInstance Door_1 
    
    public static EV EV_Close;		//## classInstance EV_Close 
    
    public static EV EV_Open;		//## classInstance EV_Open 
    
    public static Filter Filter_1;		//## classInstance Filter_1 
    
    public static Button_Inhibition Inhib_1;		//## classInstance Inhib_1 
    
    public static Locks Locks_1;		//## classInstance Locks_1 
    
    public static Button Open_Inside;		//## classInstance Open_Inside 
    
    public static Button Open_Outside;		//## classInstance Open_Outside 
    
    public static Button Open_Pilot;		//## classInstance Open_Pilot 
    
    
    // Constructors
    
    //## auto_generated 
    public  Default_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(EV_Close != null)
            {
                AnimServices.setInstanceName(EV_Close, "EV_Close");
            }
        if(Door_1 != null)
            {
                AnimServices.setInstanceName(Door_1, "Door_1");
            }
        if(Command_1 != null)
            {
                AnimServices.setInstanceName(Command_1, "Command_1");
            }
        if(EV_Open != null)
            {
                AnimServices.setInstanceName(EV_Open, "EV_Open");
            }
        if(Locks_1 != null)
            {
                AnimServices.setInstanceName(Locks_1, "Locks_1");
            }
        if(Filter_1 != null)
            {
                AnimServices.setInstanceName(Filter_1, "Filter_1");
            }
        if(Open_Inside != null)
            {
                AnimServices.setInstanceName(Open_Inside, "Open_Inside");
            }
        if(Close_Inside != null)
            {
                AnimServices.setInstanceName(Close_Inside, "Close_Inside");
            }
        if(Open_Pilot != null)
            {
                AnimServices.setInstanceName(Open_Pilot, "Open_Pilot");
            }
        if(Close_Pilot != null)
            {
                AnimServices.setInstanceName(Close_Pilot, "Close_Pilot");
            }
        if(Close_Outside != null)
            {
                AnimServices.setInstanceName(Close_Outside, "Close_Outside");
            }
        if(Open_Outside != null)
            {
                AnimServices.setInstanceName(Open_Outside, "Open_Outside");
            }
        if(Inhib_1 != null)
            {
                AnimServices.setInstanceName(Inhib_1, "Inhib_1");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        Close_Inside = new Button(false, false, p_thread);
        Close_Outside = new Button(false, true, p_thread);
        Close_Pilot = new Button(false, false, p_thread);
        Command_1 = new General_Command(p_thread);
        Door_1 = new Door(p_thread);
        EV_Close = new EV(false, p_thread);
        EV_Open = new EV(true, p_thread);
        Filter_1 = new Filter(p_thread);
        Inhib_1 = new Button_Inhibition(p_thread);
        Locks_1 = new Locks(p_thread);
        Open_Inside = new Button(true, false, p_thread);
        Open_Outside = new Button(true, true, p_thread);
        Open_Pilot = new Button(true, false, p_thread);
        {
            
            EV_Open.getPortEVToDoor().setItsDefaultRequiredInterface(Door_1.getPortOpenDoor().getItsDefaultProvidedInterface());
            
        }{
            
            Door_1.getPortOpenDoor().setItsDefaultRequiredInterface(EV_Open.getPortEVToDoor().getItsDefaultProvidedInterface());
            
        }
        {
            
            Door_1.getPortCloseDoor().setItsDefaultRequiredInterface(EV_Close.getPortEVToDoor().getItsDefaultProvidedInterface());
            
        }{
            
            EV_Close.getPortEVToDoor().setItsDefaultRequiredInterface(Door_1.getPortCloseDoor().getItsDefaultProvidedInterface());
            
        }
        {
            
            EV_Close.getPortEVToCommand().setItsDefaultRequiredInterface(Command_1.getPortCloseCommand().getItsDefaultProvidedInterface());
            
        }{
            
            Command_1.getPortCloseCommand().setItsDefaultRequiredInterface(EV_Close.getPortEVToCommand().getItsDefaultProvidedInterface());
            
        }
        {
            
            EV_Open.getPortEVToCommand().setItsDefaultRequiredInterface(Command_1.getPortOpenCommand().getItsDefaultProvidedInterface());
            
        }{
            
            Command_1.getPortOpenCommand().setItsDefaultRequiredInterface(EV_Open.getPortEVToCommand().getItsDefaultProvidedInterface());
            
        }
        {
            
            Door_1.getPortToLock().setItsDefaultRequiredInterface(Locks_1.getPortToDoor().getItsDefaultProvidedInterface());
            
        }{
            
            Locks_1.getPortToDoor().setItsDefaultRequiredInterface(Door_1.getPortToLock().getItsDefaultProvidedInterface());
            
        }
        {
            
            Locks_1.getPortToCommand().setItsDefaultRequiredInterface(Command_1.getPortToLock().getItsDefaultProvidedInterface());
            
        }{
            
            Command_1.getPortToLock().setItsDefaultRequiredInterface(Locks_1.getPortToCommand().getItsDefaultProvidedInterface());
            
        }
        {
            
            Filter_1.getPortToCommand().setItsDefaultRequiredInterface(Command_1.getPortFromFilter().getItsDefaultProvidedInterface());
            
        }{
            
            Command_1.getPortFromFilter().setItsDefaultRequiredInterface(Filter_1.getPortToCommand().getItsDefaultProvidedInterface());
            
        }
        {
            
            Open_Inside.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromOpenInside().getItsDefaultProvidedInterface());
            
        }{
            
            Filter_1.getPortFromOpenInside().setItsDefaultRequiredInterface(Open_Inside.getPortOut().getItsDefaultProvidedInterface());
            
        }
        {
            
            Close_Inside.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromCloseInside().getItsDefaultProvidedInterface());
            
        }{
            
            Filter_1.getPortFromCloseInside().setItsDefaultRequiredInterface(Close_Inside.getPortOut().getItsDefaultProvidedInterface());
            
        }
        {
            
            Filter_1.getPortFromOpenPilot().setItsDefaultRequiredInterface(Open_Pilot.getPortOut().getItsDefaultProvidedInterface());
            
        }{
            
            Open_Pilot.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromOpenPilot().getItsDefaultProvidedInterface());
            
        }
        {
            
            Filter_1.getPortFromClosePilot().setItsDefaultRequiredInterface(Close_Pilot.getPortOut().getItsDefaultProvidedInterface());
            
        }{
            
            Close_Pilot.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromClosePilot().getItsDefaultProvidedInterface());
            
        }
        {
            
            Open_Outside.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromOpenOutside().getItsDefaultProvidedInterface());
            
        }{
            
            Filter_1.getPortFromOpenOutside().setItsDefaultRequiredInterface(Open_Outside.getPortOut().getItsDefaultProvidedInterface());
            
        }
        {
            
            Close_Outside.getPortOut().setItsDefaultRequiredInterface(Filter_1.getPortFromCloseOutside().getItsDefaultProvidedInterface());
            
        }{
            
            Filter_1.getPortFromCloseOutside().setItsDefaultRequiredInterface(Close_Outside.getPortOut().getItsDefaultProvidedInterface());
            
        }
        {
            
            Inhib_1.getPortToOpen().setItsDefaultRequiredInterface(Open_Outside.getPortFromInhibition().getItsDefaultProvidedInterface());
            
        }{
            
            Open_Outside.getPortFromInhibition().setItsDefaultRequiredInterface(Inhib_1.getPortToOpen().getItsDefaultProvidedInterface());
            
        }
        {
            
            Close_Outside.getPortFromInhibition().setItsDefaultRequiredInterface(Inhib_1.getPortToFilter().getItsDefaultProvidedInterface());
            
        }{
            
            Inhib_1.getPortToFilter().setItsDefaultRequiredInterface(Close_Outside.getPortFromInhibition().getItsDefaultProvidedInterface());
            
        }
        {
            
            Inhib_1.getPortToFilter().setItsDefaultRequiredInterface(Filter_1.getPortFromInhib().getItsDefaultProvidedInterface());
            
        }{
            
            Filter_1.getPortFromInhib().setItsDefaultRequiredInterface(Inhib_1.getPortToFilter().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= Close_Inside.startBehavior();
        done &= Close_Outside.startBehavior();
        done &= Close_Pilot.startBehavior();
        done &= Command_1.startBehavior();
        done &= Door_1.startBehavior();
        done &= EV_Close.startBehavior();
        done &= EV_Open.startBehavior();
        done &= Filter_1.startBehavior();
        done &= Inhib_1.startBehavior();
        done &= Locks_1.startBehavior();
        done &= Open_Inside.startBehavior();
        done &= Open_Outside.startBehavior();
        done &= Open_Pilot.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

