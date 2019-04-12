echo off

set RHAP_JARS_DIR=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/Users/teodorci/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=None   

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
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\EvtPressed.class del Default\EvtPressed.class
if exist Default\Controler.class del Default\Controler.class
if exist Default\PushButton.class del Default\PushButton.class
if exist Default\Pannel.class del Default\Pannel.class
if exist Default\MockControler.class del Default\MockControler.class
if exist Default\EvtReleased.class del Default\EvtReleased.class
if exist Default\AbstractControler.class del Default\AbstractControler.class
if exist Default\PilotPannel.class del Default\PilotPannel.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\Rampe.class del Default\Rampe.class

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


