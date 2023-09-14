package org.starxg.janetfilter.plugin.fastrequest;

import com.janetfilter.core.Environment;
import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginConfig;
import com.janetfilter.core.plugin.PluginEntry;

import java.util.ArrayList;
import java.util.List;

public class RestfulFastRequestPlugin implements PluginEntry {
    private final  List<MyTransformer> transformers = new ArrayList<>();


    @Override
    public void init(Environment environment, PluginConfig config) {
        transformers.add(new CrackTransformer());
    }

    @Override
    public String getName() {
        return "RestfulFastRequestPlugin";
    }

    @Override
    public String getAuthor() {
        return "https://github.com/starxg";
    }

    @Override
    public List<MyTransformer> getTransformers() {
        return transformers;
    }
}
