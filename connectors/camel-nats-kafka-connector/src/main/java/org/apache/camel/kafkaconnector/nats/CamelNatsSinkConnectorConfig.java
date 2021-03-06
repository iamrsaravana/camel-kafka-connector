/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.nats;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelNatsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_NATS_PATH_TOPIC_CONF = "camel.sink.path.topic";
    public static final String CAMEL_SINK_NATS_PATH_TOPIC_DOC = "The name of topic we want to use";
    public static final String CAMEL_SINK_NATS_PATH_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Timeout for connection attempts. (in milliseconds)";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = 2000;
    public static final String CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_CONF = "camel.sink.endpoint.flushConnection";
    public static final String CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_DOC = "Define if we want to flush connection when stopping or not";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_DEFAULT = true;
    public static final String CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_CONF = "camel.sink.endpoint.flushTimeout";
    public static final String CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_DOC = "Set the flush timeout (in milliseconds)";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_DEFAULT = 1000;
    public static final String CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_CONF = "camel.sink.endpoint.maxPingsOut";
    public static final String CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_DOC = "maximum number of pings have not received a response allowed by the client";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_DEFAULT = 2;
    public static final String CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_CONF = "camel.sink.endpoint.maxReconnectAttempts";
    public static final String CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_DOC = "Max reconnection attempts";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_DEFAULT = 60;
    public static final String CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_CONF = "camel.sink.endpoint.noEcho";
    public static final String CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_DOC = "Turn off echo. If supported by the gnatsd version you are connecting to this flag will prevent the server from echoing messages back to the connection if it has subscriptions on the subject being published to.";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_CONF = "camel.sink.endpoint.noRandomizeServers";
    public static final String CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_DOC = "Whether or not randomizing the order of servers for the connection attempts";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_CONF = "camel.sink.endpoint.pedantic";
    public static final String CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_DOC = "Whether or not running in pedantic mode (this affects performance)";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_CONF = "camel.sink.endpoint.pingInterval";
    public static final String CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_DOC = "Ping interval to be aware if connection is still alive (in milliseconds)";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_DEFAULT = 120000;
    public static final String CAMEL_SINK_NATS_ENDPOINT_RECONNECT_CONF = "camel.sink.endpoint.reconnect";
    public static final String CAMEL_SINK_NATS_ENDPOINT_RECONNECT_DOC = "Whether or not using reconnection feature";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_RECONNECT_DEFAULT = true;
    public static final String CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_CONF = "camel.sink.endpoint.reconnectTimeWait";
    public static final String CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_DOC = "Waiting time before attempts reconnection (in milliseconds)";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_DEFAULT = 2000;
    public static final String CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_CONF = "camel.sink.endpoint.requestCleanupInterval";
    public static final String CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_DOC = "Interval to clean up cancelled/timed out requests.";
    public static final Integer CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_DEFAULT = 5000;
    public static final String CAMEL_SINK_NATS_ENDPOINT_SERVERS_CONF = "camel.sink.endpoint.servers";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SERVERS_DOC = "URLs to one or more NAT servers. Use comma to separate URLs when specifying multiple servers.";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_ENDPOINT_VERBOSE_CONF = "camel.sink.endpoint.verbose";
    public static final String CAMEL_SINK_NATS_ENDPOINT_VERBOSE_DOC = "Whether or not running in verbose mode";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_VERBOSE_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_CONF = "camel.sink.endpoint.replySubject";
    public static final String CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_DOC = "the subject to which subscribers should send response";
    public static final String CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_ENDPOINT_CONNECTION_CONF = "camel.sink.endpoint.connection";
    public static final String CAMEL_SINK_NATS_ENDPOINT_CONNECTION_DOC = "Reference an already instantiated connection to Nats server";
    public static final String CAMEL_SINK_NATS_ENDPOINT_CONNECTION_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_CONF = "camel.sink.endpoint.traceConnection";
    public static final String CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_DOC = "Whether or not connection trace messages should be printed to standard out for fine grained debugging of connection issues.";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_SECURE_CONF = "camel.sink.endpoint.secure";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SECURE_DOC = "Set secure option indicating TLS is required";
    public static final Boolean CAMEL_SINK_NATS_ENDPOINT_SECURE_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_COMPONENT_SERVERS_CONF = "camel.component.nats.servers";
    public static final String CAMEL_SINK_NATS_COMPONENT_SERVERS_DOC = "URLs to one or more NAT servers. Use comma to separate URLs when specifying multiple servers.";
    public static final String CAMEL_SINK_NATS_COMPONENT_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_NATS_COMPONENT_VERBOSE_CONF = "camel.component.nats.verbose";
    public static final String CAMEL_SINK_NATS_COMPONENT_VERBOSE_DOC = "Whether or not running in verbose mode";
    public static final Boolean CAMEL_SINK_NATS_COMPONENT_VERBOSE_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.nats.lazyStartProducer";
    public static final String CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.nats.autowiredEnabled";
    public static final String CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.nats.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelNatsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelNatsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_NATS_PATH_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_PATH_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_NATS_PATH_TOPIC_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_FLUSH_CONNECTION_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_FLUSH_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_MAX_PINGS_OUT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_MAX_RECONNECT_ATTEMPTS_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_NO_ECHO_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_NO_RANDOMIZE_SERVERS_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_PEDANTIC_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_PING_INTERVAL_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_RECONNECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_RECONNECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_RECONNECT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_RECONNECT_TIME_WAIT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_REQUEST_CLEANUP_INTERVAL_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_ENDPOINT_SERVERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_SERVERS_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_VERBOSE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_VERBOSE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_VERBOSE_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_REPLY_SUBJECT_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_CONNECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_ENDPOINT_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_CONNECTION_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_TRACE_CONNECTION_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_ENDPOINT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_SECURE_DOC);
        conf.define(CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_NATS_COMPONENT_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NATS_COMPONENT_SERVERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_COMPONENT_SERVERS_DOC);
        conf.define(CAMEL_SINK_NATS_COMPONENT_VERBOSE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_COMPONENT_VERBOSE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_COMPONENT_VERBOSE_DOC);
        conf.define(CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}