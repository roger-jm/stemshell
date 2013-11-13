@echo off

set DIRNAME=.\
if "%OS%" == "Windows_NT" set DIRNAME=%~dp0%


set AS_JAVA=%JAVA_HOME%

set CLASSPATH=.
set CLASSPATH=%CLASSPATH%;%JAVAC_JAR%
set CLASSPATH=%CLASSPATH%;"D:\mavenLR\commons-cli\commons-cli\1.2\commons-cli-1.2.jar";"D:\mavenLR\org\sonatype\jline\jline\2.5\jline-2.5.jar"
set CLASSPATH=%CLASSPATH%;"%DIRNAME%\stemshell-0.1.0-SNAPSHOT.jar"

"%AS_JAVA%\bin\java" -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address="8006" -classpath %CLASSPATH% com.instanceone.stemshell.example.ExampleShell  %*
endlocal