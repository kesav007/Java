CD C:\Software\apache-tomcat-8.0.36\bin
CALL shutdown.bat
DEL /S /Q C:\Software\apache-tomcat-8.0.36\webapps\308tube-jersey.war
RD /S /Q C:\Software\apache-tomcat-8.0.36\webapps\308tube-jersey
RD /S /Q C:\Software\apache-tomcat-8.0.36\work\Catalina\localhost\308tube-jersey
CD C:\Software\apache-tomcat-8.0.36\bin
CALL startup.bat