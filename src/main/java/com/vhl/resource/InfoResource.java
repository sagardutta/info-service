package com.vhl.resource;

import com.vhl.domain.InfoItem;
import com.vhl.domain.InfoItemList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sdutta on 12/26/15.
 */

@Path("info/")
public class InfoResource {

    @GET
    @Produces("application/json")
    public List<InfoItem> getAll(){

        return InfoItemList.getItemList().stream().collect(Collectors.toList());
    }
}
