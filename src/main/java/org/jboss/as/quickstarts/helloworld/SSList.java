package org.jboss.as.quickstarts.helloworld;

/**
 * Created by Александр on 27.03.2015.
 */

import java.util.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@RequestScoped
public class SSList {

    private List<ss> ssList;

    @Produces
    @Named
    public List<ss> getMembers() {


        ss ps1 = new ss();
        ps1.setId((long)1000);
        ps1.setName("sas3");
        //ssList.add(ps1);

        ArrayList<ss> ssArray = new ArrayList<ss>();
        ssArray.add(ps1);

        return ssArray;
    }
}
