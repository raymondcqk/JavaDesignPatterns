package tech.keihong;

import java.util.ArrayList;
import java.util.List;

public class GirlSearchController {


    private IGirlSearchService searchService = new IGirlSearchService();

    public List<Girl> searchApi(int type) {

        List<Girl> girls = new ArrayList<>();
        //... 读取girls列表

        List<Girl> girlsSearch = new ArrayList<>();
        switch (type) {
            case 1:
                girlsSearch = searchService.searchGirl(new GirlSearchAge(), girls);
                break;
            case 2:
                girlsSearch = searchService.searchGirl(new GirlSearchFigure(), girls);
                break;
            case 3:
                girlsSearch = searchService.searchGirl(new GirlSearchRandom(), girls);
                break;
        }
        return girlsSearch;
    }
}
