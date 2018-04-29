package project.service.impl;

import project.processor.annotations.SettingsMapping;
import org.springframework.stereotype.Service;
import project.service.SearchService;
import project.shared.CommonSettings;

/**
 * Created by Rogov on 12.11.2017.
 */
@Service
public class SearchServiceImpl implements CommonSettings, SearchService {

    @SettingsMapping(key = "SearchService")
    public void getSettings() {
        System.out.println(this.getClass());
    }
}