#!/bin/sh
#Specify install as a keyword argument
if [ $# -lt 1] ; then
    echo -e "Please provide the root directory of your app engine installation to continue"
    exit 1
fi

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-labs -Dversion=1.3.5 -Dpackaging=jar \
-Dfile=$1/lib/user/appengine-api-labs-1.3.5.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-1.0-sdk -Dversion=1.3.5 -Dpackaging=jar \
-Dfile=$1/lib/user/appengine-api-1.0-sdk-1.3.5.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-api-stubs -Dversion=1.3.5 -Dpackaging=jar \
-Dfile=$1/lib/impl/appengine-api-stubs.jar

mvn install:install-file -DgroupId=com.google.appengine \
-DartifactId=appengine-local-runtime -Dversion=1.3.5 -Dpackaging=jar \
-Dfile=$1/lib/impl/appengine-local-runtime.jar