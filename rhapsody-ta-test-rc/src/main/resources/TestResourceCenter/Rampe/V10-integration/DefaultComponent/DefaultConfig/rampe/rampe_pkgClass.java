/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: rampe
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/rampe_pkgClass.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// rampe/rampe_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## ignore 
public class rampe_pkgClass {
    
    public static Controller itsController;		//## classInstance itsController 
    
    public static Data itsData;		//## classInstance itsData 
    
    
    // Constructors
    
    //## auto_generated 
    public  rampe_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsController != null)
            {
                AnimServices.setInstanceName(itsController, "itsController");
            }
        if(itsData != null)
            {
                AnimServices.setInstanceName(itsData, "itsData");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsController = new Controller(p_thread);
        itsData = new Data();
        itsController.setItsData(itsData);
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsController.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/rampe_pkgClass.java
*********************************************************************/

