/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: guerinsy
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Mon, 25, Mar 2019 
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
    
    public static Ping itsPing;		//## classInstance itsPing 
    
    public static Pong itsPong;		//## classInstance itsPong 
    
    
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
        if(itsPing != null)
            {
                AnimServices.setInstanceName(itsPing, "itsPing");
            }
        if(itsPong != null)
            {
                AnimServices.setInstanceName(itsPong, "itsPong");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsPing = new Ping(p_thread);
        itsPong = new Pong(p_thread);
        itsPing.setUnPong(itsPong);
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsPing.startBehavior();
        done &= itsPong.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

