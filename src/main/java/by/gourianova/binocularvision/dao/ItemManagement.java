package by.gourianova.binocularvision.dao;

import by.gourianova.binocularvision.model.AppItem;

import java.util.List;

public interface ItemManagement {

    public void addAppItem(AppItem item);

    public void updateAppItem(List<AppItem> items);

}
