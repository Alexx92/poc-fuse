/**
 *  Copyright 2005-2018 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.mycompany;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.apache.log4j.Logger;
import java.util.Properties;
/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application {
    private static final Logger logger = Logger.getLogger("");
	
    private String password;
    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("*** Valor ID-EMISOR = " + System.getenv().getOrDefault("COD-SERVICIO", "No existe en property"));
        logger.info("*** Valor COD-SERVICIO = " + System.getenv().getOrDefault("ID-EMISOR", "No existe en property"));

        logger.info("*** Valor COD-SERVICIO = " + System.getenv().getOrDefault("USER-CALL-SOAP", "No existe en property"));

    }
    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean(
            new CamelHttpTransportServlet(), "/rest/*");
        servlet.setName("CamelServlet");
        return servlet;
    }

}
