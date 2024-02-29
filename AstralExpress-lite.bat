@echo off
setlocal enabledelayedexpansion

:menu
:: Check if config file exists and load game path
if exist gamepath.txt (
    set /p gamepath=<gamepath.txt
    set "option1=Toggle launch game with server (Currently ON)"
) else (
    set gamepath=
    set "option1=Toggle launch game with server (Currently OFF)"
)

:: Remove quotes from option1
for /f "delims=" %%A in ("%option1%") do set option1=%%~A

echo Welcome to Astral Express 1.0
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
echo 1^) Start server
echo 2^) Build/repair server
echo 3^) %option1%
echo 4^) Stop proxy ^& exit
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
echo AstralPlus by Midrooms
echo LunarCore by Melledy
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

set /p op=Select: 
if "%op%"=="1" goto start
if "%op%"=="2" goto build
if "%op%"=="3" goto toggle
if "%op%"=="4" start /min cmd /k "cd "%CD%\Resources" && proxy.bat 2" && exit

cls
goto menu

:start
start /min cmd /k "cd "%CD%\Resources" && proxy.bat 1"
start cmd /k "cd "%CD%\Resources" && java -jar LunarCore.jar"
if not "!gamepath!"=="" (
    timeout /t 10 /nobreak
    start "" !gamepath!
)
cls
goto menu

:build
start cmd /c "cd "%CD%\Resources" && gradlew jar && exit"
cls
goto menu

:toggle
if not "!gamepath!"=="" (
    del gamepath.txt
    set gamepath=
) else (
    set /p "gamepath=Paste full game path here: "
    if not "!gamepath!"=="" (
        echo !gamepath! > gamepath.txt
    )
)
cls
goto menu
