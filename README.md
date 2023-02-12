# Yolo Service backend



## Running the server
If you wish to run the server, run the following command:

```
mvn spring-boot:run
```


which should result in output such as:

```
[2021-01-07T13:04:14.4616 #37268]  INFO 10374 --- [main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8100 (http).

```

indicating the server is now listening at port 9292.

### Using your credentials
The server's code includes placeholder credentials that are set up to work with those supplied as an example in the SDK's documentation. You can use your own credentials by setting the `API_KEY` and `API_SECRET` environment variables before running the server. For example, you could supply your own credentials by running the server like so:

```
API_KEY=my_api_key API_SECRET=my_api_secret rackup
```

or for Windows based systems:

```
cmd /C "set API_KEY=my_api_key && set API_SECRET=my_api_secret && rackup"
```

## License
The sample backend is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
