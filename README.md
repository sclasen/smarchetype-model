## Installing the archetype locally

1. git clone git://github.com/sroysf/smarchetype-model.git
2. cd smarchetype-model
3. ./install-archetype.sh


## Project Structure Overview

This is a single module web application, with functionality broken up simply by package naming. For example:

* com.vmforce.samples.dao
* com.vmforce.samples.entity

## Creating a new project from an archetype

In Spring STS...

1) File -> New -> Other -> Maven -> Maven Project

Open Advanced pulldown, and select [groupId].[artifactId] for the Name template

Click Next

2) Select "All Catalogs", check the box for "Include snapshot archetypes", and filter for com.vmforce

Select the archetype

Click Next.

3) Enter the desired group Id, artifact ID, and version number for your new project.

Click Finish

You should see a new project in your workspace, with the naming convention matching the naming convention selected in step 1 above.


## Initial sanity check

1) Navigate to the main project directory

2) Execute : mvn -DskipTests clean package

You should get a successful build with no errors.

## Customizing your project

1) Setup your forceDatabase.properties file, in src/main/resources/

Instructions on setting up this file are included as comments within the file itself.

2) Build your application for the first time, with your customizations. Application artifact is in target/

mvn -DskipTests clean install

3) Deploy your application to VMForce for the first time, in order to setup the oAuth authentication credentials.

See instructions [here](https://github.com/forcedotcom/vmforce/wiki) if you need help deploying an application.

4) Customize the oauth.properties file in src/main/resources

5) Now rebuild and redeploy your application, with the customized oauth credentials.


## Test drive

1) Setup and deploy the app as you normally would, either on VMForce or locally. Application artifact is in web/target

2) Example test, locally:

http://localhost:8080/sampleWebApp (replace sampleWebApp with the artifact id you chose for your project)

## IMPORTANT NOTES

* Be careful with the properties files containing security credentials when checking into a version control system.
