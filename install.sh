#!/bin/sh
#Specify install as a keyword argument
if [ $# -lt 1] ; then
    echo -e "Please provide the root directory of your app engine installation to continue"
    exit 1
fi
appengineversion="1.4.2"

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-labs -Dversion=$appengineversion -Dpackaging=jar \
-Dfile=$1/lib/user/appengine-api-labs-$appengineversion.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-1.0-sdk -Dversion=$appengineversion -Dpackaging=jar \
-Dfile=$1/lib/user/appengine-api-1.0-sdk-$appengineversion.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-stubs -Dversion=$appengineversion -Dpackaging=jar \
-Dfile=$1/lib/impl/appengine-api-stubs.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-local-runtime -Dversion=$appengineversion -Dpackaging=jar \
-Dfile=$1/lib/impl/appengine-local-runtime.jar
