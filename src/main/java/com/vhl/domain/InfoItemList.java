package com.vhl.domain;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sdutta on 12/26/15.
 */
public class InfoItemList {

    private static final CopyOnWriteArrayList<InfoItem> itemList = new CopyOnWriteArrayList<>();

    static{

        itemList.add(new InfoItem("Job listing", Arrays.asList("job")));
        itemList.add(new InfoItem("Training listing", Arrays.asList("training")));
        itemList.add(new InfoItem("Job listing 2", Arrays.asList("job")));
        itemList.add(new InfoItem("Training listing", Arrays.asList("training")));
    }

    public static CopyOnWriteArrayList<InfoItem> getItemList(){
        return itemList;
    }
}
