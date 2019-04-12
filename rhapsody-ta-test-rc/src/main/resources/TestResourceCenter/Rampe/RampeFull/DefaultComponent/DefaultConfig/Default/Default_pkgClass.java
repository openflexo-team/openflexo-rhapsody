/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;

//----------------------------------------------------------------------------
// Default/Default_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## ignore 
public class Default_pkgClass {
    
    public static Pannel itsExternalPannel;		//## classInstance itsExternalPannel 
    
    public static Pannel itsInternalPannel;		//## classInstance itsInternalPannel 
    
    public static PilotPannel itsPilotPannel;		//## classInstance itsPilotPannel 
    
    public static Rampe itsRampe;		//## classInstance itsRampe 
    
    
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
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsExternalPannel = new Pannel(p_thread);
        itsInternalPannel = new Pannel(p_thread);
        itsPilotPannel = new PilotPannel(p_thread);
        itsRampe = new Rampe(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsExternalPannel.startBehavior();
        done &= itsInternalPannel.startBehavior();
        done &= itsPilotPannel.startBehavior();
        done &= itsRampe.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

