/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.helloworld;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.as.quickstarts.helloworld.HibernateUtil;

/**
 * A simple CDI service which is able to say hello to someone
 * 
 * @author Pete Muir
 * 
 */
public class HelloService {

    String createHelloMessage(String name) {
        /*
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        ss p1 = new ss();
        p1.setName("ranga");
        long personId = (Long) session.save(p1);
        session.getTransaction().commit();

        ss id = (ss) session.get(ss.class, personId);

        session.close();
        return "Pidar " + id.getName() + "!";
        */

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

/*
        ss ps1 = new ss();
        ps1.setName("sas3");1231

        ss p2 = new ss();
        p2.setName("sas1");
        session.saveOrUpdate(ps1);
        session.saveOrUpdate(p2);
*/
        session.getTransaction().commit();


        //ss person = (ss) session.get(ss.class, personId);
        session.close();
        
        return "Print ";// + ps1.getId().toString() + " " + p2.getId().toString();
    }

}
