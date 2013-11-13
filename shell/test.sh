#!/bin/sh

DIR=`pwd`
echo ${DIR}

T_PATH="${DIR}/stemshell-0.1.0-SNAPSHOT.jar:${DIR}/commons-cli-1.2.jar:${DIR}/jline-2.5.jar"
echo ${T_PATH}

JAVA=${JAVA_HOME}/bin/java

${JAVA} -classpath ${T_PATH} com.instanceone.stemshell.example.ExampleShell
