package com.alicannklc.codeigniter.snippets;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class CodigniterTemplateProvider implements DefaultLiveTemplatesProvider {
    public CodigniterTemplateProvider() {
    }

    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"liveTemplates/Codeigniter-Snippets"};
    }

    @Nullable
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }
}
