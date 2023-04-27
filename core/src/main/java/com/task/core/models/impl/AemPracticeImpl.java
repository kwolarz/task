package com.task.core.models.impl;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.task.core.models.AemPracticeModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AemPracticeImpl implements AemPracticeModel {

    @Inject
    private String imagePath;

    @Inject
    private boolean backgroundCheckbox;

    @Inject
    private List<NavigationItem> navigation;


    @Override
    public String getImagePath() {
        if (StringUtils.isBlank(imagePath)) {
            return "";
        }
        return imagePath;
    }

    @Override
    public boolean isBackgroundImage() {
        return backgroundCheckbox;
    }

    @Override
    public List<NavigationItem> getNavigationItems() {
        return navigation;
    }


}
