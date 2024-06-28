FROM quay.io/wildfly/wildfly:latest
ARG DB_URL=production
ARG DB_USER=production
ARG DB_PASSWORD=production
ENV DB_URL=$DB_URL
ENV DB_USER=$DB_USER
ENV DB_PASSWORD=$DB_PASSWORD
COPY /wildfly/modules /opt/jboss/wildfly/modules
COPY /wildfly/standalone/configuration/standalone.xml /opt/jboss/wildfly/standalone/configuration
COPY /build/libs/main.war /opt/jboss/wildfly/standalone/deployments
EXPOSE 8080
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
