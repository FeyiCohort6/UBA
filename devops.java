use case example:
  service httpd start | stop | restart | status | enable | disable

  sh sonar.sh start
  sh sonar.sh stop
  sh sonar.sh enable



sonar.sh

echo "Switch case demo starts"
case $1 in
start)
echo "Starting SonarQube Server"
echo "SonarQube server started";;
stop)
echo "Stopping SonarQube Server"
echo "SonarQube Server stopped";;
enable)
echo "Enabling SonarQube Server"
echo "SonarQube Server Enabled";;
*)
echo "You passed the wrong option"
echo "The options are Start | Stop | Enable";;
esac
echo "End of Switch case demo"

