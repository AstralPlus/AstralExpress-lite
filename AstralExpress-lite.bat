@echo off
:menu
echo Welcome to Astral Express    1.0
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
echo 1^) Start server ^& enable proxy
echo 2^) Build/repair server
echo 3^) Stop proxy ^& exit
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
echo AstralPlus by Midrooms
echo LunarCore by Melledy
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

set /p op=Select: 
if "%op%"=="1" goto start
if "%op%"=="2" goto build
if "%op%"=="3" start /min cmd /k "cd "%CD%\AstralPackage" && stopProxy.bat" && exit

cls
goto menu

:start
start /min cmd /k "cd "%CD%\AstralPackage" && startProxy.bat"
start cmd /k "cd "%CD%\AstralPackage" && java -jar LunarCore.jar"
cls
goto menu

:build
start cmd /c "cd "%CD%\AstralPackage" && gradlew jar && exit"
cls
goto menu
