call runcrud.bat
if "%ERRORLEVEL%" == "0" goto brave
echo.
echo runcrud.bat had some errors
goto fail

:brave
cd C:\Program Files (x86)\BraveSoftware\Brave-Browser\Application\
call brave.exe http://localhost:8080/crud/v1/tasks
if "%ERRORLEVEL%" == "0" goto end
echo error starting brave browser
goto fail

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished