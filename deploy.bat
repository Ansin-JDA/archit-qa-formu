@echo off
set build_path="D:\ZWValley\Code\archit-qa-formu"
set war_path="D:\ZWValley\Code\archit-qa-formu\target"
set tmc_path="D:\JDA_work\JDA_Software\apache-tomcat-7.0.55\bin"
set web_apps="D:\JDA_work\JDA_Software\apache-tomcat-7.0.55\webapps"

echo "Go to build_path"
cd %build_path%
call mvn "clean" "install"

echo "copy knowledge-0.0.1-SNAPSHOT.war"
cd %war_path%
cp -rfv knowledge-0.0.1-SNAPSHOT.war %web_apps% 

echo "Remove old packages in web_apps"
rd /s/q %web_apps%\knowledge-0.0.1-SNAPSHOT
rd /s/q %web_apps%\knowledge_forum

echo "shutdown tomcat and start tomcat"
cd %tmc_path%
call shutdown.bat
call startup.bat
cd %build_path% 