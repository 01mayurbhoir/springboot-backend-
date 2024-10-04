//package com.example.journalApp.appcache;
//
//import com.example.journalApp.entity.ConfigJournalAppEntity;
//import com.example.journalApp.repository.ConfigJournalAppRepository;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class AppCache {
//
//    public enum keys{
//        WEATHER_API;
//    }
//
//    @Autowired
//    private ConfigJournalAppRepository configJournalAppRepository;
//
//    public Map<String , String> appCache ;
//
//    @PostConstruct
//    public void init(){
//        appCache = new HashMap<>();
//        List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
//        for (ConfigJournalAppEntity configJournalAppEntity : all){
//            appCache.put(configJournalAppEntity.getKey(),configJournalAppEntity.getValue());
//        }
//
//    }
//}
