package tech.keihong;

import java.util.List;

public class IGirlSearchService {

    List<Girl> searchGirl(IGirlSearch girlSearchImpl, List<Girl> girls) {
        return girlSearchImpl.searchGirl(girls);
    }
}
