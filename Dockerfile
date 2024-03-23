FROM quay.io/wildfly/wildfly:latest
COPY /wildfly/modules /opt/jboss/wildfly/modules
COPY /wildfly/standalone/configuration/standalone.xml /opt/jboss/wildfly/standalone/configuration
COPY /build/libs/main.war /opt/jboss/wildfly/standalone/deployments
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]