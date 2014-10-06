# ACS Embedded Retrofit Bundle

This projects makes the [Retrofit](https://github.com/square/retrofit/) API available as an OSGi bundle inside a content package suitable for deployment on CQ/AEM.

This package depends upon Google GSON which should be available as-is as it is distributed as an OSGi bundle.

## Logging

By default, Retrofit will log to `System.out`. To have it logged through the standard Sling/AEM logging system, this bundle includes an adapter for Slf4j which logs under the category name `retrofit`. To use this adapter, call `setLog()` during the construction of the `RestAdapter`:

    RestAdapter restAdapter = new RestAdapter.Builder()
          .setEndpoint(API_URL)
          .setLogLevel(LogLevel.FULL)
          .setLog(Slf4jLog.INSTANCE)
          .build();