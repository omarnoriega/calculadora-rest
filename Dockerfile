FROM airhacks/wildfly
MAINTAINER Omar Noriega
ADD dist/api.war ${DEPLOYMENT_DIR}
EXPOSE 7543/tcp