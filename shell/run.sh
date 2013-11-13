#!/bin/sh

DIRNAME=`pwd`

AS_JAVA=${JAVA_HOME}

CLASSPATH="${JAVAC_JAR}"
CLASSPATH="${CLASSPATH}:${DIRNAME}/commons-cli-1.2.jar:${DIRNAME}/jline-2.5.jar:${DIRNAME}/stemshell-0.1.0-SNAPSHOT.jar"

"${AS_JAVA}"/bin/java -cp ${CLASSPATH} com.instanceone.stemshell.example.ExampleShell "${@}"