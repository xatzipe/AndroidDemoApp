#!/usr/bin/env bash

echo "This is an App Center Pre-Build script. For more information on how to use App Center build scripts vist: https://docs.microsoft.com/en-us/appcenter/build/custom/scripts"
(echo ""; echo "org.gradle.java.home=/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/") >> $APPCENTER_SOURCE_DIRECTORY/gradle.properties
echo "Print gradle.properties content"
cat $APPCENTER_SOURCE_DIRECTORY/gradle.properties
