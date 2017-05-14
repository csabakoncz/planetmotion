# Basic GWT application (client side only)

## How to build it:
 - The `dist` folder already contains a build of the client-side artifacts. 
 - How to recreate it:
 - `mvn clean package`
 - `rm -rf dist; mdkir dist`
 - `cp -a target/planetmotion-1.0-SNAPSHOT/* dist`
 - `rm -rf dist/META-INF/; rm -rf dist/WEB-INF`
 
## How to launch the dev mode server:
 - `mvn gwt:run`
 
