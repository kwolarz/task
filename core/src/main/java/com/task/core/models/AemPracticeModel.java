package com.task.core.models;

import com.task.core.models.impl.NavigationItem;

import java.util.List;

public interface AemPracticeModel {

    public String getImagePath();

    public boolean isBackgroundImage();

    public List<NavigationItem> getNavigationItems();

}
