@ECHO OFF
cd /d %~dp0
taskkill /f /im StarRail.HttpProxy.exe
certutil -user -delstore root ae8fe14dc72938ad5b1ed3889dd8e2ec619a50cf
reg add "HKCU\Software\Microsoft\Windows\CurrentVersion\Internet Settings" /v ProxyEnable /t REG_DWORD /d 0 /f
reg add "HKCU\Software\Microsoft\Windows\CurrentVersion\Internet Settings" /v ProxyServer /d "" /f
cls
exit