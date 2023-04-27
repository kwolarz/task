package com.task.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class NavigationItem {

    @Inject
    private String navigationtitle;

    @Inject
    private String navigationpath;

    public String getNavigationpath() {
        return navigationpath;
    }

    public String getNavigationtitle() {
        return navigationtitle;
    }
}
