echo off

set RHAP_JARS_DIR=C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\oxf.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\anim.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\animcom.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\oxf.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\anim.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\animcom.jar;C:/Users/Adrien/IBM/Rational/Rhapsody/8.1.5x64/Share\LangJava\lib\oxfInst.jar;
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
if exist Default\Inhib.class del Default\Inhib.class
if exist Default\EV_Stopped.class del Default\EV_Stopped.class
if exist Default\Button.class del Default\Button.class
if exist Default\Lock.class del Default\Lock.class
if exist Default\Button_Inhibition.class del Default\Button_Inhibition.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\Stop_EV.class del Default\Stop_EV.class
if exist Default\Release_Button.class del Default\Release_Button.class
if exist Default\EV_Open_Activated.class del Default\EV_Open_Activated.class
if exist Default\Unlock.class del Default\Unlock.class
if exist Default\General_Command.class del Default\General_Command.class
if exist Default\EV.class del Default\EV.class
if exist Default\EV_Close_Activated.class del Default\EV_Close_Activated.class
if exist Default\Unpress.class del Default\Unpress.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\Interrupt.class del Default\Interrupt.class
if exist Default\Door.class del Default\Door.class
if exist Default\Activate_EV.class del Default\Activate_EV.class
if exist Default\Press.class del Default\Press.class
if exist Default\Close_Button.class del Default\Close_Button.class
if exist Default\Locked.class del Default\Locked.class
if exist Default\Open_Button.class del Default\Open_Button.class
if exist Default\Locks.class del Default\Locks.class
if exist Default\Filter.class del Default\Filter.class
if exist Default\Unlocked.class del Default\Unlocked.class

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


