# App Engine Instance that redirects all traffic to another domain - Created by [Handstand Technologies, LLC](http://handstandtech.com)

Redirects all traffic from your App Engine Instance to the domain specified in the web.xml configuration.

## REQUIREMENTS

- Uses Google App Engine 1.4.2
- Eclipse Project using the Google Plugin for Eclipse 3.6

## CONFIGURATION

- In the war/WEB-INF/web.xml file, change *http://YOURDOMAIN.COM* to the domain you want to be redirected to
- In the war/WEB-INF/appengine-web.xml file, change *APPSPOT_NAME_GOES_HERE* to your appspot id