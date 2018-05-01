FROM airhacks/wildfly
MAINTAINER Omar Noriega
ADD dist/calculadora.war ${DEPLOYMENT_DIR}
EXPOSE 7543/tcp