echo off

set RHAP_JARS_DIR=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist rampe\evtPush.class del rampe\evtPush.class
if exist rampe\Lock.class del rampe\Lock.class
if exist rampe\evtUnlocked.class del rampe\evtUnlocked.class
if exist rampe\Outputs.class del rampe\Outputs.class
if exist rampe\e3.class del rampe\e3.class
if exist rampe\Pannel.class del rampe\Pannel.class
if exist rampe\Door.class del rampe\Door.class
if exist rampe\e2.class del rampe\e2.class
if exist rampe\rampe_pkgClass.class del rampe\rampe_pkgClass.class
if exist rampe\CompositeController.class del rampe\CompositeController.class
if exist rampe\evtDesactivateEV.class del rampe\evtDesactivateEV.class
if exist rampe\Wrapper.class del rampe\Wrapper.class
if exist rampe\evtCloseDoor.class del rampe\evtCloseDoor.class
if exist rampe\Pilot.class del rampe\Pilot.class
if exist rampe\ElectroVanne.class del rampe\ElectroVanne.class
if exist rampe\Writer.class del rampe\Writer.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist rampe\evtPressureOff.class del rampe\evtPressureOff.class
if exist rampe\Utilisateur.class del rampe\Utilisateur.class
if exist rampe\evtLocked.class del rampe\evtLocked.class
if exist rampe\Inputs.class del rampe\Inputs.class
if exist rampe\Button.class del rampe\Button.class
if exist rampe\e1.class del rampe\e1.class
if exist rampe\InternalState.class del rampe\InternalState.class
if exist rampe\PilotPannel.class del rampe\PilotPannel.class
if exist rampe\evtActivateEV.class del rampe\evtActivateEV.class
if exist rampe\Controller.class del rampe\Controller.class
if exist rampe\evtStopEV.class del rampe\evtStopEV.class
if exist rampe\evtInterrupt.class del rampe\evtInterrupt.class
if exist rampe\Data.class del rampe\Data.class
if exist rampe\evtPressureOn.class del rampe\evtPressureOn.class
if exist rampe\Reader.class del rampe\Reader.class
if exist rampe\evtOpenDoor.class del rampe\evtOpenDoor.class
if exist rampe\SharedData.class del rampe\SharedData.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


