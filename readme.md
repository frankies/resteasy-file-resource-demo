# The validation of Resteasy download and upload 

## Prequire

- JDK 1.8
- Maven 3.0.5 or higher

## Build

### 1. Setup jetty server

```bash
 mvn jetty:run
```
 
### 2. Access the website

Put `http://localhost:8080/api/download` in your browser. 
Then the file will be downloaded.


### 3. Stop jetty server

Press 'Ctrl+c` component key to quit.


