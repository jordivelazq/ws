# Test project for IES Systems

## Install

    mvn install

## Run the app

    mvn spring-boot:run

I got javax.xml.bind.JAXBException: no ObjectFactory.class or jaxb.index. 
WSDL was generated in a very old version with rcp encoding which made it 
difficult to get JAVA classes to use with according SpringBoot project.
