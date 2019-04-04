package com.potulad.learning.designpatterns.proxy.protection;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple factory that constructs the self/non-self proxies based on the userName and the profileName;
 */
public class ProxySimpleFactory {

    /**
     * Map of all people in objectville and their beans. The serious flaw is that we can't have duplicate names in
     * objectville. Which kind of makes sense if you think of this as userNames. leaving as-is for simplicity.
     */
    Map<String, PersonBean> currentPeopleAndBeanMap = new HashMap<>();

    public ProxySimpleFactory() {
        for(PeopleInObjectville person : PeopleInObjectville.values()) {
            currentPeopleAndBeanMap.put(person.getName(), new ActualPerson(person.getName(), person.getGender()));
        }
    }

    public PersonBean getPersonBean(String userName, String profileName) {

        final PersonBean userNameBean = this.currentPeopleAndBeanMap.get(userName);
        final PersonBean profileNameBean = this.currentPeopleAndBeanMap.get(profileName);

        if(userName == null || profileName == null) {
            throw new IllegalArgumentException("Unknown userName or profileName");
        }

        if(userName.equalsIgnoreCase(profileName)) {
            return (PersonBean) Proxy.newProxyInstance(userNameBean.getClass().getClassLoader(),
                                                       userNameBean.getClass().getInterfaces(),
                                                       new SelfInvocationHandler(userNameBean));
        } else {
            return (PersonBean) Proxy.newProxyInstance(profileNameBean.getClass().getClassLoader(),
                                                       profileNameBean.getClass().getInterfaces(),
                                                       new NonSelfInvocationHandler(profileNameBean));
        }
    }
}
